package Projecte;

public class ImantMangetic implements Equipament{

	String nom;
	double factor;
	String tipus;


	public ImantMangetic() {
		this.nom = "Iman magnètic";
		this.factor = 1.5;
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
		return "ImantMangetic [nom=" + nom + ", factor=" + factor + ", tipus=" + tipus + "]";
	}


	
	
}
