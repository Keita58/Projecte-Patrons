
public class Cano implements Equipament{

	String nom="Canó";
	double factor=0.33;
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
		return "Cano [nom=" + nom + ", factor=" + factor + ", tipus=" + tipus + "]";
	}


	

}
