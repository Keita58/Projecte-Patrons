package Projecte;

public class Meteorit implements Enemic {

	String nom;
	int puntsRestar;
	String tipus;

	public Meteorit(){
		nom = "Meteorit";
		puntsRestar = -15;
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
		return "Meteorit [nom=" + nom + ", puntsRestar=" + puntsRestar + ", tipus=" + tipus + "]";
	}
}
