import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;


public class TabLab_2 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	Connection connection=null;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public TabLab_2() {
		
		connection=sqliteConnction2.dbConnector();
		
		setSize(1582, 690);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelLab_2 = new JPanel();
		JPanelLab_2.setBounds(0, 0, 1582, 690);							// ZMNIEJSZYÆ !!!
		add(JPanelLab_2);
		JPanelLab_2.setLayout(null);
		

			
		JScrollPane scrollPaneLab2_1 = new JScrollPane();
		scrollPaneLab2_1.setBounds(40, 77, 498, 274);
		JPanelLab_2.add(scrollPaneLab2_1);
		
		JTable tableLab2_1 = new JTable();
		tableLab2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try{
					int row =tableLab2_1.getSelectedRow();
					String Kod_=(tableLab2_1.getModel().getValueAt(row, 0)).toString();
					
					String query="select * from RawMaterials where Kod='"+Kod_+"' ";
					PreparedStatement pst=connection.prepareStatement(query);
					
						ResultSet rs=pst.executeQuery();
						
						while(rs.next())
						{
							textField.setText(rs.getString("Nazwa"));
							textField_1.setText(rs.getString("Kod"));

						}
										
					pst.close();
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		scrollPaneLab2_1.setViewportView(tableLab2_1);
		
		JLabel btnLoadTable = new JLabel("Load Data");
		btnLoadTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					String query="select Kod,Nazwa from RawMaterials";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					tableLab2_1.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}

				
			}
			public void mouseEntered(MouseEvent arg0) 
			{
				btnLoadTable.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				btnLoadTable.setBackground(SystemColor.controlHighlight);									
			}	
		});
		btnLoadTable.setOpaque(true);
		btnLoadTable.setHorizontalAlignment(SwingConstants.CENTER);
		btnLoadTable.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnLoadTable.setBorder(new LineBorder(SystemColor.controlShadow));
		btnLoadTable.setBackground(SystemColor.controlHighlight);
		btnLoadTable.setBounds(823, 38, 155, 25);
		JPanelLab_2.add(btnLoadTable);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(144, 410, 200, 25);
		JPanelLab_2.add(textField);
		
		JLabel label = new JLabel("Nazwa surowca");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.PLAIN, 15));
		label.setBorder(new LineBorder(SystemColor.controlShadow));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(144, 385, 200, 25);
		JPanelLab_2.add(label);
		
		JLabel label_1 = new JLabel("Kod");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_1.setBorder(new LineBorder(SystemColor.controlShadow));
		label_1.setBackground(SystemColor.controlHighlight);
		label_1.setBounds(44, 385, 100, 25);
		JPanelLab_2.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(44, 410, 100, 25);
		JPanelLab_2.add(textField_1);
		
		JLabel label_2 = new JLabel("DODAJ");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try 
				{
					String query="insert into RawMaterials (Kod,Nazwa) values (?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,textField_1.getText());
					pst.setString(2,textField.getText());

					pst.execute(); 
					
					JOptionPane.showMessageDialog(null, "Date Saved");
					
					pst.close(); 
				
					
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			

			}
			public void mouseEntered(MouseEvent arg0) 
			{
				label_2.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				label_2.setBackground(SystemColor.controlHighlight);									
			}
			});
		
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_2.setBorder(new LineBorder(SystemColor.controlShadow));
		label_2.setBackground(SystemColor.controlHighlight);
		label_2.setBounds(604, 76, 148, 25);
		JPanelLab_2.add(label_2);
		
		JLabel label_3 = new JLabel("USU\u0143");
		label_3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				int action=JOptionPane.showConfirmDialog(null, "Do you really want to DELETE?", "DELETE",JOptionPane.YES_NO_OPTION);
				if(action==0)
				{
					try
					{
					String query="delete from RawMaterials where Kod='"+textField_1.getText()+"'  ";
					PreparedStatement pst=connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					
					pst.close();
					
					}
					catch (Exception ex) 
					{
					ex.printStackTrace();
					}
				}
			}
			
			public void mouseEntered(MouseEvent arg0) 
			{
				label_3.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				label_3.setBackground(SystemColor.controlHighlight);									
			}
		});
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_3.setBorder(new LineBorder(SystemColor.controlShadow));
		label_3.setBackground(SystemColor.controlHighlight);
		label_3.setBounds(604, 101, 148, 25);
		JPanelLab_2.add(label_3);
		
		JLabel label_4 = new JLabel("AKTUALIZUJ");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_4.setBorder(new LineBorder(SystemColor.controlShadow));
		label_4.setBackground(SystemColor.controlHighlight);
		label_4.setBounds(604, 126, 148, 25);
		JPanelLab_2.add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kod", "Nazwa"}));
		comboBox.setBounds(424, 38, 114, 25);
		JPanelLab_2.add(comboBox);
		
		JLabel label_5 = new JLabel("Szukaj");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_5.setBorder(new LineBorder(SystemColor.controlShadow));
		label_5.setBackground(SystemColor.controlHighlight);
		label_5.setBounds(268, 38, 155, 25);
		JPanelLab_2.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
					String selection=(String)comboBox.getSelectedItem();
					String query="select Kod,Nazwa from RawMaterials where "+selection+"=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textField_2.getText());
						ResultSet rs=pst.executeQuery();
						
						
						tableLab2_1.setModel(DbUtils.resultSetToTableModel(rs));
										
					pst.close();
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(40, 38, 230, 26);
		JPanelLab_2.add(textField_2);
		
	}
}
