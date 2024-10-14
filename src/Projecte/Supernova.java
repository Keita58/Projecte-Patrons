package Projecte;

public class Supernova implements Enemic {

	String nom;
	int puntsRestar;
	String tipus;

	public Supernova(){
		nom = "Supernova";
		puntsRestar = -20;
		tipus = "Enemic";
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
		return "Supernova [nom=" + nom + ", puntsRestar=" + puntsRestar + ", tipus=" + tipus + "]";
	}
}
