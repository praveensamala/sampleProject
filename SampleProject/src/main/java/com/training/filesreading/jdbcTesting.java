package com.training.filesreading;
import java.sql.*;

public class jdbcTesting
{
	public static void main(String args[])
	{
		try {
			//To make the connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "hr");
			Statement stmt = conn.createStatement();
			
			//Select statement
			/*ResultSet rs = stmt.executeQuery("select * from countries");
			ResultSetMetaData rsmt = rs.getMetaData();
			int colcount = rsmt.getColumnCount();
			
			while (rs.next()) {
				for (int i=1; i<colcount; i++) {
					//System.out.print(i+", "+rsmt.getColumnName(i)+": "+rs.getString(i)+", ");
				}
			}*/
			
			//Insert statement
			//String insertsql = "INSERT INTO USERS VALUES ('1001', 'USERNAME 1001', 'DEPT1001', 'LOCATION1001')";
			for (int i=1001; i<200001; i++) {
				System.out.println(i);
				String newinsertsql = "INSERT INTO USERS VALUES('"+i+"', 'USERNAME "+i+"', 'DEPT "+i+"', 'LOCATION "+i+"')";
				System.out.println(newinsertsql);
				stmt.executeUpdate(newinsertsql);
			}

			//Delete statement
			String delquerystmt = "DELETE FROM USERS";
			int rowsdeleted = stmt.executeUpdate(delquerystmt);
			System.out.println("deleted rows : "+rowsdeleted);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
