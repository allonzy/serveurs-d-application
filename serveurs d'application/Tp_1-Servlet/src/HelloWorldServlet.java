import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class HelloWorldServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		//request.getParameter("parameter");// Get a parameter from the request
		PrintWriter writer = response.getWriter();
		writer.print("hello world");
	}
}
