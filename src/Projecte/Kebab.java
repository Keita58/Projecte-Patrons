package Projecte;

public class Kebab implements Recurs{
	String nom="Kebab";
	int puntsSumar=25;
	String tipus="Recurs";
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
	public int puntsASumar() {
		// TODO Auto-generated method stub
		return puntsSumar;
	}

	@Override
	public String toString() {
		return "Kebab [nom=" + nom + ", puntsSumar=" + puntsSumar + ", tipus=" + tipus + "]";
	}

	

}