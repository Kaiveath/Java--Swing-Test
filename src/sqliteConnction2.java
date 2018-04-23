import java.sql.*;

import javax.swing.*;
public class sqliteConnction2 {
	
	Connection conn2=null;

	public static Connection dbConnector()
	{
		try{
			Class.forName("org.sqlite.JDBC");
	
			Connection conn2=DriverManager.getConnection("jdbc:sqlite:E:\\projektyEclipse\\Company\\database\\RawMaterials.sqlite");

			JOptionPane.showMessageDialog(null, "Connection Successfull");
		
			return conn2;
			
		}
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
		
		
	}
	
}
