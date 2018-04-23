import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Checkbox;


public class ProductionOrder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
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
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductionOrder frame = new ProductionOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProductionOrder() {
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 10, 1400, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Lp.");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.PLAIN, 15));
		label.setBorder(new LineBorder(SystemColor.controlShadow));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(125, 126, 200, 25);
		contentPane.add(label);
		
		textField = new JTextField("");
		textField.setOpaque(true);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(SystemColor.controlShadow));
		textField.setBackground(Color.WHITE);
		textField.setBounds(325, 126, 360, 25);
		contentPane.add(textField);
		
		JLabel lblPartia = new JLabel("Kod Lab.");
		lblPartia.setOpaque(true);
		lblPartia.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartia.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPartia.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPartia.setBackground(SystemColor.controlHighlight);
		lblPartia.setBounds(125, 151, 200, 25);
		contentPane.add(lblPartia);
		
		textField_1 = new JTextField("");
		textField_1.setOpaque(true);
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(325, 151, 360, 25);
		contentPane.add(textField_1);
		
		JLabel lblKodProd = new JLabel("Kod Prod.");
		lblKodProd.setOpaque(true);
		lblKodProd.setHorizontalAlignment(SwingConstants.CENTER);
		lblKodProd.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKodProd.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKodProd.setBackground(SystemColor.controlHighlight);
		lblKodProd.setBounds(125, 176, 200, 25);
		contentPane.add(lblKodProd);
		
		textField_2 = new JTextField("");
		textField_2.setOpaque(true);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(325, 176, 360, 25);
		contentPane.add(textField_2);
		
		JLabel lblPartia_1 = new JLabel("Partia");
		lblPartia_1.setOpaque(true);
		lblPartia_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartia_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPartia_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPartia_1.setBackground(SystemColor.controlHighlight);
		lblPartia_1.setBounds(125, 201, 200, 25);
		contentPane.add(lblPartia_1);
		
		textField_3 = new JTextField("");
		textField_3.setOpaque(true);
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(325, 201, 360, 25);
		contentPane.add(textField_3);
		
		JLabel lblNazwa = new JLabel("Nazwa");
		lblNazwa.setOpaque(true);
		lblNazwa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwa.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwa.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwa.setBackground(SystemColor.controlHighlight);
		lblNazwa.setBounds(125, 226, 200, 25);
		contentPane.add(lblNazwa);
		
		textField_4 = new JTextField("");
		textField_4.setOpaque(true);
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(325, 226, 360, 25);
		contentPane.add(textField_4);
		
		JLabel lblRodzaj = new JLabel("Rodzaj");
		lblRodzaj.setOpaque(true);
		lblRodzaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblRodzaj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRodzaj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblRodzaj.setBackground(SystemColor.controlHighlight);
		lblRodzaj.setBounds(125, 251, 200, 25);
		contentPane.add(lblRodzaj);
		
		textField_5 = new JTextField("");
		textField_5.setOpaque(true);
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(325, 251, 360, 25);
		contentPane.add(textField_5);
		
		JLabel lblWagaZlecona = new JLabel("Waga zlecona");
		lblWagaZlecona.setOpaque(true);
		lblWagaZlecona.setHorizontalAlignment(SwingConstants.CENTER);
		lblWagaZlecona.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWagaZlecona.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWagaZlecona.setBackground(SystemColor.controlHighlight);
		lblWagaZlecona.setBounds(125, 276, 200, 25);
		contentPane.add(lblWagaZlecona);
		
		textField_6 = new JTextField("");
		textField_6.setOpaque(true);
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(325, 276, 360, 25);
		contentPane.add(textField_6);
		
		JLabel lblWagaWyprodukowana = new JLabel("Waga wyprodukowana");
		lblWagaWyprodukowana.setOpaque(true);
		lblWagaWyprodukowana.setHorizontalAlignment(SwingConstants.CENTER);
		lblWagaWyprodukowana.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWagaWyprodukowana.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWagaWyprodukowana.setBackground(SystemColor.controlHighlight);
		lblWagaWyprodukowana.setBounds(125, 301, 200, 25);
		contentPane.add(lblWagaWyprodukowana);
		
		textField_7 = new JTextField("");
		textField_7.setOpaque(true);
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(325, 301, 360, 25);
		contentPane.add(textField_7);
		
		JLabel lblStraty = new JLabel("Straty");
		lblStraty.setOpaque(true);
		lblStraty.setHorizontalAlignment(SwingConstants.CENTER);
		lblStraty.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblStraty.setBorder(new LineBorder(SystemColor.controlShadow));
		lblStraty.setBackground(SystemColor.controlHighlight);
		lblStraty.setBounds(125, 326, 200, 25);
		contentPane.add(lblStraty);
		
		textField_8 = new JTextField("");
		textField_8.setOpaque(true);
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(325, 326, 360, 25);
		contentPane.add(textField_8);
		
		JLabel lblLiniaProdNr = new JLabel("Linia Prod. nr");
		lblLiniaProdNr.setOpaque(true);
		lblLiniaProdNr.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiniaProdNr.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblLiniaProdNr.setBorder(new LineBorder(SystemColor.controlShadow));
		lblLiniaProdNr.setBackground(SystemColor.controlHighlight);
		lblLiniaProdNr.setBounds(125, 351, 200, 25);
		contentPane.add(lblLiniaProdNr);
		
		textField_9 = new JTextField("");
		textField_9.setOpaque(true);
		textField_9.setHorizontalAlignment(SwingConstants.LEFT);
		textField_9.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(325, 351, 360, 25);
		contentPane.add(textField_9);
		
		JLabel lblIloKonternerw = new JLabel("Ilo\u015B\u0107 konterner\u00F3w");
		lblIloKonternerw.setOpaque(true);
		lblIloKonternerw.setHorizontalAlignment(SwingConstants.CENTER);
		lblIloKonternerw.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIloKonternerw.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIloKonternerw.setBackground(SystemColor.controlHighlight);
		lblIloKonternerw.setBounds(125, 376, 200, 25);
		contentPane.add(lblIloKonternerw);
		
		textField_10 = new JTextField("");
		textField_10.setOpaque(true);
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(325, 376, 360, 25);
		contentPane.add(textField_10);
		
		JLabel lblPriorytet = new JLabel("Priorytet");
		lblPriorytet.setOpaque(true);
		lblPriorytet.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriorytet.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPriorytet.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPriorytet.setBackground(SystemColor.controlHighlight);
		lblPriorytet.setBounds(125, 401, 200, 25);
		contentPane.add(lblPriorytet);
		
		textField_11 = new JTextField("");
		textField_11.setOpaque(true);
		textField_11.setHorizontalAlignment(SwingConstants.LEFT);
		textField_11.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(325, 401, 360, 25);
		contentPane.add(textField_11);
		
		JLabel lblPlanghiszp = new JLabel("PL/ANG/HISZP");
		lblPlanghiszp.setOpaque(true);
		lblPlanghiszp.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlanghiszp.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPlanghiszp.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPlanghiszp.setBackground(SystemColor.controlHighlight);
		lblPlanghiszp.setBounds(125, 426, 200, 25);
		contentPane.add(lblPlanghiszp);
		
		textField_12 = new JTextField("");
		textField_12.setOpaque(true);
		textField_12.setHorizontalAlignment(SwingConstants.LEFT);
		textField_12.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_12.setColumns(10);
		textField_12.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(325, 426, 360, 25);
		contentPane.add(textField_12);
		
		JLabel lblHandlowiec = new JLabel("Handlowiec");
		lblHandlowiec.setOpaque(true);
		lblHandlowiec.setHorizontalAlignment(SwingConstants.CENTER);
		lblHandlowiec.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblHandlowiec.setBorder(new LineBorder(SystemColor.controlShadow));
		lblHandlowiec.setBackground(SystemColor.controlHighlight);
		lblHandlowiec.setBounds(125, 451, 200, 25);
		contentPane.add(lblHandlowiec);
		
		textField_13 = new JTextField("");
		textField_13.setOpaque(true);
		textField_13.setHorizontalAlignment(SwingConstants.LEFT);
		textField_13.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(325, 451, 360, 25);
		contentPane.add(textField_13);
		
		JLabel label_14 = new JLabel("Opis");
		label_14.setOpaque(true);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_14.setBorder(new LineBorder(SystemColor.controlShadow));
		label_14.setBackground(SystemColor.controlHighlight);
		label_14.setBounds(125, 476, 200, 25);
		contentPane.add(label_14);
		
		textField_14 = new JTextField("");
		textField_14.setOpaque(true);
		textField_14.setHorizontalAlignment(SwingConstants.LEFT);
		textField_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_14.setColumns(10);
		textField_14.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(325, 476, 360, 25);
		contentPane.add(textField_14);
		
		JLabel label_15 = new JLabel("v1");
		label_15.setOpaque(true);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_15.setBorder(new LineBorder(SystemColor.controlShadow));
		label_15.setBackground(SystemColor.controlHighlight);
		label_15.setBounds(125, 501, 200, 25);
		contentPane.add(label_15);
		
		textField_15 = new JTextField("");
		textField_15.setOpaque(true);
		textField_15.setHorizontalAlignment(SwingConstants.LEFT);
		textField_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_15.setColumns(10);
		textField_15.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(325, 501, 360, 25);
		contentPane.add(textField_15);
		
		JLabel label_16 = new JLabel("v2");
		label_16.setOpaque(true);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_16.setBorder(new LineBorder(SystemColor.controlShadow));
		label_16.setBackground(SystemColor.controlHighlight);
		label_16.setBounds(125, 526, 200, 25);
		contentPane.add(label_16);
		
		textField_16 = new JTextField("");
		textField_16.setOpaque(true);
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_16.setColumns(10);
		textField_16.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(325, 526, 360, 25);
		contentPane.add(textField_16);
		
		JLabel label_17 = new JLabel("v3");
		label_17.setOpaque(true);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_17.setBorder(new LineBorder(SystemColor.controlShadow));
		label_17.setBackground(SystemColor.controlHighlight);
		label_17.setBounds(125, 551, 200, 25);
		contentPane.add(label_17);
		
		textField_17 = new JTextField("");
		textField_17.setOpaque(true);
		textField_17.setHorizontalAlignment(SwingConstants.LEFT);
		textField_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_17.setColumns(10);
		textField_17.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(325, 551, 360, 25);
		contentPane.add(textField_17);
		
		JLabel label_18 = new JLabel("v4");
		label_18.setOpaque(true);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_18.setBorder(new LineBorder(SystemColor.controlShadow));
		label_18.setBackground(SystemColor.controlHighlight);
		label_18.setBounds(125, 576, 200, 25);
		contentPane.add(label_18);
		
		textField_18 = new JTextField("");
		textField_18.setOpaque(true);
		textField_18.setHorizontalAlignment(SwingConstants.LEFT);
		textField_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_18.setColumns(10);
		textField_18.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(325, 576, 360, 25);
		contentPane.add(textField_18);
		
		JLabel label_19 = new JLabel("v5");
		label_19.setOpaque(true);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_19.setBorder(new LineBorder(SystemColor.controlShadow));
		label_19.setBackground(SystemColor.controlHighlight);
		label_19.setBounds(125, 601, 200, 25);
		contentPane.add(label_19);
		
		textField_19 = new JTextField("");
		textField_19.setOpaque(true);
		textField_19.setHorizontalAlignment(SwingConstants.LEFT);
		textField_19.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_19.setColumns(10);
		textField_19.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(325, 601, 360, 25);
		contentPane.add(textField_19);
		
		JLabel label_20 = new JLabel("v6");
		label_20.setOpaque(true);
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_20.setBorder(new LineBorder(SystemColor.controlShadow));
		label_20.setBackground(SystemColor.controlHighlight);
		label_20.setBounds(125, 626, 200, 25);
		contentPane.add(label_20);
		
		textField_20 = new JTextField("");
		textField_20.setOpaque(true);
		textField_20.setHorizontalAlignment(SwingConstants.LEFT);
		textField_20.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_20.setColumns(10);
		textField_20.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(325, 626, 360, 25);
		contentPane.add(textField_20);
		
		JLabel lblZlecenieProdukcyjne = new JLabel("Zlecenie Produkcyjne:");
		lblZlecenieProdukcyjne.setHorizontalAlignment(SwingConstants.CENTER);
		lblZlecenieProdukcyjne.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblZlecenieProdukcyjne.setBounds(129, 64, 556, 59);
		contentPane.add(lblZlecenieProdukcyjne);
		
		JLabel lblReceptura = new JLabel("Receptura:");
		lblReceptura.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceptura.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblReceptura.setBounds(761, 64, 384, 59);
		contentPane.add(lblReceptura);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(753, 182, 502, 420);
		contentPane.add(scrollPane);
		
		JLabel label_23 = new JLabel("DODAJ");
		label_23.setOpaque(true);
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_23.setBorder(new LineBorder(SystemColor.controlShadow));
		label_23.setBackground(SystemColor.controlHighlight);
		label_23.setBounds(757, 730, 200, 25);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("AKTUALIZUJ");
		label_24.setOpaque(true);
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_24.setBorder(new LineBorder(SystemColor.controlShadow));
		label_24.setBackground(SystemColor.controlHighlight);
		label_24.setBounds(957, 730, 200, 25);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("DRUKUJ");
		label_25.setOpaque(true);
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_25.setBorder(new LineBorder(SystemColor.controlShadow));
		label_25.setBackground(SystemColor.controlHighlight);
		label_25.setBounds(957, 755, 200, 25);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("USU\u0143");
		label_26.setOpaque(true);
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_26.setBorder(new LineBorder(SystemColor.controlShadow));
		label_26.setBackground(SystemColor.controlHighlight);
		label_26.setBounds(757, 755, 200, 25);
		contentPane.add(label_26);
		
		JLabel lblKod = new JLabel("Kod");
		lblKod.setOpaque(true);
		lblKod.setHorizontalAlignment(SwingConstants.CENTER);
		lblKod.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKod.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod.setBackground(SystemColor.controlHighlight);
		lblKod.setBounds(751, 126, 120, 25);
		contentPane.add(lblKod);
		
		JLabel lblNazwaSurowca = new JLabel("Nazwa Surowca");
		lblNazwaSurowca.setOpaque(true);
		lblNazwaSurowca.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaSurowca.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaSurowca.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaSurowca.setBackground(SystemColor.controlHighlight);
		lblNazwaSurowca.setBounds(871, 126, 200, 25);
		contentPane.add(lblNazwaSurowca);
		
		JLabel lblWaga = new JLabel("Waga");
		lblWaga.setOpaque(true);
		lblWaga.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaga.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWaga.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWaga.setBackground(SystemColor.controlHighlight);
		lblWaga.setBounds(1071, 126, 175, 25);
		contentPane.add(lblWaga);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(871, 626, 200, 42);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(753, 626, 118, 42);
		contentPane.add(comboBox_1);
		
		textField_21 = new JTextField("");
		textField_21.setOpaque(true);
		textField_21.setHorizontalAlignment(SwingConstants.LEFT);
		textField_21.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_21.setColumns(10);
		textField_21.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_21.setBackground(Color.WHITE);
		textField_21.setBounds(1071, 626, 184, 42);
		contentPane.add(textField_21);
		
		Checkbox checkbox = new Checkbox("v1");
		checkbox.setBounds(125, 666, 213, 24);
		contentPane.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("v2");
		checkbox_1.setBounds(125, 696, 213, 24);
		contentPane.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("v3");
		checkbox_2.setBounds(125, 726, 213, 24);
		contentPane.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("v4");
		checkbox_3.setBounds(125, 756, 213, 24);
		contentPane.add(checkbox_3);
	}
}
