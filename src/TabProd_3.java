import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class TabProd_3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabProd_3() {

		setSize(1582, 690);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelProd_3 = new JPanel();
		JPanelProd_3.setBounds(0, 0, 1582, 690);							// ZMNIEJSZYÆ !!!
		add(JPanelProd_3);
		JPanelProd_3.setLayout(null);
		
		JLabel lblListaNowychZlece = new JLabel("Lista Nowych Zlece\u0144:");
		lblListaNowychZlece.setHorizontalAlignment(SwingConstants.LEFT);
		lblListaNowychZlece.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblListaNowychZlece.setBounds(34, 13, 269, 50);
		JPanelProd_3.add(lblListaNowychZlece);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(22, 114, 859, 338);
		JPanelProd_3.add(scrollPane_9);
		
		JLabel label_51 = new JLabel("Lp.");
		label_51.setOpaque(true);
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_51.setBorder(new LineBorder(SystemColor.controlShadow));
		label_51.setBackground(SystemColor.controlHighlight);
		label_51.setBounds(27, 76, 50, 25);
		JPanelProd_3.add(label_51);
		
		JLabel lblPartia_2 = new JLabel("Partia");
		lblPartia_2.setOpaque(true);
		lblPartia_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartia_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPartia_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPartia_2.setBackground(SystemColor.controlHighlight);
		lblPartia_2.setBounds(77, 76, 120, 25);
		JPanelProd_3.add(lblPartia_2);
		
		JLabel lblNazwa_2 = new JLabel("Nazwa");
		lblNazwa_2.setOpaque(true);
		lblNazwa_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwa_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwa_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwa_2.setBackground(SystemColor.controlHighlight);
		lblNazwa_2.setBounds(197, 76, 200, 25);
		JPanelProd_3.add(lblNazwa_2);
		
		JLabel lblKod_3 = new JLabel("Kod1");
		lblKod_3.setOpaque(true);
		lblKod_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblKod_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKod_3.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod_3.setBackground(SystemColor.controlHighlight);
		lblKod_3.setBounds(397, 76, 69, 25);
		JPanelProd_3.add(lblKod_3);
		
		JLabel lblWaga = new JLabel("Kod2");
		lblWaga.setOpaque(true);
		lblWaga.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaga.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWaga.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWaga.setBackground(SystemColor.controlHighlight);
		lblWaga.setBounds(466, 76, 69, 25);
		JPanelProd_3.add(lblWaga);
		
		JLabel lblWaga_2 = new JLabel("Waga");
		lblWaga_2.setOpaque(true);
		lblWaga_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaga_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWaga_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWaga_2.setBackground(SystemColor.controlHighlight);
		lblWaga_2.setBounds(536, 76, 69, 25);
		JPanelProd_3.add(lblWaga_2);
		
		JLabel lblPriorytet_1 = new JLabel("priorytet");
		lblPriorytet_1.setOpaque(true);
		lblPriorytet_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriorytet_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPriorytet_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPriorytet_1.setBackground(SystemColor.controlHighlight);
		lblPriorytet_1.setBounds(604, 76, 69, 25);
		JPanelProd_3.add(lblPriorytet_1);
		
		JLabel lblPlanhi = new JLabel("PL/AN/HI");
		lblPlanhi.setOpaque(true);
		lblPlanhi.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanhi.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPlanhi.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPlanhi.setBackground(SystemColor.controlHighlight);
		lblPlanhi.setBounds(673, 76, 69, 25);
		JPanelProd_3.add(lblPlanhi);
		
		JLabel label_61 = new JLabel("Lp.");
		label_61.setOpaque(true);
		label_61.setHorizontalAlignment(SwingConstants.CENTER);
		label_61.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_61.setBorder(new LineBorder(SystemColor.controlShadow));
		label_61.setBackground(SystemColor.controlHighlight);
		label_61.setBounds(934, 76, 140, 25);
		JPanelProd_3.add(label_61);
		
		JTextField textField_62 = new JTextField("");
		textField_62.setOpaque(true);
		textField_62.setHorizontalAlignment(SwingConstants.LEFT);
		textField_62.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_62.setColumns(10);
		textField_62.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_62.setBackground(Color.WHITE);
		textField_62.setBounds(1074, 76, 246, 25);
		JPanelProd_3.add(textField_62);
		
		JLabel lblPartia_3 = new JLabel("Partia");
		lblPartia_3.setOpaque(true);
		lblPartia_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartia_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPartia_3.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPartia_3.setBackground(SystemColor.controlHighlight);
		lblPartia_3.setBounds(934, 101, 140, 25);
		JPanelProd_3.add(lblPartia_3);
		
		JTextField textField_63 = new JTextField("");
		textField_63.setOpaque(true);
		textField_63.setHorizontalAlignment(SwingConstants.LEFT);
		textField_63.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_63.setColumns(10);
		textField_63.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_63.setBackground(Color.WHITE);
		textField_63.setBounds(1074, 101, 246, 25);
		JPanelProd_3.add(textField_63);
		
		JLabel lblNazwa_3 = new JLabel("Nazwa");
		lblNazwa_3.setOpaque(true);
		lblNazwa_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwa_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwa_3.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwa_3.setBackground(SystemColor.controlHighlight);
		lblNazwa_3.setBounds(934, 126, 140, 25);
		JPanelProd_3.add(lblNazwa_3);
		
		JTextField textField_64 = new JTextField("");
		textField_64.setOpaque(true);
		textField_64.setHorizontalAlignment(SwingConstants.LEFT);
		textField_64.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_64.setColumns(10);
		textField_64.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_64.setBackground(Color.WHITE);
		textField_64.setBounds(1074, 126, 246, 25);
		JPanelProd_3.add(textField_64);
		
		JLabel lblKod_4 = new JLabel("Kod1");
		lblKod_4.setOpaque(true);
		lblKod_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblKod_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKod_4.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod_4.setBackground(SystemColor.controlHighlight);
		lblKod_4.setBounds(934, 151, 140, 25);
		JPanelProd_3.add(lblKod_4);
		
		JTextField textField_65 = new JTextField("");
		textField_65.setOpaque(true);
		textField_65.setHorizontalAlignment(SwingConstants.LEFT);
		textField_65.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_65.setColumns(10);
		textField_65.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_65.setBackground(Color.WHITE);
		textField_65.setBounds(1074, 151, 246, 25);
		JPanelProd_3.add(textField_65);
		
		JLabel lblKod_5 = new JLabel("Kod2");
		lblKod_5.setOpaque(true);
		lblKod_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblKod_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKod_5.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod_5.setBackground(SystemColor.controlHighlight);
		lblKod_5.setBounds(934, 176, 140, 25);
		JPanelProd_3.add(lblKod_5);
		
		JTextField textField_66 = new JTextField("");
		textField_66.setOpaque(true);
		textField_66.setHorizontalAlignment(SwingConstants.LEFT);
		textField_66.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_66.setColumns(10);
		textField_66.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_66.setBackground(Color.WHITE);
		textField_66.setBounds(1074, 176, 246, 25);
		JPanelProd_3.add(textField_66);
		
		JLabel lblWaga_3 = new JLabel("Waga");
		lblWaga_3.setOpaque(true);
		lblWaga_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaga_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWaga_3.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWaga_3.setBackground(SystemColor.controlHighlight);
		lblWaga_3.setBounds(934, 201, 140, 25);
		JPanelProd_3.add(lblWaga_3);
		
		JTextField textField_67 = new JTextField("");
		textField_67.setOpaque(true);
		textField_67.setHorizontalAlignment(SwingConstants.LEFT);
		textField_67.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_67.setColumns(10);
		textField_67.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_67.setBackground(Color.WHITE);
		textField_67.setBounds(1074, 201, 246, 25);
		JPanelProd_3.add(textField_67);
		
		JLabel lblPriorytet_2 = new JLabel("Priorytet");
		lblPriorytet_2.setOpaque(true);
		lblPriorytet_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriorytet_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPriorytet_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPriorytet_2.setBackground(SystemColor.controlHighlight);
		lblPriorytet_2.setBounds(934, 226, 140, 25);
		JPanelProd_3.add(lblPriorytet_2);
		
		JTextField textField_68 = new JTextField("");
		textField_68.setOpaque(true);
		textField_68.setHorizontalAlignment(SwingConstants.LEFT);
		textField_68.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_68.setColumns(10);
		textField_68.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_68.setBackground(Color.WHITE);
		textField_68.setBounds(1074, 226, 246, 25);
		JPanelProd_3.add(textField_68);
		
		JLabel lblPlanghisz = new JLabel("PL/ANG/HISZ");
		lblPlanghisz.setOpaque(true);
		lblPlanghisz.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanghisz.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPlanghisz.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPlanghisz.setBackground(SystemColor.controlHighlight);
		lblPlanghisz.setBounds(934, 251, 140, 25);
		JPanelProd_3.add(lblPlanghisz);
		
		JTextField textField_69 = new JTextField("");
		textField_69.setOpaque(true);
		textField_69.setHorizontalAlignment(SwingConstants.LEFT);
		textField_69.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_69.setColumns(10);
		textField_69.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_69.setBackground(Color.WHITE);
		textField_69.setBounds(1074, 251, 246, 25);
		JPanelProd_3.add(textField_69);
		
		JLabel lblDodaj_1 = new JLabel("Dodaj");
		lblDodaj_1.setOpaque(true);
		lblDodaj_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDodaj_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDodaj_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDodaj_1.setBackground(SystemColor.controlHighlight);
		lblDodaj_1.setBounds(1354, 76, 134, 25);
		JPanelProd_3.add(lblDodaj_1);
		
		JLabel lblAktualizuj_1 = new JLabel("Aktualizuj");
		lblAktualizuj_1.setOpaque(true);
		lblAktualizuj_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAktualizuj_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblAktualizuj_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblAktualizuj_1.setBackground(SystemColor.controlHighlight);
		lblAktualizuj_1.setBounds(1354, 101, 134, 25);
		JPanelProd_3.add(lblAktualizuj_1);
		
		JLabel lblUsu_3 = new JLabel("Usu\u0144");
		lblUsu_3.setOpaque(true);
		lblUsu_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsu_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUsu_3.setBorder(new LineBorder(SystemColor.controlShadow));
		lblUsu_3.setBackground(SystemColor.controlHighlight);
		lblUsu_3.setBounds(1354, 126, 134, 25);
		JPanelProd_3.add(lblUsu_3);
		
		JLabel lblDodajDoPlanu = new JLabel("Dodaj do Planu");
		lblDodajDoPlanu.setOpaque(true);
		lblDodajDoPlanu.setHorizontalAlignment(SwingConstants.CENTER);
		lblDodajDoPlanu.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDodajDoPlanu.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDodajDoPlanu.setBackground(SystemColor.controlHighlight);
		lblDodajDoPlanu.setBounds(1354, 151, 134, 25);
		JPanelProd_3.add(lblDodajDoPlanu);
		
		JLabel lblPokaPoniejMin = new JLabel("Poka\u017C poni\u017Cej min.");
		lblPokaPoniejMin.setOpaque(true);
		lblPokaPoniejMin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPokaPoniejMin.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPokaPoniejMin.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPokaPoniejMin.setBackground(SystemColor.controlHighlight);
		lblPokaPoniejMin.setBounds(1354, 175, 134, 25);
		JPanelProd_3.add(lblPokaPoniejMin);
		
		JLabel lblZatwierd = new JLabel("Zatwierd\u017A");
		lblZatwierd.setOpaque(true);
		lblZatwierd.setHorizontalAlignment(SwingConstants.CENTER);
		lblZatwierd.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZatwierd.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZatwierd.setBackground(SystemColor.controlHighlight);
		lblZatwierd.setBounds(1354, 200, 134, 25);
		JPanelProd_3.add(lblZatwierd);
		
		JLabel lblHandl = new JLabel("Handl.");
		lblHandl.setOpaque(true);
		lblHandl.setHorizontalAlignment(SwingConstants.CENTER);
		lblHandl.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblHandl.setBorder(new LineBorder(SystemColor.controlShadow));
		lblHandl.setBackground(SystemColor.controlHighlight);
		lblHandl.setBounds(743, 76, 69, 25);
		JPanelProd_3.add(lblHandl);
		
		JLabel lblOk = new JLabel("OK");
		lblOk.setOpaque(true);
		lblOk.setHorizontalAlignment(SwingConstants.CENTER);
		lblOk.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblOk.setBorder(new LineBorder(SystemColor.controlShadow));
		lblOk.setBackground(SystemColor.controlHighlight);
		lblOk.setBounds(812, 76, 69, 25);
		JPanelProd_3.add(lblOk);
	}

}
