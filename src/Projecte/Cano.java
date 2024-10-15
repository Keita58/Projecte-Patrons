package Projecte;

public class Cano extends NauDecorator implements Equipament {

	String nom;
	double factor;
	String tipus;
	Nau nau;

	public Cano(Nau nau) {
		super(nau);
		this.nau = nau;
		this.nom = "Canó";
		this.factor = 0.33;
		this.tipus = "Equipament";
	}

	public Nau getNau() {
		return nau;
	}

	public void setNau(Nau nau) {
		this.nau = nau;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public String getTipus() {
		return tipus;
	}

	@Override
	public double getFactor() {
		return factor;
	}

	@Override
	public String toString() {
		return "Cano [nom=" + nom + ", factor=" + factor + ", tipus=" + tipus + "]";
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
		return super.getDescripcio() + " amb " + this.getNom();
	}
}
