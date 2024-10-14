package Projecte;

public class Alien implements Enemic {

	String nom;
	int puntsRestar;
	String tipus;

	public Alien() {
		this.nom = "Alien";
		this.puntsRestar = -7;
		this.tipus = "Enemic";
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
	public int getPuntsARestar() {
		// TODO Auto-generated method stub
		return puntsRestar;
	}

	@Override
	public String toString() {
		return "Alien [nom=" + nom + ", puntsRestar=" + puntsRestar + ", tipus=" + tipus + "]";
	}
}
