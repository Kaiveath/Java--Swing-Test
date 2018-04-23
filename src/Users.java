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
import javax.swing.JComboBox;
import java.awt.Checkbox;


public class Users extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Users frame = new Users();
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
	public Users() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 50, 1400, 900);
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
		label.setBounds(76, 146, 200, 25);
		contentPane.add(label);
		
		textField = new JTextField("");
		textField.setOpaque(true);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(SystemColor.controlShadow));
		textField.setBackground(Color.WHITE);
		textField.setBounds(276, 146, 360, 25);
		contentPane.add(textField);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		lblImi.setOpaque(true);
		lblImi.setHorizontalAlignment(SwingConstants.CENTER);
		lblImi.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblImi.setBorder(new LineBorder(SystemColor.controlShadow));
		lblImi.setBackground(SystemColor.controlHighlight);
		lblImi.setBounds(76, 171, 200, 25);
		contentPane.add(lblImi);
		
		textField_1 = new JTextField("");
		textField_1.setOpaque(true);
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(276, 171, 360, 25);
		contentPane.add(textField_1);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setOpaque(true);
		lblNazwisko.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwisko.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwisko.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwisko.setBackground(SystemColor.controlHighlight);
		lblNazwisko.setBounds(76, 196, 200, 25);
		contentPane.add(lblNazwisko);
		
		textField_2 = new JTextField("");
		textField_2.setOpaque(true);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(276, 196, 360, 25);
		contentPane.add(textField_2);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setOpaque(true);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblLogin.setBorder(new LineBorder(SystemColor.controlShadow));
		lblLogin.setBackground(SystemColor.controlHighlight);
		lblLogin.setBounds(76, 221, 200, 25);
		contentPane.add(lblLogin);
		
		textField_3 = new JTextField("");
		textField_3.setOpaque(true);
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(276, 221, 360, 25);
		contentPane.add(textField_3);
		
		JLabel lblHaso = new JLabel("Has\u0142o");
		lblHaso.setOpaque(true);
		lblHaso.setHorizontalAlignment(SwingConstants.CENTER);
		lblHaso.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblHaso.setBorder(new LineBorder(SystemColor.controlShadow));
		lblHaso.setBackground(SystemColor.controlHighlight);
		lblHaso.setBounds(76, 246, 200, 25);
		contentPane.add(lblHaso);
		
		textField_4 = new JTextField("");
		textField_4.setOpaque(true);
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(276, 246, 360, 25);
		contentPane.add(textField_4);
		
		JLabel lblPotwierdzHaso = new JLabel("Kod pocztowy");
		lblPotwierdzHaso.setOpaque(true);
		lblPotwierdzHaso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPotwierdzHaso.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPotwierdzHaso.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPotwierdzHaso.setBackground(SystemColor.controlHighlight);
		lblPotwierdzHaso.setBounds(76, 271, 200, 25);
		contentPane.add(lblPotwierdzHaso);
		
		textField_5 = new JTextField("");
		textField_5.setOpaque(true);
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(276, 271, 360, 25);
		contentPane.add(textField_5);
		
		JLabel lblMiasto = new JLabel("Miasto");
		lblMiasto.setOpaque(true);
		lblMiasto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiasto.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblMiasto.setBorder(new LineBorder(SystemColor.controlShadow));
		lblMiasto.setBackground(SystemColor.controlHighlight);
		lblMiasto.setBounds(76, 296, 200, 25);
		contentPane.add(lblMiasto);
		
		textField_6 = new JTextField("");
		textField_6.setOpaque(true);
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(276, 296, 360, 25);
		contentPane.add(textField_6);
		
		JLabel lblUlica = new JLabel("Ulica");
		lblUlica.setOpaque(true);
		lblUlica.setHorizontalAlignment(SwingConstants.CENTER);
		lblUlica.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUlica.setBorder(new LineBorder(SystemColor.controlShadow));
		lblUlica.setBackground(SystemColor.controlHighlight);
		lblUlica.setBounds(76, 321, 200, 25);
		contentPane.add(lblUlica);
		
		textField_7 = new JTextField("");
		textField_7.setOpaque(true);
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(276, 321, 360, 25);
		contentPane.add(textField_7);
		
		JLabel lblNrMieszkania = new JLabel("Nr mieszkania");
		lblNrMieszkania.setOpaque(true);
		lblNrMieszkania.setHorizontalAlignment(SwingConstants.CENTER);
		lblNrMieszkania.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNrMieszkania.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNrMieszkania.setBackground(SystemColor.controlHighlight);
		lblNrMieszkania.setBounds(76, 346, 200, 25);
		contentPane.add(lblNrMieszkania);
		
		textField_8 = new JTextField("");
		textField_8.setOpaque(true);
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(276, 346, 360, 25);
		contentPane.add(textField_8);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setOpaque(true);
		lblTelefon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefon.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTelefon.setBorder(new LineBorder(SystemColor.controlShadow));
		lblTelefon.setBackground(SystemColor.controlHighlight);
		lblTelefon.setBounds(76, 371, 200, 25);
		contentPane.add(lblTelefon);
		
		textField_9 = new JTextField("");
		textField_9.setOpaque(true);
		textField_9.setHorizontalAlignment(SwingConstants.LEFT);
		textField_9.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(276, 371, 360, 25);
		contentPane.add(textField_9);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setOpaque(true);
		lblMail.setHorizontalAlignment(SwingConstants.CENTER);
		lblMail.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblMail.setBorder(new LineBorder(SystemColor.controlShadow));
		lblMail.setBackground(SystemColor.controlHighlight);
		lblMail.setBounds(76, 396, 200, 25);
		contentPane.add(lblMail);
		
		textField_10 = new JTextField("");
		textField_10.setOpaque(true);
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(276, 396, 360, 25);
		contentPane.add(textField_10);
		
		JLabel lblGrupa = new JLabel("Grupa");
		lblGrupa.setOpaque(true);
		lblGrupa.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupa.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGrupa.setBorder(new LineBorder(SystemColor.controlShadow));
		lblGrupa.setBackground(SystemColor.controlHighlight);
		lblGrupa.setBounds(76, 421, 200, 25);
		contentPane.add(lblGrupa);
		
		textField_11 = new JTextField("");
		textField_11.setOpaque(true);
		textField_11.setHorizontalAlignment(SwingConstants.LEFT);
		textField_11.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(276, 421, 360, 25);
		contentPane.add(textField_11);
		
		JLabel lblWynagrodzenie = new JLabel("Wykszta\u0142cenie");
		lblWynagrodzenie.setOpaque(true);
		lblWynagrodzenie.setHorizontalAlignment(SwingConstants.CENTER);
		lblWynagrodzenie.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWynagrodzenie.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWynagrodzenie.setBackground(SystemColor.controlHighlight);
		lblWynagrodzenie.setBounds(76, 446, 200, 25);
		contentPane.add(lblWynagrodzenie);
		
		textField_12 = new JTextField("");
		textField_12.setOpaque(true);
		textField_12.setHorizontalAlignment(SwingConstants.LEFT);
		textField_12.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_12.setColumns(10);
		textField_12.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(276, 446, 360, 25);
		contentPane.add(textField_12);
		
		JLabel lblStanowisko = new JLabel("Stanowisko");
		lblStanowisko.setOpaque(true);
		lblStanowisko.setHorizontalAlignment(SwingConstants.CENTER);
		lblStanowisko.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblStanowisko.setBorder(new LineBorder(SystemColor.controlShadow));
		lblStanowisko.setBackground(SystemColor.controlHighlight);
		lblStanowisko.setBounds(76, 471, 200, 25);
		contentPane.add(lblStanowisko);
		
		textField_13 = new JTextField("");
		textField_13.setOpaque(true);
		textField_13.setHorizontalAlignment(SwingConstants.LEFT);
		textField_13.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(276, 471, 360, 25);
		contentPane.add(textField_13);
		
		JLabel label_14 = new JLabel("Opis");
		label_14.setOpaque(true);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_14.setBorder(new LineBorder(SystemColor.controlShadow));
		label_14.setBackground(SystemColor.controlHighlight);
		label_14.setBounds(76, 496, 200, 25);
		contentPane.add(label_14);
		
		textField_14 = new JTextField("");
		textField_14.setOpaque(true);
		textField_14.setHorizontalAlignment(SwingConstants.LEFT);
		textField_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_14.setColumns(10);
		textField_14.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(276, 496, 360, 25);
		contentPane.add(textField_14);
		
		JLabel label_15 = new JLabel("v1");
		label_15.setOpaque(true);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_15.setBorder(new LineBorder(SystemColor.controlShadow));
		label_15.setBackground(SystemColor.controlHighlight);
		label_15.setBounds(76, 521, 200, 25);
		contentPane.add(label_15);
		
		textField_15 = new JTextField("");
		textField_15.setOpaque(true);
		textField_15.setHorizontalAlignment(SwingConstants.LEFT);
		textField_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_15.setColumns(10);
		textField_15.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(276, 521, 360, 25);
		contentPane.add(textField_15);
		
		JLabel label_16 = new JLabel("v2");
		label_16.setOpaque(true);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_16.setBorder(new LineBorder(SystemColor.controlShadow));
		label_16.setBackground(SystemColor.controlHighlight);
		label_16.setBounds(76, 546, 200, 25);
		contentPane.add(label_16);
		
		textField_16 = new JTextField("");
		textField_16.setOpaque(true);
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_16.setColumns(10);
		textField_16.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(276, 546, 360, 25);
		contentPane.add(textField_16);
		
		JLabel label_17 = new JLabel("v3");
		label_17.setOpaque(true);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_17.setBorder(new LineBorder(SystemColor.controlShadow));
		label_17.setBackground(SystemColor.controlHighlight);
		label_17.setBounds(76, 571, 200, 25);
		contentPane.add(label_17);
		
		textField_17 = new JTextField("");
		textField_17.setOpaque(true);
		textField_17.setHorizontalAlignment(SwingConstants.LEFT);
		textField_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_17.setColumns(10);
		textField_17.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(276, 571, 360, 25);
		contentPane.add(textField_17);
		
		JLabel label_18 = new JLabel("v4");
		label_18.setOpaque(true);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_18.setBorder(new LineBorder(SystemColor.controlShadow));
		label_18.setBackground(SystemColor.controlHighlight);
		label_18.setBounds(76, 596, 200, 25);
		contentPane.add(label_18);
		
		textField_18 = new JTextField("");
		textField_18.setOpaque(true);
		textField_18.setHorizontalAlignment(SwingConstants.LEFT);
		textField_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_18.setColumns(10);
		textField_18.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(276, 596, 360, 25);
		contentPane.add(textField_18);
		
		JLabel label_19 = new JLabel("v5");
		label_19.setOpaque(true);
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_19.setBorder(new LineBorder(SystemColor.controlShadow));
		label_19.setBackground(SystemColor.controlHighlight);
		label_19.setBounds(76, 621, 200, 25);
		contentPane.add(label_19);
		
		textField_19 = new JTextField("");
		textField_19.setOpaque(true);
		textField_19.setHorizontalAlignment(SwingConstants.LEFT);
		textField_19.setFont(new Font("Calibri", Font.PLAIN, 15));
		textField_19.setColumns(10);
		textField_19.setBorder(new LineBorder(SystemColor.controlShadow));
		textField_19.setBackground(Color.WHITE);
		textField_19.setBounds(276, 621, 360, 25);
		contentPane.add(textField_19);
		
		JLabel lblDaneUytkownika = new JLabel("Dane U\u017Cytkownika:");
		lblDaneUytkownika.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaneUytkownika.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblDaneUytkownika.setBounds(80, 45, 556, 59);
		contentPane.add(lblDaneUytkownika);
		
		JLabel lblDodaj = new JLabel("Dodaj");
		lblDodaj.setOpaque(true);
		lblDodaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblDodaj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDodaj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDodaj.setBackground(SystemColor.controlHighlight);
		lblDodaj.setBounds(436, 678, 200, 25);
		contentPane.add(lblDodaj);
		
		JLabel lblUsu = new JLabel("Usu\u0144");
		lblUsu.setOpaque(true);
		lblUsu.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsu.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUsu.setBorder(new LineBorder(SystemColor.controlShadow));
		lblUsu.setBackground(SystemColor.controlHighlight);
		lblUsu.setBounds(436, 703, 200, 25);
		contentPane.add(lblUsu);
		
		JLabel lblAktualizuj = new JLabel("Aktualizuj");
		lblAktualizuj.setOpaque(true);
		lblAktualizuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblAktualizuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblAktualizuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblAktualizuj.setBackground(SystemColor.controlHighlight);
		lblAktualizuj.setBounds(436, 728, 200, 25);
		contentPane.add(lblAktualizuj);
		
		JLabel lblZmieHaso = new JLabel("Zmie\u0144 Has\u0142o");
		lblZmieHaso.setOpaque(true);
		lblZmieHaso.setHorizontalAlignment(SwingConstants.CENTER);
		lblZmieHaso.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZmieHaso.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZmieHaso.setBackground(SystemColor.controlHighlight);
		lblZmieHaso.setBounds(436, 753, 200, 25);
		contentPane.add(lblZmieHaso);
		
		JLabel lblListaObecnoci = new JLabel("Lista Obecno\u015Bci");
		lblListaObecnoci.setOpaque(true);
		lblListaObecnoci.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaObecnoci.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblListaObecnoci.setBorder(new LineBorder(SystemColor.controlShadow));
		lblListaObecnoci.setBackground(SystemColor.controlHighlight);
		lblListaObecnoci.setBounds(436, 778, 200, 25);
		contentPane.add(lblListaObecnoci);
		
		JLabel lblNazwaPracownika = new JLabel("Nazwa Pracownika");
		lblNazwaPracownika.setOpaque(true);
		lblNazwaPracownika.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwaPracownika.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwaPracownika.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwaPracownika.setBackground(SystemColor.controlHighlight);
		lblNazwaPracownika.setBounds(76, 678, 330, 25);
		contentPane.add(lblNazwaPracownika);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(76, 704, 330, 42);
		contentPane.add(comboBox);
		
		JLabel lblWczytaj = new JLabel("Wczytaj");
		lblWczytaj.setOpaque(true);
		lblWczytaj.setHorizontalAlignment(SwingConstants.CENTER);
		lblWczytaj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWczytaj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWczytaj.setBackground(SystemColor.controlHighlight);
		lblWczytaj.setBounds(203, 761, 200, 42);
		contentPane.add(lblWczytaj);
		
		JLabel lblUprawnienia = new JLabel("Uprawnienia");
		lblUprawnienia.setHorizontalAlignment(SwingConstants.CENTER);
		lblUprawnienia.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblUprawnienia.setBounds(703, 45, 556, 59);
		contentPane.add(lblUprawnienia);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 255));
		panel.setBounds(687, 145, 245, 326);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Checkbox checkbox = new Checkbox("v3");
		checkbox.setBounds(32, 300, 213, 24);
		panel.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("v2");
		checkbox_1.setBounds(32, 270, 213, 24);
		panel.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("v1");
		checkbox_2.setBounds(32, 240, 213, 24);
		panel.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("v4");
		checkbox_3.setBounds(32, 210, 213, 24);
		panel.add(checkbox_3);
		
		Checkbox checkbox_4 = new Checkbox("v3");
		checkbox_4.setBounds(32, 180, 213, 24);
		panel.add(checkbox_4);
		
		Checkbox checkbox_5 = new Checkbox("v2");
		checkbox_5.setBounds(32, 150, 213, 24);
		panel.add(checkbox_5);
		
		Checkbox checkbox_6 = new Checkbox("v1");
		checkbox_6.setBounds(32, 120, 213, 24);
		panel.add(checkbox_6);
		
		Checkbox checkbox_7 = new Checkbox("v4");
		checkbox_7.setBounds(32, 90, 213, 24);
		panel.add(checkbox_7);
		
		Checkbox checkbox_8 = new Checkbox("v3");
		checkbox_8.setBounds(32, 60, 213, 24);
		panel.add(checkbox_8);
		
		Checkbox checkbox_9 = new Checkbox("v2");
		checkbox_9.setBounds(32, 30, 213, 24);
		panel.add(checkbox_9);
		
		Checkbox checkbox_10 = new Checkbox("v1");
		checkbox_10.setBounds(32, 0, 213, 24);
		panel.add(checkbox_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 255));
		panel_1.setBounds(687, 471, 245, 326);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Checkbox checkbox_11 = new Checkbox("v4");
		checkbox_11.setBounds(32, 0, 213, 24);
		panel_1.add(checkbox_11);
		
		Checkbox checkbox_12 = new Checkbox("v1");
		checkbox_12.setBounds(32, 30, 213, 24);
		panel_1.add(checkbox_12);
		
		Checkbox checkbox_13 = new Checkbox("v2");
		checkbox_13.setBounds(32, 60, 213, 24);
		panel_1.add(checkbox_13);
		
		Checkbox checkbox_14 = new Checkbox("v3");
		checkbox_14.setBounds(32, 90, 213, 24);
		panel_1.add(checkbox_14);
		
		Checkbox checkbox_15 = new Checkbox("v4");
		checkbox_15.setBounds(32, 120, 213, 24);
		panel_1.add(checkbox_15);
		
		Checkbox checkbox_16 = new Checkbox("v3");
		checkbox_16.setBounds(32, 153, 213, 24);
		panel_1.add(checkbox_16);
		
		Checkbox checkbox_17 = new Checkbox("v4");
		checkbox_17.setBounds(32, 183, 213, 24);
		panel_1.add(checkbox_17);
		
		Checkbox checkbox_18 = new Checkbox("v1");
		checkbox_18.setBounds(32, 213, 213, 24);
		panel_1.add(checkbox_18);
		
		Checkbox checkbox_19 = new Checkbox("v2");
		checkbox_19.setBounds(32, 243, 213, 24);
		panel_1.add(checkbox_19);
		
		Checkbox checkbox_20 = new Checkbox("v3");
		checkbox_20.setBounds(32, 273, 213, 24);
		panel_1.add(checkbox_20);
		
		Checkbox checkbox_21 = new Checkbox("v4");
		checkbox_21.setBounds(32, 303, 213, 24);
		panel_1.add(checkbox_21);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 204));
		panel_2.setBounds(1014, 472, 245, 326);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		Checkbox checkbox_22 = new Checkbox("v4");
		checkbox_22.setBounds(22, 0, 213, 24);
		panel_2.add(checkbox_22);
		
		Checkbox checkbox_23 = new Checkbox("v1");
		checkbox_23.setBounds(22, 30, 213, 24);
		panel_2.add(checkbox_23);
		
		Checkbox checkbox_24 = new Checkbox("v2");
		checkbox_24.setBounds(22, 60, 213, 24);
		panel_2.add(checkbox_24);
		
		Checkbox checkbox_25 = new Checkbox("v3");
		checkbox_25.setBounds(22, 90, 213, 24);
		panel_2.add(checkbox_25);
		
		Checkbox checkbox_26 = new Checkbox("v4");
		checkbox_26.setBounds(22, 120, 213, 24);
		panel_2.add(checkbox_26);
		
		Checkbox checkbox_27 = new Checkbox("v3");
		checkbox_27.setBounds(22, 153, 213, 24);
		panel_2.add(checkbox_27);
		
		Checkbox checkbox_28 = new Checkbox("v4");
		checkbox_28.setBounds(22, 183, 213, 24);
		panel_2.add(checkbox_28);
		
		Checkbox checkbox_29 = new Checkbox("v1");
		checkbox_29.setBounds(22, 213, 213, 24);
		panel_2.add(checkbox_29);
		
		Checkbox checkbox_30 = new Checkbox("v2");
		checkbox_30.setBounds(22, 243, 213, 24);
		panel_2.add(checkbox_30);
		
		Checkbox checkbox_31 = new Checkbox("v3");
		checkbox_31.setBounds(22, 273, 213, 24);
		panel_2.add(checkbox_31);
		
		Checkbox checkbox_32 = new Checkbox("v4");
		checkbox_32.setBounds(22, 303, 213, 24);
		panel_2.add(checkbox_32);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 153, 153));
		panel_3.setBounds(1014, 146, 245, 326);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		Checkbox checkbox_33 = new Checkbox("v1");
		checkbox_33.setBounds(22, 0, 213, 24);
		panel_3.add(checkbox_33);
		
		Checkbox checkbox_34 = new Checkbox("v2");
		checkbox_34.setBounds(22, 30, 213, 24);
		panel_3.add(checkbox_34);
		
		Checkbox checkbox_35 = new Checkbox("v3");
		checkbox_35.setBounds(22, 60, 213, 24);
		panel_3.add(checkbox_35);
		
		Checkbox checkbox_36 = new Checkbox("v4");
		checkbox_36.setBounds(22, 90, 213, 24);
		panel_3.add(checkbox_36);
		
		Checkbox checkbox_37 = new Checkbox("v1");
		checkbox_37.setBounds(22, 120, 213, 24);
		panel_3.add(checkbox_37);
		
		Checkbox checkbox_38 = new Checkbox("v2");
		checkbox_38.setBounds(22, 150, 213, 24);
		panel_3.add(checkbox_38);
		
		Checkbox checkbox_39 = new Checkbox("v3");
		checkbox_39.setBounds(22, 180, 213, 24);
		panel_3.add(checkbox_39);
		
		Checkbox checkbox_40 = new Checkbox("v4");
		checkbox_40.setBounds(22, 210, 213, 24);
		panel_3.add(checkbox_40);
		
		Checkbox checkbox_41 = new Checkbox("v1");
		checkbox_41.setBounds(22, 240, 213, 24);
		panel_3.add(checkbox_41);
		
		Checkbox checkbox_42 = new Checkbox("v2");
		checkbox_42.setBounds(22, 270, 213, 24);
		panel_3.add(checkbox_42);
		
		Checkbox checkbox_43 = new Checkbox("v3");
		checkbox_43.setBounds(22, 300, 213, 24);
		panel_3.add(checkbox_43);
		
		
		
	}

}
