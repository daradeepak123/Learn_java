package dataBaseWorkOut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBWorkOut {
	
	
	
	@Test
	public void dbTest()
	{
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:sqlserver://sql5106.site4now.net","DB_aa2489_n4605_1_admin","secure*12");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from Currency");
			ResultSetMetaData rsd=rs.getMetaData();
			int count=rsd.getColumnCount();
			while(rs.next())
			{
				for(int i=1;i<=count;i++)
				{
					System.out.print(rs.getObject(i) + "\t" );
				}
				System.out.println();
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
