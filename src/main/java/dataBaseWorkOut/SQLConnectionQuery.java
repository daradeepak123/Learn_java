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
		Connection con=DriverManager.getConnection("jdbc:sqlserver://sql5104.site4now.net","DB_a9dea1_n4602_1_admin","secure*12");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from Country");
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
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
		while (rs.next()) {
			HashMap<String, Object> row = new HashMap<String, Object>(columns);
			for (int i = 1; i <= columns; ++i) {
			row.put(md.getColumnName(i), rs.getObject(i));
			}
			list.add(row);
			}


//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		con.close();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}

	}
}
