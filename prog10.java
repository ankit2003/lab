import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*;
/**
 * Servlet implementation class New
 */
public class serv extends HttpServlet {
    private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
       
        response.setContentType("text/html");
        ArrayList<String>list=new ArrayList<String>();
        PrintWriter out=response.getWriter();
        list.add(request.getParameter("ename"));
        list.add(request.getParameter("enum"));
        list.add(request.getParameter("edept"));
        list.add(request.getParameter("edoj"));
        Connection con=null;
        Statement st=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("after loading sql driver");
            final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
            final String USER="root";
            final String PASS="sql";
            final String DB_URL="jdbc:mysql://127.0.0.1:3306/emp1";
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected with default host");
            System.out.println("inserting records into the table");
            st=con.createStatement();
            int row=st.executeUpdate("Insert into Persons values('"+list.get(0)+"',"+list.get(1)+",'"+list.get(2)+"','"+list.get(3)+"');");
            if(row>0)
            {
                Iterator itr =list.iterator();
                while(itr.hasNext()) {
                    System.out.println(itr.next());
                }
                System.out.println("Above data inserted successfully");
               
            }
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

}