import java.sql.*;

import javax.swing.*;
public class sqliteConnction {
	Connection conn=null;
	//Connection conn2=null;

	public static Connection dbConnector()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\projektyEclipse\\JavaGuiDemo\\database\\EmployeeData.sqlite");
		//	Connection conn2=DriverManager.getConnection("jdbc:sqlite:E:\\projektyEclipse\\Company\\database\\RawMaterials.sqlite");

			JOptionPane.showMessageDialog(null, "Connection Successfull");
			return conn;
		//	return conn2;
			
		}
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
		
		
	}
	
}
