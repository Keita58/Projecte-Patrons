
public class ImantMangetic implements Equipament{

	String nom="Imant magnètic";
	double factor=1.5;
	String tipus="Equipament";
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
	public double getFactor() {
		// TODO Auto-generated method stub
		return factor;
	}

	@Override
	public String toString() {
		return "ImantMangetic [nom=" + nom + ", factor=" + factor + ", tipus=" + tipus + "]";
	}

	
	
}
