package Projecte;

public class Meteorit implements Enemic {

	String nom="Meteorit";
	int puntsRestar=-15;
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
		return "Meteorit [nom=" + nom + ", puntsRestar=" + puntsRestar + ", tipus=" + tipus + "]";
	}

	

	
}
