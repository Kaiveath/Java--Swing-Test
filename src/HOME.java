import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class HOME<MOUSE_EXITED> extends JFrame {

	private JPanel contentPane;

	
	
	
	/**
	 * Launch the application.
	 */
	
    JFrame frame = new JFrame();
    JTabbedPane JTabbedStart = new JTabbedPane();

    
    
    /**
     * TABBED LIST
     */
    
    
	TabStart t1 = new TabStart();
	TabSell_1 t2 = new TabSell_1();
	TabSell_2 t3 = new TabSell_2();
	TabMag_1 t4 = new TabMag_1();
	TabMag_2 t5 = new TabMag_2();
	TabMag_3 t6 = new TabMag_3();
	TabLab_1 t7 = new TabLab_1();
	TabLab_2 t8 = new TabLab_2();
	TabLab_3 t9 = new TabLab_3();
	TabProd_1 t10 = new TabProd_1();
	TabProd_2 t11 = new TabProd_2();
	TabProd_3 t12 = new TabProd_3();
	TabProd_4 t13 = new TabProd_4();
	TabProd_5 t14 = new TabProd_5();
	TabAcco_1 t15 = new TabAcco_1();
	TabAdm_1 t16 = new TabAdm_1();
	TabAdm_2 t17 = new TabAdm_2();
	TabAdm_3 t18 = new TabAdm_3();
	Headline h1 = new Headline();
    
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOME frame = new HOME();
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
	
	
	public HOME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	/**
	 * Headline	
	 */
		contentPane.add(h1);
	
	/**
	 * TabbedPane
	 */
		
		JTabbedPane JTabbedStart = new JTabbedPane(JTabbedPane.TOP);
		JTabbedStart.setBounds(0, 82, 1582, 771);
		JTabbedStart.setBackground(new Color(0,206,209));
		JTabbedStart.setOpaque(true);
		contentPane.add(JTabbedStart);

			JPanel TabStart = new JPanel();
			JTabbedStart.addTab("<html><body><table width='150' height='180'>START</table></body></html>", t1);
			TabStart.setLayout(null);
		
		JTabbedPane JTabbedSell = new JTabbedPane(JTabbedPane.TOP);
		JTabbedStart.addTab("<html><body><table width='150' height='180'>SPRZEDA¯</table></body></html>", null, JTabbedSell, null);
		
			JPanel TabSell_1 = new JPanel();
			JTabbedSell.addTab("<html><body><table width='150' height='180'>FAKTURY </table></body></html>", t2);
			TabSell_1.setLayout(null);
		
			JPanel TabSell_2 = new JPanel();
			JTabbedSell.addTab("<html><body><table width='150' height='180'>KARTY KONTRACHENTÓW</table></body></html>", t3);
			TabSell_2.setLayout(null);
						
		JTabbedPane JTabbedMagazine = new JTabbedPane(JTabbedPane.TOP);
		JTabbedStart.addTab("<html><body><table width='150' height='180'>MAGAZYN</table></body></html>", null, JTabbedMagazine, null);
		
			JPanel TabMag_1 = new JPanel();
			JTabbedMagazine.addTab("<html><body><table width='150' height='180'>MAGAZYNY</table></body></html>", t4);
			TabMag_1.setLayout(null);
				
						
			JPanel TabMag_2 = new JPanel();
			JTabbedMagazine.addTab("<html><body><table width='150' height='180'>ZAKUPY</table></body></html>", t5);
			TabMag_2.setLayout(null);
		
			JPanel TabMag_3 = new JPanel();
			JTabbedMagazine.addTab("<html><body><table width='150' height='180'>KARTY DOSTAWCÓW</table></body></html>", t6);
			TabMag_3.setLayout(null);
				
			
		JTabbedPane JTabbedLaboratory = new JTabbedPane(JTabbedPane.TOP);
		JTabbedStart.addTab("<html><body><table width='150' height='180'>LABORATORIUM</table></body></html>", null, JTabbedLaboratory, null);
		
			JPanel TabLab_1 = new JPanel();
			JTabbedLaboratory.addTab("<html><body><table width='150' height='180'>RECEPTURY</table></body></html>", t9);
			TabLab_1.setLayout(null);
				
			JPanel TabLab_2 = new JPanel();
			JTabbedLaboratory.addTab("<html><body><table width='150' height='180'>KARTY SUROWCÓW</table></body></html>", t8);
			JTabbedLaboratory.addTab("<html><body><table width='150' height='180'>LAB 1</table></body></html>", t7);
			TabLab_2.setLayout(null);
					
			JPanel TabLab_3 = new JPanel();
			TabLab_3.setLayout(null);
			
		JTabbedPane JTabbedProduction = new JTabbedPane();
		JTabbedStart.addTab("<html><body><table width='150' height='180'>PRODUKCJA</table></body></html>", null, JTabbedProduction, null);
		
			JPanel TabProd_1 = new JPanel();
			JTabbedProduction.addTab("<html><body><table width='150' height='180'>WIDOK MASZYN</table></body></html>", t10);
			TabProd_1.setLayout(null);
					
			JPanel TabProd_2 = new JPanel();
			JTabbedProduction.addTab("<html><body><table width='150' height='180'>PLAN PRODUKCYNJY</table></body></html>", t11);
			TabProd_2.setLayout(null);	
							
			JPanel TabProd_3 = new JPanel();
			JTabbedProduction.addTab("<html><body><table width='150' height='180'>NOWE ZLECENIA</table></body></html>", t12);
			TabProd_3.setLayout(null);	
			
			JPanel TabProd_4 = new JPanel();
			JTabbedProduction.addTab("<html><body><table width='150' height='180'>WIDOK OPERATORA</table></body></html>", t13);
			TabProd_4.setLayout(null);	
		
			JPanel TabProd_5 = new JPanel();
			JTabbedProduction.addTab("<html><body><table width='150' height='180'>xx</table></body></html>", t14);
			TabProd_5.setLayout(null);	
					
		JTabbedPane JTabbedAccountancy = new JTabbedPane(JTabbedPane.TOP);
		JTabbedStart.addTab("<html><body><table width='150' height='180'>KSIÊGOWOŒÆ</table></body></html>", null, JTabbedAccountancy, null);
		
			JPanel TabAcco_1 = new JPanel();
			JTabbedAccountancy.addTab("<html><body><table width='150' height='180'>ACCOUNT</table></body></html>", t15);
			TabAcco_1.setLayout(null);			
		
		JTabbedPane JTabbedAdministration = new JTabbedPane(JTabbedPane.TOP);
		JTabbedStart.addTab("<html><body><table width='150' height='180'>ADMINISTRACJA</table></body></html>", null, JTabbedAdministration, null);
		
			JPanel TabAdm_1 = new JPanel();
			JTabbedAdministration.addTab("<html><body><table width='150' height='180'>Adm1</table></body></html>", t16);
			TabAdm_1.setLayout(null);

			JPanel TabAdm_2 = new JPanel();
			JTabbedAdministration.addTab("<html><body><table width='150' height='180'>Adm2</table></body></html>",t17);
			TabAdm_2.setLayout(null);
			
			JPanel TabAdm_3 = new JPanel();
			JTabbedAdministration.addTab("<html><body><table width='150' height='180'>Adm3</table></body></html>", t18);
			TabAdm_3.setLayout(null);
			
		
		
		
	}

	private void foo() {
		// TODO Auto-generated method stub
		
	}
}
