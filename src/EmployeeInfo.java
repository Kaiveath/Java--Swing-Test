import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EmployeeInfo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JComboBox comboBoxName;
	private JList listName;
	private JComboBox comboBoxSelection;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeInfo frame = new EmployeeInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JTextField lblNewLabelxxx;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldAGE;
	private JTextField textFieldSearch;
	private JMenu mnFile;
	private JMenu mnNewMenu;
	private JLabel lblClock;
	
	public void refreshTable()
	{
		try {
			String query="select EID,NAME,SURNAME,AGE from EmployeeInfo";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void fillComboBox()
	{
		try {
			String query="select * from EmployeeInfo";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{
				comboBoxName.addItem(rs.getString("Name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void loadList()
	{
		try {
			String query="select * from EmployeeInfo";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			DefaultListModel DLM=new DefaultListModel();
			while(rs.next())
			{
				DLM.addElement(rs.getString("NAME"));
			}
			listName.setModel(DLM);
			pst.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//public void clock()
//	{
//		Calendar cal=new GregorianCalendar();
//		int day=cal.get(Calendar.DAY_OF_MONTH);
//		int month=cal.get(Calendar.MONTH);
//		int year=cal.get(Calendar.YEAR);
		
//		int secound=cal.get(Calendar.SECOND);
//		int minute=cal.get(Calendar.MINUTE);
//		int hour=cal.get(Calendar.HOUR);
		
//		lblClock.setText("Time "+hour+":"+minute+":"+secound+"  Date  "+year+"/"+month+"/"+day);
		
//	}
	/**
	 * Create the frame.
	 */
	public EmployeeInfo() {
//		clock();
		
		connection=sqliteConnction.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1053, 619);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mnNewMenu = new JMenu("New");
		mnFile.add(mnNewMenu);
		Image img = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		mnNewMenu.setIcon(new ImageIcon(img));
		
		JMenuItem mntmJavaProject = new JMenuItem("Java Project");
		mnNewMenu.add(mntmJavaProject);
		
		JMenuItem mntmProject = new JMenuItem("Project");
		mnNewMenu.add(mntmProject);
		
		JMenuItem mntmOpenFile = new JMenuItem("Open File");
		mnFile.add(mntmOpenFile);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		JMenuItem mntmCloseAll = new JMenuItem("Close All");
		mnFile.add(mntmCloseAll);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JRadioButtonMenuItem rdbtnmntmRadioButton = new JRadioButtonMenuItem("Radio Button");
		mnEdit.add(rdbtnmntmRadioButton);
		
		JCheckBoxMenuItem chckbxmntmCheckBox = new JCheckBoxMenuItem("Check Box");
		mnEdit.add(chckbxmntmCheckBox);
		
		JMenu mnSource = new JMenu("Source");
		menuBar.add(mnSource);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoadTable = new JButton("Load Employee Data");
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="select EID,NAME,SURNAME,AGE from EmployeeInfo";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnLoadTable.setBounds(823, 38, 155, 25);
		contentPane.add(btnLoadTable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(415, 100, 562, 164);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try{
					int row =table.getSelectedRow();
					String EID_=(table.getModel().getValueAt(row, 0)).toString();
					
					String query="select * from EmployeeInfo where EID='"+EID_+"' ";
					PreparedStatement pst=connection.prepareStatement(query);
					
						ResultSet rs=pst.executeQuery();
						
						while(rs.next())
						{
							lblNewLabelxxx.setText(rs.getString("EID"));
							textFieldName.setText(rs.getString("NAME"));
							textFieldSurname.setText(rs.getString("SURNAME"));
							textFieldAGE.setText(rs.getString("AGE"));
						}
										
					pst.close();
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		scrollPane.setViewportView(table);
		

		
		lblNewLabelxxx = new JTextField();
		lblNewLabelxxx.setBounds(190, 121, 116, 22);
		contentPane.add(lblNewLabelxxx);
		//lblNewLabelxxx.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(190, 185, 116, 22);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldSurname = new JTextField();
		textFieldSurname.setBounds(190, 249, 116, 22);
		contentPane.add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		textFieldAGE = new JTextField();
		textFieldAGE.setBounds(190, 310, 116, 22);
		contentPane.add(textFieldAGE);
		textFieldAGE.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("EID");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel.setBackground(SystemColor.menu);
		lblNewLabel.setText("EID");
		lblNewLabel.setBounds(92, 112, 67, 37);
		contentPane.add(lblNewLabel);

		JLabel lblNAME = new JLabel("Name");
		lblNAME.setText("Name");
		lblNAME.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNAME.setBackground(SystemColor.menu);
		lblNAME.setBounds(92, 174, 67, 37); 
		contentPane.add(lblNAME);
		
		JLabel lblSurname = new JLabel("zzzzzz");
		lblSurname.setText("Surname");
		lblSurname.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblSurname.setBackground(SystemColor.menu);
		lblSurname.setBounds(92, 238, 89, 37);
		contentPane.add(lblSurname);
		
		JLabel lblAge = new JLabel();
		lblAge.setText("AGE");
		lblAge.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblAge.setBackground(SystemColor.menu);
		lblAge.setBounds(92, 299, 67, 37);
		contentPane.add(lblAge);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="insert into EmployeeInfo (EID,NAME,SURNAME,AGE) values (?,?,?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,lblNewLabelxxx.getText());
					pst.setString(2,textFieldName.getText());
					pst.setString(3,textFieldSurname.getText());
					pst.setString(4,textFieldAGE.getText());
					
					pst.execute(); 
					
					JOptionPane.showMessageDialog(null, "Date Saved");
					
					pst.close(); 
				
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				refreshTable();
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSave.setBounds(124, 390, 97, 25);
		contentPane.add(btnSave);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int action=JOptionPane.showConfirmDialog(null, "Do you really want to DELETE?", "DELETE",JOptionPane.YES_NO_OPTION);
				if(action==0){
				try{
					String query="delete from EmployeeInfo where EID='"+lblNewLabelxxx.getText()+"'  ";
					PreparedStatement pst=connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					
					pst.close();
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				refreshTable();
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBounds(124, 466, 97, 25);
		contentPane.add(btnDelete);
		
		JButton button_1 = new JButton("UPDATE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="Update EmployeeInfo set EID='"+lblNewLabelxxx.getText()+"' ,name='"+textFieldName.getText()+"' ,surname='"+textFieldSurname.getText()+"' ,age='"+textFieldAGE.getText()+"' where EID='"+lblNewLabelxxx.getText()+"'";
					PreparedStatement pst=connection.prepareStatement(query);
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Updated");
					
					pst.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				refreshTable();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBounds(124, 428, 97, 25);
		contentPane.add(button_1);
		
		comboBoxName = new JComboBox();
		comboBoxName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="select * from EmployeeInfo where name=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, (String)comboBoxName.getSelectedItem());
						ResultSet rs=pst.executeQuery();
						
						while(rs.next())
						{
							lblNewLabelxxx.setText(rs.getString("EID"));
							textFieldName.setText(rs.getString("NAME"));
							textFieldSurname.setText(rs.getString("SURNAME"));
							textFieldAGE.setText(rs.getString("AGE"));
						}
										
					pst.close();
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		comboBoxName.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBoxName.setBounds(92, 32, 214, 37);
		contentPane.add(comboBoxName);
		
		listName = new JList();
		listName.setBounds(418, 336, 560, 155);
		contentPane.add(listName);
		
		textFieldSearch = new JTextField();
		textFieldSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
					String selection=(String)comboBoxSelection.getSelectedItem();
					String query="select Eid,Name,Surname,Age from EmployeeInfo where "+selection+"=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textFieldSearch.getText());
						ResultSet rs=pst.executeQuery();
						
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
										
					pst.close();
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		textFieldSearch.setBounds(415, 32, 242, 37);
		contentPane.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		comboBoxSelection = new JComboBox();
		comboBoxSelection.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		comboBoxSelection.setModel(new DefaultComboBoxModel(new String[] {"EID", "Name", "Surname", "Age"}));
		comboBoxSelection.setBounds(669, 39, 142, 24);
		contentPane.add(comboBoxSelection);
		
		lblClock = new JLabel("clock");
		lblClock.setBounds(236, 390, 116, 25);
		contentPane.add(lblClock);
		
		refreshTable();
		fillComboBox();
		loadList();
	}
}
