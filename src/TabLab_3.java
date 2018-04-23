import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

import java.sql.*;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.Color;

public class TabLab_3 extends JPanel {
	
	Connection connection=null;
	private JTextField textField;
	private JTable table;
	public JComboBox comboBoxLab3_2;
	public JTextField textFieldFind;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	
	/**
	 * Public void
	 */
	
	
	
	
	public void refreshTable()
	{
//		try {
//			String query="select EID,KodSurowca,NazwaSurowca,Waga from RawMaterialsTable";
//			PreparedStatement pst=connection.prepareStatement(query);
//			ResultSet rs=pst.executeQuery();
//			table.setModel(DbUtils.resultSetToTableModel(rs));
//		}
//			
//			
		
//				try{
//					
//					this.comboBoxLab3_2 = comboBoxLab3_2;
//					String selection=(String)comboBoxLab3_2.getSelectedItem();
//					String query="select KodSurowca,NazwaSurowca,Waga from RawMaterialsTable where "+selection+"=? ";
//					PreparedStatement pst=connection.prepareStatement(query);
//					pst.setString(1, textFieldFind.getText());
//						ResultSet rs=pst.executeQuery();
//						
//						
//						table.setModel(DbUtils.resultSetToTableModel(rs));
//										
//					pst.close();
//					}
//
//			
//			
//			
//			
//		 catch (Exception e) {
//			e.printStackTrace();
//		}
//				
//		try{
//			String selection=(String)comboBoxLab3_2.getSelectedItem();
//			String query="select KodSurowca,NazwaSurowca,Waga from RawMaterialsTable where "+selection+"=? ";
//			PreparedStatement pst=connection.prepareStatement(query);
//			pst.setString(1, textFieldFind.getText());
//				ResultSet rs=pst.executeQuery();
//			
//			
//			table.setModel(DbUtils.resultSetToTableModel(rs));
//							
//		pst.close();
//		
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}	
				
				
				
	}
	
	

	public TabLab_3() {
		initialize();
		connection=sqliteConnction2.dbConnector();
		
		
		
		
	/**
	 * Frame	
	 */

		setSize(1582, 690);												
		setLayout(null);
		
		JPanel JPanelLab_3 = new JPanel();
		JPanelLab_3.setBounds(0, 0, 1582, 690);							
		add(JPanelLab_3);
		JPanelLab_3.setLayout(null);
		
		JTextField textFieldRawMaterial = new JTextField();
		textFieldRawMaterial.setColumns(10);
		textFieldRawMaterial.setBounds(150, 570, 200, 25);
		JPanelLab_3.add(textFieldRawMaterial);
		
		JTextField textFieldCodeRaw = new JTextField();
		textFieldCodeRaw.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) 
			{
						
				try
				{
					String selection=(String)textFieldCodeRaw.getText();
					System.out.println(selection);
					String query="select * from RawMaterials where Kod='"+selection+"' ";
					PreparedStatement pst=connection.prepareStatement(query);
				
						ResultSet rs=pst.executeQuery();
						
						while(rs.next())
						{
						
							textFieldRawMaterial.setText(rs.getString("Nazwa"));

						}
										
					pst.close();
				} 
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		textFieldCodeRaw.setColumns(10);
		textFieldCodeRaw.setBounds(50, 570, 100, 25);
		JPanelLab_3.add(textFieldCodeRaw);
		

		
		JTextField textFieldWeight = new JTextField();
		textFieldWeight.setColumns(10);
		textFieldWeight.setBounds(350, 570, 200, 25);
		JPanelLab_3.add(textFieldWeight);
		
		JLabel label_5 = new JLabel();
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_5.setBorder(new LineBorder(SystemColor.controlShadow));
		label_5.setBackground(SystemColor.controlHighlight);
		label_5.setBounds(50, 485, 100, 25);
		JPanelLab_3.add(label_5);
		
		JComboBox comboBoxLab3_2 = new JComboBox();
		comboBoxLab3_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		comboBoxLab3_2.setModel(new DefaultComboBoxModel(new String[] {"PowderCode", "EID"}));
		comboBoxLab3_2.setBounds(434, 72, 114, 25);
		JPanelLab_3.add(comboBoxLab3_2);
		
		
		JTextField textFieldFind = new JTextField();
		textFieldFind.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
					String selection=(String)comboBoxLab3_2.getSelectedItem();
					String query="select RawMaterialsTable.Nr,"
							+ " RawMaterialsTable.KodSurowca,"
							+ " RawMaterials.Nazwa,"
							+ " RawMaterialsTable.Waga"
						+ " from RawMaterialsTable,"
							+ " RawMaterials"
						+ " where "+selection+"=? "
							+ "and RawMaterialsTable.KodSurowca = RawMaterials.Kod";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldFind.getText());
						ResultSet rs=pst.executeQuery();
						
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
										
					pst.close();
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		textFieldFind.setBounds(50, 72, 230, 26);
		JPanelLab_3.add(textFieldFind);
		textFieldFind.setColumns(10);
		
		
		

		JLabel lblSzukaj = new JLabel("Szukaj");
		lblSzukaj.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					String selection=(String)comboBoxLab3_2.getSelectedItem();
					String query="select RawMaterialsTable.Nr,"
									+ " RawMaterialsTable.KodSurowca,"
									+ " RawMaterials.Nazwa,"
									+ " RawMaterialsTable.Waga"
								+ " from RawMaterialsTable,"
									+ " RawMaterials"
								+ " where "+selection+"=? "
									+ "and RawMaterialsTable.KodSurowca = RawMaterials.Kod";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldFind.getText());
						ResultSet rs=pst.executeQuery();
					
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
									
				pst.close();
				
				} catch (Exception ex) {
					ex.printStackTrace();
				}	
				}
			public void mouseEntered(MouseEvent arg0) 
			{
				lblSzukaj.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				lblSzukaj.setBackground(SystemColor.controlHighlight);									
			}
			});
		lblSzukaj.setOpaque(true);
		lblSzukaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblSzukaj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblSzukaj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblSzukaj.setBackground(SystemColor.controlHighlight);
		lblSzukaj.setBounds(278, 72, 155, 25);
		JPanelLab_3.add(lblSzukaj);
	
		
		JLabel label_2 = new JLabel("USU\u0143");
		label_2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				int action=JOptionPane.showConfirmDialog(null, "Do you really want to DELETE?", "DELETE",JOptionPane.YES_NO_OPTION);
				if(action==0)
				{
					try
					{
						
						String query1="SELECT RawMaterialsTable.Nr"
								+ " FROM RawMaterialsTable"
								+ " where EID='"+label_5.getText()+"'  ";
						PreparedStatement pst1=connection.prepareStatement(query1);
				
						pst1.execute();
						ResultSet rs=pst1.executeQuery();
						while (rs.next())
						{
						String deleted = rs.getString(1);
					    System.out.println(deleted);
					    Integer deleted_ = Integer.valueOf(deleted);
						
						
						String PowderCode_=(textFieldFind.getText());
						Statement stmt3 = connection.createStatement();
						ResultSet rs3 = stmt3.executeQuery("SELECT COUNT(Nr) AS COUNT"
								+ " FROM RawMaterialsTable"
								+ " WHERE PowderCode='"+PowderCode_+"' ");
						

							
							while(rs3.next())
							{
							    System.out.println("The count is " + rs3.getInt("COUNT"));
							    
							    Integer x = Integer.valueOf(rs3.getInt("COUNT"));
								int i = deleted_;
								
								try
								{	
									
									
									String set=
//											"BEGIN"
//												+ " IF Nr > '"+i+"' THEN"
														"UPDATE RawMaterialsTable"
														+ " SET Nr = Nr - 1"
														+ " WHERE PowderCode='"+PowderCode_+"'"
														+ " AND Nr>'"+i+"'";
//												+ " END IF;"
//											+ " END;";
									
									PreparedStatement pst=connection.prepareStatement(set);
									pst.execute();
									pst.close();
									
							
									
									
									
									
									
									
								    System.out.println("Nr line:"+i);
								//    i++;
								//
//									while(i!=10);
//									{
//
//								    System.out.println("koniec");
//								    
//								    
//
//									}
								}
								catch (Exception e) 
								{
								e.printStackTrace();
								}




							}
											
						stmt3.close(); 
						}
						
						
						
						
						pst1.close();
						

						
						
//							String query="delete from RawMaterialsTable where EID='"+label_5.getText()+"'  ";
//							PreparedStatement pst=connection.prepareStatement(query);
//					
//							pst.execute();
//					
//							JOptionPane.showMessageDialog(null, "Data Deleted");
//					
//							pst.close();
					
					}
					catch (Exception ex) 
					{
					ex.printStackTrace();
					}
				}
				try
				{
				String selection=(String)comboBoxLab3_2.getSelectedItem();
				String query="select RawMaterialsTable.Nr,"
						+ " RawMaterialsTable.KodSurowca,"
						+ " RawMaterials.Nazwa,"
						+ " RawMaterialsTable.Waga"
					+ " from RawMaterialsTable,"
						+ " RawMaterials"
					+ " where "+selection+"=? "
						+ "and RawMaterialsTable.KodSurowca = RawMaterials.Kod";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.setString(1, textFieldFind.getText());
				ResultSet rs=pst.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
								
				pst.close();
			
				} 
				catch (Exception ex) 
				{
				ex.printStackTrace();
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
		label_2.setBounds(585, 222, 148, 25);
		JPanelLab_3.add(label_2);
		
		
		


		
		JLabel label_1 = new JLabel("DODAJ");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try 
				{	
		//			int row =table.getSelectedRow();
				//	int count=0;
					
		//			String Nr_=(table.getModel().getValueAt(row, 0)).toString();
					String PowderCode_=(textFieldFind.getText());

					Statement stmt3 = connection.createStatement();

					ResultSet rs3 = stmt3.executeQuery("SELECT COUNT(Nr) AS COUNT"
							+ " FROM RawMaterialsTable"
							+ " where PowderCode='"+PowderCode_+"' ");
					
					while(rs3.next())
					{
						    System.out.println("The count is " + rs3.getInt("COUNT"));
						    
						    
							Integer x = Integer.valueOf(rs3.getInt("COUNT"));
							x = new Integer(x.intValue() + 1);	
							System.out.println(x);
				
							String Nr_ = String.valueOf(x);
							String query="insert into RawMaterialsTable (Nr,KodSurowca,Waga,PowderCode)"
									+ " values (?,?,?,?)";

							PreparedStatement pst=connection.prepareStatement(query);

							pst.setString(1,Nr_);
							pst.setString(2,textFieldCodeRaw.getText());
							pst.setString(3,textFieldWeight.getText());
							pst.setString(4,textFieldFind.getText());
							pst.execute(); 
					

							JOptionPane.showMessageDialog(null, "Date Saved");
					
							pst.close(); 
					}
										
					stmt3.close(); 

					
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				try
				{
					String selection=(String)comboBoxLab3_2.getSelectedItem();
					String query="select RawMaterialsTable.Nr,"
							+ " RawMaterialsTable.KodSurowca,"
							+ " RawMaterials.Nazwa,"
							+ " RawMaterialsTable.Waga"
						+ " from RawMaterialsTable,"
							+ " RawMaterials"
						+ " where "+selection+"=? "
							+ "and RawMaterialsTable.KodSurowca = RawMaterials.Kod";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldFind.getText());
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
								
					pst.close();
				} 
				catch (Exception ex)
				{
					ex.printStackTrace();
				}	
			}
			public void mouseEntered(MouseEvent arg0) 
			{
				label_1.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				label_1.setBackground(SystemColor.controlHighlight);									
			}
			});
		
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_1.setBorder(new LineBorder(SystemColor.controlShadow));
		label_1.setBackground(SystemColor.controlHighlight);
		label_1.setBounds(585, 197, 148, 25);
		JPanelLab_3.add(label_1);
		
		
		JScrollPane scrollPaneLab3_2 = new JScrollPane();
		scrollPaneLab3_2.setBounds(50, 110, 500, 370);
		JPanelLab_3.add(scrollPaneLab3_2);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				
				try
				{
					int row =table.getSelectedRow();
					String Nr_=(table.getModel().getValueAt(row, 0)).toString();
					String PowderCode_=(textFieldFind.getText());
			
					System.out.println(Nr_);
					System.out.println(PowderCode_);

					String query="SELECT RawMaterialsTable.KodSurowca AS RawMaterialsTable_KodSurowca,"
								+ " RawMaterials.Nazwa AS RawMaterials_Nazwa,"
								+ " RawMaterialsTable.Waga AS RawMaterialsTable_Waga,"
								+ " RawMaterialsTable.EID AS RawMaterialsTable_EID"
							+ " FROM RawMaterialsTable,"
								+ " RawMaterials "
							+ " WHERE (Nr ='"+Nr_+"'"
								+ " AND PowderCode='"+PowderCode_+"')"
							+ " AND (RawMaterialsTable.KodSurowca = RawMaterials.Kod)";

					PreparedStatement pst=connection.prepareStatement(query);
					
						ResultSet rs=pst.executeQuery();
						
						while(rs.next())
						{
							textFieldCodeRaw.setText(rs.getString("RawMaterialsTable_KodSurowca"));
							textFieldRawMaterial.setText(rs.getString("RawMaterials_Nazwa"));
							textFieldWeight.setText(rs.getString("RawMaterialsTable_Waga"));
							label_5.setText(rs.getString("RawMaterialsTable_EID"));									//Refer to the column position in your call to the JDBC API
																													// or SELECT a.columnName as columnNameA,
						}
										
					pst.close();
					
				} 
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
				
				
				
				
			}
		});
		scrollPaneLab3_2.setViewportView(table);
		
		
		JLabel lblAktualizuj = new JLabel("AKTUALIZUJ");
		
		lblAktualizuj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					String query="Update RawMaterialsTable set EID='"+label_5.getText()+"' ,KodSurowca='"+textFieldCodeRaw.getText()+"' ,NazwaSurowca='"+textFieldRawMaterial.getText()+"' ,Waga='"+textFieldWeight.getText()+"' where EID='"+label_5.getText()+"'";
					PreparedStatement pst=connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Updated");
					
					pst.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				try
				{
					String selection=(String)comboBoxLab3_2.getSelectedItem();
					String query="select RawMaterialsTable.Nr,"
							+ " RawMaterialsTable.KodSurowca,"
							+ " RawMaterials.Nazwa,"
							+ " RawMaterialsTable.Waga"
						+ " from RawMaterialsTable,"
							+ " RawMaterials"
						+ " where "+selection+"=? "
							+ "and RawMaterialsTable.KodSurowca = RawMaterials.Kod";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldFind.getText());
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
								
					pst.close();
				} 
				catch (Exception ex)
				{
					ex.printStackTrace();
				}	
			}
			public void mouseEntered(MouseEvent arg0) 
			{
				lblAktualizuj.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				lblAktualizuj.setBackground(SystemColor.controlHighlight);									
			}
			
			
		});
		lblAktualizuj.setOpaque(true);
		lblAktualizuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblAktualizuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblAktualizuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblAktualizuj.setBackground(SystemColor.controlHighlight);
		lblAktualizuj.setBounds(585, 247, 148, 25);
		JPanelLab_3.add(lblAktualizuj);
		
		JLabel lblDrukuj = new JLabel("DRUKUJ");
		lblDrukuj.setOpaque(true);
		lblDrukuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrukuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDrukuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDrukuj.setBackground(SystemColor.controlHighlight);
		lblDrukuj.setBounds(585, 272, 148, 25);
		JPanelLab_3.add(lblDrukuj);
		

		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(350, 485, 200, 25);
		JPanelLab_3.add(textField);
		
		JLabel lblKod = new JLabel("Kod");
		lblKod.setOpaque(true);
		lblKod.setHorizontalAlignment(SwingConstants.CENTER);
		lblKod.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKod.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod.setBackground(SystemColor.controlHighlight);
		lblKod.setBounds(50, 545, 100, 25);
		JPanelLab_3.add(lblKod);
		
		JLabel lblNazwaSurowca = new JLabel("Nazwa surowca");
		lblNazwaSurowca.setOpaque(true);
		lblNazwaSurowca.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaSurowca.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaSurowca.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaSurowca.setBackground(SystemColor.controlHighlight);
		lblNazwaSurowca.setBounds(150, 545, 200, 25);
		JPanelLab_3.add(lblNazwaSurowca);
		
		JLabel lblWaga = new JLabel("Waga");
		lblWaga.setOpaque(true);
		lblWaga.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaga.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWaga.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWaga.setBackground(SystemColor.controlHighlight);
		lblWaga.setBounds(350, 545, 200, 25);
		JPanelLab_3.add(lblWaga);
		
		JLabel lblSuma = new JLabel("Suma:");
		lblSuma.setOpaque(true);
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblSuma.setBorder(new LineBorder(SystemColor.controlShadow));
		lblSuma.setBackground(SystemColor.controlHighlight);
		lblSuma.setBounds(258, 485, 92, 25);
		JPanelLab_3.add(lblSuma);
		
		JLabel lblNoweReceptury = new JLabel("Nowe Receptury");
		lblNoweReceptury.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoweReceptury.setForeground(new Color(0, 102, 102));
		lblNoweReceptury.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblNoweReceptury.setBounds(181, 14, 215, 45);
		JPanelLab_3.add(lblNoweReceptury);
		
		JLabel lblRejestrPrzebieguProcesu = new JLabel("Rejestr przebiegu procesu opracowania wyrobu");
		lblRejestrPrzebieguProcesu.setHorizontalAlignment(SwingConstants.CENTER);
		lblRejestrPrzebieguProcesu.setForeground(new Color(0, 102, 102));
		lblRejestrPrzebieguProcesu.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblRejestrPrzebieguProcesu.setBounds(834, 14, 466, 45);
		JPanelLab_3.add(lblRejestrPrzebieguProcesu);
		
		JLabel lblNumerZlecenia = new JLabel("Numer zlecenia");
		lblNumerZlecenia.setOpaque(true);
		lblNumerZlecenia.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumerZlecenia.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNumerZlecenia.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNumerZlecenia.setBackground(SystemColor.controlHighlight);
		lblNumerZlecenia.setBounds(776, 72, 200, 25);
		JPanelLab_3.add(lblNumerZlecenia);
		
		textField_1 = new JTextField("");
		textField_1.setOpaque(true);
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(976, 72, 360, 25);
		JPanelLab_3.add(textField_1);
		
		JLabel lblNazwaProduktu = new JLabel("Nazwa produktu");
		lblNazwaProduktu.setOpaque(true);
		lblNazwaProduktu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaProduktu.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaProduktu.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaProduktu.setBackground(SystemColor.controlHighlight);
		lblNazwaProduktu.setBounds(776, 97, 200, 25);
		JPanelLab_3.add(lblNazwaProduktu);
		
		textField_2 = new JTextField("");
		textField_2.setOpaque(true);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(976, 97, 360, 25);
		JPanelLab_3.add(textField_2);
		
		JLabel lblDataRozpoczcia = new JLabel("Data rozpocz\u0119cia");
		lblDataRozpoczcia.setOpaque(true);
		lblDataRozpoczcia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataRozpoczcia.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDataRozpoczcia.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDataRozpoczcia.setBackground(SystemColor.controlHighlight);
		lblDataRozpoczcia.setBounds(776, 122, 200, 25);
		JPanelLab_3.add(lblDataRozpoczcia);
		
		textField_3 = new JTextField("");
		textField_3.setOpaque(true);
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(976, 122, 360, 25);
		JPanelLab_3.add(textField_3);
		
		JLabel lblWstpnaKalkulacja = new JLabel("Wst\u0119pna kalkulacja");
		lblWstpnaKalkulacja.setOpaque(true);
		lblWstpnaKalkulacja.setHorizontalAlignment(SwingConstants.CENTER);
		lblWstpnaKalkulacja.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWstpnaKalkulacja.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWstpnaKalkulacja.setBackground(SystemColor.controlHighlight);
		lblWstpnaKalkulacja.setBounds(776, 147, 200, 25);
		JPanelLab_3.add(lblWstpnaKalkulacja);
		
		textField_4 = new JTextField("");
		textField_4.setOpaque(true);
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(976, 147, 360, 25);
		JPanelLab_3.add(textField_4);
		
		JLabel lblPrbaLaboratoryjna = new JLabel("Pr\u00F3ba laboratoryjna");
		lblPrbaLaboratoryjna.setOpaque(true);
		lblPrbaLaboratoryjna.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrbaLaboratoryjna.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPrbaLaboratoryjna.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPrbaLaboratoryjna.setBackground(SystemColor.controlHighlight);
		lblPrbaLaboratoryjna.setBounds(776, 172, 200, 25);
		JPanelLab_3.add(lblPrbaLaboratoryjna);
		
		textField_5 = new JTextField("");
		textField_5.setOpaque(true);
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(976, 172, 360, 25);
		JPanelLab_3.add(textField_5);
		
		JLabel lblOstatecznaKalkulacja = new JLabel("Ostateczna kalkulacja");
		lblOstatecznaKalkulacja.setOpaque(true);
		lblOstatecznaKalkulacja.setHorizontalAlignment(SwingConstants.CENTER);
		lblOstatecznaKalkulacja.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblOstatecznaKalkulacja.setBorder(new LineBorder(SystemColor.controlShadow));
		lblOstatecznaKalkulacja.setBackground(SystemColor.controlHighlight);
		lblOstatecznaKalkulacja.setBounds(776, 197, 200, 25);
		JPanelLab_3.add(lblOstatecznaKalkulacja);
		
		textField_6 = new JTextField("");
		textField_6.setOpaque(true);
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(976, 197, 360, 25);
		JPanelLab_3.add(textField_6);
		
		JLabel lblDataZakoczenia = new JLabel("Data zako\u0144czenia");
		lblDataZakoczenia.setOpaque(true);
		lblDataZakoczenia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataZakoczenia.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDataZakoczenia.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDataZakoczenia.setBackground(SystemColor.controlHighlight);
		lblDataZakoczenia.setBounds(776, 222, 200, 25);
		JPanelLab_3.add(lblDataZakoczenia);
		
		textField_7 = new JTextField("");
		textField_7.setOpaque(true);
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(976, 222, 360, 25);
		JPanelLab_3.add(textField_7);
		
		JLabel lblSporzdzi = new JLabel("Sporz\u0105dzi\u0142:");
		lblSporzdzi.setOpaque(true);
		lblSporzdzi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSporzdzi.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblSporzdzi.setBorder(new LineBorder(SystemColor.controlShadow));
		lblSporzdzi.setBackground(SystemColor.controlHighlight);
		lblSporzdzi.setBounds(776, 247, 200, 25);
		JPanelLab_3.add(lblSporzdzi);
		
		textField_8 = new JTextField("");
		textField_8.setOpaque(true);
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(976, 247, 360, 25);
		JPanelLab_3.add(textField_8);
		
		JLabel lblV = new JLabel("Opis");
		lblV.setOpaque(true);
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		lblV.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV.setBackground(SystemColor.controlHighlight);
		lblV.setBounds(776, 272, 200, 25);
		JPanelLab_3.add(lblV);
		
		textField_9 = new JTextField("");
		textField_9.setOpaque(true);
		textField_9.setHorizontalAlignment(SwingConstants.LEFT);
		textField_9.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(976, 272, 360, 25);
		JPanelLab_3.add(textField_9);
		
		JLabel lblV_1 = new JLabel("v1");
		lblV_1.setOpaque(true);
		lblV_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_1.setBackground(SystemColor.controlHighlight);
		lblV_1.setBounds(776, 297, 200, 25);
		JPanelLab_3.add(lblV_1);
		
		textField_10 = new JTextField("");
		textField_10.setOpaque(true);
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(976, 297, 360, 25);
		JPanelLab_3.add(textField_10);
		
		JLabel lblTestyOkrelenie = new JLabel("TESTY - Okre\u015Blenie wymaga\u0144 klienta");
		lblTestyOkrelenie.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestyOkrelenie.setForeground(new Color(0, 102, 102));
		lblTestyOkrelenie.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblTestyOkrelenie.setBounds(834, 340, 466, 45);
		JPanelLab_3.add(lblTestyOkrelenie);
		
		textField_11 = new JTextField("");
		textField_11.setOpaque(true);
		textField_11.setHorizontalAlignment(SwingConstants.LEFT);
		textField_11.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(976, 573, 360, 25);
		JPanelLab_3.add(textField_11);
		
		JLabel lblIso_7 = new JLabel("ISO 8888");
		lblIso_7.setOpaque(true);
		lblIso_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblIso_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIso_7.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIso_7.setBackground(SystemColor.controlHighlight);
		lblIso_7.setBounds(776, 573, 200, 25);
		JPanelLab_3.add(lblIso_7);
		
		JLabel lblIso_6 = new JLabel("ISO 7777");
		lblIso_6.setOpaque(true);
		lblIso_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblIso_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIso_6.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIso_6.setBackground(SystemColor.controlHighlight);
		lblIso_6.setBounds(776, 548, 200, 25);
		JPanelLab_3.add(lblIso_6);
		
		textField_12 = new JTextField("");
		textField_12.setOpaque(true);
		textField_12.setHorizontalAlignment(SwingConstants.LEFT);
		textField_12.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_12.setColumns(10);
		textField_12.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(976, 548, 360, 25);
		JPanelLab_3.add(textField_12);
		
		textField_13 = new JTextField("");
		textField_13.setOpaque(true);
		textField_13.setHorizontalAlignment(SwingConstants.LEFT);
		textField_13.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(976, 523, 360, 25);
		JPanelLab_3.add(textField_13);
		
		JLabel lblIso_5 = new JLabel("ISO 6666");
		lblIso_5.setOpaque(true);
		lblIso_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblIso_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIso_5.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIso_5.setBackground(SystemColor.controlHighlight);
		lblIso_5.setBounds(776, 523, 200, 25);
		JPanelLab_3.add(lblIso_5);
		
		textField_14 = new JTextField("");
		textField_14.setOpaque(true);
		textField_14.setHorizontalAlignment(SwingConstants.LEFT);
		textField_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_14.setColumns(10);
		textField_14.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(976, 498, 360, 25);
		JPanelLab_3.add(textField_14);
		
		JLabel lblIso_4 = new JLabel("ISO 5555");
		lblIso_4.setOpaque(true);
		lblIso_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblIso_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIso_4.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIso_4.setBackground(SystemColor.controlHighlight);
		lblIso_4.setBounds(776, 498, 200, 25);
		JPanelLab_3.add(lblIso_4);
		
		JLabel lblIso_3 = new JLabel("ISO 4444");
		lblIso_3.setOpaque(true);
		lblIso_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblIso_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIso_3.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIso_3.setBackground(SystemColor.controlHighlight);
		lblIso_3.setBounds(776, 473, 200, 25);
		JPanelLab_3.add(lblIso_3);
		
		textField_15 = new JTextField("");
		textField_15.setOpaque(true);
		textField_15.setHorizontalAlignment(SwingConstants.LEFT);
		textField_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_15.setColumns(10);
		textField_15.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(976, 473, 360, 25);
		JPanelLab_3.add(textField_15);
		
		textField_16 = new JTextField("");
		textField_16.setOpaque(true);
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_16.setColumns(10);
		textField_16.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(976, 448, 360, 25);
		JPanelLab_3.add(textField_16);
		
		JLabel lblIso_2 = new JLabel("ISO 3333");
		lblIso_2.setOpaque(true);
		lblIso_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblIso_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIso_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIso_2.setBackground(SystemColor.controlHighlight);
		lblIso_2.setBounds(776, 448, 200, 25);
		JPanelLab_3.add(lblIso_2);
		
		JLabel lblIso_1 = new JLabel("ISO 2222");
		lblIso_1.setOpaque(true);
		lblIso_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIso_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIso_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIso_1.setBackground(SystemColor.controlHighlight);
		lblIso_1.setBounds(776, 423, 200, 25);
		JPanelLab_3.add(lblIso_1);
		
		textField_17 = new JTextField("");
		textField_17.setOpaque(true);
		textField_17.setHorizontalAlignment(SwingConstants.LEFT);
		textField_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_17.setColumns(10);
		textField_17.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(976, 423, 360, 25);
		JPanelLab_3.add(textField_17);
		
		JLabel lblIso = new JLabel("ISO 1111");
		lblIso.setOpaque(true);
		lblIso.setHorizontalAlignment(SwingConstants.CENTER);
		lblIso.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIso.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIso.setBackground(SystemColor.controlHighlight);
		lblIso.setBounds(776, 398, 200, 25);
		JPanelLab_3.add(lblIso);
		
		textField_18 = new JTextField("");
		textField_18.setOpaque(true);
		textField_18.setHorizontalAlignment(SwingConstants.LEFT);
		textField_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_18.setColumns(10);
		textField_18.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(976, 398, 360, 25);
		JPanelLab_3.add(textField_18);
		
		JLabel label = new JLabel("DODAJ");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.PLAIN, 15));
		label.setBorder(new LineBorder(SystemColor.controlShadow));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(1382, 222, 148, 25);
		JPanelLab_3.add(label);
		
		JLabel label_3 = new JLabel("USU\u0143");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_3.setBorder(new LineBorder(SystemColor.controlShadow));
		label_3.setBackground(SystemColor.controlHighlight);
		label_3.setBounds(1382, 247, 148, 25);
		JPanelLab_3.add(label_3);
		
		JLabel label_4 = new JLabel("AKTUALIZUJ");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_4.setBorder(new LineBorder(SystemColor.controlShadow));
		label_4.setBackground(SystemColor.controlHighlight);
		label_4.setBounds(1382, 272, 148, 25);
		JPanelLab_3.add(label_4);
		
		JLabel label_6 = new JLabel("DRUKUJ");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_6.setBorder(new LineBorder(SystemColor.controlShadow));
		label_6.setBackground(SystemColor.controlHighlight);
		label_6.setBounds(1382, 297, 148, 25);
		JPanelLab_3.add(label_6);
		
		JLabel lblKartaTechniczna = new JLabel("Karta Techniczna");
		lblKartaTechniczna.setOpaque(true);
		lblKartaTechniczna.setHorizontalAlignment(SwingConstants.CENTER);
		lblKartaTechniczna.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKartaTechniczna.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKartaTechniczna.setBackground(SystemColor.controlHighlight);
		lblKartaTechniczna.setBounds(1382, 398, 148, 25);
		JPanelLab_3.add(lblKartaTechniczna);
		
		JLabel lblCertyfikat = new JLabel("Certyfikat");
		lblCertyfikat.setOpaque(true);
		lblCertyfikat.setHorizontalAlignment(SwingConstants.CENTER);
		lblCertyfikat.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblCertyfikat.setBorder(new LineBorder(SystemColor.controlShadow));
		lblCertyfikat.setBackground(SystemColor.controlHighlight);
		lblCertyfikat.setBounds(1382, 423, 148, 25);
		JPanelLab_3.add(lblCertyfikat);
		
		JLabel lblV_2 = new JLabel("v1");
		lblV_2.setOpaque(true);
		lblV_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_2.setBackground(SystemColor.controlHighlight);
		lblV_2.setBounds(1382, 448, 148, 25);
		JPanelLab_3.add(lblV_2);
		
		JLabel lblV_3 = new JLabel("v2");
		lblV_3.setOpaque(true);
		lblV_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_3.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_3.setBackground(SystemColor.controlHighlight);
		lblV_3.setBounds(1382, 473, 148, 25);
		JPanelLab_3.add(lblV_3);
		
		JLabel lblSprawdStan = new JLabel("Sprawd\u017A Stan");
		lblSprawdStan.setOpaque(true);
		lblSprawdStan.setHorizontalAlignment(SwingConstants.CENTER);
		lblSprawdStan.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblSprawdStan.setBorder(new LineBorder(SystemColor.controlShadow));
		lblSprawdStan.setBackground(SystemColor.controlHighlight);
		lblSprawdStan.setBounds(585, 297, 148, 25);
		JPanelLab_3.add(lblSprawdStan);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1382, 570, 148, 25);
		JPanelLab_3.add(comboBox);
		
		JLabel lblHandlowiec = new JLabel("Handlowiec");
		lblHandlowiec.setOpaque(true);
		lblHandlowiec.setHorizontalAlignment(SwingConstants.CENTER);
		lblHandlowiec.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblHandlowiec.setBorder(new LineBorder(SystemColor.controlShadow));
		lblHandlowiec.setBackground(SystemColor.controlHighlight);
		lblHandlowiec.setBounds(1382, 545, 148, 25);
		JPanelLab_3.add(lblHandlowiec);
		

		

		
	}
	private void initialize() {
		// TODO Auto-generated method stub
		
	}
}
