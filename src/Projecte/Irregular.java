package Projecte;

public class Irregular implements Galaxia {
	String nom="Irregular";
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
		return "Irregular [nom=" + nom + ", tipus=" + tipus + "]";
	}

	
}
