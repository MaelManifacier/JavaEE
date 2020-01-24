<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="modele.Course"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courses</title>
</head>
<body>

	<h2>Hey dude ! What's the big idea ?</h2>

	<% 
	
		List<Course> listeCourses = (List<Course>) request.getAttribute("c");
		for(Course course : listeCourses){%>
				<tr>
					<td><%= course.nom %></td>
					<br/>
				</tr>
		<%}
	%>

</body>
</html>