import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Headline extends JPanel {

	/**
	 * Create the panel.
	 */
	public Headline() {

		setSize(1582, 82);												
		setLayout(null);
		
		JPanel JPanelHeadline = new JPanel();
		JPanelHeadline.setBounds(0, 0, 1582, 82);							
		add(JPanelHeadline);
		JPanelHeadline.setBackground(new Color(0,206,209));		
		JPanelHeadline.setLayout(null);
		
		
		
		JLabel labelCompany = new JLabel("Nice Company Sp. z o.o.");
		labelCompany.setBounds(12, 9, 427, 59);
		JPanelHeadline.add(labelCompany);
		labelCompany.setForeground(new Color(0,102,102));
		labelCompany.setHorizontalAlignment(SwingConstants.LEFT);
		labelCompany.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
		JLabel lblAlertAll2 = new JLabel("15");
		lblAlertAll2.setBounds(1426, 48, 29, 26);
		JPanelHeadline.add(lblAlertAll2);
		lblAlertAll2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAlertAll2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlertAll2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblAlertAll2.setForeground(new Color(165, 42, 42));
		
		JLabel labelDate = new JLabel("05-pa\u017A-2017");
		labelDate.setBounds(1095, 5, 127, 39);
		JPanelHeadline.add(labelDate);
		labelDate.setHorizontalAlignment(SwingConstants.LEFT);
		labelDate.setFont(new Font("Calibri", Font.BOLD, 22));
		labelDate.setForeground(new Color(0,102,102));

		
		JLabel labelDateWeek = new JLabel("40 tydzie\u0144");
		labelDateWeek.setBounds(1095, 42, 127, 39);
		JPanelHeadline.add(labelDateWeek);
		labelDateWeek.setHorizontalAlignment(SwingConstants.LEFT);
		labelDateWeek.setFont(new Font("Calibri", Font.BOLD, 20));
		labelDateWeek.setForeground(new Color(0,102,102));

		
		JLabel labelClock = new JLabel("17:45");
		labelClock.setBounds(1216, 0, 166, 81);
		JPanelHeadline.add(labelClock);
		labelClock.setHorizontalAlignment(SwingConstants.CENTER);
		labelClock.setFont(new Font("Calibri", Font.BOLD, 40));
		labelClock.setForeground(new Color(0,102,102));

		
		JLabel labelLogedAs = new JLabel("zalogowany: MARCIN");
		labelLogedAs.setBounds(1398, 5, 172, 20);
		JPanelHeadline.add(labelLogedAs);
		labelLogedAs.setHorizontalAlignment(SwingConstants.RIGHT);
		labelLogedAs.setFont(new Font("Calibri", Font.PLAIN, 15));
		labelLogedAs.setForeground(new Color(0,102,102));

		
		JLabel lblWyloguj = new JLabel("Wyloguj");
		lblWyloguj.setBounds(1491, 33, 79, 26);
		JPanelHeadline.add(lblWyloguj);
		lblWyloguj.setOpaque(true);
		lblWyloguj.setHorizontalAlignment(SwingConstants.CENTER);
		lblWyloguj.setFont(new Font("Calibri", Font.BOLD, 15));
		lblWyloguj.setForeground(new Color(0,206,209));
		lblWyloguj.setBorder(null);
		lblWyloguj.setBackground(new Color(0,102,102));
		
		JLabel labelAlertSpecial = new JLabel("5");
		labelAlertSpecial.setBounds(1338, 5, 102, 75);
		JPanelHeadline.add(labelAlertSpecial);
		labelAlertSpecial.setForeground(new Color(255, 0, 0));
		labelAlertSpecial.setBackground(Color.RED);
		labelAlertSpecial.setHorizontalAlignment(SwingConstants.CENTER);
		labelAlertSpecial.setFont(new Font("Calibri", Font.BOLD, 40));

	}

}
