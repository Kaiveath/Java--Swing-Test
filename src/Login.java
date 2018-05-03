import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;


public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	Connection connection=null;
	private JTextField textFieldUN;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblYouAreYour;
	private JLabel lblHaso;
	private JLabel lblZalogujSi;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JLabel lblPlanYourself;
	private JPanel panel_2;
	private JLabel lblZaloguj;
	
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection=sqliteConnction.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 200, 1053, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblNewLabel;
		Image img1 = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(0, 0, 498, 517);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblYouAreYour = new JLabel("You are your own hero");
		lblYouAreYour.setForeground(new Color(0, 102, 102));
		lblYouAreYour.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblYouAreYour.setBounds(124, 100, 252, 51);
		panel.add(lblYouAreYour);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 102, 102));
		separator.setForeground(new Color(0, 102, 102));
		separator.setBounds(62, 223, 348, 50);
		panel.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 102, 102));
		separator_1.setBackground(new Color(0, 102, 102));
		separator_1.setBounds(94, 249, 282, 50);
		panel.add(separator_1);
		
		lblPlanYourself = new JLabel("Plan yourself");
		lblPlanYourself.setForeground(new Color(0, 102, 102));
		lblPlanYourself.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblPlanYourself.setBounds(181, 148, 145, 51);
		panel.add(lblPlanYourself);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(498, 0, 537, 517);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		lblNewLabel_2 = new JLabel("U\u017Cytkownik:");
		lblNewLabel_2.setBounds(60, 150, 217, 37);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(0, 206, 209));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		textFieldUN = new JTextField();
		textFieldUN.addKeyListener(new KeyAdapter() {
			// test
		    @Override
		    public void keyTyped(KeyEvent e) {
		    }

		    private boolean pressed = false;
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (!pressed){
					
				textFieldUN.setText("");
				pressed = true;
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				pressed = true;
			}
			
		});
		textFieldUN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldUN.setText("");
			}
		});
		
		textFieldUN.setText("Podaj nazwe u\u017Cytkownika");
		textFieldUN.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldUN.setForeground(new Color(0, 206, 209));
		textFieldUN.setBackground(new Color(0, 102, 102));
		Border empty = null;
		textFieldUN.setBorder(empty);
		textFieldUN.setBounds(62, 185, 283, 40);
		panel_1.add(textFieldUN);
		textFieldUN.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textFieldUN.setColumns(10);
		textFieldUN.setCaretColor(new Color(0, 206, 209));
		textFieldUN.setCaretPosition(0);
		
		passwordField = new JPasswordField();
		
		passwordField.addKeyListener(new KeyAdapter() {
			
		    @Override
		    public void keyTyped(KeyEvent e) {
		    }

		    private boolean pressed = false;
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (!pressed){
					
					passwordField.setText("");
				pressed = true;
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				pressed = true;
			}
			
		});
				
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setText("");
			}
		});
		
		passwordField.setCaretColor(new Color(0, 206, 209));
		
		passwordField.setForeground(new Color(0, 206, 209));
		passwordField.setText("*******************");
		passwordField.setCaretPosition(0);
		Border empty2 = null;
		passwordField.setBorder(empty2);
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBackground(new Color(0, 102, 102));
		passwordField.setBounds(62, 285, 283, 40);
		panel_1.add(passwordField);
		passwordField.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(302, 59, 128, 128);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img));
		
		lblHaso = new JLabel("Has\u0142o:");
		lblHaso.setForeground(new Color(0, 206, 209));
		lblHaso.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblHaso.setBounds(60, 250, 217, 37);
		panel_1.add(lblHaso);
		
		lblZalogujSi = new JLabel("Zaloguj si\u0119");
		lblZalogujSi.setForeground(new Color(0, 206, 209));
		lblZalogujSi.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblZalogujSi.setBounds(60, 79, 217, 37);
		panel_1.add(lblZalogujSi);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 206, 209));
		separator_2.setBackground(new Color(0, 206, 209));
		separator_2.setBounds(61, 225, 348, 19);
		panel_1.add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 206, 209));
		separator_3.setBackground(new Color(0, 206, 209));
		separator_3.setBounds(61, 325, 348, 19);
		panel_1.add(separator_3);
		
		lblZaloguj = new JLabel("Zaloguj");
		lblZaloguj.setBounds(106, 426, 155, 50);
		panel_1.add(lblZaloguj);
		lblZaloguj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					String query="select * from EmployeeInfo where Uzytkownik=? and Has³o=? ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,textFieldUN.getText() );
					pst.setString(2,passwordField.getText() );
					
					ResultSet rs=pst.executeQuery();
					int count =0;
					while(rs.next()){
						count=count+1;	
					}
					if(count ==1)
					{
						
						UIManager.put("OptionPane.background", new Color(0, 206, 209));
						UIManager.put("Panel.background", new Color(0, 206, 209));

						JOptionPane.showMessageDialog(null,"Correct, Good Luck","",JOptionPane.INFORMATION_MESSAGE);
						
						frame.dispose();
						UIManager.put("OptionPane.background", null);
						UIManager.put("Panel.background", null);
						HOME goHome=new HOME();
						goHome.setVisible(true);
					}
					else if(count>1)
					{						 
						UIManager.put("OptionPane.background", new Color(0, 206, 209));
						UIManager.put("Panel.background", new Color(0, 206, 209));

						JOptionPane.showMessageDialog(null,"Duplicate User name and password","Error",JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						
						
						 UIManager.put("OptionPane.background", new Color(0, 206, 209));
						 UIManager.put("Panel.background", new Color(0, 206, 209));

						JOptionPane.showMessageDialog(null,"User name and password is not correct. Try again.","Error",JOptionPane.INFORMATION_MESSAGE);
					
						
					}
					rs.close();
					pst.close(); 
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
					
				}
				
				
			}
		});
		lblZaloguj.setHorizontalAlignment(SwingConstants.CENTER);
		lblZaloguj.setForeground(new Color(0, 102, 102));
		lblZaloguj.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 206, 209));
		panel_2.setBounds(106, 426, 155, 50);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
	}
}
