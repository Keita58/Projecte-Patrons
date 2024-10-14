package Projecte;

public class Escut extends NauDecorator implements Equipament {

	String nom;
	double factor;
	String tipus;
	public Escut(Nau nau) {
		super(nau);
		this.nom = "Escut protector";
		this.factor = 0.75;
		this.tipus = "Equipament";
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
	public String toString() {
		return "Escut [nom=" + nom + ", factor=" + factor + ", tipus=" + tipus + "]";
	}

	@Override
	public int getPunts() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getPunts'");
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
