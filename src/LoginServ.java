

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "loginserv", urlPatterns = { "/loginserv" })
public class LoginServ extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		
//		String Email = request.getParameter("email");
//		String Password = request.getParameter("password");
//		
//		if(Email.equals("abc")&&Password.equals("123")){
//			
//			out.print("Hey Welcome to servlet (GET)!! <br/>");
//			out.print("<br/>Your Email is : " + Email );
//			out.print("<br/>Your Password is : " + Password );
//		}
//		else{
//			out.print("Wrong credentials !! <br/>");
//		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		
		if(Email.equals("abc")&&Password.equals("123")){
			
			out.print("Hey Welcome to servlet (POST)!! <br/>");
			out.print("<br/>Your Email is : " + Email );
			out.print("<br/>Your Password is : " + Password );
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("details");
					
			dispatcher.forward(request, response);
			
		}
		else{
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			
			dispatcher.include(request, response);
			
			out.print("<h1 style='color:red; text-align:center'>Wrong Credentials !!</h1>");
		
		}
	}

}
