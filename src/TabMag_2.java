import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class TabMag_2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabMag_2() 
	{

		setSize(1582, 690);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelMag_2 = new JPanel();
		JPanelMag_2.setBounds(0, 0, 1582, 690);							// ZMNIEJSZYÆ !!!
		add(JPanelMag_2);
		JPanelMag_2.setLayout(null);
		
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 180, 1085, 337);
		JPanelMag_2.add(scrollPane_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		scrollPane_3.setColumnHeaderView(panel_1);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 86, 1550, 337);
		panel_1.add(scrollPane_4);
		
		JLabel label_4 = new JLabel("Rejestr Zam\u00F3wie\u0144 do Dostawc\u00F3w");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 30));
		label_4.setBounds(12, 0, 1191, 59);
		panel_1.add(label_4);
		
		JButton button_1 = new JButton("Dodaj");
		button_1.setFont(new Font("Calibri", Font.BOLD, 20));
		button_1.setBounds(12, 436, 144, 32);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Generuj PDF");
		button_2.setFont(new Font("Calibri", Font.BOLD, 20));
		button_2.setBounds(12, 482, 144, 32);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Kopiuj");
		button_3.setFont(new Font("Calibri", Font.BOLD, 20));
		button_3.setBounds(12, 521, 144, 32);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Usu\u0144");
		button_4.setFont(new Font("Calibri", Font.BOLD, 20));
		button_4.setBounds(168, 436, 144, 32);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("Edytuj");
		button_5.setFont(new Font("Calibri", Font.BOLD, 20));
		button_5.setBounds(168, 482, 144, 32);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("v1");
		button_6.setFont(new Font("Calibri", Font.BOLD, 20));
		button_6.setBounds(168, 525, 144, 32);
		panel_1.add(button_6);
		
		JLabel label_5 = new JLabel("Lp.");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_5.setBorder(new LineBorder(SystemColor.controlShadow));
		label_5.setBackground(SystemColor.controlHighlight);
		label_5.setBounds(10, 60, 50, 25);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Data zam\u00F3wienia");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_6.setBorder(new LineBorder(SystemColor.controlShadow));
		label_6.setBackground(SystemColor.controlHighlight);
		label_6.setBounds(60, 60, 120, 25);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Dostawca");
		label_7.setOpaque(true);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_7.setBorder(new LineBorder(SystemColor.controlShadow));
		label_7.setBackground(SystemColor.controlHighlight);
		label_7.setBounds(180, 60, 200, 25);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("Rodzaj surowca");
		label_8.setOpaque(true);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_8.setBorder(new LineBorder(SystemColor.controlShadow));
		label_8.setBackground(SystemColor.controlHighlight);
		label_8.setBounds(380, 60, 120, 25);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Nazwa surowca");
		label_9.setOpaque(true);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_9.setBorder(new LineBorder(SystemColor.controlShadow));
		label_9.setBackground(SystemColor.controlHighlight);
		label_9.setBounds(500, 60, 200, 25);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Ilo\u015B\u0107 zamawiana");
		label_10.setOpaque(true);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_10.setBorder(new LineBorder(SystemColor.controlShadow));
		label_10.setBackground(SystemColor.controlHighlight);
		label_10.setBounds(700, 60, 120, 25);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("Ilo\u015B\u0107 dostarczona");
		label_11.setOpaque(true);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_11.setBorder(new LineBorder(SystemColor.controlShadow));
		label_11.setBackground(SystemColor.controlHighlight);
		label_11.setBounds(820, 60, 120, 25);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Przewidywana data");
		label_12.setOpaque(true);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_12.setBorder(new LineBorder(SystemColor.controlShadow));
		label_12.setBackground(SystemColor.controlHighlight);
		label_12.setBounds(940, 60, 150, 25);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("Cena");
		label_13.setOpaque(true);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_13.setBorder(new LineBorder(SystemColor.controlShadow));
		label_13.setBackground(SystemColor.controlHighlight);
		label_13.setBounds(1090, 60, 80, 25);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Kurs");
		label_14.setOpaque(true);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_14.setBorder(new LineBorder(SystemColor.controlShadow));
		label_14.setBackground(SystemColor.controlHighlight);
		label_14.setBounds(1170, 60, 80, 25);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("Waluta");
		label_15.setOpaque(true);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_15.setBorder(new LineBorder(SystemColor.controlShadow));
		label_15.setBackground(SystemColor.controlHighlight);
		label_15.setBounds(1250, 60, 80, 25);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("Termin p\u0142atno\u015Bci");
		label_16.setOpaque(true);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_16.setBorder(new LineBorder(SystemColor.controlShadow));
		label_16.setBackground(SystemColor.controlHighlight);
		label_16.setBounds(1330, 60, 120, 25);
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("Transport");
		label_17.setOpaque(true);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_17.setBorder(new LineBorder(SystemColor.controlShadow));
		label_17.setBackground(SystemColor.controlHighlight);
		label_17.setBounds(1450, 60, 80, 25);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Dostawa");
		label_18.setOpaque(true);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_18.setBorder(new LineBorder(SystemColor.controlShadow));
		label_18.setBackground(SystemColor.controlHighlight);
		label_18.setBounds(1530, 60, 80, 25);
		panel_1.add(label_18);
		
		JLabel lblNewLabel_1 = new JLabel("Rejestr Zam\u00F3wie\u0144 do Dostawc\u00F3w");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 0, 1085, 59);
		JPanelMag_2.add(lblNewLabel_1);
		
		JLabel lblLp = new JLabel("Lp.");
		lblLp.setOpaque(true);
		lblLp.setHorizontalAlignment(SwingConstants.CENTER);
		lblLp.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblLp.setBorder(new LineBorder(SystemColor.controlShadow));
		lblLp.setBackground(SystemColor.controlHighlight);
		lblLp.setBounds(10, 60, 50, 25);
		JPanelMag_2.add(lblLp);
		
		JLabel lblDataZamwienia = new JLabel("Data zam\u00F3wienia");
		lblDataZamwienia.setOpaque(true);
		lblDataZamwienia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataZamwienia.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDataZamwienia.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDataZamwienia.setBackground(SystemColor.controlHighlight);
		lblDataZamwienia.setBounds(60, 60, 120, 25);
		JPanelMag_2.add(lblDataZamwienia);
		
		JLabel lblDostawca = new JLabel("Dostawca");
		lblDostawca.setOpaque(true);
		lblDostawca.setHorizontalAlignment(SwingConstants.CENTER);
		lblDostawca.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDostawca.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDostawca.setBackground(SystemColor.controlHighlight);
		lblDostawca.setBounds(180, 60, 200, 25);
		JPanelMag_2.add(lblDostawca);
		
		JLabel lblRodzajSurowca = new JLabel("Rodzaj surowca");
		lblRodzajSurowca.setOpaque(true);
		lblRodzajSurowca.setHorizontalAlignment(SwingConstants.CENTER);
		lblRodzajSurowca.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRodzajSurowca.setBorder(new LineBorder(SystemColor.controlShadow));
		lblRodzajSurowca.setBackground(SystemColor.controlHighlight);
		lblRodzajSurowca.setBounds(380, 60, 120, 25);
		JPanelMag_2.add(lblRodzajSurowca);
		
		JLabel lblNazwaSurowca = new JLabel("Nazwa surowca");
		lblNazwaSurowca.setOpaque(true);
		lblNazwaSurowca.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaSurowca.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaSurowca.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaSurowca.setBackground(SystemColor.controlHighlight);
		lblNazwaSurowca.setBounds(500, 60, 200, 25);
		JPanelMag_2.add(lblNazwaSurowca);
		
		JLabel lblIloZamawiana = new JLabel("Ilo\u015B\u0107 zamawiana");
		lblIloZamawiana.setOpaque(true);
		lblIloZamawiana.setHorizontalAlignment(SwingConstants.CENTER);
		lblIloZamawiana.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIloZamawiana.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIloZamawiana.setBackground(SystemColor.controlHighlight);
		lblIloZamawiana.setBounds(700, 60, 120, 25);
		JPanelMag_2.add(lblIloZamawiana);
		
		JLabel lblIloDostarczona = new JLabel("Ilo\u015B\u0107 dostarczona");
		lblIloDostarczona.setOpaque(true);
		lblIloDostarczona.setHorizontalAlignment(SwingConstants.CENTER);
		lblIloDostarczona.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIloDostarczona.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIloDostarczona.setBackground(SystemColor.controlHighlight);
		lblIloDostarczona.setBounds(820, 60, 120, 25);
		JPanelMag_2.add(lblIloDostarczona);
		
		JLabel lblPrzewidywanaDataDtostarczenia = new JLabel("Przewidywana data");
		lblPrzewidywanaDataDtostarczenia.setOpaque(true);
		lblPrzewidywanaDataDtostarczenia.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrzewidywanaDataDtostarczenia.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPrzewidywanaDataDtostarczenia.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPrzewidywanaDataDtostarczenia.setBackground(SystemColor.controlHighlight);
		lblPrzewidywanaDataDtostarczenia.setBounds(940, 60, 150, 25);
		JPanelMag_2.add(lblPrzewidywanaDataDtostarczenia);
		
		JLabel lblCenaE = new JLabel("Cena");
		lblCenaE.setOpaque(true);
		lblCenaE.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenaE.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblCenaE.setBorder(new LineBorder(SystemColor.controlShadow));
		lblCenaE.setBackground(SystemColor.controlHighlight);
		lblCenaE.setBounds(12, 85, 80, 25);
		JPanelMag_2.add(lblCenaE);
		
		JLabel lblKurs = new JLabel("Kurs");
		lblKurs.setOpaque(true);
		lblKurs.setHorizontalAlignment(SwingConstants.CENTER);
		lblKurs.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKurs.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKurs.setBackground(SystemColor.controlHighlight);
		lblKurs.setBounds(92, 85, 80, 25);
		JPanelMag_2.add(lblKurs);
		
		JLabel lblWaluta = new JLabel("Waluta");
		lblWaluta.setOpaque(true);
		lblWaluta.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaluta.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWaluta.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWaluta.setBackground(SystemColor.controlHighlight);
		lblWaluta.setBounds(172, 85, 80, 25);
		JPanelMag_2.add(lblWaluta);
		
		JLabel lblTerminPatnoci = new JLabel("Termin p\u0142atno\u015Bci");
		lblTerminPatnoci.setOpaque(true);
		lblTerminPatnoci.setHorizontalAlignment(SwingConstants.CENTER);
		lblTerminPatnoci.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTerminPatnoci.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTerminPatnoci.setBackground(SystemColor.controlHighlight);
		lblTerminPatnoci.setBounds(252, 85, 120, 25);
		JPanelMag_2.add(lblTerminPatnoci);
		
		JLabel lblTransport = new JLabel("Transport");
		lblTransport.setOpaque(true);
		lblTransport.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransport.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTransport.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTransport.setBackground(SystemColor.controlHighlight);
		lblTransport.setBounds(372, 85, 80, 25);
		JPanelMag_2.add(lblTransport);
		
		JLabel lblDostawa = new JLabel("Dostawa");
		lblDostawa.setOpaque(true);
		lblDostawa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDostawa.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDostawa.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDostawa.setBackground(SystemColor.controlHighlight);
		lblDostawa.setBounds(452, 85, 80, 25);
		JPanelMag_2.add(lblDostawa);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setBounds(1302, 60, 71, 22);
		JPanelMag_2.add(comboBox_18);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setBounds(1385, 60, 57, 22);
		JPanelMag_2.add(comboBox_19);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setBounds(1448, 60, 57, 22);
		JPanelMag_2.add(comboBox_20);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setBounds(1448, 90, 57, 22);
		JPanelMag_2.add(comboBox_21);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setBounds(1385, 90, 57, 22);
		JPanelMag_2.add(comboBox_22);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setBounds(1301, 90, 72, 22);
		JPanelMag_2.add(comboBox_23);
		
		JLabel lblOdDnia = new JLabel("Od dnia:");
		lblOdDnia.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblOdDnia.setBounds(1169, 60, 65, 20);
		JPanelMag_2.add(lblOdDnia);
		
		JLabel lblDoDnia = new JLabel("Do dnia:");
		lblDoDnia.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblDoDnia.setBounds(1169, 93, 65, 20);
		JPanelMag_2.add(lblDoDnia);
		
		JLabel lblWywietl = new JLabel("Wy\u015Bwietl:");
		lblWywietl.setHorizontalAlignment(SwingConstants.CENTER);
		lblWywietl.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblWywietl.setBounds(1098, 0, 474, 59);
		JPanelMag_2.add(lblWywietl);
		
		Checkbox checkbox_25 = new Checkbox("Zam\u00F3wienia niepotwierdzone");
		checkbox_25.setBounds(1125, 120, 213, 24);
		JPanelMag_2.add(checkbox_25);
		
		Checkbox checkbox_26 = new Checkbox("Zam\u00F3wienia sp\u00F3\u017Anione");
		checkbox_26.setBounds(1125, 150, 213, 24);
		JPanelMag_2.add(checkbox_26);
		
		Checkbox checkbox_27 = new Checkbox("Reklamacje");
		checkbox_27.setBounds(1125, 180, 213, 24);
		JPanelMag_2.add(checkbox_27);
		
		Checkbox checkbox_28 = new Checkbox("Zam\u00F3wienia zagraniczne");
		checkbox_28.setBounds(1125, 210, 213, 24);
		JPanelMag_2.add(checkbox_28);
		
		Checkbox checkbox_29 = new Checkbox("Follow");
		checkbox_29.setBounds(1344, 320, 213, 24);
		JPanelMag_2.add(checkbox_29);
		
		Checkbox checkbox_30 = new Checkbox("Zam\u00F3wienia polskie");
		checkbox_30.setBounds(1125, 290, 213, 24);
		JPanelMag_2.add(checkbox_30);
		
		Checkbox checkbox_31 = new Checkbox("Odbi\u00F3r po naszej stronie");
		checkbox_31.setBounds(1125, 332, 213, 24);
		JPanelMag_2.add(checkbox_31);
		
		JLabel lblRodzajSurowca_1 = new JLabel("Rodzaj surowca:");
		lblRodzajSurowca_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblRodzajSurowca_1.setBounds(1125, 375, 144, 26);
		JPanelMag_2.add(lblRodzajSurowca_1);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setBounds(1285, 376, 143, 23);
		JPanelMag_2.add(comboBox_24);
		
		JLabel lblDostawca_1 = new JLabel("Dostawca:");
		lblDostawca_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblDostawca_1.setBounds(1125, 414, 144, 26);
		JPanelMag_2.add(lblDostawca_1);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setBounds(1285, 415, 143, 23);
		JPanelMag_2.add(comboBox_25);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setOpaque(true);
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblMail.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblMail.setBorder(new LineBorder(SystemColor.controlShadow));
		lblMail.setBackground(SystemColor.controlHighlight);
		lblMail.setBounds(532, 85, 200, 25);
		JPanelMag_2.add(lblMail);
		
		Checkbox checkbox_32 = new Checkbox("Zam\u00F3wienia w drodze");
		checkbox_32.setBounds(1359, 120, 213, 24);
		JPanelMag_2.add(checkbox_32);
		
		Checkbox checkbox_33 = new Checkbox("Zam\u00F3wienia na magazynie");
		checkbox_33.setBounds(1359, 150, 213, 24);
		JPanelMag_2.add(checkbox_33);
		
		Checkbox checkbox_34 = new Checkbox("Brak FV");
		checkbox_34.setBounds(1344, 180, 213, 24);
		JPanelMag_2.add(checkbox_34);
		
		Checkbox checkbox_35 = new Checkbox("Brak dokumentu 1");
		checkbox_35.setBounds(1344, 210, 213, 24);
		JPanelMag_2.add(checkbox_35);
		
		Checkbox checkbox_36 = new Checkbox("Brak dokumentu 2");
		checkbox_36.setBounds(1344, 252, 213, 24);
		JPanelMag_2.add(checkbox_36);
		
		Checkbox checkbox_37 = new Checkbox("Wszystkie");
		checkbox_37.setBounds(1344, 290, 213, 24);
		JPanelMag_2.add(checkbox_37);
		
		JLabel lblOpis = new JLabel("Opis");
		lblOpis.setOpaque(true);
		lblOpis.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpis.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblOpis.setBorder(new LineBorder(SystemColor.controlShadow));
		lblOpis.setBackground(SystemColor.controlHighlight);
		lblOpis.setBounds(731, 85, 80, 25);
		JPanelMag_2.add(lblOpis);
		
		JLabel lblWywietlInfo = new JLabel("Double click item");
		lblWywietlInfo.setOpaque(true);
		lblWywietlInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWywietlInfo.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWywietlInfo.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWywietlInfo.setBackground(SystemColor.controlHighlight);
		lblWywietlInfo.setBounds(810, 85, 200, 25);
		JPanelMag_2.add(lblWywietlInfo);
		
		JLabel lblVV = new JLabel("v1; v2; .....; vi");
		lblVV.setOpaque(true);
		lblVV.setHorizontalAlignment(SwingConstants.CENTER);
		lblVV.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblVV.setBorder(new LineBorder(SystemColor.controlShadow));
		lblVV.setBackground(SystemColor.controlHighlight);
		lblVV.setBounds(20, 109, 200, 25);
		JPanelMag_2.add(lblVV);
		
		JLabel lblFollowedBy = new JLabel("Followed by:");
		lblFollowedBy.setOpaque(true);
		lblFollowedBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblFollowedBy.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblFollowedBy.setBorder(new LineBorder(SystemColor.controlShadow));
		lblFollowedBy.setBackground(SystemColor.controlHighlight);
		lblFollowedBy.setBounds(219, 109, 200, 25);
		JPanelMag_2.add(lblFollowedBy);
		
		JLabel lblStanyMinimum = new JLabel("Stany minimum");
		lblStanyMinimum.setOpaque(true);
		lblStanyMinimum.setHorizontalAlignment(SwingConstants.CENTER);
		lblStanyMinimum.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblStanyMinimum.setBorder(new LineBorder(SystemColor.controlShadow));
		lblStanyMinimum.setBackground(SystemColor.controlHighlight);
		lblStanyMinimum.setBounds(212, 624, 200, 25);
		JPanelMag_2.add(lblStanyMinimum);
		
		JLabel lblGenerujRejestr = new JLabel("Generuj Rejestr");
		lblGenerujRejestr.setOpaque(true);
		lblGenerujRejestr.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenerujRejestr.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGenerujRejestr.setBorder(new LineBorder(SystemColor.controlShadow));
		lblGenerujRejestr.setBackground(SystemColor.controlHighlight);
		lblGenerujRejestr.setBounds(12, 624, 200, 25);
		JPanelMag_2.add(lblGenerujRejestr);
		
		JLabel lblGenerujPdf = new JLabel("Generuj PDF");
		lblGenerujPdf.setOpaque(true);
		lblGenerujPdf.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenerujPdf.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGenerujPdf.setBorder(new LineBorder(SystemColor.controlShadow));
		lblGenerujPdf.setBackground(SystemColor.controlHighlight);
		lblGenerujPdf.setBounds(12, 599, 200, 25);
		JPanelMag_2.add(lblGenerujPdf);
		
		JLabel lblPrzyjmij = new JLabel("Przyjmij");
		lblPrzyjmij.setOpaque(true);
		lblPrzyjmij.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrzyjmij.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPrzyjmij.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPrzyjmij.setBackground(SystemColor.controlHighlight);
		lblPrzyjmij.setBounds(212, 599, 200, 25);
		JPanelMag_2.add(lblPrzyjmij);
		
		JLabel lblGoMail = new JLabel("Go mail");
		lblGoMail.setOpaque(true);
		lblGoMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoMail.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGoMail.setBorder(new LineBorder(SystemColor.controlShadow));
		lblGoMail.setBackground(SystemColor.controlHighlight);
		lblGoMail.setBounds(212, 574, 200, 25);
		JPanelMag_2.add(lblGoMail);
		
		JLabel lblKopiuj = new JLabel("Kopiuj");
		lblKopiuj.setOpaque(true);
		lblKopiuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblKopiuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKopiuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKopiuj.setBackground(SystemColor.controlHighlight);
		lblKopiuj.setBounds(212, 549, 200, 25);
		JPanelMag_2.add(lblKopiuj);
		
		JLabel label_75 = new JLabel("DODAJ");
		label_75.setOpaque(true);
		label_75.setHorizontalAlignment(SwingConstants.CENTER);
		label_75.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_75.setBorder(new LineBorder(SystemColor.controlShadow));
		label_75.setBackground(SystemColor.controlHighlight);
		label_75.setBounds(12, 549, 200, 25);
		JPanelMag_2.add(label_75);
		label_75.addMouseListener(new MouseAdapter() 
		{
	
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				label_75.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				label_75.setBackground(SystemColor.controlHighlight);									
			}
		});	
		
		label_75.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				Orders goOrders=new Orders();
				goOrders.setVisible(true);	
			}
		});

		
		JLabel label_76 = new JLabel("USU\u0143");
		label_76.setOpaque(true);
		label_76.setHorizontalAlignment(SwingConstants.CENTER);
		label_76.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_76.setBorder(new LineBorder(SystemColor.controlShadow));
		label_76.setBackground(SystemColor.controlHighlight);
		label_76.setBounds(12, 574, 200, 25);
		JPanelMag_2.add(label_76);
		
		JLabel lblV_28 = new JLabel("v3");
		lblV_28.setOpaque(true);
		lblV_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_28.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_28.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_28.setBackground(SystemColor.controlHighlight);
		lblV_28.setBounds(412, 624, 200, 25);
		JPanelMag_2.add(lblV_28);
		
		JLabel lblV_27 = new JLabel("v2");
		lblV_27.setOpaque(true);
		lblV_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_27.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_27.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_27.setBackground(SystemColor.controlHighlight);
		lblV_27.setBounds(412, 599, 200, 25);
		JPanelMag_2.add(lblV_27);
		
		JLabel lblV_26 = new JLabel("v1");
		lblV_26.setOpaque(true);
		lblV_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_26.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_26.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_26.setBackground(SystemColor.controlHighlight);
		lblV_26.setBounds(412, 574, 200, 25);
		JPanelMag_2.add(lblV_26);
		
		JLabel lblZapotrzebowanieProd = new JLabel("Zapotrzebowanie Prod.");
		lblZapotrzebowanieProd.setOpaque(true);
		lblZapotrzebowanieProd.setHorizontalAlignment(SwingConstants.CENTER);
		lblZapotrzebowanieProd.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZapotrzebowanieProd.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZapotrzebowanieProd.setBackground(SystemColor.controlHighlight);
		lblZapotrzebowanieProd.setBounds(412, 549, 200, 25);
		JPanelMag_2.add(lblZapotrzebowanieProd);
		
		lblZapotrzebowanieProd.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				RawMaterials goRawMaterials=new RawMaterials();
				goRawMaterials.setVisible(true);	
			}
		
		
		});
		lblZapotrzebowanieProd.addMouseListener(new MouseAdapter() 
		{
	
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				lblZapotrzebowanieProd.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				lblZapotrzebowanieProd.setBackground(SystemColor.controlHighlight);									
			}
		});	


	}
}
