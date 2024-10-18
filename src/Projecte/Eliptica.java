package Projecte;

public class Eliptica implements Galaxia {

	String nom;
	String tipus;

	public Eliptica() {
		this.nom = "El·líptica";
		this.tipus = "Galàxia";
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public String getTipus() {
		// TODO Auto-generated method stub
		return tipus;
	}
	
	@Override
	public String toString() {
		return "Eliptica [nom=" + nom + ", tipus=" + tipus + "]";
	}
}
