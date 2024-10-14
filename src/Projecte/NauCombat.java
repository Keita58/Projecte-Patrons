package Projecte;

public class NauCombat implements Enemic{

	String nom;
	int puntsRestar;
	String tipus;

	public NauCombat() {
		this.nom = "Nau de combat";
		this.puntsRestar = -10;
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
		return "NauCombat [nom=" + nom + ", puntsRestar=" + puntsRestar + ", tipus=" + tipus + "]";
	}
}
