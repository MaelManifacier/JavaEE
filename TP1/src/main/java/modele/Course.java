package modele;

public class Course {
	
	public String nom;
	public boolean achete = false;
	public int quantite = 30;
	public String categorie;
	
	public Course (String nom, String categorie) {
		this.nom = nom;
		this.categorie = categorie;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (o == this)
	        return true;
	    if (!(o instanceof Course))
	        return false;
	    Course other = (Course)o;
	    if(other.nom.equals(this.nom) ) {
	    	return true;
	    }
	    return false;
	}
	
	public int acheter(int nb) {
		if (nb > this.quantite) {
			return -1;
		} else {
			this.quantite -= nb;
			if (quantite == 0) {
				this.achete = true;
			}
			return this.quantite;
		}
	}

}
