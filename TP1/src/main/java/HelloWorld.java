
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloWorld")
public class HelloWorld extends HttpServlet
{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		try(PrintWriter out = response.getWriter()){
			out.println("<h1>Hey you there</h1>");
		}
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}