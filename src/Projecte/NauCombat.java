package Projecte;

public class NauCombat implements Enemic{

	String nom="Nau de combat";
	int puntsRestar=10;
	String tipus="Enemic";
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
