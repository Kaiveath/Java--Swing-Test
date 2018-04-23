import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class TabSell_2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabSell_2()
	{

		setSize(1582, 680);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelSell_2 = new JPanel();
		JPanelSell_2.setBounds(0, 0, 1582, 680);							// ZMNIEJSZYÆ !!!
		add(JPanelSell_2);
		JPanelSell_2.setLayout(null);
		
		
		
		JLabel lblDaneFaktury = new JLabel("Dane Faktury:");
		lblDaneFaktury.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaneFaktury.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblDaneFaktury.setBounds(38, 0, 556, 59);
		JPanelSell_2.add(lblDaneFaktury);
		
		JLabel label_29 = new JLabel("Lp.");
		label_29.setOpaque(true);
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_29.setBorder(new LineBorder(SystemColor.controlShadow));
		label_29.setBackground(SystemColor.controlHighlight);
		label_29.setBounds(34, 62, 200, 25);
		JPanelSell_2.add(label_29);
		
		JLabel lblNazwaKlienta = new JLabel("Nazwa Klienta");
		lblNazwaKlienta.setOpaque(true);
		lblNazwaKlienta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaKlienta.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaKlienta.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaKlienta.setBackground(SystemColor.controlHighlight);
		lblNazwaKlienta.setBounds(34, 87, 200, 25);
		JPanelSell_2.add(lblNazwaKlienta);
		
		JLabel lblNazwaSkrcona = new JLabel("Nazwa skr\u00F3cona");
		lblNazwaSkrcona.setOpaque(true);
		lblNazwaSkrcona.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaSkrcona.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaSkrcona.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaSkrcona.setBackground(SystemColor.controlHighlight);
		lblNazwaSkrcona.setBounds(34, 112, 200, 25);
		JPanelSell_2.add(lblNazwaSkrcona);
		
		JLabel lblNip_2 = new JLabel("NIP");
		lblNip_2.setOpaque(true);
		lblNip_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNip_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNip_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNip_2.setBackground(SystemColor.controlHighlight);
		lblNip_2.setBounds(34, 137, 200, 25);
		JPanelSell_2.add(lblNip_2);
		
		JLabel lblKraj_1 = new JLabel("Kraj");
		lblKraj_1.setOpaque(true);
		lblKraj_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKraj_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKraj_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKraj_1.setBackground(SystemColor.controlHighlight);
		lblKraj_1.setBounds(34, 162, 200, 25);
		JPanelSell_2.add(lblKraj_1);
		
		JLabel lblKodPocztowy_1 = new JLabel("Kod Pocztowy");
		lblKodPocztowy_1.setOpaque(true);
		lblKodPocztowy_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKodPocztowy_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKodPocztowy_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKodPocztowy_1.setBackground(SystemColor.controlHighlight);
		lblKodPocztowy_1.setBounds(34, 187, 200, 25);
		JPanelSell_2.add(lblKodPocztowy_1);
		
		JLabel lblMiasto_1 = new JLabel("Miasto");
		lblMiasto_1.setOpaque(true);
		lblMiasto_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiasto_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblMiasto_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblMiasto_1.setBackground(SystemColor.controlHighlight);
		lblMiasto_1.setBounds(34, 212, 200, 25);
		JPanelSell_2.add(lblMiasto_1);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setOpaque(true);
		lblAdres.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdres.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblAdres.setBorder(new LineBorder(SystemColor.controlShadow));
		lblAdres.setBackground(SystemColor.controlHighlight);
		lblAdres.setBounds(34, 237, 200, 25);
		JPanelSell_2.add(lblAdres);
		
		JLabel lblNr_1 = new JLabel("Nr");
		lblNr_1.setOpaque(true);
		lblNr_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNr_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNr_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNr_1.setBackground(SystemColor.controlHighlight);
		lblNr_1.setBounds(34, 262, 200, 25);
		JPanelSell_2.add(lblNr_1);
		
		JLabel label_45 = new JLabel("Mail v1");
		label_45.setOpaque(true);
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_45.setBorder(new LineBorder(SystemColor.controlShadow));
		label_45.setBackground(SystemColor.controlHighlight);
		label_45.setBounds(34, 287, 200, 25);
		JPanelSell_2.add(label_45);
		
		JLabel label_46 = new JLabel("Mail v2");
		label_46.setOpaque(true);
		label_46.setHorizontalAlignment(SwingConstants.CENTER);
		label_46.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_46.setBorder(new LineBorder(SystemColor.controlShadow));
		label_46.setBackground(SystemColor.controlHighlight);
		label_46.setBounds(34, 312, 200, 25);
		JPanelSell_2.add(label_46);
		
		JLabel lblTelefonV = new JLabel("Telefon v1");
		lblTelefonV.setOpaque(true);
		lblTelefonV.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefonV.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTelefonV.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTelefonV.setBackground(SystemColor.controlHighlight);
		lblTelefonV.setBounds(34, 337, 200, 25);
		JPanelSell_2.add(lblTelefonV);
		
		JLabel lblTelefonV_1 = new JLabel("Telefon v2");
		lblTelefonV_1.setOpaque(true);
		lblTelefonV_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefonV_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTelefonV_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTelefonV_1.setBackground(SystemColor.controlHighlight);
		lblTelefonV_1.setBounds(34, 362, 200, 25);
		JPanelSell_2.add(lblTelefonV_1);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		lblImi.setOpaque(true);
		lblImi.setHorizontalAlignment(SwingConstants.CENTER);
		lblImi.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblImi.setBorder(new LineBorder(SystemColor.controlShadow));
		lblImi.setBackground(SystemColor.controlHighlight);
		lblImi.setBounds(34, 387, 200, 25);
		JPanelSell_2.add(lblImi);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setOpaque(true);
		lblNazwisko.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwisko.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwisko.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwisko.setBackground(SystemColor.controlHighlight);
		lblNazwisko.setBounds(34, 412, 200, 25);
		JPanelSell_2.add(lblNazwisko);
		
		JLabel lblPrzedstawiciel = new JLabel("Przedstawiciel");
		lblPrzedstawiciel.setOpaque(true);
		lblPrzedstawiciel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrzedstawiciel.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPrzedstawiciel.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPrzedstawiciel.setBackground(SystemColor.controlHighlight);
		lblPrzedstawiciel.setBounds(34, 437, 200, 25);
		JPanelSell_2.add(lblPrzedstawiciel);
		
		JLabel label_52 = new JLabel("v2");
		label_52.setOpaque(true);
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		label_52.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_52.setBorder(new LineBorder(SystemColor.controlShadow));
		label_52.setBackground(SystemColor.controlHighlight);
		label_52.setBounds(34, 462, 200, 25);
		JPanelSell_2.add(label_52);
		
		JLabel label_53 = new JLabel("v3");
		label_53.setOpaque(true);
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_53.setBorder(new LineBorder(SystemColor.controlShadow));
		label_53.setBackground(SystemColor.controlHighlight);
		label_53.setBounds(34, 487, 200, 25);
		JPanelSell_2.add(label_53);
		
		JLabel label_54 = new JLabel("v4");
		label_54.setOpaque(true);
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_54.setBorder(new LineBorder(SystemColor.controlShadow));
		label_54.setBackground(SystemColor.controlHighlight);
		label_54.setBounds(34, 512, 200, 25);
		JPanelSell_2.add(label_54);
		
		JLabel label_55 = new JLabel("v5");
		label_55.setOpaque(true);
		label_55.setHorizontalAlignment(SwingConstants.CENTER);
		label_55.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_55.setBorder(new LineBorder(SystemColor.controlShadow));
		label_55.setBackground(SystemColor.controlHighlight);
		label_55.setBounds(34, 537, 200, 25);
		JPanelSell_2.add(label_55);
		
		JLabel label_56 = new JLabel("v6");
		label_56.setOpaque(true);
		label_56.setHorizontalAlignment(SwingConstants.CENTER);
		label_56.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_56.setBorder(new LineBorder(SystemColor.controlShadow));
		label_56.setBackground(SystemColor.controlHighlight);
		label_56.setBounds(34, 562, 200, 25);
		JPanelSell_2.add(label_56);
		
		JTextField textField_27 = new JTextField("");
		textField_27.setOpaque(true);
		textField_27.setHorizontalAlignment(SwingConstants.LEFT);
		textField_27.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_27.setColumns(10);
		textField_27.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(234, 562, 360, 25);
		JPanelSell_2.add(textField_27);
		
		JTextField textField_28 = new JTextField("");
		textField_28.setOpaque(true);
		textField_28.setHorizontalAlignment(SwingConstants.LEFT);
		textField_28.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_28.setColumns(10);
		textField_28.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_28.setBackground(Color.WHITE);
		textField_28.setBounds(234, 537, 360, 25);
		JPanelSell_2.add(textField_28);
		
		JTextField textField_29 = new JTextField("");
		textField_29.setOpaque(true);
		textField_29.setHorizontalAlignment(SwingConstants.LEFT);
		textField_29.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_29.setColumns(10);
		textField_29.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_29.setBackground(Color.WHITE);
		textField_29.setBounds(234, 512, 360, 25);
		JPanelSell_2.add(textField_29);
		
		JTextField textField_30 = new JTextField("");
		textField_30.setOpaque(true);
		textField_30.setHorizontalAlignment(SwingConstants.LEFT);
		textField_30.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_30.setColumns(10);
		textField_30.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_30.setBackground(Color.WHITE);
		textField_30.setBounds(234, 487, 360, 25);
		JPanelSell_2.add(textField_30);
		
		JTextField textField_31 = new JTextField("");
		textField_31.setOpaque(true);
		textField_31.setHorizontalAlignment(SwingConstants.LEFT);
		textField_31.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_31.setColumns(10);
		textField_31.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_31.setBackground(Color.WHITE);
		textField_31.setBounds(234, 462, 360, 25);
		JPanelSell_2.add(textField_31);
		
		JTextField textField_32 = new JTextField("");
		textField_32.setOpaque(true);
		textField_32.setHorizontalAlignment(SwingConstants.LEFT);
		textField_32.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_32.setColumns(10);
		textField_32.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_32.setBackground(Color.WHITE);
		textField_32.setBounds(234, 437, 360, 25);
		JPanelSell_2.add(textField_32);
		
		JTextField textField_33 = new JTextField("");
		textField_33.setOpaque(true);
		textField_33.setHorizontalAlignment(SwingConstants.LEFT);
		textField_33.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_33.setColumns(10);
		textField_33.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_33.setBackground(Color.WHITE);
		textField_33.setBounds(234, 412, 360, 25);
		JPanelSell_2.add(textField_33);
		
		JTextField textField_34 = new JTextField("");
		textField_34.setOpaque(true);
		textField_34.setHorizontalAlignment(SwingConstants.LEFT);
		textField_34.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_34.setColumns(10);
		textField_34.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_34.setBackground(Color.WHITE);
		textField_34.setBounds(234, 387, 360, 25);
		JPanelSell_2.add(textField_34);
		
		JTextField textField_35 = new JTextField("");
		textField_35.setOpaque(true);
		textField_35.setHorizontalAlignment(SwingConstants.LEFT);
		textField_35.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_35.setColumns(10);
		textField_35.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_35.setBackground(Color.WHITE);
		textField_35.setBounds(234, 362, 360, 25);
		JPanelSell_2.add(textField_35);
		
		JTextField textField_36 = new JTextField("");
		textField_36.setOpaque(true);
		textField_36.setHorizontalAlignment(SwingConstants.LEFT);
		textField_36.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_36.setColumns(10);
		textField_36.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_36.setBackground(Color.WHITE);
		textField_36.setBounds(234, 337, 360, 25);
		JPanelSell_2.add(textField_36);
		
		JTextField textField_37 = new JTextField("");
		textField_37.setOpaque(true);
		textField_37.setHorizontalAlignment(SwingConstants.LEFT);
		textField_37.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_37.setColumns(10);
		textField_37.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_37.setBackground(Color.WHITE);
		textField_37.setBounds(234, 312, 360, 25);
		JPanelSell_2.add(textField_37);
		
		JTextField textField_38 = new JTextField("");
		textField_38.setOpaque(true);
		textField_38.setHorizontalAlignment(SwingConstants.LEFT);
		textField_38.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_38.setColumns(10);
		textField_38.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_38.setBackground(Color.WHITE);
		textField_38.setBounds(234, 287, 360, 25);
		JPanelSell_2.add(textField_38);
		
		JTextField textField_39 = new JTextField("");
		textField_39.setOpaque(true);
		textField_39.setHorizontalAlignment(SwingConstants.LEFT);
		textField_39.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_39.setColumns(10);
		textField_39.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_39.setBackground(Color.WHITE);
		textField_39.setBounds(234, 262, 360, 25);
		JPanelSell_2.add(textField_39);
		
		JTextField textField_40 = new JTextField("");
		textField_40.setOpaque(true);
		textField_40.setHorizontalAlignment(SwingConstants.LEFT);
		textField_40.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_40.setColumns(10);
		textField_40.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_40.setBackground(Color.WHITE);
		textField_40.setBounds(234, 237, 360, 25);
		JPanelSell_2.add(textField_40);
		
		JTextField textField_41 = new JTextField("");
		textField_41.setOpaque(true);
		textField_41.setHorizontalAlignment(SwingConstants.LEFT);
		textField_41.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_41.setColumns(10);
		textField_41.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_41.setBackground(Color.WHITE);
		textField_41.setBounds(234, 212, 360, 25);
		JPanelSell_2.add(textField_41);
		
		JTextField textField_42 = new JTextField("");
		textField_42.setOpaque(true);
		textField_42.setHorizontalAlignment(SwingConstants.LEFT);
		textField_42.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_42.setColumns(10);
		textField_42.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_42.setBackground(Color.WHITE);
		textField_42.setBounds(234, 187, 360, 25);
		JPanelSell_2.add(textField_42);
		
		JTextField textField_43 = new JTextField("");
		textField_43.setOpaque(true);
		textField_43.setHorizontalAlignment(SwingConstants.LEFT);
		textField_43.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_43.setColumns(10);
		textField_43.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_43.setBackground(Color.WHITE);
		textField_43.setBounds(234, 162, 360, 25);
		JPanelSell_2.add(textField_43);
		
		JTextField textField_44 = new JTextField("");
		textField_44.setOpaque(true);
		textField_44.setHorizontalAlignment(SwingConstants.LEFT);
		textField_44.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_44.setColumns(10);
		textField_44.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_44.setBackground(Color.WHITE);
		textField_44.setBounds(234, 137, 360, 25);
		JPanelSell_2.add(textField_44);
		
		JTextField textField_46 = new JTextField("");
		textField_46.setOpaque(true);
		textField_46.setHorizontalAlignment(SwingConstants.LEFT);
		textField_46.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_46.setColumns(10);
		textField_46.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_46.setBackground(Color.WHITE);
		textField_46.setBounds(234, 112, 360, 25);
		JPanelSell_2.add(textField_46);
		
		JTextField textField_47 = new JTextField("");
		textField_47.setOpaque(true);
		textField_47.setHorizontalAlignment(SwingConstants.LEFT);
		textField_47.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_47.setColumns(10);
		textField_47.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_47.setBackground(Color.WHITE);
		textField_47.setBounds(234, 87, 360, 25);
		JPanelSell_2.add(textField_47);
		
		JTextField textField_48 = new JTextField("");
		textField_48.setOpaque(true);
		textField_48.setHorizontalAlignment(SwingConstants.LEFT);
		textField_48.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_48.setColumns(10);
		textField_48.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_48.setBackground(Color.WHITE);
		textField_48.setBounds(234, 62, 360, 25);
		JPanelSell_2.add(textField_48);
		
		JLabel label_57 = new JLabel("Nazwa dostawcy");
		label_57.setOpaque(true);
		label_57.setHorizontalAlignment(SwingConstants.CENTER);
		label_57.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_57.setBorder(new LineBorder(SystemColor.controlShadow));
		label_57.setBackground(SystemColor.controlHighlight);
		label_57.setBounds(34, 600, 330, 25);
		JPanelSell_2.add(label_57);
		
		JComboBox comboBox_30 = new JComboBox();
		comboBox_30.setBounds(34, 626, 330, 42);
		JPanelSell_2.add(comboBox_30);
		
		JLabel label_58 = new JLabel("NIP");
		label_58.setOpaque(true);
		label_58.setHorizontalAlignment(SwingConstants.CENTER);
		label_58.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_58.setBorder(new LineBorder(SystemColor.controlShadow));
		label_58.setBackground(SystemColor.controlHighlight);
		label_58.setBounds(364, 600, 230, 25);
		JPanelSell_2.add(label_58);
		
		JComboBox comboBox_31 = new JComboBox();
		comboBox_31.setBounds(364, 626, 230, 42);
		JPanelSell_2.add(comboBox_31);
		
		JLabel lblDaneDostawy = new JLabel("Dane Dostawy:");
		lblDaneDostawy.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaneDostawy.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblDaneDostawy.setBounds(626, 0, 556, 59);
		JPanelSell_2.add(lblDaneDostawy);
		
		JLabel label_28 = new JLabel("Kraj");
		label_28.setOpaque(true);
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_28.setBorder(new LineBorder(SystemColor.controlShadow));
		label_28.setBackground(SystemColor.controlHighlight);
		label_28.setBounds(626, 62, 200, 25);
		JPanelSell_2.add(label_28);
		
		JTextField textField_49 = new JTextField("");
		textField_49.setOpaque(true);
		textField_49.setHorizontalAlignment(SwingConstants.LEFT);
		textField_49.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_49.setColumns(10);
		textField_49.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_49.setBackground(Color.WHITE);
		textField_49.setBounds(826, 62, 360, 25);
		JPanelSell_2.add(textField_49);
		
		JLabel label_34 = new JLabel("Kod Pocztowy");
		label_34.setOpaque(true);
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_34.setBorder(new LineBorder(SystemColor.controlShadow));
		label_34.setBackground(SystemColor.controlHighlight);
		label_34.setBounds(626, 87, 200, 25);
		JPanelSell_2.add(label_34);
		
		JTextField textField_50 = new JTextField("");
		textField_50.setOpaque(true);
		textField_50.setHorizontalAlignment(SwingConstants.LEFT);
		textField_50.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_50.setColumns(10);
		textField_50.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_50.setBackground(Color.WHITE);
		textField_50.setBounds(826, 87, 360, 25);
		JPanelSell_2.add(textField_50);
		
		JLabel label_38 = new JLabel("Miasto");
		label_38.setOpaque(true);
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_38.setBorder(new LineBorder(SystemColor.controlShadow));
		label_38.setBackground(SystemColor.controlHighlight);
		label_38.setBounds(626, 112, 200, 25);
		JPanelSell_2.add(label_38);
		
		JTextField textField_51 = new JTextField("");
		textField_51.setOpaque(true);
		textField_51.setHorizontalAlignment(SwingConstants.LEFT);
		textField_51.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_51.setColumns(10);
		textField_51.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_51.setBackground(Color.WHITE);
		textField_51.setBounds(826, 112, 360, 25);
		JPanelSell_2.add(textField_51);
		
		JLabel label_39 = new JLabel("Adres");
		label_39.setOpaque(true);
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_39.setBorder(new LineBorder(SystemColor.controlShadow));
		label_39.setBackground(SystemColor.controlHighlight);
		label_39.setBounds(626, 137, 200, 25);
		JPanelSell_2.add(label_39);
		
		JTextField textField_52 = new JTextField("");
		textField_52.setOpaque(true);
		textField_52.setHorizontalAlignment(SwingConstants.LEFT);
		textField_52.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_52.setColumns(10);
		textField_52.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_52.setBackground(Color.WHITE);
		textField_52.setBounds(826, 137, 360, 25);
		JPanelSell_2.add(textField_52);
		
		JLabel label_40 = new JLabel("Nr");
		label_40.setOpaque(true);
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		label_40.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_40.setBorder(new LineBorder(SystemColor.controlShadow));
		label_40.setBackground(SystemColor.controlHighlight);
		label_40.setBounds(626, 162, 200, 25);
		JPanelSell_2.add(label_40);
		
		JTextField textField_53 = new JTextField("");
		textField_53.setOpaque(true);
		textField_53.setHorizontalAlignment(SwingConstants.LEFT);
		textField_53.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_53.setColumns(10);
		textField_53.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_53.setBackground(Color.WHITE);
		textField_53.setBounds(826, 162, 360, 25);
		JPanelSell_2.add(textField_53);
		
		JLabel lblWarunkiFaktury = new JLabel("Warunki Faktury:");
		lblWarunkiFaktury.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarunkiFaktury.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblWarunkiFaktury.setBounds(626, 240, 556, 59);
		JPanelSell_2.add(lblWarunkiFaktury);
		
		JLabel lblRodzajPatnoci = new JLabel("Rodzaj p\u0142atno\u015Bci");
		lblRodzajPatnoci.setOpaque(true);
		lblRodzajPatnoci.setHorizontalAlignment(SwingConstants.CENTER);
		lblRodzajPatnoci.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRodzajPatnoci.setBorder(new LineBorder(SystemColor.controlShadow));
		lblRodzajPatnoci.setBackground(SystemColor.controlHighlight);
		lblRodzajPatnoci.setBounds(626, 297, 200, 25);
		JPanelSell_2.add(lblRodzajPatnoci);
		
		JTextField textField_54 = new JTextField("");
		textField_54.setOpaque(true);
		textField_54.setHorizontalAlignment(SwingConstants.LEFT);
		textField_54.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_54.setColumns(10);
		textField_54.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_54.setBackground(Color.WHITE);
		textField_54.setBounds(826, 297, 360, 25);
		JPanelSell_2.add(textField_54);
		
		JLabel lblRodzajFaktury = new JLabel("Rodzaj Faktury");
		lblRodzajFaktury.setOpaque(true);
		lblRodzajFaktury.setHorizontalAlignment(SwingConstants.CENTER);
		lblRodzajFaktury.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRodzajFaktury.setBorder(new LineBorder(SystemColor.controlShadow));
		lblRodzajFaktury.setBackground(SystemColor.controlHighlight);
		lblRodzajFaktury.setBounds(626, 322, 200, 25);
		JPanelSell_2.add(lblRodzajFaktury);
		
		JTextField textField_55 = new JTextField("");
		textField_55.setOpaque(true);
		textField_55.setHorizontalAlignment(SwingConstants.LEFT);
		textField_55.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_55.setColumns(10);
		textField_55.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_55.setBackground(Color.WHITE);
		textField_55.setBounds(826, 322, 360, 25);
		JPanelSell_2.add(textField_55);
		
		JLabel lblTerminPatnoci_1 = new JLabel("Termin P\u0142atno\u015Bci");
		lblTerminPatnoci_1.setOpaque(true);
		lblTerminPatnoci_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTerminPatnoci_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTerminPatnoci_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTerminPatnoci_1.setBackground(SystemColor.controlHighlight);
		lblTerminPatnoci_1.setBounds(626, 347, 200, 25);
		JPanelSell_2.add(lblTerminPatnoci_1);
		
		JTextField textField_56 = new JTextField("");
		textField_56.setOpaque(true);
		textField_56.setHorizontalAlignment(SwingConstants.LEFT);
		textField_56.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_56.setColumns(10);
		textField_56.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_56.setBackground(Color.WHITE);
		textField_56.setBounds(826, 347, 360, 25);
		JPanelSell_2.add(textField_56);
		
		JLabel lblUzgodnionyKredyt = new JLabel("Uzgodniony Kredyt");
		lblUzgodnionyKredyt.setOpaque(true);
		lblUzgodnionyKredyt.setHorizontalAlignment(SwingConstants.CENTER);
		lblUzgodnionyKredyt.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUzgodnionyKredyt.setBorder(new LineBorder(SystemColor.controlShadow));
		lblUzgodnionyKredyt.setBackground(SystemColor.controlHighlight);
		lblUzgodnionyKredyt.setBounds(626, 372, 200, 25);
		JPanelSell_2.add(lblUzgodnionyKredyt);
		
		JTextField textField_57 = new JTextField("");
		textField_57.setOpaque(true);
		textField_57.setHorizontalAlignment(SwingConstants.LEFT);
		textField_57.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_57.setColumns(10);
		textField_57.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_57.setBackground(Color.WHITE);
		textField_57.setBounds(826, 372, 360, 25);
		JPanelSell_2.add(textField_57);
		
		JLabel lblNrKonta = new JLabel("Nr Konta");
		lblNrKonta.setOpaque(true);
		lblNrKonta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNrKonta.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNrKonta.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNrKonta.setBackground(SystemColor.controlHighlight);
		lblNrKonta.setBounds(626, 397, 200, 25);
		JPanelSell_2.add(lblNrKonta);
		
		JTextField textField_58 = new JTextField("");
		textField_58.setOpaque(true);
		textField_58.setHorizontalAlignment(SwingConstants.LEFT);
		textField_58.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_58.setColumns(10);
		textField_58.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_58.setBackground(Color.WHITE);
		textField_58.setBounds(826, 397, 360, 25);
		JPanelSell_2.add(textField_58);
		
		JLabel lblKurier = new JLabel("Kurier");
		lblKurier.setOpaque(true);
		lblKurier.setHorizontalAlignment(SwingConstants.CENTER);
		lblKurier.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKurier.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKurier.setBackground(SystemColor.controlHighlight);
		lblKurier.setBounds(626, 422, 200, 25);
		JPanelSell_2.add(lblKurier);
		
		JTextField textField_59 = new JTextField("");
		textField_59.setOpaque(true);
		textField_59.setHorizontalAlignment(SwingConstants.LEFT);
		textField_59.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_59.setColumns(10);
		textField_59.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_59.setBackground(Color.WHITE);
		textField_59.setBounds(826, 422, 360, 25);
		JPanelSell_2.add(textField_59);
		
		JLabel lblWaluta_1 = new JLabel("Waluta");
		lblWaluta_1.setOpaque(true);
		lblWaluta_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaluta_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWaluta_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWaluta_1.setBackground(SystemColor.controlHighlight);
		lblWaluta_1.setBounds(626, 447, 200, 25);
		JPanelSell_2.add(lblWaluta_1);
		
		JTextField textField_60 = new JTextField("");
		textField_60.setOpaque(true);
		textField_60.setHorizontalAlignment(SwingConstants.LEFT);
		textField_60.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_60.setColumns(10);
		textField_60.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_60.setBackground(Color.WHITE);
		textField_60.setBounds(826, 447, 360, 25);
		JPanelSell_2.add(textField_60);
		
		JLabel lblV_15 = new JLabel("v1");
		lblV_15.setOpaque(true);
		lblV_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_15.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_15.setBackground(SystemColor.controlHighlight);
		lblV_15.setBounds(626, 472, 200, 25);
		JPanelSell_2.add(lblV_15);
		
		JTextField textField_61 = new JTextField("");
		textField_61.setOpaque(true);
		textField_61.setHorizontalAlignment(SwingConstants.LEFT);
		textField_61.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_61.setColumns(10);
		textField_61.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_61.setBackground(Color.WHITE);
		textField_61.setBounds(826, 472, 360, 25);
		JPanelSell_2.add(textField_61);
		
		JLabel label_41 = new JLabel("DODAJ");
		label_41.setOpaque(true);
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		label_41.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_41.setBorder(new LineBorder(SystemColor.controlShadow));
		label_41.setBackground(SystemColor.controlHighlight);
		label_41.setBounds(626, 526, 200, 25);
		JPanelSell_2.add(label_41);
		
		JLabel label_42 = new JLabel("AKTUALIZUJ");
		label_42.setOpaque(true);
		label_42.setHorizontalAlignment(SwingConstants.CENTER);
		label_42.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_42.setBorder(new LineBorder(SystemColor.controlShadow));
		label_42.setBackground(SystemColor.controlHighlight);
		label_42.setBounds(826, 526, 200, 25);
		JPanelSell_2.add(label_42);
		
		JLabel label_43 = new JLabel("DRUKUJ");
		label_43.setOpaque(true);
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		label_43.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_43.setBorder(new LineBorder(SystemColor.controlShadow));
		label_43.setBackground(SystemColor.controlHighlight);
		label_43.setBounds(826, 551, 200, 25);
		JPanelSell_2.add(label_43);
		
		JLabel label_44 = new JLabel("USU\u0143");
		label_44.setOpaque(true);
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_44.setBorder(new LineBorder(SystemColor.controlShadow));
		label_44.setBackground(SystemColor.controlHighlight);
		label_44.setBounds(626, 551, 200, 25);
		JPanelSell_2.add(label_44);
		
		JLabel lblPrzegldajFv = new JLabel("Przegl\u0105daj FV");
		lblPrzegldajFv.setOpaque(true);
		lblPrzegldajFv.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrzegldajFv.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPrzegldajFv.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPrzegldajFv.setBackground(SystemColor.controlHighlight);
		lblPrzegldajFv.setBounds(626, 576, 200, 25);
		JPanelSell_2.add(lblPrzegldajFv);
		
		JLabel lblClearAll = new JLabel("CLEAR ALL");
		lblClearAll.setOpaque(true);
		lblClearAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblClearAll.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblClearAll.setBorder(new LineBorder(SystemColor.controlShadow));
		lblClearAll.setBackground(SystemColor.controlHighlight);
		lblClearAll.setBounds(826, 576, 200, 25);
		JPanelSell_2.add(lblClearAll);
		
		JLabel label_49 = new JLabel("v4");
		label_49.setOpaque(true);
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_49.setBorder(new LineBorder(SystemColor.controlShadow));
		label_49.setBackground(SystemColor.controlHighlight);
		label_49.setBounds(826, 601, 200, 25);
		JPanelSell_2.add(label_49);
		
		JLabel label_50 = new JLabel("v2");
		label_50.setOpaque(true);
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_50.setBorder(new LineBorder(SystemColor.controlShadow));
		label_50.setBackground(SystemColor.controlHighlight);
		label_50.setBounds(626, 601, 200, 25);
		JPanelSell_2.add(label_50);
		
		JLabel lblDodatkowyOpis = new JLabel("Dodatkowy Opis:");
		lblDodatkowyOpis.setHorizontalAlignment(SwingConstants.CENTER);
		lblDodatkowyOpis.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblDodatkowyOpis.setBounds(1216, 0, 321, 59);
		JPanelSell_2.add(lblDodatkowyOpis);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(1216, 62, 321, 435);
		JPanelSell_2.add(scrollPane_7);
		
		JTextArea textArea = new JTextArea();
		scrollPane_7.setViewportView(textArea);
		
		
	}

}
