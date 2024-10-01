package Projecte;

public class PortaEspacial implements Bonus{

	String nom="Porta espacial";
	int puntsSumar=2;
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
		return "PortaEspacial [nom=" + nom + ", puntsSumar=" + puntsSumar + ", tipus=" + tipus + "]";
	}

	
	

}
