package dataBaseWorkOut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class SQLConnectionQuery {
	
	
	@Test
	public void sqlExecution()
	{
		try {
		Connection con=DriverManager.getConnection("jdbc:sqlserver://sql5106.site4now.net","DB_aa2489_n4605_1_admin","secure*12");
		Statement stm=con.createStatement();  //sql5106.site4now.net  //sql5104.site4now.net
		ResultSet rs=stm.executeQuery("select * from db_aa2489_n4605_1.. Currency c \r\n"
				+ "inner join  Country cc on cc.id=c.id");
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		List <List<Object>> listt=new ArrayList<List<Object>>();
		while(rs.next())
		{
			List <Object> l=new ArrayList<Object>();
			for (int i = 1; i <= columns; ++i) {
				l.add(rs.getObject(i));
			}
			listt.add(l);
		}
		for(Object o:listt)
		{
			System.out.println(o);
		}
	
		con.close();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}

	}
}
