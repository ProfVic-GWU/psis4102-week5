// Source: https://www2.seas.gwu.edu/~simhaweb/ecom/materials/JSP1.htm
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class HelloWorld extends HttpServlet {


   public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {


	res.setContentType("text/html");
	PrintWriter out = res.getWriter();


	out.println("<HTML>");
	out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
	out.println("<BODY>");
	out.println("<H1>Hello World</H1>");
	out.println("Today is: " + (new java.util.Date().toString()) );
	out.println("</BODY></HTML>");
   } // doGet

} // HelloWorld
