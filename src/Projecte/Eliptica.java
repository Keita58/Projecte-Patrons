package Projecte;

public class Eliptica implements Galaxia {
	String nom="El·líptica";
	String tipus="Galàxia";
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
