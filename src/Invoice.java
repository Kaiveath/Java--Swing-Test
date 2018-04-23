import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import java.awt.Checkbox;
import java.awt.Color;

import javax.swing.JScrollBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;

import java.awt.SystemColor;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Scrollbar;

import javax.swing.DropMode;

import java.awt.TextArea;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Invoice extends JFrame {

	private static JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField;
	private JTextField txtDni;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	public static Checkbox checkbox_4;
	private JPanel panel;
	public static JRadioButton radioButton;
	public static JRadioButton radioButton_1;
	public static JRadioButton radioButton_2;
	public static JRadioButton radioButton_3;

	
	
	
    private static JLabel lblZgoda;
    public JLabel lblEf;

    
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoice frame = new Invoice();
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
	public Invoice() {
		


		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 10, 1400, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(281, 100, 277, 251);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_13 = new JLabel("P\u0142atno\u015B\u0107:");
		label_13.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_13.setBounds(12, 13, 120, 20);
		panel_3.add(label_13);
		
		JLabel label_16 = new JLabel("Termin:");
		label_16.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_16.setBounds(12, 33, 120, 20);
		panel_3.add(label_16);
		
		JLabel label_18 = new JLabel("Kurier:");
		label_18.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_18.setBounds(12, 53, 120, 20);
		panel_3.add(label_18);
		
		JLabel label_20 = new JLabel("Przedstawiciel:");
		label_20.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_20.setBounds(12, 73, 120, 20);
		panel_3.add(label_20);
		
		JLabel label_24 = new JLabel("Jan Kowalski");
		label_24.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_24.setBounds(144, 73, 120, 20);
		panel_3.add(label_24);
		
		JLabel label_25 = new JLabel("Fedex / Raben");
		label_25.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_25.setBounds(144, 53, 120, 20);
		panel_3.add(label_25);
		
		JLabel lblDni_1 = new JLabel("14 Dni");
		lblDni_1.setForeground(Color.RED);
		lblDni_1.setFont(new Font("Calibri", Font.BOLD, 16));
		lblDni_1.setBounds(144, 33, 120, 20);
		panel_3.add(lblDni_1);
		
		JLabel lblPobranieEfv = new JLabel("Pobranie");
		lblPobranieEfv.setForeground(Color.RED);
		lblPobranieEfv.setFont(new Font("Calibri", Font.BOLD, 16));
		lblPobranieEfv.setBounds(144, 13, 66, 20);
		panel_3.add(lblPobranieEfv);
		
		JLabel label_28 = new JLabel("Dane dostawy:");
		label_28.setFont(new Font("Calibri", Font.BOLD, 18));
		label_28.setBounds(12, 106, 120, 20);
		panel_3.add(label_28);
		
		JLabel label_29 = new JLabel("Pa\u0144stwo:");
		label_29.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_29.setBounds(12, 128, 120, 20);
		panel_3.add(label_29);
		
		JLabel label_30 = new JLabel("Miasto:");
		label_30.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_30.setBounds(12, 150, 120, 20);
		panel_3.add(label_30);
		
		JLabel label_31 = new JLabel("Kod pocztowy:");
		label_31.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_31.setBounds(12, 172, 120, 20);
		panel_3.add(label_31);
		
		JLabel label_32 = new JLabel("Ulica:");
		label_32.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_32.setBounds(12, 191, 120, 20);
		panel_3.add(label_32);
		
		JLabel label_39 = new JLabel("Nr mieszkania:");
		label_39.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_39.setBounds(12, 208, 120, 20);
		panel_3.add(label_39);
		
		JLabel label_40 = new JLabel("Us\u0142uga transp:");
		label_40.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_40.setBounds(12, 225, 120, 20);
		panel_3.add(label_40);
		
		JLabel label_41 = new JLabel("Po naszej stronie");
		label_41.setFont(new Font("Calibri", Font.BOLD, 16));
		label_41.setBounds(144, 225, 120, 20);
		panel_3.add(label_41);
		
		JLabel label_42 = new JLabel("999");
		label_42.setFont(new Font("Calibri", Font.BOLD, 16));
		label_42.setBounds(144, 208, 120, 20);
		panel_3.add(label_42);
		
		JLabel label_43 = new JLabel("Warszawska");
		label_43.setFont(new Font("Calibri", Font.BOLD, 16));
		label_43.setBounds(144, 191, 120, 20);
		panel_3.add(label_43);
		
		JLabel label_44 = new JLabel("11-040");
		label_44.setFont(new Font("Calibri", Font.BOLD, 16));
		label_44.setBounds(144, 172, 120, 20);
		panel_3.add(label_44);
		
		JLabel label_45 = new JLabel("Dobre Miasto");
		label_45.setFont(new Font("Calibri", Font.BOLD, 16));
		label_45.setBounds(144, 150, 120, 20);
		panel_3.add(label_45);
		
		JLabel label_46 = new JLabel("Polska");
		label_46.setFont(new Font("Calibri", Font.BOLD, 16));
		label_46.setBounds(144, 128, 120, 20);
		panel_3.add(label_46);
		
		JLabel lblEfv = new JLabel("e-FV");
		lblEfv.setForeground(Color.BLACK);
		lblEfv.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblEfv.setBounds(211, 13, 53, 20);
		panel_3.add(lblEfv);
		
		JButton btnZapiszOpis = new JButton("Zapisz opis 1");
		btnZapiszOpis.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnZapiszOpis.setBounds(1254, 30, 113, 29);
		contentPane.add(btnZapiszOpis);
		
		JButton btnUsu = new JButton("Usu\u0144");
		btnUsu.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnUsu.setBounds(780, 693, 122, 32);
		contentPane.add(btnUsu);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnDodaj.setBounds(780, 659, 122, 32);
		contentPane.add(btnDodaj);
		
		JButton btnAktualizuj = new JButton("Aktualizuj");
		btnAktualizuj.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnAktualizuj.setBounds(780, 726, 122, 32);
		contentPane.add(btnAktualizuj);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(315, 9, 331, 32);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(740, 9, 105, 32);
		contentPane.add(comboBox_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 364, 926, 270);
		contentPane.add(scrollPane);
		
		JLabel lblSprzedarzZMagazynu = new JLabel("Magazyn:");
		lblSprzedarzZMagazynu.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSprzedarzZMagazynu.setBounds(658, 9, 88, 42);
		contentPane.add(lblSprzedarzZMagazynu);
		
		JLabel lblKontrachent = new JLabel("Kontrachent:");
		lblKontrachent.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblKontrachent.setBounds(199, 9, 113, 42);
		contentPane.add(lblKontrachent);
		
		JLabel lblWarunki = new JLabel("Warunki og\u00F3lne:");
		lblWarunki.setForeground(SystemColor.textHighlight);
		lblWarunki.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarunki.setFont(new Font("Calibri", Font.BOLD, 24));
		lblWarunki.setBounds(417, 60, 397, 42);
		contentPane.add(lblWarunki);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(12, 683, 300, 42);
		contentPane.add(comboBox_2);
		
		JLabel lblWartoBrutto = new JLabel("Warto\u015B\u0107 brutto:");
		lblWartoBrutto.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblWartoBrutto.setBounds(769, 784, 161, 26);
		contentPane.add(lblWartoBrutto);
		
		JButton btnZapiszOpis_1 = new JButton("Zapisz opis 2");
		btnZapiszOpis_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnZapiszOpis_1.setBounds(1254, 283, 113, 29);
		contentPane.add(btnZapiszOpis_1);
		
		JLabel lblNumerFv = new JLabel("Numer FV:");
		lblNumerFv.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNumerFv.setBounds(12, 9, 113, 42);
		contentPane.add(lblNumerFv);
		
		JLabel lblFv = new JLabel("FV/00001");
		lblFv.setFont(new Font("Calibri", Font.BOLD, 20));
		lblFv.setBounds(108, 9, 86, 42);
		contentPane.add(lblFv);
		
		JLabel lblZ = new JLabel("0,00 z\u0142");
		lblZ.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblZ.setBounds(739, 814, 167, 26);
		contentPane.add(lblZ);
		
		JButton button = new JButton("Generuj PDF");
		button.setFont(new Font("Calibri", Font.PLAIN, 20));
		button.setBounds(1070, 660, 144, 30);
		contentPane.add(button);
		
		JLabel lblWagaSumaryczna = new JLabel("Waga sumaryczna:");
		lblWagaSumaryczna.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblWagaSumaryczna.setBounds(584, 784, 161, 26);
		contentPane.add(lblWagaSumaryczna);
		
		JLabel lblKg = new JLabel("0,00 kg");
		lblKg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKg.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblKg.setBounds(578, 813, 167, 26);
		contentPane.add(lblKg);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(462, 683, 150, 42);
		contentPane.add(textField_2);
		
		JButton btnHistoria = new JButton("Historia");
		btnHistoria.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnHistoria.setBounds(945, 660, 112, 30);
		contentPane.add(btnHistoria);
		
		JLabel lblFvZatwierdzone = new JLabel("Zalega!");
		lblFvZatwierdzone.setForeground(new Color(255, 0, 0));
		lblFvZatwierdzone.setFont(new Font("Calibri", Font.BOLD, 20));
		lblFvZatwierdzone.setBounds(1029, 774, 81, 42);
		contentPane.add(lblFvZatwierdzone);
		
		JLabel lblPostp = new JLabel("Post\u0119p:");
		lblPostp.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPostp.setBounds(951, 774, 69, 42);
		contentPane.add(lblPostp);
		
		JLabel lblZgoda = new JLabel("ZGODA");
		lblZgoda.setForeground(new Color(128, 128, 128));
		lblZgoda.setFont(new Font("Calibri", Font.BOLD, 20));
		lblZgoda.setBounds(1105, 774, 69, 42);
		contentPane.add(lblZgoda);
		
		JLabel lblOpracowa = new JLabel("Opracowa\u0142:");
		lblOpracowa.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblOpracowa.setBounds(12, 774, 161, 26);
		contentPane.add(lblOpracowa);
		
		JLabel lblJanKowalski = new JLabel("Jan Kowalski");
		lblJanKowalski.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblJanKowalski.setBounds(12, 808, 161, 26);
		contentPane.add(lblJanKowalski);
		
		JLabel lblWTrakciePrzygotowania = new JLabel("W trakcie");
		lblWTrakciePrzygotowania.setForeground(new Color(30, 144, 255));
		lblWTrakciePrzygotowania.setFont(new Font("Calibri", Font.BOLD, 20));
		lblWTrakciePrzygotowania.setBounds(1185, 774, 99, 42);
		contentPane.add(lblWTrakciePrzygotowania);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(1226, 693, 39, 32);
		contentPane.add(panel);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.setBackground(Color.GREEN);	
				lblFvZatwierdzone.setForeground(new Color(128, 128, 128));
				lblZgoda.setForeground(Color.GREEN);
				
				
			}
		});

		
		JButton btnPozwolenie = new JButton("Pozwolenie");
		btnPozwolenie.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnPozwolenie.setBounds(1070, 694, 144, 30);
		contentPane.add(btnPozwolenie);
		btnPozwolenie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			panel.setBackground(new Color(255, 215, 0));	
			lblFvZatwierdzone.setForeground(new Color(255, 215, 0));
				
			}
		});

		
		JButton btnInfo = new JButton("Info");
		btnInfo.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnInfo.setBounds(945, 694, 113, 30);
		contentPane.add(btnInfo);
		
		JButton btnWarunki = new JButton("Warunki");
		btnWarunki.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnWarunki.setBounds(945, 727, 112, 30);
		contentPane.add(btnWarunki);
		

		
		JLabel lblNazwaProtuktu = new JLabel(" Nazwa protuktu:");
		lblNazwaProtuktu.setOpaque(true);
		lblNazwaProtuktu.setHorizontalAlignment(SwingConstants.LEFT);
		lblNazwaProtuktu.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblNazwaProtuktu.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaProtuktu.setBackground(SystemColor.controlHighlight);
		lblNazwaProtuktu.setBounds(12, 658, 300, 26);
		contentPane.add(lblNazwaProtuktu);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(1014, 65, 353, 212);
		contentPane.add(textArea);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(947, 319, 420, 134);
		contentPane.add(textArea_1);
		
		JButton btnWyczy_1 = new JButton("Wyczy\u015B\u0107");
		btnWyczy_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnWyczy_1.setBounds(1157, 284, 88, 29);
		contentPane.add(btnWyczy_1);
		
		JButton btnWyczy = new JButton("Wyczy\u015B\u0107");
		btnWyczy.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnWyczy.setBounds(1157, 30, 88, 29);
		contentPane.add(btnWyczy);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 64, 392, 287);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRodzajPatnoci = new JLabel("Telefon:");
		lblRodzajPatnoci.setBounds(0, 73, 120, 20);
		lblRodzajPatnoci.setFont(new Font("Calibri", Font.PLAIN, 16));
		panel_1.add(lblRodzajPatnoci);
		
		JLabel lblTerminPatnoci = new JLabel("mail:");
		lblTerminPatnoci.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblTerminPatnoci.setBounds(0, 93, 120, 20);
		panel_1.add(lblTerminPatnoci);
		
		JLabel lblPoleconyKurier = new JLabel("Dane Faktury:");
		lblPoleconyKurier.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPoleconyKurier.setBounds(0, 126, 120, 20);
		panel_1.add(lblPoleconyKurier);
		
		JLabel lblKodPocztowy = new JLabel("Pa\u0144stwo:");
		lblKodPocztowy.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblKodPocztowy.setBounds(0, 148, 120, 20);
		panel_1.add(lblKodPocztowy);
		
		JLabel lblMiasto = new JLabel("Miasto:");
		lblMiasto.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblMiasto.setBounds(0, 170, 120, 20);
		panel_1.add(lblMiasto);
		
		JLabel lblKodPocztowy_1 = new JLabel("Kod pocztowy:");
		lblKodPocztowy_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblKodPocztowy_1.setBounds(0, 192, 120, 20);
		panel_1.add(lblKodPocztowy_1);
		
		JLabel lblUlica = new JLabel("Ulica:");
		lblUlica.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblUlica.setBounds(0, 211, 120, 20);
		panel_1.add(lblUlica);
		
		JLabel lblNrMieszkania = new JLabel("Nr mieszkania:");
		lblNrMieszkania.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNrMieszkania.setBounds(0, 227, 120, 20);
		panel_1.add(lblNrMieszkania);
		
		JLabel lblPrzelew = new JLabel("663 335 565");
		lblPrzelew.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPrzelew.setBounds(132, 73, 120, 20);
		panel_1.add(lblPrzelew);
		
		JLabel lblDni = new JLabel("xxss@ssl.com");
		lblDni.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblDni.setBounds(132, 93, 120, 20);
		panel_1.add(lblDni);
		
		JLabel lblPolska = new JLabel("Polska");
		lblPolska.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPolska.setBounds(132, 148, 120, 20);
		panel_1.add(lblPolska);
		
		JLabel lblDobreMiasto = new JLabel("Dobre Miasto");
		lblDobreMiasto.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblDobreMiasto.setBounds(132, 170, 120, 20);
		panel_1.add(lblDobreMiasto);
		
		JLabel label_19 = new JLabel("11-040");
		label_19.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_19.setBounds(132, 192, 120, 20);
		panel_1.add(label_19);
		
		JLabel lblWarszawska = new JLabel("Warszawska");
		lblWarszawska.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblWarszawska.setBounds(132, 211, 120, 20);
		panel_1.add(lblWarszawska);
		
		JLabel label_21 = new JLabel("999");
		label_21.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_21.setBounds(132, 227, 120, 20);
		panel_1.add(label_21);
		
		JLabel lblNip = new JLabel("NIP:");
		lblNip.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNip.setBounds(0, 243, 120, 20);
		panel_1.add(lblNip);
		
		JLabel label_15 = new JLabel("015565358865");
		label_15.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_15.setBounds(132, 243, 120, 20);
		panel_1.add(label_15);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 118, 252, 17);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 3, 998, 5);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 266, 252, 17);
		panel_1.add(separator_2);
		
		JLabel lblNip_1 = new JLabel("NIP:");
		lblNip_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblNip_1.setBounds(0, 33, 120, 20);
		panel_1.add(lblNip_1);
		
		JLabel lblKontakt = new JLabel("Kontakt:");
		lblKontakt.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblKontakt.setBounds(0, 53, 120, 20);
		panel_1.add(lblKontakt);
		
		JLabel lblTomaszWilk = new JLabel("Tomasz Wilk");
		lblTomaszWilk.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblTomaszWilk.setBounds(132, 53, 120, 20);
		panel_1.add(lblTomaszWilk);
		
		JLabel label_36 = new JLabel("855555756565");
		label_36.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_36.setBounds(132, 33, 120, 20);
		panel_1.add(label_36);
		
		JLabel lblPenaNazwaFirmy = new JLabel("Pe\u0142na nazwa:");
		lblPenaNazwaFirmy.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPenaNazwaFirmy.setBounds(0, 13, 120, 20);
		panel_1.add(lblPenaNazwaFirmy);
		
		JLabel lblLakierniaProszkowaXxssaasd = new JLabel("Lakiernia proszkowa xxssaasd Sp. z o.o.");
		lblLakierniaProszkowaXxssaasd.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblLakierniaProszkowaXxssaasd.setBounds(132, 13, 426, 20);
		panel_1.add(lblLakierniaProszkowaXxssaasd);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(933, 459, 434, 176);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("0");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(119, 136, 153));
		label.setFont(new Font("Calibri", Font.PLAIN, 16));
		label.setBorder(new LineBorder(SystemColor.controlShadow));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(162, 7, 25, 26);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("+");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_1.setBorder(new LineBorder(SystemColor.controlShadow));
		label_1.setBackground(SystemColor.controlHighlight);
		label_1.setBounds(128, 7, 23, 26);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("-");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_2.setBorder(new LineBorder(SystemColor.controlShadow));
		label_2.setBackground(SystemColor.controlHighlight);
		label_2.setBounds(105, 7, 23, 26);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_3.setBorder(new LineBorder(SystemColor.controlShadow));
		label_3.setBackground(SystemColor.controlHighlight);
		label_3.setBounds(70, 7, 25, 26);
		panel_2.add(label_3);
		
		Checkbox checkbox = new Checkbox("FV");
		checkbox.setEnabled(false);
		checkbox.setBounds(10, 10, 39, 20);
		panel_2.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("WZ");
		checkbox_1.setState(true);
		checkbox_1.setBounds(10, 43, 39, 20);
		panel_2.add(checkbox_1);
		
		JLabel label_4 = new JLabel("1");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_4.setBorder(new LineBorder(SystemColor.controlShadow));
		label_4.setBackground(SystemColor.controlHighlight);
		label_4.setBounds(70, 40, 25, 26);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("-");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_5.setBorder(new LineBorder(SystemColor.controlShadow));
		label_5.setBackground(SystemColor.controlHighlight);
		label_5.setBounds(105, 40, 23, 26);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("+");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_6.setBorder(new LineBorder(SystemColor.controlShadow));
		label_6.setBackground(SystemColor.controlHighlight);
		label_6.setBounds(128, 40, 23, 26);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("0");
		label_7.setOpaque(true);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(119, 136, 153));
		label_7.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_7.setBorder(new LineBorder(SystemColor.controlShadow));
		label_7.setBackground(SystemColor.controlHighlight);
		label_7.setBounds(162, 40, 25, 26);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("0");
		label_8.setOpaque(true);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(119, 136, 153));
		label_8.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_8.setBorder(new LineBorder(SystemColor.controlShadow));
		label_8.setBackground(SystemColor.controlHighlight);
		label_8.setBounds(162, 73, 25, 26);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("+");
		label_9.setOpaque(true);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_9.setBorder(new LineBorder(SystemColor.controlShadow));
		label_9.setBackground(SystemColor.controlHighlight);
		label_9.setBounds(128, 73, 23, 26);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("-");
		label_10.setOpaque(true);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_10.setBorder(new LineBorder(SystemColor.controlShadow));
		label_10.setBackground(SystemColor.controlHighlight);
		label_10.setBounds(105, 73, 23, 26);
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel("1");
		label_11.setOpaque(true);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_11.setBorder(new LineBorder(SystemColor.controlShadow));
		label_11.setBackground(SystemColor.controlHighlight);
		label_11.setBounds(70, 73, 25, 26);
		panel_2.add(label_11);
		
		Checkbox checkbox_2 = new Checkbox("WZ v2");
		checkbox_2.setState(true);
		checkbox_2.setBounds(10, 76, 57, 20);
		panel_2.add(checkbox_2);
		
		Checkbox checkbox_10 = new Checkbox("FV D");
		checkbox_10.setBounds(10, 109, 57, 20);
		panel_2.add(checkbox_10);
		
		JLabel label_14 = new JLabel("0");
		label_14.setOpaque(true);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_14.setBorder(new LineBorder(SystemColor.controlShadow));
		label_14.setBackground(SystemColor.controlHighlight);
		label_14.setBounds(70, 106, 25, 26);
		panel_2.add(label_14);
		
		JLabel label_17 = new JLabel("-");
		label_17.setOpaque(true);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_17.setBorder(new LineBorder(SystemColor.controlShadow));
		label_17.setBackground(SystemColor.controlHighlight);
		label_17.setBounds(105, 106, 23, 26);
		panel_2.add(label_17);
		
		JLabel label_22 = new JLabel("+");
		label_22.setOpaque(true);
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_22.setBorder(new LineBorder(SystemColor.controlShadow));
		label_22.setBackground(SystemColor.controlHighlight);
		label_22.setBounds(128, 106, 23, 26);
		panel_2.add(label_22);
		
		JLabel label_23 = new JLabel("0");
		label_23.setOpaque(true);
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setForeground(new Color(119, 136, 153));
		label_23.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_23.setBorder(new LineBorder(SystemColor.controlShadow));
		label_23.setBackground(SystemColor.controlHighlight);
		label_23.setBounds(162, 106, 25, 26);
		panel_2.add(label_23);
		
		Checkbox checkbox_6 = new Checkbox("Towar przygotowany");
		checkbox_6.setBounds(220, 10, 137, 24);
		panel_2.add(checkbox_6);
		
		Checkbox checkbox_7 = new Checkbox("FV gotowa do druku");
		checkbox_7.setBounds(220, 43, 137, 24);
		panel_2.add(checkbox_7);
		
		Checkbox checkbox_8 = new Checkbox("FV oczekiwanie na towar");
		checkbox_8.setBounds(220, 76, 174, 24);
		panel_2.add(checkbox_8);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(220, 106, 82, 26);
		panel_2.add(textField_5);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(314, 106, 82, 26);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(220, 145, 82, 26);
		panel_2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(314, 145, 82, 26);
		panel_2.add(textField_10);
		
		JButton btnDrukuj = new JButton("Drukuj");
		btnDrukuj.setBounds(10, 143, 113, 30);
		panel_2.add(btnDrukuj);
		btnDrukuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDrukuj.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnSave.setBounds(126, 143, 82, 30);
		panel_2.add(btnSave);
		
		JLabel lblKod = new JLabel(" Kod:");
		lblKod.setOpaque(true);
		lblKod.setHorizontalAlignment(SwingConstants.LEFT);
		lblKod.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblKod.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod.setBackground(SystemColor.controlHighlight);
		lblKod.setBounds(312, 658, 150, 26);
		contentPane.add(lblKod);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(312, 683, 150, 42);
		contentPane.add(comboBox_5);
		
		JLabel lblIlo = new JLabel(" Ilo\u015B\u0107:");
		lblIlo.setOpaque(true);
		lblIlo.setHorizontalAlignment(SwingConstants.LEFT);
		lblIlo.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblIlo.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIlo.setBackground(SystemColor.controlHighlight);
		lblIlo.setBounds(462, 658, 150, 26);
		contentPane.add(lblIlo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(612, 683, 150, 42);
		contentPane.add(textField);
		
		JLabel label_12 = new JLabel(" Ilo\u015B\u0107:");
		label_12.setOpaque(true);
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Calibri", Font.PLAIN, 19));
		label_12.setBorder(new LineBorder(SystemColor.controlShadow));
		label_12.setBackground(SystemColor.controlHighlight);
		label_12.setBounds(612, 658, 150, 26);
		contentPane.add(label_12);
		
		JButton btnKodKreskowy = new JButton("Kod Kreskowy");
		btnKodKreskowy.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnKodKreskowy.setBounds(1070, 730, 150, 30);
		contentPane.add(btnKodKreskowy);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(559, 100, 449, 251);
		contentPane.add(panel_4);
		
		Checkbox checkbox_3 = new Checkbox("FV PRO-FORMA");
		checkbox_3.setEnabled(false);
		checkbox_3.setBounds(187, 10, 137, 20);
		panel_4.add(checkbox_3);
		
		Checkbox checkbox_4 = new Checkbox("e-FV");
		checkbox_4.setState(true);
		checkbox_4.setBounds(8, 10, 47, 20);
		panel_4.add(checkbox_4);		  
	    checkbox_4.addItemListener(new ItemListener() {
	        @Override
	        public void itemStateChanged(ItemEvent ie) {
	          if (checkbox_4.getState() == true) {
	        //    JOptionPane.showMessageDialog(null, "checkbox1 is checked");
		            lblEfv.setForeground(Color.BLACK);
		            lblEfv.setFont(new Font("Calibri", Font.PLAIN, 16));
	          } else {
		            lblEfv.setForeground(Color.RED);
		            lblEfv.setFont(new Font("Calibri", Font.BOLD, 16));
	         //   JOptionPane.showMessageDialog(null, "checkbox1 is unchecked");
	          }
	        }
	      });

	    	
	


		
		JLabel label_33 = new JLabel("Termin:");
		label_33.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_33.setBounds(8, 30, 88, 26);
		panel_4.add(label_33);
		
		txtDni = new JTextField();
		txtDni.setText("30 Dni");
		txtDni.setColumns(10);
		txtDni.setBounds(67, 30, 105, 22);
		panel_4.add(txtDni);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(67, 53, 143, 20);
		panel_4.add(comboBox_3);
		
		JLabel label_34 = new JLabel("Kurier:");
		label_34.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_34.setBounds(8, 53, 88, 26);
		panel_4.add(label_34);
		
		JLabel label_35 = new JLabel("Konto:");
		label_35.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_35.setBounds(8, 73, 88, 26);
		panel_4.add(label_35);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(67, 73, 370, 20);
		panel_4.add(comboBox_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(222, 53, 215, 20);
		panel_4.add(textField_3);
		
		JLabel label_37 = new JLabel("P\u0142atno\u015B\u0107:");
		label_37.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_37.setBounds(4, 117, 88, 26);
		panel_4.add(label_37);
		
		JRadioButton radioButton = new JRadioButton("Przelew");
		radioButton.setSelected(true);
		radioButton.setBounds(0, 145, 88, 25);
		panel_4.add(radioButton);
		

		
		JRadioButton radioButton_1 = new JRadioButton("Got\u00F3wka");
		radioButton_1.setBounds(0, 169, 88, 25);
		panel_4.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Pobranie");
		radioButton_2.setBounds(0, 193, 88, 25);
		panel_4.add(radioButton_2);
		
		radioButton_2.addItemListener(new ItemListener() {
	        @Override
	        public void itemStateChanged(ItemEvent ie) {
	          if (radioButton_2.isSelected() == true) {
	        //    JOptionPane.showMessageDialog(null, "checkbox1 is checked");
	        	  lblPobranieEfv.setForeground(Color.BLACK);
	        	  lblPobranieEfv.setFont(new Font("Calibri", Font.PLAIN, 16));
	          } else {
	        	  lblPobranieEfv.setForeground(Color.RED);
	        	  lblPobranieEfv.setFont(new Font("Calibri", Font.BOLD, 16));
	         //   JOptionPane.showMessageDialog(null, "checkbox1 is unchecked");
	          }
	        }
	      });
		
		JRadioButton radioButton_3 = new JRadioButton("Przedp\u0142ata");
		radioButton_3.setBounds(0, 217, 99, 25);
		panel_4.add(radioButton_3);
		
		
		ButtonGroup bg1 = new ButtonGroup( );

		bg1.add(radioButton);
		bg1.add(radioButton_1);
		bg1.add(radioButton_2);
		bg1.add(radioButton_3);
		
		
		

		
		JLabel label_38 = new JLabel("Data wystawienia:");
		label_38.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_38.setBounds(134, 117, 122, 26);
		panel_4.add(label_38);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(266, 120, 171, 22);
		panel_4.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(266, 140, 171, 22);
		panel_4.add(textField_6);
		
		JLabel label_47 = new JLabel("Data dostawy:");
		label_47.setHorizontalAlignment(SwingConstants.RIGHT);
		label_47.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_47.setBounds(106, 139, 150, 26);
		panel_4.add(label_47);
		
		Checkbox checkbox_5 = new Checkbox("PLN");
		checkbox_5.setState(true);
		checkbox_5.setBounds(106, 163, 49, 24);
		panel_4.add(checkbox_5);
		
		Checkbox checkbox_9 = new Checkbox("Euro");
		checkbox_9.setEnabled(false);
		checkbox_9.setBounds(161, 163, 57, 24);
		panel_4.add(checkbox_9);
		
		JLabel label_48 = new JLabel("Kurs:");
		label_48.setHorizontalAlignment(SwingConstants.RIGHT);
		label_48.setFont(new Font("Calibri", Font.PLAIN, 16));
		label_48.setBounds(194, 161, 64, 26);
		panel_4.add(label_48);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(266, 162, 88, 22);
		panel_4.add(textField_7);
	}

}
