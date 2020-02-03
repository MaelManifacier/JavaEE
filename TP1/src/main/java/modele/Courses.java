package modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Courses {

	private List<Course> coursesList;
	
	public Courses() {
		this.coursesList = new ArrayList();
		this.coursesList.add(new Course("Hey", "cat"));
		this.coursesList.add(new Course("coucou", "bouh"));
		this.coursesList.add(new Course("Est-ce que la force est présente dans ce tp ???", "oui"));
	}
	
	@Override
	public String toString() {
		return this.coursesList.toString();
	}
	
	public void addItem(String it, String categorie) {
		this.coursesList.add(new Course(it, categorie));
	}
	
	public void deleteItem(String it) {
		System.out.println(it);
		Course c;
		Iterator i = this.coursesList.iterator();
		while (i.hasNext()) {
			c = (Course) i.next();
			if (c.nom.equals(it)) {
				i.remove();
			}
		}
	}
	
	public List<Course> getListe() {
		return this.coursesList;
	}
	
}
