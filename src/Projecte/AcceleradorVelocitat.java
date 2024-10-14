package Projecte;

public class AcceleradorVelocitat implements Bonus {

	String nom;
	int puntsSumar;
	String tipus;

	public AcceleradorVelocitat() {
		this.nom = "Accelerador de velocitat";
		this.puntsSumar = 1;
		this.tipus = "Bonus";
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public String getTipus() {
		// TODO Auto-generated method stub
		return "Accelerador de velocitat";
	}

	@Override
	public int puntsASumar() {
		// TODO Auto-generated method stub
		return puntsSumar;
	}

	@Override
	public String toString() {
		return "AcceleradorVelocitat [nom=" + nom + ", puntsSumar=" + puntsSumar + ", tipus=" + tipus + "]";
	}
}
