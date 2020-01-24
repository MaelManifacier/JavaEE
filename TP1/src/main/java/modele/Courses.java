package modele;

import java.util.ArrayList;
import java.util.List;

public class Courses {

	private List<Course> coursesList;
	
	public Courses() {
		this.coursesList = new ArrayList<>();
		this.coursesList.add(new Course("Hey", "cat"));
		this.coursesList.add(new Course("coucou", "bouh"));
		this.coursesList.add(new Course("Est-ce que la force est présente dans ce tp ???", "oui"));
	}
	
	@Override
	public String toString() {
		return this.coursesList.toString();
	}
	
	public void addItem(String it, String qtt) {
		this.coursesList.add(new Course(it ,qtt));
	}
	
	public void deleteItem(String it) {
		System.out.println(it);
		if(this.coursesList.contains(new Course(it, ""))) {
			this.coursesList.remove(this.coursesList.indexOf(it));
		}
	}
	
	public List<Course> getListe() {
		return this.coursesList;
	}
	
}
