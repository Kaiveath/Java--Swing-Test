import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class TabStart extends JPanel
{



	public TabStart() 
	{	
		setLayout(null);
		setSize(1582, 740);				//FULL
		


		JPanel PanelStart = new JPanel();
		add(PanelStart);
		PanelStart.setBounds(0, 0, 1582, 740);
		PanelStart.setLayout(null);
		
		JButton btnCalendar1_1 = new JButton("1");
		btnCalendar1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnCalendar1_1.setBounds(150, 380, 50, 50);
		PanelStart.add(btnCalendar1_1);	
		
		JButton btnCalendar1_2 = new JButton("2");
		btnCalendar1_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnCalendar1_2.setBounds(200, 380, 50, 50);
		PanelStart.add(btnCalendar1_2);	
		
				JButton btnCalendar1_3 = new JButton("3");
				btnCalendar1_3.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar1_3.setBounds(250, 380, 50, 50);
				PanelStart.add(btnCalendar1_3);
				
				JButton btnCalendar1_4 = new JButton("4");
				btnCalendar1_4.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar1_4.setBounds(300, 380, 50, 50);
				PanelStart.add(btnCalendar1_4);	
				
				JButton btnCalendar1_5 = new JButton("5");
				btnCalendar1_5.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar1_5.setBounds(350, 380, 50, 50);
				PanelStart.add(btnCalendar1_5);
				
				JButton btnCalendar1_6 = new JButton("6");
				btnCalendar1_6.setForeground(Color.GRAY);
				btnCalendar1_6.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar1_6.setBounds(400, 380, 50, 50);
				PanelStart.add(btnCalendar1_6);
				
				JButton btnCalendar1_7 = new JButton("7");
				btnCalendar1_7.setForeground(Color.RED);
				btnCalendar1_7.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar1_7.setBounds(450, 380, 50, 50);
				PanelStart.add(btnCalendar1_7);
				
				JButton btnCalendar2_1 = new JButton("8");
				btnCalendar2_1.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar2_1.setBounds(150, 430, 50, 50);
				PanelStart.add(btnCalendar2_1);
				
				JButton btnCalendar2_2 = new JButton("9");
				btnCalendar2_2.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar2_2.setBounds(200, 430, 50, 50);
				PanelStart.add(btnCalendar2_2);
				
				JButton btnCalendar2_3 = new JButton("10");
				btnCalendar2_3.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar2_3.setBounds(250, 430, 50, 50);
				PanelStart.add(btnCalendar2_3);
				
				JButton btnCalendar2_4 = new JButton("11");
				btnCalendar2_4.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar2_4.setBounds(300, 430, 50, 50);
				PanelStart.add(btnCalendar2_4);
				
				JButton btnCalendar2_5 = new JButton("12");
				btnCalendar2_5.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar2_5.setBounds(350, 430, 50, 50);
				PanelStart.add(btnCalendar2_5);
				
				JButton btnCalendar2_6 = new JButton("13");
				btnCalendar2_6.setForeground(Color.GRAY);
				btnCalendar2_6.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar2_6.setBounds(400, 430, 50, 50);
				PanelStart.add(btnCalendar2_6);
				
				JButton btnCalendar2_7 = new JButton("14");
				btnCalendar2_7.setForeground(Color.RED);
				btnCalendar2_7.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar2_7.setBounds(450, 430, 50, 50);
				PanelStart.add(btnCalendar2_7);
				
				JButton btnCalendar3_1 = new JButton("15");
				btnCalendar3_1.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar3_1.setBounds(150, 480, 50, 50);
				PanelStart.add(btnCalendar3_1);
				
				JButton btnCalendar3_2 = new JButton("16");
				btnCalendar3_2.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar3_2.setBounds(200, 480, 50, 50);
				PanelStart.add(btnCalendar3_2);
				
				JButton btnCalendar3_3 = new JButton("17");
				btnCalendar3_3.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar3_3.setBounds(250, 480, 50, 50);
				PanelStart.add(btnCalendar3_3);
				
				JButton btnCalendar3_4 = new JButton("18");
				btnCalendar3_4.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar3_4.setBounds(300, 480, 50, 50);
				PanelStart.add(btnCalendar3_4);
				
				JButton btnCalendar3_5 = new JButton("19");
				btnCalendar3_5.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar3_5.setBounds(350, 480, 50, 50);
				PanelStart.add(btnCalendar3_5);
				
				JButton btnCalendar3_6 = new JButton("20");
				btnCalendar3_6.setForeground(Color.GRAY);
				btnCalendar3_6.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar3_6.setBounds(400, 480, 50, 50);
				PanelStart.add(btnCalendar3_6);
				
				JButton btnCalendar3_7 = new JButton("21");
				btnCalendar3_7.setForeground(Color.RED);
				btnCalendar3_7.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar3_7.setBounds(450, 480, 50, 50);
				PanelStart.add(btnCalendar3_7);
				
				JButton	btnCalendar4_1_1 = new JButton("22");
				btnCalendar4_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar4_1_1.setBounds(150, 530, 50, 50);
				PanelStart.add(btnCalendar4_1_1);
				
				JButton btnCalendar4_2 = new JButton("23");
				btnCalendar4_2.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar4_2.setBounds(200, 530, 50, 50);
				PanelStart.add(btnCalendar4_2);
				
				JButton btnCalendar4_3 = new JButton("24");
				btnCalendar4_3.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar4_3.setBounds(250, 530, 50, 50);
				PanelStart.add(btnCalendar4_3);
				
				JButton btnCalendar4_4 = new JButton("25");
				btnCalendar4_4.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar4_4.setBounds(300, 530, 50, 50);
				PanelStart.add(btnCalendar4_4);
				
				JButton btnCalendar4_5 = new JButton("26");
				btnCalendar4_5.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar4_5.setBounds(350, 530, 50, 50);
				PanelStart.add(btnCalendar4_5);
				
				JButton btnCalendar4_6 = new JButton("27");
				btnCalendar4_6.setForeground(Color.GRAY);
				btnCalendar4_6.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar4_6.setBounds(400, 530, 50, 50);
				PanelStart.add(btnCalendar4_6);
				
				JButton btnCalendar4_7 = new JButton("28");
				btnCalendar4_7.setForeground(Color.RED);
				btnCalendar4_7.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar4_7.setBounds(450, 530, 50, 50);
				PanelStart.add(btnCalendar4_7);
				
				JButton btnCalendar5_1 = new JButton("29");
				btnCalendar5_1.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar5_1.setBounds(150, 580, 50, 50);
				PanelStart.add(btnCalendar5_1);
				
				JButton btnCalendar5_2 = new JButton("30");
				btnCalendar5_2.setFont(new Font("Calibri", Font.PLAIN, 15));
				btnCalendar5_2.setBounds(200, 580, 50, 50);
				PanelStart.add(btnCalendar5_2);
				
		JButton btnCalendar5_3 = new JButton("31");
		btnCalendar5_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnCalendar5_3.setBounds(250, 580, 50, 50);
		PanelStart.add(btnCalendar5_3);	
		
		JButton btnCalendar5_4 = new JButton("1");
		btnCalendar5_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnCalendar5_4.setBounds(300, 580, 50, 50);
		PanelStart.add(btnCalendar5_4);
		
			JButton btnCalendar5_5 = new JButton("2");
			btnCalendar5_5.setFont(new Font("Calibri", Font.PLAIN, 15));
			btnCalendar5_5.setBounds(350, 580, 50, 50);
			PanelStart.add(btnCalendar5_5);
			
			JButton btnCalendar5_6 = new JButton("3");
			btnCalendar5_6.setForeground(Color.GRAY);
			btnCalendar5_6.setFont(new Font("Calibri", Font.PLAIN, 15));
			btnCalendar5_6.setBounds(400, 580, 50, 50);
			PanelStart.add(btnCalendar5_6);	
			
			JButton btnCalendar5_7 = new JButton("4");
			btnCalendar5_7.setForeground(Color.RED);
			btnCalendar5_7.setFont(new Font("Calibri", Font.PLAIN, 15));
			btnCalendar5_7.setBounds(450, 580, 50, 50);
			PanelStart.add(btnCalendar5_7);
			
			JLabel labelMonday = new JLabel("PN");
			labelMonday.setHorizontalAlignment(SwingConstants.CENTER);
			labelMonday.setFont(new Font("Calibri", Font.BOLD, 22));
			labelMonday.setBounds(155, 335, 40, 40);
			PanelStart.add(labelMonday);
			
			JLabel labelTuesday = new JLabel("WT");
			labelTuesday.setHorizontalAlignment(SwingConstants.CENTER);
			labelTuesday.setFont(new Font("Calibri", Font.BOLD, 22));
			labelTuesday.setBounds(205, 335, 40, 40);
			PanelStart.add(labelTuesday);
			
			JLabel labelWednesday = new JLabel("ŒR");
			labelWednesday.setHorizontalAlignment(SwingConstants.CENTER);
			labelWednesday.setFont(new Font("Calibri", Font.BOLD, 22));
			labelWednesday.setBounds(255, 335, 40, 40);
			PanelStart.add(labelWednesday);
			
			JLabel labelThursday = new JLabel("CZ");
			labelThursday.setHorizontalAlignment(SwingConstants.CENTER);
			labelThursday.setFont(new Font("Calibri", Font.BOLD, 22));
			labelThursday.setBounds(305, 335, 40, 40);
			PanelStart.add(labelThursday);
			
			JLabel labelFriday = new JLabel("PT");
			labelFriday.setHorizontalAlignment(SwingConstants.CENTER);
			labelFriday.setFont(new Font("Calibri", Font.BOLD, 22));
			labelFriday.setBounds(355, 335, 40, 40);
			PanelStart.add(labelFriday);
			
			JLabel labelSaturday = new JLabel("SB");
			labelSaturday.setForeground(Color.GRAY);
			labelSaturday.setHorizontalAlignment(SwingConstants.CENTER);
			labelSaturday.setFont(new Font("Calibri", Font.BOLD, 22));
			labelSaturday.setBounds(405, 335, 40, 40);
			PanelStart.add(labelSaturday);
			
			JLabel labelSunday = new JLabel("ND");
			labelSunday.setForeground(Color.RED);
			labelSunday.setHorizontalAlignment(SwingConstants.CENTER);
			labelSunday.setFont(new Font("Calibri", Font.BOLD, 22));
			labelSunday.setBounds(455, 335, 40, 40);
			PanelStart.add(labelSunday);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(715, 91, 687, 426);
			PanelStart.add(scrollPane_2);
			
			JLabel lblPowiadomienia = new JLabel("Powiadomienia");
			lblPowiadomienia.setHorizontalAlignment(SwingConstants.CENTER);
			lblPowiadomienia.setFont(new Font("Calibri", Font.PLAIN, 27));
			lblPowiadomienia.setBounds(715, 53, 686, 40);
			PanelStart.add(lblPowiadomienia);
			lblPowiadomienia.setBorder(new LineBorder(SystemColor.controlShadow));
			lblPowiadomienia.setBackground(SystemColor.controlHighlight);
			lblPowiadomienia.setOpaque(true);
			
			JLabel lblNowe = new JLabel("Dodaj");
			lblNowe.setOpaque(true);
			lblNowe.setHorizontalAlignment(SwingConstants.CENTER);
			lblNowe.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblNowe.setBorder(new LineBorder(SystemColor.controlShadow));
			lblNowe.setBackground(SystemColor.controlHighlight);
			lblNowe.setBounds(713, 530, 79, 26);
			PanelStart.add(lblNowe);
			
			JLabel lblUsu = new JLabel("Usu\u0144");
			lblUsu.setOpaque(true);
			lblUsu.setHorizontalAlignment(SwingConstants.CENTER);
			lblUsu.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblUsu.setBorder(new LineBorder(SystemColor.controlShadow));
			lblUsu.setBackground(SystemColor.controlHighlight);
			lblUsu.setBounds(713, 569, 79, 26);
			PanelStart.add(lblUsu);
			
			JLabel lblWarunki = new JLabel("Warunki");
			lblWarunki.setOpaque(true);
			lblWarunki.setHorizontalAlignment(SwingConstants.CENTER);
			lblWarunki.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblWarunki.setBorder(new LineBorder(SystemColor.controlShadow));
			lblWarunki.setBackground(SystemColor.controlHighlight);
			lblWarunki.setBounds(713, 609, 79, 26);
			PanelStart.add(lblWarunki);
			
			JLabel lblZgoda = new JLabel("Zgoda");
			lblZgoda.setOpaque(true);
			lblZgoda.setHorizontalAlignment(SwingConstants.CENTER);
			lblZgoda.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblZgoda.setBorder(new LineBorder(SystemColor.controlShadow));
			lblZgoda.setBackground(SystemColor.controlHighlight);
			lblZgoda.setBounds(816, 530, 79, 26);
			PanelStart.add(lblZgoda);
			
			JLabel lblOdpowiedz = new JLabel("Odpowiedz");
			lblOdpowiedz.setOpaque(true);
			lblOdpowiedz.setHorizontalAlignment(SwingConstants.CENTER);
			lblOdpowiedz.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblOdpowiedz.setBorder(new LineBorder(SystemColor.controlShadow));
			lblOdpowiedz.setBackground(SystemColor.controlHighlight);
			lblOdpowiedz.setBounds(816, 569, 79, 26);
			PanelStart.add(lblOdpowiedz);
			
			JLabel lblV = new JLabel("Archiwizuj");
			lblV.setOpaque(true);
			lblV.setHorizontalAlignment(SwingConstants.CENTER);
			lblV.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblV.setBorder(new LineBorder(SystemColor.controlShadow));
			lblV.setBackground(SystemColor.controlHighlight);
			lblV.setBounds(816, 609, 79, 26);
			PanelStart.add(lblV);
			
			JLabel lblV_3 = new JLabel("v4");
			lblV_3.setOpaque(true);
			lblV_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblV_3.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblV_3.setBorder(new LineBorder(SystemColor.controlShadow));
			lblV_3.setBackground(SystemColor.controlHighlight);
			lblV_3.setBounds(918, 609, 79, 26);
			PanelStart.add(lblV_3);
			
			JLabel lblV_1 = new JLabel("Od\u015Bwie\u017C");
			lblV_1.setOpaque(true);
			lblV_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblV_1.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblV_1.setBorder(new LineBorder(SystemColor.controlShadow));
			lblV_1.setBackground(SystemColor.controlHighlight);
			lblV_1.setBounds(918, 530, 79, 26);
			PanelStart.add(lblV_1);
			
			JLabel lblV_2 = new JLabel("v3");
			lblV_2.setOpaque(true);
			lblV_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblV_2.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblV_2.setBorder(new LineBorder(SystemColor.controlShadow));
			lblV_2.setBackground(SystemColor.controlHighlight);
			lblV_2.setBounds(918, 569, 79, 26);
			PanelStart.add(lblV_2);
			
			JLabel label_1 = new JLabel("+");
			label_1.setOpaque(true);
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setFont(new Font("Calibri", Font.PLAIN, 16));
			label_1.setBorder(new LineBorder(SystemColor.controlShadow));
			label_1.setBackground(SystemColor.controlHighlight);
			label_1.setBounds(1161, 530, 23, 26);
			PanelStart.add(label_1);
			
			JLabel label_2 = new JLabel("-");
			label_2.setOpaque(true);
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setFont(new Font("Calibri", Font.PLAIN, 16));
			label_2.setBorder(new LineBorder(SystemColor.controlShadow));
			label_2.setBackground(SystemColor.controlHighlight);
			label_2.setBounds(1139, 530, 23, 26);
			PanelStart.add(label_2);
			
			JLabel label_3 = new JLabel("1");
			label_3.setOpaque(true);
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setFont(new Font("Calibri", Font.PLAIN, 16));
			label_3.setBorder(new LineBorder(SystemColor.controlShadow));
			label_3.setBackground(SystemColor.controlHighlight);
			label_3.setBounds(1108, 530, 23, 26);
			PanelStart.add(label_3);
			
			JLabel lblPriorytet = new JLabel("Priorytet");
			lblPriorytet.setOpaque(true);
			lblPriorytet.setHorizontalAlignment(SwingConstants.CENTER);
			lblPriorytet.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblPriorytet.setBorder(new LineBorder(SystemColor.controlShadow));
			lblPriorytet.setBackground(SystemColor.controlHighlight);
			lblPriorytet.setBounds(1017, 530, 79, 26);
			PanelStart.add(lblPriorytet);
			
			JComboBox comboBox_12 = new JComboBox();
			comboBox_12.setBounds(1243, 613, 57, 22);
			PanelStart.add(comboBox_12);
			
			JComboBox comboBox_13 = new JComboBox();
			comboBox_13.setBounds(1240, 578, 57, 22);
			PanelStart.add(comboBox_13);
			
			JComboBox comboBox_14 = new JComboBox();
			comboBox_14.setBounds(1180, 613, 57, 22);
			PanelStart.add(comboBox_14);
			
			JComboBox comboBox_15 = new JComboBox();
			comboBox_15.setBounds(1177, 578, 57, 22);
			PanelStart.add(comboBox_15);
			
			JComboBox comboBox_16 = new JComboBox();
			comboBox_16.setBounds(1094, 578, 71, 22);
			PanelStart.add(comboBox_16);
			
			JComboBox comboBox_17 = new JComboBox();
			comboBox_17.setBounds(1096, 613, 72, 22);
			PanelStart.add(comboBox_17);
			
			JLabel lblOd = new JLabel("Od:");
			lblOd.setOpaque(true);
			lblOd.setHorizontalAlignment(SwingConstants.CENTER);
			lblOd.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblOd.setBorder(new LineBorder(SystemColor.controlShadow));
			lblOd.setBackground(SystemColor.controlHighlight);
			lblOd.setBounds(1016, 569, 66, 26);
			PanelStart.add(lblOd);
			
			JLabel lblDo = new JLabel("Do:");
			lblDo.setOpaque(true);
			lblDo.setHorizontalAlignment(SwingConstants.CENTER);
			lblDo.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblDo.setBorder(new LineBorder(SystemColor.controlShadow));
			lblDo.setBackground(SystemColor.controlHighlight);
			lblDo.setBounds(1017, 609, 65, 26);
			PanelStart.add(lblDo);
			
			JLabel lblUstawienia = new JLabel("Ustawienia");
			lblUstawienia.addMouseListener(new MouseAdapter() 
			{
		
				@Override
				public void mouseEntered(MouseEvent arg0) 
				{
					lblUstawienia.setBackground(Color.GRAY);
				}
				public void mouseExited(MouseEvent arg0) 
				{
					lblUstawienia.setBackground(SystemColor.controlHighlight);									
				}
			});	
			

			

			lblUstawienia.setOpaque(true);
			lblUstawienia.setHorizontalAlignment(SwingConstants.CENTER);
			lblUstawienia.setFont(new Font("Calibri", Font.PLAIN, 15));
			lblUstawienia.setBorder(new LineBorder(SystemColor.controlShadow));
			lblUstawienia.setBackground(SystemColor.controlHighlight);
			lblUstawienia.setBounds(50, 58, 150, 137);
			PanelStart.add(lblUstawienia);
			
			JScrollPane scrollPane_6 = new JScrollPane();
			scrollPane_6.setBounds(250, 67, 434, 255);
			PanelStart.add(scrollPane_6);
			
			JTextArea txtrZalegokredytzleceniadostawaSurowca = new JTextArea();
			txtrZalegokredytzleceniadostawaSurowca.setFont(new Font("Monospaced", Font.PLAIN, 15));
			txtrZalegokredytzleceniadostawaSurowca.setText("zaleg\u0142o\u015B\u0107/kredyt/zlecenia/dostawa surowca/\r\nmini mail/ krd.../");
			scrollPane_6.setViewportView(txtrZalegokredytzleceniadostawaSurowca);
		
		
		
		
	}
}
