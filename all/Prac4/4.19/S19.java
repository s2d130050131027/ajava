import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletConfig;
public class S19 extends HttpServlet {
	public void init(ServletConfig c){
	}
	public void doGet(HttpServletRequest rq,HttpServletResponse re) throws ServletException{
		re.setContentType("text/html");
		Connection c=null;
		Statement s=null;
		try{
			PrintWriter out=re.getWriter();
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/servlet","postgres","1014");
			s=c.createStatement();
			out.println("<h2>eno=130050131031</h2>");
			String query="insert into student values(1301,'akash');";
			int i=s.executeUpdate(query);
			if(i!=0){
				out.println("<h2>Record has been inserted</h2>");
			}
			else{
				out.println("<h2>sorry! Failure</h2>");
			}
		}
		catch(IOException i){
			System.out.println("IOException");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void destroy(){
	}
}