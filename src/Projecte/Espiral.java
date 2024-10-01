package Projecte;

public class Espiral implements Galaxia{
	String nom="Espiral";
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
		return "Espiral [nom=" + nom + ", tipus=" + tipus + "]";
	}

	
	
}
