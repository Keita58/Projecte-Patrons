package Projecte;

public class RobotReparador implements Bonus {
	String nom="Robot reparador";
	int puntsSumar=5;
	String tipus="Bonus";
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
		return "RobotReparador [nom=" + nom + ", puntsSumar=" + puntsSumar + ", tipus=" + tipus + "]";
	}

	
}
