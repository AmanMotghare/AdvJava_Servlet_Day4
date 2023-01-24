

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Details
 */
@WebServlet(name = "details", urlPatterns = { "/details" })
public class Details extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		
		out.print("<!DOCTYPE html><html><head><meta charset='ISO-8859-1'><title>Login Form | Servlet Day 4</title><link rel='stylesheet' href='style.css' /></head>");
		out.print("<body> <div class='container'> <div class='login'>");
		
		out.print("<form><h1>Welcome</h1><hr/><p>Your Login Credentials!</p>");
		
		out.print("<h3 style='color:black; text-align:center'>Your Email is : " + Email +"</h3>" );
		out.print("<h3 style='color:black; text-align:center'>Your Password is : " + Password +"</h3></form> </div>");
			
	         
	    out.print("<div class='pic'><img src='images/login.jfif' /></div></div>");
	     
		
		
//		out.print("<h1 style='color:purple; text-align:center'>Heyyy !!<br/><br/></h1>");
//		out.print("<br/><h2 style='color:purple; text-align:center'>Your Email is : " + Email +"</h2> <br/><br/>" );
//		out.print("<br/><h2 style='color:purple; text-align:center'>Your Password is : " + Password +"</h2> <br/><br/>");
		
		out.print("</body></html>");
	}

}
