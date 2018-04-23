import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class TabMag_3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabMag_3() {

		setSize(1582, 690);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelMag_3 = new JPanel();
		JPanelMag_3.setBounds(0, 0, 1582, 690);							// ZMNIEJSZYÆ !!!
		add(JPanelMag_3);
		JPanelMag_3.setLayout(null);
		
		JLabel lblLp_1 = new JLabel("Lp.");
		lblLp_1.setOpaque(true);
		lblLp_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLp_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblLp_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblLp_1.setBackground(SystemColor.controlHighlight);
		lblLp_1.setBounds(23, 75, 200, 25);
		JPanelMag_3.add(lblLp_1);
		
		JLabel lblNazwaDostawcy = new JLabel("Nazwa dostawcy");
		lblNazwaDostawcy.setOpaque(true);
		lblNazwaDostawcy.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaDostawcy.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaDostawcy.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaDostawcy.setBackground(SystemColor.controlHighlight);
		lblNazwaDostawcy.setBounds(23, 100, 200, 25);
		JPanelMag_3.add(lblNazwaDostawcy);
		
		JLabel lblKodPocztowy = new JLabel("Kraj");
		lblKodPocztowy.setOpaque(true);
		lblKodPocztowy.setHorizontalAlignment(SwingConstants.CENTER);
		lblKodPocztowy.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKodPocztowy.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKodPocztowy.setBackground(SystemColor.controlHighlight);
		lblKodPocztowy.setBounds(23, 125, 200, 25);
		JPanelMag_3.add(lblKodPocztowy);
		
		JLabel lblMiasto = new JLabel("Miasto");
		lblMiasto.setOpaque(true);
		lblMiasto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiasto.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblMiasto.setBorder(new LineBorder(SystemColor.controlShadow));
		lblMiasto.setBackground(SystemColor.controlHighlight);
		lblMiasto.setBounds(23, 150, 200, 25);
		JPanelMag_3.add(lblMiasto);
		
		JLabel lblKraj = new JLabel("Kod pocztowy");
		lblKraj.setOpaque(true);
		lblKraj.setHorizontalAlignment(SwingConstants.CENTER);
		lblKraj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKraj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKraj.setBackground(SystemColor.controlHighlight);
		lblKraj.setBounds(23, 175, 200, 25);
		JPanelMag_3.add(lblKraj);
		
		JLabel lblUlica = new JLabel("Ulica");
		lblUlica.setOpaque(true);
		lblUlica.setHorizontalAlignment(SwingConstants.CENTER);
		lblUlica.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUlica.setBorder(new LineBorder(SystemColor.controlShadow));
		lblUlica.setBackground(SystemColor.controlHighlight);
		lblUlica.setBounds(23, 200, 200, 25);
		JPanelMag_3.add(lblUlica);
		
		JLabel lblNr = new JLabel("Nr");
		lblNr.setOpaque(true);
		lblNr.setHorizontalAlignment(SwingConstants.CENTER);
		lblNr.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNr.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNr.setBackground(SystemColor.controlHighlight);
		lblNr.setBounds(23, 225, 200, 25);
		JPanelMag_3.add(lblNr);
		
		JLabel lblTelefon = new JLabel("Telefon v1");
		lblTelefon.setOpaque(true);
		lblTelefon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefon.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTelefon.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTelefon.setBackground(SystemColor.controlHighlight);
		lblTelefon.setBounds(23, 250, 200, 25);
		JPanelMag_3.add(lblTelefon);
		
		JLabel lblTelefon_1 = new JLabel("Telefon v2");
		lblTelefon_1.setOpaque(true);
		lblTelefon_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefon_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTelefon_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTelefon_1.setBackground(SystemColor.controlHighlight);
		lblTelefon_1.setBounds(23, 275, 200, 25);
		JPanelMag_3.add(lblTelefon_1);
		
		JLabel lblWarunki_1 = new JLabel("Termin p\u0142atno\u015Bci");
		lblWarunki_1.setOpaque(true);
		lblWarunki_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarunki_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWarunki_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWarunki_1.setBackground(SystemColor.controlHighlight);
		lblWarunki_1.setBounds(23, 375, 200, 25);
		JPanelMag_3.add(lblWarunki_1);
		
		JLabel lblNip = new JLabel("NIP");
		lblNip.setOpaque(true);
		lblNip.setHorizontalAlignment(SwingConstants.CENTER);
		lblNip.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNip.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNip.setBackground(SystemColor.controlHighlight);
		lblNip.setBounds(23, 350, 200, 25);
		JPanelMag_3.add(lblNip);
		
		JLabel lblMailV_1 = new JLabel("Mail v2");
		lblMailV_1.setOpaque(true);
		lblMailV_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMailV_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblMailV_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblMailV_1.setBackground(SystemColor.controlHighlight);
		lblMailV_1.setBounds(23, 325, 200, 25);
		JPanelMag_3.add(lblMailV_1);
		
		JLabel lblMailV = new JLabel("Mail v1");
		lblMailV.setOpaque(true);
		lblMailV.setHorizontalAlignment(SwingConstants.CENTER);
		lblMailV.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblMailV.setBorder(new LineBorder(SystemColor.controlShadow));
		lblMailV.setBackground(SystemColor.controlHighlight);
		lblMailV.setBounds(23, 300, 200, 25);
		JPanelMag_3.add(lblMailV);
		
		JLabel lblRodzajTransportu = new JLabel("Rodzaj transportu");
		lblRodzajTransportu.setOpaque(true);
		lblRodzajTransportu.setHorizontalAlignment(SwingConstants.CENTER);
		lblRodzajTransportu.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRodzajTransportu.setBorder(new LineBorder(SystemColor.controlShadow));
		lblRodzajTransportu.setBackground(SystemColor.controlHighlight);
		lblRodzajTransportu.setBounds(23, 400, 200, 25);
		JPanelMag_3.add(lblRodzajTransportu);
		
		JLabel lblOpis_1 = new JLabel("Opis");
		lblOpis_1.setOpaque(true);
		lblOpis_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpis_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblOpis_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblOpis_1.setBackground(SystemColor.controlHighlight);
		lblOpis_1.setBounds(23, 425, 200, 25);
		JPanelMag_3.add(lblOpis_1);
		
		JLabel lblV_4 = new JLabel("v1");
		lblV_4.setOpaque(true);
		lblV_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_4.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_4.setBackground(SystemColor.controlHighlight);
		lblV_4.setBounds(23, 450, 200, 25);
		JPanelMag_3.add(lblV_4);
		
		JLabel lblV_5 = new JLabel("v2");
		lblV_5.setOpaque(true);
		lblV_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_5.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_5.setBackground(SystemColor.controlHighlight);
		lblV_5.setBounds(23, 475, 200, 25);
		JPanelMag_3.add(lblV_5);
		
		JLabel lblV_6 = new JLabel("v3");
		lblV_6.setOpaque(true);
		lblV_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_6.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_6.setBackground(SystemColor.controlHighlight);
		lblV_6.setBounds(23, 500, 200, 25);
		JPanelMag_3.add(lblV_6);
		
		JLabel lblV_7 = new JLabel("v4");
		lblV_7.setOpaque(true);
		lblV_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_7.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_7.setBackground(SystemColor.controlHighlight);
		lblV_7.setBounds(23, 525, 200, 25);
		JPanelMag_3.add(lblV_7);
		
		JLabel lblV_8 = new JLabel("v5");
		lblV_8.setOpaque(true);
		lblV_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_8.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_8.setBackground(SystemColor.controlHighlight);
		lblV_8.setBounds(23, 550, 200, 25);
		JPanelMag_3.add(lblV_8);
		
		JLabel lblV_9 = new JLabel("v6");
		lblV_9.setOpaque(true);
		lblV_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_9.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_9.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_9.setBackground(SystemColor.controlHighlight);
		lblV_9.setBounds(23, 575, 200, 25);
		JPanelMag_3.add(lblV_9);
		
		JLabel lblDaneOglne = new JLabel("Dane og\u00F3lne:");
		lblDaneOglne.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaneOglne.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblDaneOglne.setBounds(27, 13, 556, 59);
		JPanelMag_3.add(lblDaneOglne);
		
		JLabel lblAsortyment = new JLabel("Asortyment:");
		lblAsortyment.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsortyment.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblAsortyment.setBounds(659, 13, 384, 59);
		JPanelMag_3.add(lblAsortyment);
		
		JTextField textField_2 = new JTextField("");
		textField_2.setOpaque(true);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_2.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(223, 75, 360, 25);
		JPanelMag_3.add(textField_2);
		textField_2.setColumns(10);
		
		JTextField textField_4 = new JTextField("");
		textField_4.setOpaque(true);
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(223, 100, 360, 25);
		JPanelMag_3.add(textField_4);
		
		JTextField textField_5 = new JTextField("");
		textField_5.setOpaque(true);
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(223, 150, 360, 25);
		JPanelMag_3.add(textField_5);
		
		JTextField textField_6 = new JTextField("");
		textField_6.setOpaque(true);
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(223, 125, 360, 25);
		JPanelMag_3.add(textField_6);
		
		JTextField textField_7 = new JTextField("");
		textField_7.setOpaque(true);
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(223, 200, 360, 25);
		JPanelMag_3.add(textField_7);
		
		JTextField textField_8 = new JTextField("");
		textField_8.setOpaque(true);
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(223, 175, 360, 25);
		JPanelMag_3.add(textField_8);
		
		JTextField textField_9 = new JTextField("");
		textField_9.setOpaque(true);
		textField_9.setHorizontalAlignment(SwingConstants.LEFT);
		textField_9.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(223, 350, 360, 25);
		JPanelMag_3.add(textField_9);
		
		JTextField textField_10 = new JTextField("");
		textField_10.setOpaque(true);
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(223, 325, 360, 25);
		JPanelMag_3.add(textField_10);
		
		JTextField textField_11 = new JTextField("");
		textField_11.setOpaque(true);
		textField_11.setHorizontalAlignment(SwingConstants.LEFT);
		textField_11.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(223, 300, 360, 25);
		JPanelMag_3.add(textField_11);
		
		JTextField textField_12 = new JTextField("");
		textField_12.setOpaque(true);
		textField_12.setHorizontalAlignment(SwingConstants.LEFT);
		textField_12.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_12.setColumns(10);
		textField_12.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(223, 275, 360, 25);
		JPanelMag_3.add(textField_12);
		
		JTextField textField_13 = new JTextField("");
		textField_13.setOpaque(true);
		textField_13.setHorizontalAlignment(SwingConstants.LEFT);
		textField_13.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(223, 250, 360, 25);
		JPanelMag_3.add(textField_13);
		
		JTextField textField_14 = new JTextField("");
		textField_14.setOpaque(true);
		textField_14.setHorizontalAlignment(SwingConstants.LEFT);
		textField_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_14.setColumns(10);
		textField_14.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(223, 225, 360, 25);
		JPanelMag_3.add(textField_14);
		
		JTextField textField_15 = new JTextField("");
		textField_15.setOpaque(true);
		textField_15.setHorizontalAlignment(SwingConstants.LEFT);
		textField_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_15.setColumns(10);
		textField_15.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(223, 500, 360, 25);
		JPanelMag_3.add(textField_15);
		
		JTextField textField_16 = new JTextField("");
		textField_16.setOpaque(true);
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_16.setColumns(10);
		textField_16.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(223, 475, 360, 25);
		JPanelMag_3.add(textField_16);
		
		JTextField textField_17 = new JTextField("");
		textField_17.setOpaque(true);
		textField_17.setHorizontalAlignment(SwingConstants.LEFT);
		textField_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_17.setColumns(10);
		textField_17.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(223, 450, 360, 25);
		JPanelMag_3.add(textField_17);
		
		JTextField textField_18 = new JTextField("");
		textField_18.setOpaque(true);
		textField_18.setHorizontalAlignment(SwingConstants.LEFT);
		textField_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_18.setColumns(10);
		textField_18.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(223, 425, 360, 25);
		JPanelMag_3.add(textField_18);
		
		JTextField textField_19 = new JTextField("");
		textField_19.setOpaque(true);
		textField_19.setHorizontalAlignment(SwingConstants.LEFT);
		textField_19.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_19.setColumns(10);
		textField_19.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(223, 400, 360, 25);
		JPanelMag_3.add(textField_19);
		
		JTextField textField_20 = new JTextField("");
		textField_20.setOpaque(true);
		textField_20.setHorizontalAlignment(SwingConstants.LEFT);
		textField_20.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_20.setColumns(10);
		textField_20.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(223, 375, 360, 25);
		JPanelMag_3.add(textField_20);
		
		JTextField textField_21 = new JTextField("");
		textField_21.setOpaque(true);
		textField_21.setHorizontalAlignment(SwingConstants.LEFT);
		textField_21.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_21.setColumns(10);
		textField_21.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(223, 575, 360, 25);
		JPanelMag_3.add(textField_21);
		
		JTextField textField_22 = new JTextField("");
		textField_22.setOpaque(true);
		textField_22.setHorizontalAlignment(SwingConstants.LEFT);
		textField_22.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_22.setColumns(10);
		textField_22.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_22.setBackground(Color.WHITE);
		textField_22.setBounds(223, 550, 360, 25);
		JPanelMag_3.add(textField_22);
		
		JTextField textField_23 = new JTextField("");
		textField_23.setOpaque(true);
		textField_23.setHorizontalAlignment(SwingConstants.LEFT);
		textField_23.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_23.setColumns(10);
		textField_23.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_23.setBackground(Color.WHITE);
		textField_23.setBounds(223, 525, 360, 25);
		JPanelMag_3.add(textField_23);
		
		JTextField textField_24 = new JTextField("");
		textField_24.setOpaque(true);
		textField_24.setHorizontalAlignment(SwingConstants.LEFT);
		textField_24.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_24.setColumns(10);
		textField_24.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_24.setBackground(Color.WHITE);
		textField_24.setBounds(860, 76, 200, 25);
		JPanelMag_3.add(textField_24);
		
		JTextField textField_45 = new JTextField("");
		textField_45.setOpaque(true);
		textField_45.setHorizontalAlignment(SwingConstants.LEFT);
		textField_45.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_45.setColumns(10);
		textField_45.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_45.setBackground(Color.WHITE);
		textField_45.setBounds(860, 126, 200, 25);
		JPanelMag_3.add(textField_45);
		
		JTextField textField_87 = new JTextField("");
		textField_87.setOpaque(true);
		textField_87.setHorizontalAlignment(SwingConstants.LEFT);
		textField_87.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_87.setColumns(10);
		textField_87.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_87.setBackground(Color.WHITE);
		textField_87.setBounds(860, 176, 200, 25);
		JPanelMag_3.add(textField_87);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setBounds(23, 639, 330, 42);
		JPanelMag_3.add(comboBox_26);
		
		JLabel lblUsu_1 = new JLabel("USU\u0143");
		lblUsu_1.setOpaque(true);
		lblUsu_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsu_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUsu_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblUsu_1.setBackground(SystemColor.controlHighlight);
		lblUsu_1.setBounds(660, 605, 200, 25);
		JPanelMag_3.add(lblUsu_1);
		
		JLabel lblDodaj = new JLabel("DODAJ");
		lblDodaj.setOpaque(true);
		lblDodaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblDodaj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDodaj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDodaj.setBackground(SystemColor.controlHighlight);
		lblDodaj.setBounds(660, 580, 200, 25);
		JPanelMag_3.add(lblDodaj);
		
		JLabel lblAktualizuj = new JLabel("AKTUALIZUJ");
		lblAktualizuj.setOpaque(true);
		lblAktualizuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblAktualizuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblAktualizuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblAktualizuj.setBackground(SystemColor.controlHighlight);
		lblAktualizuj.setBounds(860, 580, 200, 25);
		JPanelMag_3.add(lblAktualizuj);
		
		JLabel lblDrukuj = new JLabel("DRUKUJ");
		lblDrukuj.setOpaque(true);
		lblDrukuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrukuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDrukuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDrukuj.setBackground(SystemColor.controlHighlight);
		lblDrukuj.setBounds(860, 605, 200, 25);
		JPanelMag_3.add(lblDrukuj);
		
		JLabel lblV_13 = new JLabel("v4");
		lblV_13.setOpaque(true);
		lblV_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_13.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_13.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_13.setBackground(SystemColor.controlHighlight);
		lblV_13.setBounds(860, 655, 200, 25);
		JPanelMag_3.add(lblV_13);
		
		JLabel lblV_11 = new JLabel("v2");
		lblV_11.setOpaque(true);
		lblV_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_11.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_11.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_11.setBackground(SystemColor.controlHighlight);
		lblV_11.setBounds(660, 655, 200, 25);
		JPanelMag_3.add(lblV_11);
		
		JLabel lblV_10 = new JLabel("HISTORIA ??");
		lblV_10.setOpaque(true);
		lblV_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_10.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_10.setBackground(SystemColor.controlHighlight);
		lblV_10.setBounds(660, 630, 200, 25);
		JPanelMag_3.add(lblV_10);
		
		JLabel lblV_12 = new JLabel("v3");
		lblV_12.setOpaque(true);
		lblV_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_12.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_12.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_12.setBackground(SystemColor.controlHighlight);
		lblV_12.setBounds(860, 630, 200, 25);
		JPanelMag_3.add(lblV_12);
		
		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setBounds(860, 100, 200, 25);
		JPanelMag_3.add(comboBox_27);
		
		JTextField textField_108 = new JTextField("");
		textField_108.setOpaque(true);
		textField_108.setHorizontalAlignment(SwingConstants.LEFT);
		textField_108.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_108.setColumns(10);
		textField_108.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_108.setBackground(Color.WHITE);
		textField_108.setBounds(860, 201, 200, 25);
		JPanelMag_3.add(textField_108);
		
		JComboBox comboBox_28 = new JComboBox();
		comboBox_28.setBounds(860, 150, 200, 25);
		JPanelMag_3.add(comboBox_28);
		
		JTextField textField_25 = new JTextField("");
		textField_25.setOpaque(true);
		textField_25.setHorizontalAlignment(SwingConstants.LEFT);
		textField_25.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_25.setColumns(10);
		textField_25.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_25.setBackground(Color.WHITE);
		textField_25.setBounds(860, 226, 200, 25);
		JPanelMag_3.add(textField_25);
		
		JTextField textField_26 = new JTextField("");
		textField_26.setOpaque(true);
		textField_26.setHorizontalAlignment(SwingConstants.LEFT);
		textField_26.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_26.setColumns(10);
		textField_26.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_26.setBackground(Color.WHITE);
		textField_26.setBounds(860, 251, 200, 25);
		JPanelMag_3.add(textField_26);
		
		JLabel label_19 = new JLabel("Lp.");
		label_19.setOpaque(true);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_19.setBorder(new LineBorder(SystemColor.controlShadow));
		label_19.setBackground(SystemColor.controlHighlight);
		label_19.setBounds(660, 76, 200, 25);
		JPanelMag_3.add(label_19);
		
		JLabel lblRodzaj = new JLabel("Rodzaj");
		lblRodzaj.setOpaque(true);
		lblRodzaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblRodzaj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRodzaj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblRodzaj.setBackground(SystemColor.controlHighlight);
		lblRodzaj.setBounds(660, 101, 200, 25);
		JPanelMag_3.add(lblRodzaj);
		
		JLabel lblNazwa = new JLabel("Nazwa");
		lblNazwa.setOpaque(true);
		lblNazwa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwa.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwa.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwa.setBackground(SystemColor.controlHighlight);
		lblNazwa.setBounds(660, 126, 200, 25);
		JPanelMag_3.add(lblNazwa);
		
		JLabel lblKurs_1 = new JLabel("Waluta");
		lblKurs_1.setOpaque(true);
		lblKurs_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKurs_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKurs_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKurs_1.setBackground(SystemColor.controlHighlight);
		lblKurs_1.setBounds(660, 151, 200, 25);
		JPanelMag_3.add(lblKurs_1);
		
		JLabel lblCena = new JLabel("Cena");
		lblCena.setOpaque(true);
		lblCena.setHorizontalAlignment(SwingConstants.CENTER);
		lblCena.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblCena.setBorder(new LineBorder(SystemColor.controlShadow));
		lblCena.setBackground(SystemColor.controlHighlight);
		lblCena.setBounds(660, 176, 200, 25);
		JPanelMag_3.add(lblCena);
		
		JLabel lblWaga_1 = new JLabel("Waga");
		lblWaga_1.setOpaque(true);
		lblWaga_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaga_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWaga_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWaga_1.setBackground(SystemColor.controlHighlight);
		lblWaga_1.setBounds(660, 201, 200, 25);
		JPanelMag_3.add(lblWaga_1);
		
		JLabel lblV_14 = new JLabel("Czas oczekiwania");
		lblV_14.setOpaque(true);
		lblV_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_14.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_14.setBackground(SystemColor.controlHighlight);
		lblV_14.setBounds(660, 251, 200, 25);
		JPanelMag_3.add(lblV_14);
		
		JLabel lblKod_2 = new JLabel("Kod");
		lblKod_2.setOpaque(true);
		lblKod_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblKod_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKod_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod_2.setBackground(SystemColor.controlHighlight);
		lblKod_2.setBounds(660, 226, 200, 25);
		JPanelMag_3.add(lblKod_2);
		
		JComboBox comboBox_29 = new JComboBox();
		comboBox_29.setBounds(353, 639, 230, 42);
		JPanelMag_3.add(comboBox_29);
		
		JLabel lblNazwaDostawcy_1 = new JLabel("Nazwa dostawcy");
		lblNazwaDostawcy_1.setOpaque(true);
		lblNazwaDostawcy_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaDostawcy_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaDostawcy_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaDostawcy_1.setBackground(SystemColor.controlHighlight);
		lblNazwaDostawcy_1.setBounds(23, 613, 330, 25);
		JPanelMag_3.add(lblNazwaDostawcy_1);
		
		JLabel lblNip_1 = new JLabel("NIP");
		lblNip_1.setOpaque(true);
		lblNip_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNip_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNip_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNip_1.setBackground(SystemColor.controlHighlight);
		lblNip_1.setBounds(353, 613, 230, 25);
		JPanelMag_3.add(lblNip_1);
		
		JLabel label_20 = new JLabel("DODAJ");
		label_20.setOpaque(true);
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_20.setBorder(new LineBorder(SystemColor.controlShadow));
		label_20.setBackground(SystemColor.controlHighlight);
		label_20.setBounds(1101, 76, 200, 25);
		JPanelMag_3.add(label_20);
		
		JLabel label_21 = new JLabel("USU\u0143");
		label_21.setOpaque(true);
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_21.setBorder(new LineBorder(SystemColor.controlShadow));
		label_21.setBackground(SystemColor.controlHighlight);
		label_21.setBounds(1101, 101, 200, 25);
		JPanelMag_3.add(label_21);
		
		JLabel label_22 = new JLabel("DRUKUJ");
		label_22.setOpaque(true);
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_22.setBorder(new LineBorder(SystemColor.controlShadow));
		label_22.setBackground(SystemColor.controlHighlight);
		label_22.setBounds(1301, 101, 200, 25);
		JPanelMag_3.add(label_22);
		
		JLabel label_23 = new JLabel("AKTUALIZUJ");
		label_23.setOpaque(true);
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_23.setBorder(new LineBorder(SystemColor.controlShadow));
		label_23.setBackground(SystemColor.controlHighlight);
		label_23.setBounds(1301, 76, 200, 25);
		JPanelMag_3.add(label_23);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(660, 301, 870, 269);
		JPanelMag_3.add(scrollPane_5);
		
	}

}
