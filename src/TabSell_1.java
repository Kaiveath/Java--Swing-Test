import java.awt.Checkbox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TabSell_1 extends JPanel
{



	public TabSell_1() 
	{
		setSize(1582, 680);												// ZMNIEJSZYÆ !!!
		setLayout(null);
		
		JPanel PanelSell_1 = new JPanel();
		PanelSell_1.setBounds(0, 0, 1582, 680);							// ZMNIEJSZYÆ !!!
		add(PanelSell_1);
		PanelSell_1.setLayout(null);
		
		
		JScrollPane scrollPaneSell1_1 = new JScrollPane();
		scrollPaneSell1_1.setBounds(53, 96, 807, 367);
		PanelSell_1.add(scrollPaneSell1_1);
		
		JTable table = new JTable();
		scrollPaneSell1_1.setViewportView(table);		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(884, 96, 541, 185);
		PanelSell_1.add(scrollPane);
		
		JTable table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		Checkbox checkbox = new Checkbox("FV zatwierdzona");
		checkbox.setBounds(53, 563, 137, 24);
		PanelSell_1.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("FV wydrukowana");
		checkbox_1.setBounds(53, 593, 137, 24);
		PanelSell_1.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("FV gotowa do druku");
		checkbox_2.setBounds(53, 624, 137, 24);
		PanelSell_1.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("FV rezerwacja");
		checkbox_3.setBounds(53, 654, 108, 24);
		PanelSell_1.add(checkbox_3);
		
		JLabel lblNewLabel = new JLabel("Poka\u017C tylko:");
		lblNewLabel.setBounds(53, 548, 108, 16);
		PanelSell_1.add(lblNewLabel);
		
		Checkbox checkbox_4 = new Checkbox("FV zaleg\u0142o\u015Bci");
		checkbox_4.setBounds(258, 563, 137, 24);
		PanelSell_1.add(checkbox_4);
		
		Checkbox checkbox_5 = new Checkbox("FV brak kredytu");
		checkbox_5.setBounds(258, 593, 137, 24);
		PanelSell_1.add(checkbox_5);
		
		Checkbox checkbox_6 = new Checkbox("FV Zgoda na wysy\u0142k\u0119");
		checkbox_6.setBounds(258, 624, 149, 24);
		PanelSell_1.add(checkbox_6);
		
		Checkbox checkbox_7 = new Checkbox("FV oczekiwanie na towar");
		checkbox_7.setBounds(258, 654, 174, 24);
		PanelSell_1.add(checkbox_7);
		
		JLabel lblSzybkiPodgld = new JLabel("Szybki podgl\u0105d");
		lblSzybkiPodgld.setHorizontalAlignment(SwingConstants.CENTER);
		lblSzybkiPodgld.setFont(new Font("Calibri", Font.BOLD, 40));
		lblSzybkiPodgld.setBounds(884, 13, 541, 81);
		PanelSell_1.add(lblSzybkiPodgld);
		
		JLabel lblDokumentyTypuFv = new JLabel("Dokumenty typu FV");
		lblDokumentyTypuFv.setHorizontalAlignment(SwingConstants.CENTER);
		lblDokumentyTypuFv.setFont(new Font("Calibri", Font.BOLD, 40));
		lblDokumentyTypuFv.setBounds(55, 13, 807, 81);
		PanelSell_1.add(lblDokumentyTypuFv);
		
		Checkbox checkbox_8 = new Checkbox("FV pobranie");
		checkbox_8.setBounds(804, 593, 137, 24);
		PanelSell_1.add(checkbox_8);
		
		Checkbox checkbox_9 = new Checkbox("FV elektroniczne");
		checkbox_9.setBounds(804, 563, 196, 24);
		PanelSell_1.add(checkbox_9);
		
		Checkbox checkbox_10 = new Checkbox("FV dla wybranego handlowca");
		checkbox_10.setBounds(462, 593, 188, 24);
		PanelSell_1.add(checkbox_10);
		
		Checkbox checkbox_11 = new Checkbox("FV dla wybranego magazynu");
		checkbox_11.setBounds(462, 563, 207, 24);
		PanelSell_1.add(checkbox_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(672, 563, 86, 22);
		PanelSell_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(672, 593, 86, 22);
		PanelSell_1.add(comboBox_1);
		
		JButton btnEdytuj = new JButton("Info kont.");
		btnEdytuj.setFont(new Font("Calibri", Font.BOLD, 20));
		btnEdytuj.setBounds(226, 516, 144, 32);
		PanelSell_1.add(btnEdytuj);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Invoice goInvoice=new Invoice();
				goInvoice.setVisible(true);
			}
		});
		btnDodaj.setFont(new Font("Calibri", Font.BOLD, 20));
		btnDodaj.setBounds(48, 476, 144, 32);
		PanelSell_1.add(btnDodaj);
		
		JButton btnAnuluj = new JButton("Anuluj");
		btnAnuluj.setFont(new Font("Calibri", Font.BOLD, 20));
		btnAnuluj.setBounds(48, 516, 144, 32);
		PanelSell_1.add(btnAnuluj);
		
		JButton btnInfoKontr = new JButton("Od\u015Bwie\u017C");
		btnInfoKontr.setFont(new Font("Calibri", Font.BOLD, 20));
		btnInfoKontr.setBounds(226, 476, 144, 32);
		PanelSell_1.add(btnInfoKontr);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(884, 281, 541, 179);
		PanelSell_1.add(scrollPane_1);
		
		Checkbox checkbox_12 = new Checkbox("FV od dnia:");
		checkbox_12.setBounds(462, 624, 86, 24);
		PanelSell_1.add(checkbox_12);
		
		Checkbox checkbox_13 = new Checkbox("FV do dnia:");
		checkbox_13.setBounds(462, 654, 86, 24);
		PanelSell_1.add(checkbox_13);
		
		Checkbox checkbox_14 = new Checkbox("FV dzisiaj");
		checkbox_14.setBounds(804, 624, 196, 24);
		PanelSell_1.add(checkbox_14);
		
		Checkbox checkbox_15 = new Checkbox("Towar przygotowany");
		checkbox_15.setBounds(804, 654, 137, 24);
		PanelSell_1.add(checkbox_15);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(701, 652, 57, 22);
		PanelSell_1.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(701, 622, 57, 22);
		PanelSell_1.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(638, 622, 57, 22);
		PanelSell_1.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(638, 652, 57, 22);
		PanelSell_1.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(555, 622, 71, 22);
		PanelSell_1.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(554, 652, 72, 22);
		PanelSell_1.add(comboBox_7);
		
		JButton btnZatwierd = new JButton("Zatwierd\u017A");
		btnZatwierd.setFont(new Font("Calibri", Font.BOLD, 20));
		btnZatwierd.setBounds(400, 476, 144, 32);
		PanelSell_1.add(btnZatwierd);
		
		JButton btnOdwierz = new JButton("Znajdz Paczk\u0119");
		btnOdwierz.setFont(new Font("Calibri", Font.BOLD, 20));
		btnOdwierz.setBounds(400, 516, 167, 32);
		PanelSell_1.add(btnOdwierz);
		
		JButton btnV_1 = new JButton("v2");
		btnV_1.setFont(new Font("Calibri", Font.BOLD, 20));
		btnV_1.setBounds(579, 516, 144, 32);
		PanelSell_1.add(btnV_1);
		
		JButton btnV = new JButton("v3");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnV.setFont(new Font("Calibri", Font.BOLD, 20));
		btnV.setBounds(735, 516, 124, 32);
		PanelSell_1.add(btnV);
		
		Checkbox checkbox_16 = new Checkbox("FV wg kuriera");
		checkbox_16.setBounds(1033, 563, 124, 24);
		PanelSell_1.add(checkbox_16);
		
		Checkbox checkbox_17 = new Checkbox("FV PRO-FORMA");
		checkbox_17.setBounds(1033, 593, 137, 24);
		PanelSell_1.add(checkbox_17);
		
		Checkbox checkbox_18 = new Checkbox("FV anulowane");
		checkbox_18.setBounds(1033, 624, 124, 24);
		PanelSell_1.add(checkbox_18);
		
		Checkbox checkbox_19 = new Checkbox("Zaznacz wszystko");
		checkbox_19.setBounds(1033, 654, 137, 24);
		PanelSell_1.add(checkbox_19);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(1186, 563, 108, 22);
		PanelSell_1.add(comboBox_8);
		
		JButton btnZapisz = new JButton("Zapisz");
		btnZapisz.setFont(new Font("Calibri", Font.BOLD, 20));
		btnZapisz.setBounds(1191, 646, 144, 32);
		PanelSell_1.add(btnZapisz);
		
		JButton btnDomylne = new JButton("Wczytaj");
		btnDomylne.setFont(new Font("Calibri", Font.BOLD, 20));
		btnDomylne.setBounds(1191, 612, 144, 32);
		PanelSell_1.add(btnDomylne);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(579, 476, 281, 32);
		PanelSell_1.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("v1");
		rdbtnNewRadioButton.setBounds(1360, 577, 46, 25);
		PanelSell_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnV = new JRadioButton("v2");
		rdbtnV.setBounds(1360, 612, 46, 25);
		PanelSell_1.add(rdbtnV);
		
		JRadioButton rdbtnV_1 = new JRadioButton("v3");
		rdbtnV_1.setBounds(1360, 642, 46, 25);
		PanelSell_1.add(rdbtnV_1);
		
		JButton btnDrukuj = new JButton("Drukuj");
		btnDrukuj.setFont(new Font("Calibri", Font.BOLD, 20));
		btnDrukuj.setBounds(1033, 476, 144, 32);
		PanelSell_1.add(btnDrukuj);
		
		Checkbox checkbox_20 = new Checkbox("WZ");
		checkbox_20.setBounds(884, 496, 39, 24);
		PanelSell_1.add(checkbox_20);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(948, 496, 52, 22);
		PanelSell_1.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(948, 470, 52, 22);
		PanelSell_1.add(comboBox_10);
		
		Checkbox checkbox_21 = new Checkbox("FV");
		checkbox_21.setBounds(884, 470, 39, 24);
		PanelSell_1.add(checkbox_21);
		
		Checkbox checkbox_22 = new Checkbox("WZ v2");
		checkbox_22.setBounds(884, 529, 57, 24);
		PanelSell_1.add(checkbox_22);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setBounds(948, 529, 52, 22);
		PanelSell_1.add(comboBox_11);
		
		JButton btnGenerujPdf = new JButton("Generuj PDF");
		btnGenerujPdf.setFont(new Font("Calibri", Font.BOLD, 20));
		btnGenerujPdf.setBounds(1033, 516, 144, 32);
		PanelSell_1.add(btnGenerujPdf);
		
		JButton btnV_2 = new JButton("Edytuj");
		btnV_2.setFont(new Font("Calibri", Font.BOLD, 20));
		btnV_2.setBounds(1191, 516, 144, 32);
		PanelSell_1.add(btnV_2);
		
		JButton btnWyslijMail = new JButton("Wyslij mail");
		btnWyslijMail.setFont(new Font("Calibri", Font.BOLD, 20));
		btnWyslijMail.setBounds(1191, 476, 144, 32);
		PanelSell_1.add(btnWyslijMail);
		
		Checkbox checkbox_23 = new Checkbox("FV dla wybranego kontrachenta");
		checkbox_23.setBounds(1342, 516, 207, 24);
		PanelSell_1.add(checkbox_23);
		
		Checkbox checkbox_24 = new Checkbox("FV wg numeru");
		checkbox_24.setBounds(1341, 476, 188, 24);
		PanelSell_1.add(checkbox_24);
		
		JButton btnMassItem = new JButton("Mass Item");
		btnMassItem.setFont(new Font("Calibri", Font.BOLD, 20));
		btnMassItem.setBounds(1438, 96, 122, 32);
		PanelSell_1.add(btnMassItem);
		




	}
}
		
		