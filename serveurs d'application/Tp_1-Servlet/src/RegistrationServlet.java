import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class RegistrationServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String name = request.getParameter("name");
		if(name != ""){
			this.getServletContext().setAttribute("name",name);
		}
	}
}
