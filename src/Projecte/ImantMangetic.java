package Projecte;

public class ImantMangetic extends NauDecorator implements Equipament{

	String nom;
	double factor;
	String tipus;
	Nau nau;

	public ImantMangetic(Nau nau) {
		super(nau);
		this.nom = "Iman magnètic";
		this.factor = 1.5;
		this.tipus = "Equipament";
		this.nau = nau;
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
	public double getFactor() {
		// TODO Auto-generated method stub
		return factor;
	}

	@Override
	public double getPunts() {
		return nau.getPunts();
	}

	@Override
	public int getCapacitatMoviment() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getCapacitatMoviment'");
	}

	@Override
	public int getSaldoRecursos() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getSaldoRecursos'");
	}

	@Override
	public String getDescripcio() {
		// TODO Auto-generated method stub
		return super.getDescripcio()+" amb "+this.nom;
	}

	@Override
	public String toString() {
		return "ImantMangetic{" +
				"nom='" + nom + '\'' +
				", factor=" + factor +
				", tipus='" + tipus + '\'' +
				", nau=" + nau +
				'}';
	}
}
