package Projecte;

public class Or implements Recurs {

	String nom="Or";
	int puntsSumar=50;
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
		return "Or [nom=" + nom + ", puntsSumar=" + puntsSumar + ", tipus=" + tipus + "]";
	}



}
