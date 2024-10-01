package Projecte;

public class Escut implements Equipament {

	String nom="Escut protector";
	double factor=0.75;
	String tipus="Equipament";
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
	public double getFactor() {
		// TODO Auto-generated method stub
		return factor;
	}


	@Override
	public String toString() {
		return "Escut [nom=" + nom + ", factor=" + factor + ", tipus=" + tipus + "]";
	}


	

}
