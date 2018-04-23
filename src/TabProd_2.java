import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class TabProd_2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TabProd_2() {


		setSize(1582, 690);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel JPanelProd_2 = new JPanel();
		JPanelProd_2.setBounds(0, 0, 1582, 690);							// ZMNIEJSZYÆ !!!
		add(JPanelProd_2);
		JPanelProd_2.setLayout(null);

		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(30, 179, 1080, 481);
		JPanelProd_2.add(scrollPane_8);
		
		JLabel lblWybrLiniProdukcyjnych = new JLabel("Wyb\u00F3r Linii Produkcyjnych:");
		lblWybrLiniProdukcyjnych.setHorizontalAlignment(SwingConstants.CENTER);
		lblWybrLiniProdukcyjnych.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblWybrLiniProdukcyjnych.setBounds(30, 10, 269, 50);
		JPanelProd_2.add(lblWybrLiniProdukcyjnych);
		
		JLabel label_48 = new JLabel("Lp.");
		label_48.setOpaque(true);
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		label_48.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_48.setBorder(new LineBorder(SystemColor.controlShadow));
		label_48.setBackground(SystemColor.controlHighlight);
		label_48.setBounds(30, 73, 50, 25);
		JPanelProd_2.add(label_48);
		
		JLabel lblDataZlecenia = new JLabel("Data zlecenia");
		lblDataZlecenia.setOpaque(true);
		lblDataZlecenia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataZlecenia.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDataZlecenia.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDataZlecenia.setBackground(SystemColor.controlHighlight);
		lblDataZlecenia.setBounds(80, 73, 120, 25);
		JPanelProd_2.add(lblDataZlecenia);
		
		JLabel lblKodLab = new JLabel("Kod Lab.");
		lblKodLab.setOpaque(true);
		lblKodLab.setHorizontalAlignment(SwingConstants.CENTER);
		lblKodLab.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKodLab.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKodLab.setBackground(SystemColor.controlHighlight);
		lblKodLab.setBounds(200, 73, 200, 25);
		JPanelProd_2.add(lblKodLab);
		
		JLabel lblKod_1 = new JLabel("Kod Prod.");
		lblKod_1.setOpaque(true);
		lblKod_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblKod_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblKod_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblKod_1.setBackground(SystemColor.controlHighlight);
		lblKod_1.setBounds(400, 73, 120, 25);
		JPanelProd_2.add(lblKod_1);
		
		JLabel lblPartia_1 = new JLabel("Partia");
		lblPartia_1.setOpaque(true);
		lblPartia_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartia_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPartia_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPartia_1.setBackground(SystemColor.controlHighlight);
		lblPartia_1.setBounds(520, 73, 200, 25);
		JPanelProd_2.add(lblPartia_1);
		
		JLabel lblNazwa_1 = new JLabel("Nazwa");
		lblNazwa_1.setOpaque(true);
		lblNazwa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNazwa_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNazwa_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblNazwa_1.setBackground(SystemColor.controlHighlight);
		lblNazwa_1.setBounds(720, 73, 120, 25);
		JPanelProd_2.add(lblNazwa_1);
		
		JLabel lblRodzaj_1 = new JLabel("Rodzaj");
		lblRodzaj_1.setOpaque(true);
		lblRodzaj_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRodzaj_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblRodzaj_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblRodzaj_1.setBackground(SystemColor.controlHighlight);
		lblRodzaj_1.setBounds(840, 73, 120, 25);
		JPanelProd_2.add(lblRodzaj_1);
		
		JLabel lblBrakujeSurowca = new JLabel("Brakuje surowca");
		lblBrakujeSurowca.setOpaque(true);
		lblBrakujeSurowca.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrakujeSurowca.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblBrakujeSurowca.setBorder(new LineBorder(SystemColor.controlShadow));
		lblBrakujeSurowca.setBackground(SystemColor.controlHighlight);
		lblBrakujeSurowca.setBounds(960, 73, 150, 25);
		JPanelProd_2.add(lblBrakujeSurowca);
		
		JLabel label_47 = new JLabel("1.");
		label_47.setOpaque(true);
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		label_47.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_47.setBorder(new LineBorder(SystemColor.controlShadow));
		label_47.setBackground(SystemColor.controlHighlight);
		label_47.setBounds(305, 23, 50, 25);
		JPanelProd_2.add(label_47);
		
		JLabel label_65 = new JLabel("2.");
		label_65.setOpaque(true);
		label_65.setHorizontalAlignment(SwingConstants.CENTER);
		label_65.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_65.setBorder(new LineBorder(SystemColor.controlShadow));
		label_65.setBackground(SystemColor.controlHighlight);
		label_65.setBounds(355, 23, 50, 25);
		JPanelProd_2.add(label_65);
		
		JLabel label_66 = new JLabel("3.");
		label_66.setOpaque(true);
		label_66.setHorizontalAlignment(SwingConstants.CENTER);
		label_66.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_66.setBorder(new LineBorder(SystemColor.controlShadow));
		label_66.setBackground(SystemColor.controlHighlight);
		label_66.setBounds(405, 23, 50, 25);
		JPanelProd_2.add(label_66);
		
		JLabel label_67 = new JLabel("5.");
		label_67.setOpaque(true);
		label_67.setHorizontalAlignment(SwingConstants.CENTER);
		label_67.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_67.setBorder(new LineBorder(SystemColor.controlShadow));
		label_67.setBackground(SystemColor.controlHighlight);
		label_67.setBounds(505, 23, 50, 25);
		JPanelProd_2.add(label_67);
		
		JLabel label_68 = new JLabel("4.");
		label_68.setOpaque(true);
		label_68.setHorizontalAlignment(SwingConstants.CENTER);
		label_68.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_68.setBorder(new LineBorder(SystemColor.controlShadow));
		label_68.setBackground(SystemColor.controlHighlight);
		label_68.setBounds(455, 23, 50, 25);
		JPanelProd_2.add(label_68);
		
		JLabel label_69 = new JLabel("6.");
		label_69.setOpaque(true);
		label_69.setHorizontalAlignment(SwingConstants.CENTER);
		label_69.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_69.setBorder(new LineBorder(SystemColor.controlShadow));
		label_69.setBackground(SystemColor.controlHighlight);
		label_69.setBounds(555, 23, 50, 25);
		JPanelProd_2.add(label_69);
		
		JLabel label_70 = new JLabel("7.");
		label_70.setOpaque(true);
		label_70.setHorizontalAlignment(SwingConstants.CENTER);
		label_70.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_70.setBorder(new LineBorder(SystemColor.controlShadow));
		label_70.setBackground(SystemColor.controlHighlight);
		label_70.setBounds(605, 23, 50, 25);
		JPanelProd_2.add(label_70);
		
		JLabel label_71 = new JLabel("8.");
		label_71.setOpaque(true);
		label_71.setHorizontalAlignment(SwingConstants.CENTER);
		label_71.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_71.setBorder(new LineBorder(SystemColor.controlShadow));
		label_71.setBackground(SystemColor.controlHighlight);
		label_71.setBounds(655, 23, 50, 25);
		JPanelProd_2.add(label_71);
		
		JLabel lblInfo_2 = new JLabel("Info");
		lblInfo_2.setOpaque(true);
		lblInfo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblInfo_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblInfo_2.setBackground(SystemColor.controlHighlight);
		lblInfo_2.setBounds(30, 98, 50, 25);
		JPanelProd_2.add(lblInfo_2);
		
		JLabel lblPrzewidzianaData = new JLabel("Przewidziana data");
		lblPrzewidzianaData.setOpaque(true);
		lblPrzewidzianaData.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrzewidzianaData.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPrzewidzianaData.setBorder(new LineBorder(SystemColor.controlShadow));
		lblPrzewidzianaData.setBackground(SystemColor.controlHighlight);
		lblPrzewidzianaData.setBounds(80, 98, 120, 25);
		JPanelProd_2.add(lblPrzewidzianaData);
		
		JLabel lblLiniaNr = new JLabel("Linia nr");
		lblLiniaNr.setOpaque(true);
		lblLiniaNr.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiniaNr.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblLiniaNr.setBorder(new LineBorder(SystemColor.controlShadow));
		lblLiniaNr.setBackground(SystemColor.controlHighlight);
		lblLiniaNr.setBounds(200, 98, 200, 25);
		JPanelProd_2.add(lblLiniaNr);
		
		JLabel lblZwaone = new JLabel("Zwa\u017Cone");
		lblZwaone.setOpaque(true);
		lblZwaone.setHorizontalAlignment(SwingConstants.CENTER);
		lblZwaone.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblZwaone.setBorder(new LineBorder(SystemColor.controlShadow));
		lblZwaone.setBackground(SystemColor.controlHighlight);
		lblZwaone.setBounds(400, 98, 120, 25);
		JPanelProd_2.add(lblZwaone);
		
		JLabel lblInfo_1 = new JLabel("Klient");
		lblInfo_1.setOpaque(true);
		lblInfo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblInfo_1.setBorder(new LineBorder(SystemColor.controlShadow));
		lblInfo_1.setBackground(SystemColor.controlHighlight);
		lblInfo_1.setBounds(520, 98, 200, 25);
		JPanelProd_2.add(lblInfo_1);
		
		JLabel lblWagaZlecona = new JLabel("Waga zlecona");
		lblWagaZlecona.setOpaque(true);
		lblWagaZlecona.setHorizontalAlignment(SwingConstants.CENTER);
		lblWagaZlecona.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWagaZlecona.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWagaZlecona.setBackground(SystemColor.controlHighlight);
		lblWagaZlecona.setBounds(720, 98, 120, 25);
		JPanelProd_2.add(lblWagaZlecona);
		
		JLabel lblWagaWyprodukowana = new JLabel("Waga wyprod.");
		lblWagaWyprodukowana.setOpaque(true);
		lblWagaWyprodukowana.setHorizontalAlignment(SwingConstants.CENTER);
		lblWagaWyprodukowana.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblWagaWyprodukowana.setBorder(new LineBorder(SystemColor.controlShadow));
		lblWagaWyprodukowana.setBackground(SystemColor.controlHighlight);
		lblWagaWyprodukowana.setBounds(840, 98, 120, 25);
		JPanelProd_2.add(lblWagaWyprodukowana);
		
		JLabel lblStraty = new JLabel("Straty");
		lblStraty.setOpaque(true);
		lblStraty.setHorizontalAlignment(SwingConstants.CENTER);
		lblStraty.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblStraty.setBorder(new LineBorder(SystemColor.controlShadow));
		lblStraty.setBackground(SystemColor.controlHighlight);
		lblStraty.setBounds(960, 98, 150, 25);
		JPanelProd_2.add(lblStraty);
		
		JLabel lblV_16 = new JLabel("v1");
		lblV_16.setOpaque(true);
		lblV_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_16.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_16.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_16.setBackground(SystemColor.controlHighlight);
		lblV_16.setBounds(30, 123, 50, 25);
		JPanelProd_2.add(lblV_16);
		
		JLabel lblV_17 = new JLabel("Ilo\u015B\u0107 kontener\u00F3w");
		lblV_17.setOpaque(true);
		lblV_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_17.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_17.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_17.setBackground(SystemColor.controlHighlight);
		lblV_17.setBounds(80, 123, 120, 25);
		JPanelProd_2.add(lblV_17);
		
		JLabel lblV_18 = new JLabel("v3");
		lblV_18.setOpaque(true);
		lblV_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_18.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_18.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_18.setBackground(SystemColor.controlHighlight);
		lblV_18.setBounds(200, 123, 200, 25);
		JPanelProd_2.add(lblV_18);
		
		JLabel lblV_19 = new JLabel("v4");
		lblV_19.setOpaque(true);
		lblV_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_19.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_19.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_19.setBackground(SystemColor.controlHighlight);
		lblV_19.setBounds(400, 123, 120, 25);
		JPanelProd_2.add(lblV_19);
		
		JLabel lblV_20 = new JLabel("v5");
		lblV_20.setOpaque(true);
		lblV_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_20.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_20.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_20.setBackground(SystemColor.controlHighlight);
		lblV_20.setBounds(520, 123, 200, 25);
		JPanelProd_2.add(lblV_20);
		
		JLabel lblV_21 = new JLabel("v6");
		lblV_21.setOpaque(true);
		lblV_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_21.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_21.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_21.setBackground(SystemColor.controlHighlight);
		lblV_21.setBounds(720, 123, 120, 25);
		JPanelProd_2.add(lblV_21);
		
		JLabel lblV_22 = new JLabel("v7");
		lblV_22.setOpaque(true);
		lblV_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_22.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_22.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_22.setBackground(SystemColor.controlHighlight);
		lblV_22.setBounds(840, 123, 120, 25);
		JPanelProd_2.add(lblV_22);
		
		JLabel lblV_23 = new JLabel("v8");
		lblV_23.setOpaque(true);
		lblV_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_23.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_23.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_23.setBackground(SystemColor.controlHighlight);
		lblV_23.setBounds(960, 123, 150, 25);
		JPanelProd_2.add(lblV_23);
		
		JLabel lblEdytuj = new JLabel("Edytuj");
		lblEdytuj.setOpaque(true);
		lblEdytuj.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdytuj.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEdytuj.setBorder(new LineBorder(SystemColor.controlShadow));
		lblEdytuj.setBackground(SystemColor.controlHighlight);
		lblEdytuj.setBounds(1158, 179, 150, 25);
		JPanelProd_2.add(lblEdytuj);
		lblEdytuj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ProductionOrder goProductionOrder=new ProductionOrder();
				goProductionOrder.setVisible(true);
			}
		});
		lblEdytuj.addMouseListener(new MouseAdapter() 
		{
	
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				lblEdytuj.setBackground(Color.GRAY);
			}
			public void mouseExited(MouseEvent arg0) 
			{
				lblEdytuj.setBackground(SystemColor.controlHighlight);									
			}
		});	
		
		JLabel label_59 = new JLabel("/\\");
		label_59.setOpaque(true);
		label_59.setHorizontalAlignment(SwingConstants.CENTER);
		label_59.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_59.setBorder(new LineBorder(SystemColor.controlShadow));
		label_59.setBackground(SystemColor.controlHighlight);
		label_59.setBounds(1158, 204, 150, 25);
		JPanelProd_2.add(label_59);
		
		JLabel label_60 = new JLabel("\\./");
		label_60.setOpaque(true);
		label_60.setHorizontalAlignment(SwingConstants.CENTER);
		label_60.setFont(new Font("Calibri", Font.PLAIN, 15));
		label_60.setBorder(new LineBorder(SystemColor.controlShadow));
		label_60.setBackground(SystemColor.controlHighlight);
		label_60.setBounds(1158, 229, 150, 25);
		JPanelProd_2.add(label_60);
		
		JLabel lblUsu_2 = new JLabel("Usu\u0144");
		lblUsu_2.setOpaque(true);
		lblUsu_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsu_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUsu_2.setBorder(new LineBorder(SystemColor.controlShadow));
		lblUsu_2.setBackground(SystemColor.controlHighlight);
		lblUsu_2.setBounds(1158, 254, 150, 25);
		JPanelProd_2.add(lblUsu_2);
		
		JLabel lblV_24 = new JLabel("Drukuj wybrane");
		lblV_24.setOpaque(true);
		lblV_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_24.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_24.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_24.setBackground(SystemColor.controlHighlight);
		lblV_24.setBounds(1158, 279, 150, 25);
		JPanelProd_2.add(lblV_24);
		
		JLabel lblV_25 = new JLabel("Dukuj Plan");
		lblV_25.setOpaque(true);
		lblV_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblV_25.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblV_25.setBorder(new LineBorder(SystemColor.controlShadow));
		lblV_25.setBackground(SystemColor.controlHighlight);
		lblV_25.setBounds(1158, 304, 150, 25);
		JPanelProd_2.add(lblV_25);
		
		JLabel lblWywietl_1 = new JLabel("Wy\u015Bwietl:");
		lblWywietl_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblWywietl_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblWywietl_1.setBounds(1155, 10, 269, 50);
		JPanelProd_2.add(lblWywietl_1);
		
		Checkbox checkbox_38 = new Checkbox("v1");
		checkbox_38.setBounds(1158, 59, 213, 24);
		JPanelProd_2.add(checkbox_38);
		
		Checkbox checkbox_39 = new Checkbox("v2");
		checkbox_39.setBounds(1158, 89, 213, 24);
		JPanelProd_2.add(checkbox_39);
		
		Checkbox checkbox_40 = new Checkbox("v3");
		checkbox_40.setBounds(1158, 119, 213, 24);
		JPanelProd_2.add(checkbox_40);
		
		Checkbox checkbox_41 = new Checkbox("v4");
		checkbox_41.setBounds(1158, 149, 213, 24);
		JPanelProd_2.add(checkbox_41);
		
		JLabel lblDukujEtykiety = new JLabel("Dukuj Etykiety");
		lblDukujEtykiety.setOpaque(true);
		lblDukujEtykiety.setHorizontalAlignment(SwingConstants.CENTER);
		lblDukujEtykiety.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDukujEtykiety.setBorder(new LineBorder(SystemColor.controlShadow));
		lblDukujEtykiety.setBackground(SystemColor.controlHighlight);
		lblDukujEtykiety.setBounds(1158, 330, 150, 25);
		JPanelProd_2.add(lblDukujEtykiety);
		
		JTextField textField_70 = new JTextField();
		textField_70.setBounds(1329, 330, 42, 25);
		JPanelProd_2.add(textField_70);
		textField_70.setColumns(10);
	}

}
