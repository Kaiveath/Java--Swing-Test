import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;


public class TabAdm_1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabAdm_1() {
		
		setSize(1582, 690);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelAdm_1 = new JPanel();
		JPanelAdm_1.setBounds(0, 0, 1582, 690);							// ZMNIEJSZYÆ !!!
		add(JPanelAdm_1);
		JPanelAdm_1.setLayout(null);
		
		JLabel lblUytkownicy = new JLabel("U\u017Cytkownicy");
		lblUytkownicy.setHorizontalAlignment(SwingConstants.CENTER);
		lblUytkownicy.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblUytkownicy.setBounds(250, 13, 942, 59);
		JPanelAdm_1.add(lblUytkownicy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 127, 942, 520);
		JPanelAdm_1.add(scrollPane);
		
		JLabel label = new JLabel("Lp.");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.PLAIN, 15));
		label.setBorder(new LineBorder(SystemColor.controlShadow));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(250, 89, 50, 25);
		JPanelAdm_1.add(label);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		lblImi.setOpaque(true);
		lblImi.setHorizontalAlignment(SwingConstants.CENTER);
		lblImi.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblImi.setBorder(new LineBorder(SystemColor.controlShadow));
		lblImi.setBackground(SystemColor.controlHighlight);
		lblImi.setBounds(300, 89, 120, 25);
		JPanelAdm_1.add(lblImi);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setOpaque(true);
		lblNazwisko.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwisko.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwisko.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwisko.setBackground(SystemColor.controlHighlight);
		lblNazwisko.setBounds(420, 89, 200, 25);
		JPanelAdm_1.add(lblNazwisko);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setOpaque(true);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblLogin.setBorder(new LineBorder(SystemColor.controlShadow));
		lblLogin.setBackground(SystemColor.controlHighlight);
		lblLogin.setBounds(620, 89, 120, 25);
		JPanelAdm_1.add(lblLogin);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setOpaque(true);
		lblTelefon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefon.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTelefon.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTelefon.setBackground(SystemColor.controlHighlight);
		lblTelefon.setBounds(740, 89, 166, 25);
		JPanelAdm_1.add(lblTelefon);
		
		JLabel lblGrupa = new JLabel("Grupa");
		lblGrupa.setOpaque(true);
		lblGrupa.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupa.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGrupa.setBorder(new LineBorder(SystemColor.controlShadow));
		lblGrupa.setBackground(SystemColor.controlHighlight);
		lblGrupa.setBounds(906, 89, 157, 25);
		JPanelAdm_1.add(lblGrupa);
		
		JLabel lblZmiana = new JLabel("Status");
		lblZmiana.setOpaque(true);
		lblZmiana.setHorizontalAlignment(SwingConstants.CENTER);
		lblZmiana.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZmiana.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZmiana.setBackground(SystemColor.controlHighlight);
		lblZmiana.setBounds(1063, 89, 132, 25);
		JPanelAdm_1.add(lblZmiana);
		
		JLabel lblDodaj = new JLabel("Szczeg\u00F3\u0142y");
		lblDodaj.setOpaque(true);
		lblDodaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblDodaj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDodaj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDodaj.setBackground(SystemColor.controlHighlight);
		lblDodaj.setBounds(1294, 125, 200, 25);
		JPanelAdm_1.add(lblDodaj);
		
		JLabel lblEdytuj = new JLabel("Dodaj");
		lblEdytuj.setOpaque(true);
		lblEdytuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdytuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEdytuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblEdytuj.setBackground(SystemColor.controlHighlight);
		lblEdytuj.setBounds(1294, 150, 200, 25);
		JPanelAdm_1.add(lblEdytuj);
		
		lblEdytuj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Users goUsers=new Users();
				goUsers.setVisible(true);
			}
		});
		lblEdytuj.addMouseListener(new MouseAdapter() 
		{
	
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				lblEdytuj.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				lblEdytuj.setBackground(SystemColor.controlHighlight);									
			}
		});	
		
		JLabel lblUsu = new JLabel("Usu\u0144");
		lblUsu.setOpaque(true);
		lblUsu.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsu.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUsu.setBorder(new LineBorder(SystemColor.controlShadow));
		lblUsu.setBackground(SystemColor.controlHighlight);
		lblUsu.setBounds(1294, 175, 200, 25);
		JPanelAdm_1.add(lblUsu);
		
		JLabel lblZarzdzanieGrafikiem = new JLabel("Zarz\u0105dzanie Grafikiem");
		lblZarzdzanieGrafikiem.setOpaque(true);
		lblZarzdzanieGrafikiem.setHorizontalAlignment(SwingConstants.CENTER);
		lblZarzdzanieGrafikiem.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZarzdzanieGrafikiem.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZarzdzanieGrafikiem.setBackground(SystemColor.controlHighlight);
		lblZarzdzanieGrafikiem.setBounds(1294, 200, 200, 25);
		JPanelAdm_1.add(lblZarzdzanieGrafikiem);
		
		lblZarzdzanieGrafikiem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TimeTable goTimeTable=new TimeTable();
				goTimeTable.setVisible(true);
			}
		});
		lblZarzdzanieGrafikiem.addMouseListener(new MouseAdapter() 
		{
	
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				lblZarzdzanieGrafikiem.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				lblZarzdzanieGrafikiem.setBackground(SystemColor.controlHighlight);									
			}
		});	
		
		
		JLabel lblV = new JLabel("v1");
		lblV.setOpaque(true);
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		lblV.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV.setBackground(SystemColor.controlHighlight);
		lblV.setBounds(1294, 225, 200, 25);
		JPanelAdm_1.add(lblV);
		
		JLabel lblV_1 = new JLabel("v2");
		lblV_1.setOpaque(true);
		lblV_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_1.setBackground(SystemColor.controlHighlight);
		lblV_1.setBounds(1294, 250, 200, 25);
		JPanelAdm_1.add(lblV_1);
		
		JLabel lblV_2 = new JLabel("v3");
		lblV_2.setOpaque(true);
		lblV_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_2.setBackground(SystemColor.controlHighlight);
		lblV_2.setBounds(1294, 275, 200, 25);
		JPanelAdm_1.add(lblV_2);


	}
}
