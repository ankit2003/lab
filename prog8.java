//package labprograms;
import java.sql.*;
import java.util.*;
public class l6
{
	private static void listDrivers()
	{
		// TODO Auto-generated method stub
		Enumeration driverList=DriverManager.getDrivers();
		while(driverList.hasMoreElements())
		{
			Driver driverClass=(Driver)driverList.nextElement();
			System.out.println(" "+driverClass.getClass().getName());
		}
	}
	
	public static void main(String[] args)
	{
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("After loading SQL server driver");
			listDrivers();
			final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
			final String USER="root";
			final String PASS ="sql";
			final String DB_URL="jdbc:mysql://localhost:3306/stud";
			con=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connected with default host");
			//create statement from connection
			Statement stmt=con.createStatement();
			// insert the data
			stmt.executeUpdate("INSERT INTO record VALUES ('1NT16CS159', 'Mohamed', 'Jaffar', 95)");
			ResultSet rs=stmt.executeQuery("select * from record");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		}
		catch(Exception e)
		{
			System.err.println("Exception is :"+e.getMessage());
		}
	}
}