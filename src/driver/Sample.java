package driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.checkerframework.common.reflection.qual.ForName;

public class Sample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		
		String st = "select * from Ipl";
		
		PreparedStatement ps = con.prepareStatement(st);
		
		ResultSet eq = ps.executeQuery();
		
		while (eq.next()) {
			String tm = eq.getString("Teamname");
			String pn = eq.getString("Playername");
			String sc = eq.getString("Score");
			
			System.out.println(tm);
			System.out.println(pn);
			System.out.println(sc);
		}
		
		con.close();
	}
	
	}
                                                            

