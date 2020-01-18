
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Courses;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	Courses c = new Courses();
	
	// listing de tous les items
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		try(PrintWriter out = response.getWriter()){
			out.println(c.toString());
		}
		
	}
	
	// ajout
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String laCourse = request.getParameter("item");
		this.c.addItem(laCourse);
	}
	
	// suppression
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String laCourseADelete = request.getParameter("item");
		this.c.deleteItem(laCourseADelete);
	}
	
}
