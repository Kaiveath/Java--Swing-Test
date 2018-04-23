import java.awt.EventQueue;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Checkbox;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;


public class Orders extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try 
				{
					Orders frame = new Orders();
					frame.setVisible(true);
				    iconify(frame);					// Zmiana rozmiaru FRAME na full screan??

				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		

	}

	/**
	 * Create the frame.
	 */
	

	
	public Orders() 
	{
		

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 10, 1400, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		
		JLabel label_1 = new JLabel("Data zam\u00F3wienia");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_1.setBorder(new LineBorder(SystemColor.controlShadow));
		label_1.setBackground(SystemColor.controlHighlight);
		label_1.setBounds(50, 165, 150, 25);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Dostawca");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_2.setBorder(new LineBorder(SystemColor.controlShadow));
		label_2.setBackground(SystemColor.controlHighlight);
		label_2.setBounds(50, 190, 150, 25);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Rodzaj surowca");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_3.setBorder(new LineBorder(SystemColor.controlShadow));
		label_3.setBackground(SystemColor.controlHighlight);
		label_3.setBounds(540, 388, 175, 25);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Nazwa surowca");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_4.setBorder(new LineBorder(SystemColor.controlShadow));
		label_4.setBackground(SystemColor.controlHighlight);
		label_4.setBounds(715, 388, 200, 25);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Ilo\u015B\u0107 zamawiana");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_5.setBorder(new LineBorder(SystemColor.controlShadow));
		label_5.setBackground(SystemColor.controlHighlight);
		label_5.setBounds(915, 388, 160, 25);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Ilo\u015B\u0107 dostarczona");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_6.setBorder(new LineBorder(SystemColor.controlShadow));
		label_6.setBackground(SystemColor.controlHighlight);
		label_6.setBounds(1075, 388, 150, 25);
		contentPane.add(label_6);
		
		JLabel lblZapiszOpis = new JLabel("Zapisz Opis");
		lblZapiszOpis.setOpaque(true);
		lblZapiszOpis.setHorizontalAlignment(SwingConstants.CENTER);
		lblZapiszOpis.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZapiszOpis.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZapiszOpis.setBackground(SystemColor.controlHighlight);
		lblZapiszOpis.setBounds(290, 790, 150, 25);
		contentPane.add(lblZapiszOpis);
		
		JLabel label_10 = new JLabel("Dostawa");
		label_10.setOpaque(true);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_10.setBorder(new LineBorder(SystemColor.controlShadow));
		label_10.setBackground(SystemColor.controlHighlight);
		label_10.setBounds(50, 290, 150, 25);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Transport");
		label_11.setOpaque(true);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_11.setBorder(new LineBorder(SystemColor.controlShadow));
		label_11.setBackground(SystemColor.controlHighlight);
		label_11.setBounds(50, 215, 150, 25);
		contentPane.add(label_11);
		
		JLabel label_13 = new JLabel("Waluta");
		label_13.setOpaque(true);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_13.setBorder(new LineBorder(SystemColor.controlShadow));
		label_13.setBackground(SystemColor.controlHighlight);
		label_13.setBounds(50, 240, 150, 25);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("Kurs");
		label_14.setOpaque(true);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_14.setBorder(new LineBorder(SystemColor.controlShadow));
		label_14.setBackground(SystemColor.controlHighlight);
		label_14.setBounds(50, 265, 150, 25);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("Cena");
		label_15.setOpaque(true);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_15.setBorder(new LineBorder(SystemColor.controlShadow));
		label_15.setBackground(SystemColor.controlHighlight);
		label_15.setBounds(1225, 388, 115, 25);
		contentPane.add(label_15);
		
		JLabel lblNumerZamwienia = new JLabel("Numer zam\u00F3wienia:");
		lblNumerZamwienia.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNumerZamwienia.setBounds(11, 13, 167, 42);
		contentPane.add(lblNumerZamwienia);
		
		JLabel label_17 = new JLabel("31/04/2017");
		label_17.setFont(new Font("Calibri", Font.BOLD, 20));
		label_17.setBounds(195, 13, 110, 42);
		contentPane.add(label_17);
		
		Checkbox checkbox = new Checkbox("Zam\u00F3wienie niepotwierdzone");
		checkbox.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox.setBounds(50, 350, 213, 25);
		contentPane.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Zam\u00F3wienie sp\u00F3\u017Anione");
		checkbox_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_1.setBounds(50, 400, 213, 25);
		contentPane.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("Reklamacja");
		checkbox_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_2.setBounds(50, 450, 213, 25);
		contentPane.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("Zam\u00F3wienie w drodze");
		checkbox_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_3.setBounds(50, 375, 213, 25);
		contentPane.add(checkbox_3);
		
		Checkbox checkbox_4 = new Checkbox("Zam\u00F3wienie na magazynie");
		checkbox_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_4.setBounds(50, 425, 213, 25);
		contentPane.add(checkbox_4);
		
		Checkbox checkbox_5 = new Checkbox("Brak FV");
		checkbox_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_5.setBounds(50, 475, 213, 25);
		contentPane.add(checkbox_5);
		
		Checkbox checkbox_6 = new Checkbox("Brak dokumentu 1");
		checkbox_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_6.setBounds(50, 500, 213, 25);
		contentPane.add(checkbox_6);
		
		Checkbox checkbox_7 = new Checkbox("Brak dokumentu 2");
		checkbox_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_7.setBounds(50, 525, 213, 25);
		contentPane.add(checkbox_7);
		
		Checkbox checkbox_8 = new Checkbox("Odbi\u00F3r po naszej stronie");
		checkbox_8.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_8.setBounds(50, 550, 213, 25);
		contentPane.add(checkbox_8);
		
		Checkbox checkbox_9 = new Checkbox("Follow");
		checkbox_9.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_9.setBounds(50, 575, 213, 25);
		contentPane.add(checkbox_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(540, 75, 800, 300);
		contentPane.add(scrollPane);
		
		Checkbox checkbox_10 = new Checkbox("Zam\u00F3wienie niepe\u0142ne");
		checkbox_10.setFont(new Font("Calibri", Font.PLAIN, 15));
		checkbox_10.setBounds(50, 325, 213, 25);
		contentPane.add(checkbox_10);
		
		textField = new JTextField();
		textField.setBounds(200, 165, 240, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(200, 190, 240, 25);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(200, 215, 240, 25);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(200, 240, 240, 25);
		contentPane.add(comboBox_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 265, 240, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(200, 290, 240, 25);
		contentPane.add(textField_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(540, 413, 175, 25);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(715, 413, 200, 25);
		contentPane.add(comboBox_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(915, 413, 160, 25);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(1075, 413, 150, 25);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(1225, 413, 115, 25);
		contentPane.add(textField_5);
		
		JLabel label = new JLabel("DODAJ");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.PLAIN, 15));
		label.setBorder(new LineBorder(SystemColor.controlShadow));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(1225, 463, 115, 25);
		contentPane.add(label);
		
		JLabel label_7 = new JLabel("AKTUALIZUJ");
		label_7.setOpaque(true);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_7.setBorder(new LineBorder(SystemColor.controlShadow));
		label_7.setBackground(SystemColor.controlHighlight);
		label_7.setBounds(1225, 513, 115, 25);
		contentPane.add(label_7);
		
		JLabel lblGenerujPdf = new JLabel("Generuj PDF");
		lblGenerujPdf.setOpaque(true);
		lblGenerujPdf.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenerujPdf.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGenerujPdf.setBorder(new LineBorder(SystemColor.controlShadow));
		lblGenerujPdf.setBackground(SystemColor.controlHighlight);
		lblGenerujPdf.setBounds(1225, 538, 115, 25);
		contentPane.add(lblGenerujPdf);
		
		JLabel label_12 = new JLabel("USU\u0143");
		label_12.setOpaque(true);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_12.setBorder(new LineBorder(SystemColor.controlShadow));
		label_12.setBackground(SystemColor.controlHighlight);
		label_12.setBounds(1225, 488, 115, 25);
		contentPane.add(label_12);
		
		JLabel lblZamknij = new JLabel("Zapisz");
		lblZamknij.setOpaque(true);
		lblZamknij.setHorizontalAlignment(SwingConstants.CENTER);
		lblZamknij.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZamknij.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZamknij.setBackground(SystemColor.controlHighlight);
		lblZamknij.setBounds(1225, 563, 115, 25);
		contentPane.add(lblZamknij);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(50, 625, 390, 160);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JLabel label_8 = new JLabel("Dane og\u00F3lne:");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 30));
		label_8.setBounds(50, 77, 390, 59);
		contentPane.add(label_8);
		
		JLabel lblZamwienie = new JLabel("Zam\u00F3wienie:");
		lblZamwienie.setHorizontalAlignment(SwingConstants.CENTER);
		lblZamwienie.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblZamwienie.setBounds(540, 13, 800, 59);
		contentPane.add(lblZamwienie);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(540, 550, 543, 263);
		contentPane.add(scrollPane_2);
		
		JLabel lblOstatnieZamwienie = new JLabel("Ostatnie zam\u00F3wienie:");
		lblOstatnieZamwienie.setHorizontalAlignment(SwingConstants.CENTER);
		lblOstatnieZamwienie.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblOstatnieZamwienie.setBounds(541, 475, 543, 59);
		contentPane.add(lblOstatnieZamwienie);
	}   


	public static void iconify(Frame Orders)								// Zmiana rozmiaru FRAME na full screan??
	
	
	
	{
	    int state = Orders.getExtendedState();

	    // Set the iconified bit
	    state |= Frame.ICONIFIED;

	    // Iconify the frame
	    Orders.setExtendedState(state);
	}
	}

