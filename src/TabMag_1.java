import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class TabMag_1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabMag_1()
	{

		setSize(1582, 690);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelMag_1 = new JPanel();
		JPanelMag_1.setBounds(0, 0, 1582, 690);							// ZMNIEJSZYÆ !!!
		add(JPanelMag_1);
		JPanelMag_1.setLayout(null);
		
		JLabel lblMag1_1 = new JLabel("MAGAZYN");
		lblMag1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblMag1_1.setBounds(44, 32, 98, 26);
		JPanelMag_1.add(lblMag1_1);
		
			JComboBox comboBoxMag1_1 = new JComboBox();
			comboBoxMag1_1.setBounds(158, 32, 137, 26);
			JPanelMag_1.add(comboBoxMag1_1);
			
				JScrollPane scrollPaneMag1_1 = new JScrollPane();
				scrollPaneMag1_1.setBounds(43, 77, 538, 274);
				JPanelMag_1.add(scrollPaneMag1_1);
				
					JTable tableMag1_1 = new JTable();
					scrollPaneMag1_1.setViewportView(tableMag1_1);
					
						JTextField textFieldMag1_1 = new JTextField();
						textFieldMag1_1.setBounds(41, 364, 540, 38);
						JPanelMag_1.add(textFieldMag1_1);
						textFieldMag1_1.setColumns(10);
						
						JButton btnMag1_5 = new JButton("RW");
						btnMag1_5.setFont(new Font("Calibri", Font.BOLD, 20));
						btnMag1_5.setBounds(652, 253, 144, 32);
						JPanelMag_1.add(btnMag1_5);
						
						JButton btnMag1_2 = new JButton("MM");
						btnMag1_2.addActionListener(new ActionListener() 
						{
							public void actionPerformed(ActionEvent arg0)
							{
								Documents goDoc=new Documents();
								goDoc.setVisible(true);
							}
						});
						btnMag1_2.setFont(new Font("Calibri", Font.BOLD, 20));
						btnMag1_2.setBounds(652, 122, 144, 32);
						JPanelMag_1.add(btnMag1_2);
						
						JButton btnMag1_3 = new JButton("DW");
						btnMag1_3.setFont(new Font("Calibri", Font.BOLD, 20));
						btnMag1_3.setBounds(652, 167, 144, 32);
						JPanelMag_1.add(btnMag1_3);
						
						JButton btnMag1_4 = new JButton("PW");
						btnMag1_4.setFont(new Font("Calibri", Font.BOLD, 20));
						btnMag1_4.setBounds(652, 212, 144, 32);
						JPanelMag_1.add(btnMag1_4);
						
						JTextField textField = new JTextField();
						textField.setColumns(10);
						textField.setBounds(652, 313, 144, 38);
						JPanelMag_1.add(textField);
						
						JButton btnMag1_1 = new JButton("INFO");
						btnMag1_1.setFont(new Font("Calibri", Font.BOLD, 20));
						btnMag1_1.setBounds(652, 73, 144, 32);
						JPanelMag_1.add(btnMag1_1);
						
						JButton btnMag1_7 = new JButton("Drukuj");
						btnMag1_7.setFont(new Font("Calibri", Font.BOLD, 20));
						btnMag1_7.setBounds(1239, 415, 144, 32);
						JPanelMag_1.add(btnMag1_7);
						
						JButton btnMag1_6 = new JButton("Usu\u0144");
						btnMag1_6.setFont(new Font("Calibri", Font.BOLD, 20));
						btnMag1_6.setBounds(1087, 415, 144, 32);
						JPanelMag_1.add(btnMag1_6);
		
	}

}
