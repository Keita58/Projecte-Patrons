package Projecte;

public class Escut implements Equipament {

	String nom;
	double factor;
	String tipus;

	public Escut() {
		this.nom = "Escut protector";
		this.factor = 0.75;
		this.tipus = "Equipament";
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
	public double getFactor() {
		// TODO Auto-generated method stub
		return factor;
	}

	@Override
	public String toString() {
		return "Escut [nom=" + nom + ", factor=" + factor + ", tipus=" + tipus + "]";
	}

}
