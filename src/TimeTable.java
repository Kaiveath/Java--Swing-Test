import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.Checkbox;
import javax.swing.JComboBox;


public class TimeTable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeTable frame = new TimeTable();
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
	public TimeTable() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 10, 1439, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrafikProdukcyjny = new JLabel("Grafik Pracy");
		lblGrafikProdukcyjny.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrafikProdukcyjny.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblGrafikProdukcyjny.setBounds(32, 33, 1301, 74);
		contentPane.add(lblGrafikProdukcyjny);
		
		JLabel lblOsoba = new JLabel("Osoba");
		lblOsoba.setOpaque(true);
		lblOsoba.setHorizontalAlignment(SwingConstants.CENTER);
		lblOsoba.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblOsoba.setBorder(new LineBorder(SystemColor.controlShadow));
		lblOsoba.setBackground(SystemColor.controlHighlight);
		lblOsoba.setBounds(30, 120, 268, 50);
		contentPane.add(lblOsoba);
		
		JLabel label = new JLabel("<html><div style='text-align: center;'>" + "02.10<br>PN" + "</div></html>");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		label.setFont(new Font("Calibri", Font.PLAIN, 15));
		label.setBorder(new LineBorder(SystemColor.controlShadow));
		label.setBackground(SystemColor.controlHighlight);
		label.setBounds(529, 120, 120, 50);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("<html><div style='text-align: center;'>03.10<br>WT</div></html>");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_1.setBorder(new LineBorder(SystemColor.controlShadow));
		label_1.setBackground(SystemColor.controlHighlight);
		label_1.setBounds(649, 120, 120, 50);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("<html><div style='text-align: center;'>04.10<br>ŒR</div></html>");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_2.setBorder(new LineBorder(SystemColor.controlShadow));
		label_2.setBackground(SystemColor.controlHighlight);
		label_2.setBounds(769, 120, 120, 50);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("<html><div style='text-align: center;'>05.10<br>CZW</div></html>");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_3.setBorder(new LineBorder(SystemColor.controlShadow));
		label_3.setBackground(SystemColor.controlHighlight);
		label_3.setBounds(889, 120, 120, 50);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("<html><div style='text-align: center;'>06.10<br>PT</div></html>");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_4.setBorder(new LineBorder(SystemColor.controlShadow));
		label_4.setBackground(SystemColor.controlHighlight);
		label_4.setBounds(1009, 120, 120, 50);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("<html><div style='text-align: center;'>07.10<br>SB</div></html>");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_5.setBorder(new LineBorder(SystemColor.controlShadow));
		label_5.setBackground(SystemColor.controlHighlight);
		label_5.setBounds(1129, 120, 120, 50);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("<html><div style='text-align: center;'>08.10<br>ND</div></html>");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_6.setBorder(new LineBorder(SystemColor.controlShadow));
		label_6.setBackground(SystemColor.controlHighlight);
		label_6.setBounds(1249, 120, 120, 50);
		contentPane.add(label_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 172, 1341, 563);
		contentPane.add(scrollPane);
		
		JLabel lblDalej = new JLabel("Dalej  >>");
		lblDalej.setOpaque(true);
		lblDalej.setHorizontalAlignment(SwingConstants.CENTER);
		lblDalej.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDalej.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDalej.setBackground(SystemColor.controlHighlight);
		lblDalej.setBounds(1249, 748, 120, 30);
		contentPane.add(lblDalej);
		
		JLabel lblWstecz = new JLabel("<<   Wstecz");
		lblWstecz.setOpaque(true);
		lblWstecz.setHorizontalAlignment(SwingConstants.CENTER);
		lblWstecz.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWstecz.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWstecz.setBackground(SystemColor.controlHighlight);
		lblWstecz.setBounds(1093, 748, 120, 30);
		contentPane.add(lblWstecz);
		
		JLabel lblGrupa = new JLabel("Grupa");
		lblGrupa.setOpaque(true);
		lblGrupa.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupa.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGrupa.setBorder(new LineBorder(SystemColor.controlShadow));
		lblGrupa.setBackground(SystemColor.controlHighlight);
		lblGrupa.setBounds(298, 120, 231, 50);
		contentPane.add(lblGrupa);
		
		Checkbox checkbox = new Checkbox("06:00 - 14:00");
		checkbox.setBounds(52, 758, 117, 24);
		contentPane.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("14:00 - 22:00");
		checkbox_1.setBounds(52, 788, 117, 24);
		contentPane.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("22:00 - 06:00");
		checkbox_2.setBounds(175, 758, 111, 24);
		contentPane.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("08:00 - 16:00");
		checkbox_3.setBounds(175, 788, 111, 24);
		contentPane.add(checkbox_3);
		
		Checkbox checkbox_4 = new Checkbox("YY:YY - XX:XX");
		checkbox_4.setBounds(306, 788, 111, 24);
		contentPane.add(checkbox_4);
		
		Checkbox checkbox_5 = new Checkbox("XX:XX - YY:YY");
		checkbox_5.setBounds(306, 758, 111, 24);
		contentPane.add(checkbox_5);
		
		JLabel lblZapisz = new JLabel("Zapisz");
		lblZapisz.setOpaque(true);
		lblZapisz.setHorizontalAlignment(SwingConstants.CENTER);
		lblZapisz.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZapisz.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZapisz.setBackground(SystemColor.controlHighlight);
		lblZapisz.setBounds(1093, 791, 120, 30);
		contentPane.add(lblZapisz);
		
		JLabel lblV = new JLabel("v1");
		lblV.setOpaque(true);
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		lblV.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV.setBackground(SystemColor.controlHighlight);
		lblV.setBounds(1249, 791, 120, 30);
		contentPane.add(lblV);
		
		Checkbox checkbox_6 = new Checkbox("Wolne");
		checkbox_6.setBounds(543, 788, 111, 24);
		contentPane.add(checkbox_6);
		
		Checkbox checkbox_7 = new Checkbox("Okoloczno\u015B\u0107");
		checkbox_7.setBounds(543, 758, 111, 24);
		contentPane.add(checkbox_7);
		
		Checkbox checkbox_8 = new Checkbox("Chorobowy");
		checkbox_8.setBounds(437, 788, 111, 24);
		contentPane.add(checkbox_8);
		
		Checkbox checkbox_9 = new Checkbox("Urlop");
		checkbox_9.setBounds(437, 758, 111, 24);
		contentPane.add(checkbox_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(678, 788, 191, 30);
		contentPane.add(comboBox);
		
		JLabel lblGrupa_1 = new JLabel("Grupa");
		lblGrupa_1.setOpaque(true);
		lblGrupa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupa_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblGrupa_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblGrupa_1.setBackground(SystemColor.controlHighlight);
		lblGrupa_1.setBounds(679, 752, 190, 30);
		contentPane.add(lblGrupa_1);
		
		
		
		
	}
}
