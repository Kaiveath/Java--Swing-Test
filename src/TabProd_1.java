import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class TabProd_1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabProd_1() {
		

		setSize(1582, 690);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelProd_1 = new JPanel();
		JPanelProd_1.setBounds(0, 0, 1582, 690);							// ZMNIEJSZYÆ !!!
		add(JPanelProd_1);
		JPanelProd_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(30, 60, 1510, 557);
		JPanelProd_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblStrona = new JLabel("Linia produkcyjna nr 1");
		lblStrona.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrona.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblStrona.setForeground(new Color(0,102,102));
		lblStrona.setBounds(25, 10, 215, 45);
		panel_2.add(lblStrona);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(SystemColor.inactiveCaption);
		panel_4.setBounds(75, 130, 317, 314);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 205, 170));
		panel_5.setBounds(1, 50, 315, 50);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblPracuje = new JLabel("Pracuje");
		lblPracuje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPracuje.setForeground(new Color(0, 102, 102));
		lblPracuje.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblPracuje.setBounds(0, 0, 317, 50);
		panel_5.add(lblPracuje);
		

		
		JProgressBar progressBar = new JProgressBar(0);
		progressBar.setBounds(146, 172, 159, 32);
		progressBar.setValue(100);
		progressBar.setStringPainted(true);
		panel_4.add(progressBar);
		
		JLabel lblEkstruderFfzi = new JLabel("Dozowanie ");
		lblEkstruderFfzi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEkstruderFfzi.setForeground(new Color(0, 102, 102));
		lblEkstruderFfzi.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblEkstruderFfzi.setBounds(0, 0, 158, 50);
		panel_4.add(lblEkstruderFfzi);
		
		JLabel lblPartia = new JLabel("Partia:");
		lblPartia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPartia.setForeground(SystemColor.textHighlight);
		lblPartia.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblPartia.setBounds(0, 99, 79, 32);
		panel_4.add(lblPartia);
		
		JLabel label_24 = new JLabel("10584");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setForeground(SystemColor.textHighlight);
		label_24.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_24.setBounds(79, 99, 79, 32);
		panel_4.add(label_24);
		
		JLabel lblKod = new JLabel("Kod:");
		lblKod.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKod.setForeground(SystemColor.textHighlight);
		lblKod.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblKod.setBounds(158, 99, 79, 32);
		panel_4.add(lblKod);
		
		JLabel label_26 = new JLabel("400307");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setForeground(SystemColor.textHighlight);
		label_26.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_26.setBounds(238, 99, 79, 32);
		panel_4.add(label_26);
		
		JLabel lblPolidurZielony = new JLabel("POLIDUR ZIELONY 6005 PRZ/B");
		lblPolidurZielony.setHorizontalAlignment(SwingConstants.CENTER);
		lblPolidurZielony.setForeground(SystemColor.textHighlight);
		lblPolidurZielony.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblPolidurZielony.setBounds(0, 128, 317, 32);
		panel_4.add(lblPolidurZielony);
		
		JProgressBar progressBar_1 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_1.setValue(100);
		progressBar_1.setStringPainted(true);
		progressBar_1.setBounds(146, 217, 159, 32);
		panel_4.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_2.setValue(100);
		progressBar_2.setStringPainted(true);
		progressBar_2.setBounds(146, 264, 159, 32);
		panel_4.add(progressBar_2);
		
		JLabel lblInfo = new JLabel("Info 1 ");
		lblInfo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInfo.setForeground(SystemColor.textHighlight);
		lblInfo.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblInfo.setBounds(0, 172, 150, 32);
		panel_4.add(lblInfo);
		
		JLabel label_25 = new JLabel("Info 1 ");
		label_25.setHorizontalAlignment(SwingConstants.RIGHT);
		label_25.setForeground(SystemColor.textHighlight);
		label_25.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_25.setBounds(-11, 214, 159, 32);
		panel_4.add(label_25);
		
		JLabel label_27 = new JLabel("Info 1 ");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setForeground(SystemColor.textHighlight);
		label_27.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_27.setBounds(-11, 264, 159, 32);
		panel_4.add(label_27);
		
		JLabel lblFfzi = new JLabel("+ Mikser");
		lblFfzi.setHorizontalAlignment(SwingConstants.LEFT);
		lblFfzi.setForeground(new Color(0, 102, 102));
		lblFfzi.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblFfzi.setBounds(158, 0, 158, 50);
		panel_4.add(lblFfzi);
		
		JLabel lblPracownik = new JLabel("Pracownik: ");
		lblPracownik.setHorizontalAlignment(SwingConstants.CENTER);
		lblPracownik.setForeground(new Color(0, 0, 0));
		lblPracownik.setFont(lblPracownik.getFont().deriveFont(lblPracownik.getFont().getStyle() | Font.ITALIC));
		lblPracownik.setBounds(75, 444, 92, 27);
		panel_2.add(lblPracownik);
		
		JLabel lblJacekWiniewski = new JLabel("Jacek Wi\u015Bniewski");
		lblJacekWiniewski.setHorizontalAlignment(SwingConstants.CENTER);
		lblJacekWiniewski.setForeground(Color.BLACK);
		lblJacekWiniewski.setFont(lblPracownik.getFont().deriveFont(lblPracownik.getFont().getStyle() | Font.ITALIC));
		lblJacekWiniewski.setBounds(167, 444, 222, 27);
		panel_2.add(lblJacekWiniewski);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(524, 130, 317, 314);
		panel_2.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setBounds(1, 50, 315, 50);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Pracuje");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 102, 102));
		label.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label.setBounds(0, 0, 317, 50);
		panel_1.add(label);
		
		JProgressBar progressBar_6 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_6.setValue(80);
		progressBar_6.setStringPainted(true);
		progressBar_6.setBounds(146, 172, 159, 32);
		panel.add(progressBar_6);
		
		JLabel label_1 = new JLabel("Ekstruder ");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(new Color(0, 102, 102));
		label_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_1.setBounds(0, 0, 158, 50);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Partia:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(SystemColor.textHighlight);
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_2.setBounds(0, 99, 79, 32);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("10584");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(SystemColor.textHighlight);
		label_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_3.setBounds(79, 99, 79, 32);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Kod:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(SystemColor.textHighlight);
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_4.setBounds(158, 99, 79, 32);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("400307");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(SystemColor.textHighlight);
		label_5.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_5.setBounds(238, 99, 79, 32);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("POLIDUR ZIELONY 6005 PRZ/B");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(SystemColor.textHighlight);
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_6.setBounds(0, 128, 317, 32);
		panel.add(label_6);
		
		JProgressBar progressBar_7 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_7.setValue(20);
		progressBar_7.setStringPainted(true);
		progressBar_7.setBounds(146, 217, 159, 32);
		panel.add(progressBar_7);
		
		JProgressBar progressBar_8 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_8.setValue(21);
		progressBar_8.setStringPainted(true);
		progressBar_8.setBounds(146, 264, 159, 32);
		panel.add(progressBar_8);
		
		JLabel label_7 = new JLabel("Info 1 ");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setForeground(SystemColor.textHighlight);
		label_7.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_7.setBounds(0, 172, 150, 32);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Info 1 ");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setForeground(SystemColor.textHighlight);
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_8.setBounds(-11, 214, 159, 32);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Info 1 ");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setForeground(SystemColor.textHighlight);
		label_9.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_9.setBounds(-11, 264, 159, 32);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel(" Ff03z5i");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setForeground(new Color(0, 102, 102));
		label_10.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_10.setBounds(158, 0, 158, 50);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Pracownik: ");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.BLACK);
		label_11.setFont(label_11.getFont().deriveFont(label_11.getFont().getStyle() | Font.ITALIC));
		label_11.setBounds(524, 444, 92, 27);
		panel_2.add(label_11);
		
		JLabel lblZbyszekXx = new JLabel("Zbyszek XX");
		lblZbyszekXx.setHorizontalAlignment(SwingConstants.CENTER);
		lblZbyszekXx.setForeground(Color.BLACK);
		lblZbyszekXx.setFont(lblZbyszekXx.getFont().deriveFont(lblZbyszekXx.getFont().getStyle() | Font.ITALIC));
		lblZbyszekXx.setBounds(616, 444, 222, 27);
		panel_2.add(lblZbyszekXx);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBackground(SystemColor.inactiveCaption);
		panel_8.setBounds(980, 130, 317, 314);
		panel_2.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(102, 205, 170));
		panel_9.setBounds(1, 50, 315, 50);
		panel_8.add(panel_9);
		
		JLabel label_13 = new JLabel("Pracuje");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(new Color(0, 102, 102));
		label_13.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_13.setBounds(0, 0, 317, 50);
		panel_9.add(label_13);
		
		JProgressBar progressBar_9 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_9.setValue(54);
		progressBar_9.setStringPainted(true);
		progressBar_9.setBounds(146, 172, 159, 32);
		panel_8.add(progressBar_9);
		
		JLabel lblMyn = new JLabel("M\u0142yn ");
		lblMyn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMyn.setForeground(new Color(0, 102, 102));
		lblMyn.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblMyn.setBounds(0, 0, 158, 50);
		panel_8.add(lblMyn);
		
		JLabel label_15 = new JLabel("Partia:");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setForeground(SystemColor.textHighlight);
		label_15.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_15.setBounds(0, 99, 79, 32);
		panel_8.add(label_15);
		
		JLabel label_16 = new JLabel("10584");
		label_16.setHorizontalAlignment(SwingConstants.LEFT);
		label_16.setForeground(SystemColor.textHighlight);
		label_16.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_16.setBounds(79, 99, 79, 32);
		panel_8.add(label_16);
		
		JLabel label_17 = new JLabel("Kod:");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setForeground(SystemColor.textHighlight);
		label_17.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_17.setBounds(158, 99, 79, 32);
		panel_8.add(label_17);
		
		JLabel label_18 = new JLabel("400307");
		label_18.setHorizontalAlignment(SwingConstants.LEFT);
		label_18.setForeground(SystemColor.textHighlight);
		label_18.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_18.setBounds(238, 99, 79, 32);
		panel_8.add(label_18);
		
		JLabel label_19 = new JLabel("POLIDUR ZIELONY 6005 PRZ/B");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(SystemColor.textHighlight);
		label_19.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_19.setBounds(0, 128, 317, 32);
		panel_8.add(label_19);
		
		JProgressBar progressBar_10 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_10.setValue(78);
		progressBar_10.setStringPainted(true);
		progressBar_10.setBounds(146, 217, 159, 32);
		panel_8.add(progressBar_10);
		
		JProgressBar progressBar_11 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_11.setValue(21);
		progressBar_11.setStringPainted(true);
		progressBar_11.setBounds(146, 264, 159, 32);
		panel_8.add(progressBar_11);
		
		JLabel label_20 = new JLabel("Info 1 ");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setForeground(SystemColor.textHighlight);
		label_20.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_20.setBounds(0, 172, 150, 32);
		panel_8.add(label_20);
		
		JLabel label_21 = new JLabel("Info 1 ");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setForeground(SystemColor.textHighlight);
		label_21.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_21.setBounds(-11, 214, 159, 32);
		panel_8.add(label_21);
		
		JLabel label_22 = new JLabel("Info 1 ");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setForeground(SystemColor.textHighlight);
		label_22.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_22.setBounds(-11, 264, 159, 32);
		panel_8.add(label_22);
		
		JLabel lblrf = new JLabel("00r23f");
		lblrf.setHorizontalAlignment(SwingConstants.LEFT);
		lblrf.setForeground(new Color(0, 102, 102));
		lblrf.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblrf.setBounds(158, 0, 158, 50);
		panel_8.add(lblrf);
		
		JLabel label_28 = new JLabel("Pracownik: ");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setForeground(Color.BLACK);
		label_28.setFont(label_28.getFont().deriveFont(label_28.getFont().getStyle() | Font.ITALIC));
		label_28.setBounds(980, 444, 92, 27);
		panel_2.add(label_28);
		
		JLabel lblStanisawZzz = new JLabel("Stanis\u0142aw ZZZ");
		lblStanisawZzz.setHorizontalAlignment(SwingConstants.CENTER);
		lblStanisawZzz.setForeground(Color.BLACK);
		lblStanisawZzz.setFont(lblStanisawZzz.getFont().deriveFont(lblStanisawZzz.getFont().getStyle() | Font.ITALIC));
		lblStanisawZzz.setBounds(1072, 444, 222, 27);
		panel_2.add(lblStanisawZzz);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(35, 60, 1505, 614);
		JPanelProd_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblStrona_1 = new JLabel("Linia produkcyjna nr 2");
		lblStrona_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrona_1.setForeground(new Color(0, 102, 102));
		lblStrona_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblStrona_1.setBounds(20, 10, 215, 45);
		panel_3.add(lblStrona_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(245, 245, 220));
		panel_6.setBounds(70, 130, 317, 314);
		panel_3.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(237,219,219));
		panel_7.setBounds(1, 50, 315, 50);
		panel_6.add(panel_7);
		
		JLabel lblPrzestj = new JLabel("Przest\u00F3j");
		lblPrzestj.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrzestj.setForeground(new Color(255, 0, 0));
		lblPrzestj.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblPrzestj.setBounds(0, 0, 317, 50);
		panel_7.add(lblPrzestj);
		
		JProgressBar progressBar_3 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_3.setForeground(new Color(240, 128, 128));
		progressBar_3.setValue(54);
		progressBar_3.setStringPainted(true);
		progressBar_3.setBounds(146, 172, 159, 32);
		panel_6.add(progressBar_3);
		
		JLabel lblEkstruderdssf = new JLabel("Ekstruder ");
		lblEkstruderdssf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEkstruderdssf.setForeground(new Color(255, 0, 0));
		lblEkstruderdssf.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblEkstruderdssf.setBounds(0, 0, 159, 50);
		panel_6.add(lblEkstruderdssf);
		
		JLabel label_30 = new JLabel("Partia:");
		label_30.setHorizontalAlignment(SwingConstants.RIGHT);
		label_30.setForeground(new Color(153, 51, 51));
		label_30.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_30.setBounds(0, 99, 79, 32);
		panel_6.add(label_30);
		
		JLabel label_31 = new JLabel("10588");
		label_31.setHorizontalAlignment(SwingConstants.LEFT);
		label_31.setForeground(new Color(153, 51, 51));
		label_31.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_31.setBounds(79, 99, 79, 32);
		panel_6.add(label_31);
		
		JLabel label_32 = new JLabel("Kod:");
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setForeground(new Color(153, 51, 51));
		label_32.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_32.setBounds(158, 99, 79, 32);
		panel_6.add(label_32);
		
		JLabel label_33 = new JLabel("400038");
		label_33.setHorizontalAlignment(SwingConstants.LEFT);
		label_33.setForeground(new Color(153, 51, 51));
		label_33.setFont(new Font("Century Gothic", Font.BOLD, 20));
		label_33.setBounds(238, 99, 79, 32);
		panel_6.add(label_33);
		
		JLabel lblPolidurCzarny = new JLabel("POLIDUR CZARNY 9005 MAT");
		lblPolidurCzarny.setHorizontalAlignment(SwingConstants.CENTER);
		lblPolidurCzarny.setForeground(new Color(153, 51, 51));
		lblPolidurCzarny.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblPolidurCzarny.setBounds(0, 128, 317, 32);
		panel_6.add(lblPolidurCzarny);
		
		JProgressBar progressBar_4 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_4.setForeground(new Color(240, 128, 128));
		progressBar_4.setValue(78);
		progressBar_4.setStringPainted(true);
		progressBar_4.setBounds(146, 217, 159, 32);
		panel_6.add(progressBar_4);
		
		JProgressBar progressBar_5 = new JProgressBar(SwingConstants.HORIZONTAL);
		progressBar_5.setForeground(new Color(240, 128, 128));
		progressBar_5.setValue(21);
		progressBar_5.setStringPainted(true);
		progressBar_5.setBounds(146, 264, 159, 32);
		panel_6.add(progressBar_5);
		
		JLabel label_35 = new JLabel("Info 1 ");
		label_35.setHorizontalAlignment(SwingConstants.RIGHT);
		label_35.setForeground(new Color(153, 51, 51));
		label_35.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_35.setBounds(0, 172, 150, 32);
		panel_6.add(label_35);
		
		JLabel label_36 = new JLabel("Info 1 ");
		label_36.setHorizontalAlignment(SwingConstants.RIGHT);
		label_36.setForeground(new Color(153, 51, 51));
		label_36.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_36.setBounds(-11, 214, 159, 32);
		panel_6.add(label_36);
		
		JLabel label_37 = new JLabel("Info 1 ");
		label_37.setHorizontalAlignment(SwingConstants.RIGHT);
		label_37.setForeground(new Color(153, 51, 51));
		label_37.setFont(new Font("Century Gothic", Font.BOLD, 15));
		label_37.setBounds(-11, 264, 159, 32);
		panel_6.add(label_37);
		
		JLabel lbldssf = new JLabel(" 88dss3f");
		lbldssf.setHorizontalAlignment(SwingConstants.LEFT);
		lbldssf.setForeground(Color.RED);
		lbldssf.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lbldssf.setBounds(158, 0, 159, 50);
		panel_6.add(lbldssf);
		
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBounds(137, 29, 97, 25);
		JPanelProd_1.add(btnNewButton_2);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				panel_2.setVisible(false);
				panel_3.setVisible(true);
			}
		});
		
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(28, 29, 97, 25);
		JPanelProd_1.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_2.setVisible(true);
				panel_3.setVisible(false);

			}
		});
	}
}
