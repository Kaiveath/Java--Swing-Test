import java.awt.Color;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class RawMaterials extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RawMaterials frame = new RawMaterials();
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
	public RawMaterials() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(50, 10, 1146, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblZapotrzebowanieNaProdukcj = new JLabel("Zapotrzebowanie na produkcj\u0119:");
		lblZapotrzebowanieNaProdukcj.setHorizontalAlignment(SwingConstants.CENTER);
		lblZapotrzebowanieNaProdukcj.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblZapotrzebowanieNaProdukcj.setBounds(12, 24, 942, 59);
		contentPane.add(lblZapotrzebowanieNaProdukcj);
		
		JLabel lblKod = new JLabel("Kod");
		lblKod.setOpaque(true);
		lblKod.setHorizontalAlignment(SwingConstants.CENTER);
		lblKod.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKod.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod.setBackground(SystemColor.controlHighlight);
		lblKod.setBounds(12, 100, 88, 25);
		contentPane.add(lblKod);
		
		JLabel label_1 = new JLabel("Nazwa surowca");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_1.setBorder(new LineBorder(SystemColor.controlShadow));
		label_1.setBackground(SystemColor.controlHighlight);
		label_1.setBounds(100, 100, 200, 25);
		contentPane.add(label_1);
		
		JLabel lblIloWymagana = new JLabel("Ilo\u015B\u0107 wymagana");
		lblIloWymagana.setOpaque(true);
		lblIloWymagana.setHorizontalAlignment(SwingConstants.CENTER);
		lblIloWymagana.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIloWymagana.setBorder(new LineBorder(SystemColor.controlShadow));
		lblIloWymagana.setBackground(SystemColor.controlHighlight);
		lblIloWymagana.setBounds(300, 100, 160, 25);
		contentPane.add(lblIloWymagana);
		
		JLabel lblStanMagazynu = new JLabel("Stan Magazynu");
		lblStanMagazynu.setOpaque(true);
		lblStanMagazynu.setHorizontalAlignment(SwingConstants.CENTER);
		lblStanMagazynu.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblStanMagazynu.setBorder(new LineBorder(SystemColor.controlShadow));
		lblStanMagazynu.setBackground(SystemColor.controlHighlight);
		lblStanMagazynu.setBounds(460, 100, 150, 25);
		contentPane.add(lblStanMagazynu);
		
		JLabel lblRnica = new JLabel("R\u00F3\u017Cnica");
		lblRnica.setOpaque(true);
		lblRnica.setHorizontalAlignment(SwingConstants.CENTER);
		lblRnica.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRnica.setBorder(new LineBorder(SystemColor.controlShadow));
		lblRnica.setBackground(SystemColor.controlHighlight);
		lblRnica.setBounds(610, 100, 115, 25);
		contentPane.add(lblRnica);
		
		JLabel lblrZuycie = new JLabel("\u015Ar. Zu\u017C. / miesi\u0105c");
		lblrZuycie.setOpaque(true);
		lblrZuycie.setHorizontalAlignment(SwingConstants.CENTER);
		lblrZuycie.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblrZuycie.setBorder(new LineBorder(SystemColor.controlShadow));
		lblrZuycie.setBackground(SystemColor.controlHighlight);
		lblrZuycie.setBounds(725, 100, 115, 25);
		contentPane.add(lblrZuycie);
		
		JLabel lblrCzasDostawy = new JLabel("\u015Ar. czas dostawy");
		lblrCzasDostawy.setOpaque(true);
		lblrCzasDostawy.setHorizontalAlignment(SwingConstants.CENTER);
		lblrCzasDostawy.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblrCzasDostawy.setBorder(new LineBorder(SystemColor.controlShadow));
		lblrCzasDostawy.setBackground(SystemColor.controlHighlight);
		lblrCzasDostawy.setBounds(840, 100, 115, 25);
		contentPane.add(lblrCzasDostawy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 126, 1058, 503);
		contentPane.add(scrollPane);
		
		JLabel lblZZamwienie = new JLabel("Z\u0142\u00F3\u017C zam\u00F3wienie");
		lblZZamwienie.setOpaque(true);
		lblZZamwienie.setHorizontalAlignment(SwingConstants.CENTER);
		lblZZamwienie.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZZamwienie.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZZamwienie.setBackground(SystemColor.controlHighlight);
		lblZZamwienie.setBounds(12, 657, 200, 25);
		contentPane.add(lblZZamwienie);
		
		lblZZamwienie.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				Orders goOrders=new Orders();
				goOrders.setVisible(true);	
			}
		});		
		lblZZamwienie.addMouseListener(new MouseAdapter() 
		{
	
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				lblZZamwienie.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				lblZZamwienie.setBackground(SystemColor.controlHighlight);									
			}
		});	

		
		JLabel lblDrukuj = new JLabel("Drukuj");
		lblDrukuj.setOpaque(true);
		lblDrukuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrukuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDrukuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDrukuj.setBackground(SystemColor.controlHighlight);
		lblDrukuj.setBounds(212, 657, 200, 25);
		contentPane.add(lblDrukuj);
		
		JLabel lblV_3 = new JLabel("v4");
		lblV_3.setOpaque(true);
		lblV_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_3.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_3.setBackground(SystemColor.controlHighlight);
		lblV_3.setBounds(212, 682, 200, 25);
		contentPane.add(lblV_3);
		
		JLabel lblV = new JLabel("Poka\u017C do jakich Farb");
		lblV.setOpaque(true);
		lblV.setHorizontalAlignment(SwingConstants.CENTER);
		lblV.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV.setBackground(SystemColor.controlHighlight);
		lblV.setBounds(12, 682, 200, 25);
		contentPane.add(lblV);
		
		JLabel lblV_1 = new JLabel("v2");
		lblV_1.setOpaque(true);
		lblV_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_1.setBackground(SystemColor.controlHighlight);
		lblV_1.setBounds(12, 707, 200, 25);
		contentPane.add(lblV_1);
		
		JLabel lblV_4 = new JLabel("v5");
		lblV_4.setOpaque(true);
		lblV_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_4.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_4.setBackground(SystemColor.controlHighlight);
		lblV_4.setBounds(212, 707, 200, 25);
		contentPane.add(lblV_4);
		
		JLabel lblV_5 = new JLabel("v6");
		lblV_5.setOpaque(true);
		lblV_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_5.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_5.setBackground(SystemColor.controlHighlight);
		lblV_5.setBounds(212, 732, 200, 25);
		contentPane.add(lblV_5);
		
		JLabel lblV_2 = new JLabel("v3");
		lblV_2.setOpaque(true);
		lblV_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_2.setBackground(SystemColor.controlHighlight);
		lblV_2.setBounds(12, 732, 200, 25);
		contentPane.add(lblV_2);
		
		Checkbox checkbox = new Checkbox("Dodatki");
		checkbox.setBounds(491, 774, 146, 24);
		contentPane.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Pigmenty");
		checkbox_1.setBounds(491, 744, 146, 24);
		contentPane.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("\u017Bywice");
		checkbox_2.setBounds(491, 714, 146, 24);
		contentPane.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("Surowce brakuj\u0105ce");
		checkbox_3.setBounds(491, 684, 146, 24);
		contentPane.add(checkbox_3);
		
		JLabel label = new JLabel("Wy\u015Bwietl:");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label.setBounds(488, 635, 269, 50);
		contentPane.add(label);
		
		Checkbox checkbox_4 = new Checkbox("v2");
		checkbox_4.setBounds(656, 772, 213, 24);
		contentPane.add(checkbox_4);
		
		Checkbox checkbox_5 = new Checkbox("Poni\u017Cej minimum");
		checkbox_5.setBounds(656, 742, 213, 24);
		contentPane.add(checkbox_5);
		
		Checkbox checkbox_6 = new Checkbox("Inne");
		checkbox_6.setBounds(656, 712, 213, 24);
		contentPane.add(checkbox_6);
		
		Checkbox checkbox_7 = new Checkbox("Wype\u0142niacze");
		checkbox_7.setBounds(656, 682, 213, 24);
		contentPane.add(checkbox_7);
		
		JLabel lblZamwione = new JLabel("Zam\u00F3wione");
		lblZamwione.setOpaque(true);
		lblZamwione.setHorizontalAlignment(SwingConstants.CENTER);
		lblZamwione.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZamwione.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZamwione.setBackground(SystemColor.controlHighlight);
		lblZamwione.setBounds(955, 100, 115, 25);
		contentPane.add(lblZamwione);
	}

}
