import java.sql.*;



public class Prog9 {
  
	public static void main(String [] args){
		
		Connection con = null;
		Statement stmt = null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("After Loading SQL ServerDrivers");
			
			final String USER = "root";
			final String PASS = "sql";
			final String DB_URL = "jdbc:mysql://127.0.0.1:3306/book1";
			
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			
			stmt = con.createStatement();
			System.out.println("Inserting records into the table");
			
			String sql = "insert into registration values(1,'ROSHAN','A',25)";
			stmt.executeUpdate(sql);
			
			sql = "insert into registration values(2,'PRASHANT','Y',25)";
			stmt.executeUpdate(sql);
			
			sql = "insert into registration values(3,'MELWIN','D',25)";
			stmt.executeUpdate(sql);
			
			sql = "insert into registration values(4,'NAVNEET','G',25)";
			stmt.executeUpdate(sql);
			
			System.out.print("Insert records into the table");
			
			ResultSet rs = stmt.executeQuery("select * from registration");
			
			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) +" " + rs.getString(3)+ " " + rs.getInt(4));
				
			}
			
			
		}catch(SQLException se){
			se.printStackTrace();
			
			
		}catch(Exception se){
			se.printStackTrace();
		}finally{
			
			try{
				if(stmt!= null)
					con.close();
			}catch(SQLException se){
				
			}
			
			try{
				if(con!=null)
					con.close();
			}catch(SQLException se){
				se.printStackTrace();
				
			}
		}
	System.out.println("Goodbye");
	}
	
	
}