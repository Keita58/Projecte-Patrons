package Projecte;

public class CristallEnergia implements Recurs {
	
	String nom;
	int puntsSumar;
	String tipus;
	
	public CristallEnergia() {
		this.nom = "Cristall d'energia";
		this.puntsSumar = 10;
		this.tipus = "Recurs";
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
	public int puntsASumar() {
		// TODO Auto-generated method stub
		return puntsSumar;
	}

	@Override
	public String toString() {
		return "CristallEnergia [nom=" + nom + ", puntsSumar=" + puntsSumar + ", tipus=" + tipus + "]";
	}

}
