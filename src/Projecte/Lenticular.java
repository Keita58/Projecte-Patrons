package Projecte;

public class Lenticular implements Galaxia {

	String nom="Lenticular";
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
		return "Lenticular [nom=" + nom + ", tipus=" + tipus + "]";
	}

	
	

}
