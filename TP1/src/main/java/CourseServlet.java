
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modele.Courses;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	Courses c = new Courses();
	
	protected void affichageRetour(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.setAttribute("c", this.c.getListe());
		
		RequestDispatcher rd= request.getRequestDispatcher("courses.jsp");
		rd.forward(request, response);
	}
	
	// listing de tous les items
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		try(PrintWriter out = response.getWriter()){
			//out.println(c.toString());
			
			try {
				affichageRetour(request, response);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
	
	// ajout
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String laCourse = request.getParameter("item");
		String categorie = request.getParameter("categorie");
		this.c.addItem(laCourse, categorie);
		
		try {
			affichageRetour(request, response);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	// suppression
	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String laCourseADelete = request.getParameter("item");
		System.out.println(request);
		this.c.deleteItem(laCourseADelete);
		System.out.println(c.toString());
		
		try {
			affichageRetour(request, response);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	// modification -> "acheté"
	
	
	
}
