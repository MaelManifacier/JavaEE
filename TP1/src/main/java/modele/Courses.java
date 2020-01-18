package modele;

import java.util.ArrayList;
import java.util.List;

public class Courses {

	private List<String> coursesList;
	
	public Courses() {
		this.coursesList = new ArrayList<>();
		this.coursesList.add("Hey");
		this.coursesList.add("coucou");
		this.coursesList.add("Est-ce que la force est présente dans ce tp ???");
	}
	
	@Override
	public String toString() {
		return this.coursesList.toString();
	}
	
	public void addItem(String it) {
		this.coursesList.add(it);
	}
	
	public void deleteItem(String it) {
		if(this.coursesList.contains(it)) {
			this.coursesList.remove(this.coursesList.indexOf(it));
		}
	}
	
}
