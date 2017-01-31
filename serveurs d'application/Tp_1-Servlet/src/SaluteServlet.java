import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class SaluteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String name = request.getParameter("name");// Get a parameter from the request
		PrintWriter writer = response.getWriter();
		String servletName = this.getServletName();
		if(name == null){
			name = (getServletContext().getAttribute("name")!= null) ?
					(String)getServletContext().getAttribute("name"):
						getInitParameter("name");
		}
		writer.print(servletName+" wish to "+name+" a great day");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String name = request.getParameter("name");// Get a parameter from the request
		PrintWriter writer = response.getWriter();
		String servletName = this.getServletName();
		if(name.equals("") || name == null){
			name = (getServletContext().getAttribute("name")!= null) ?
					(String)getServletContext().getAttribute("name"):
						getInitParameter("name");
		}
		writer.print(servletName+" wish to "+name+" a great day");

	}
}
