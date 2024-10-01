
public class CristallEnergia implements Recurs {
	String nom="Cristall d'energia";
	int puntsSumar=10;
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
		return "CristallEnergia [nom=" + nom + ", puntsSumar=" + puntsSumar + ", tipus=" + tipus + "]";
	}

}
