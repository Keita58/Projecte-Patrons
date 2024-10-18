package Projecte;

public class Eliptica extends NauDecorator implements Galaxia {

	String nom;
	String tipus;
	Nau nau;

	public Eliptica(Nau nau) {
		super(nau);
		this.nom = "El·líptica";
		this.tipus = "Galàxia";
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
		return super.getDescripcio()+" amb "+this.getNom();
	}

	@Override
	public String toString() {
		return "Eliptica [nom=" + nom + ", tipus=" + tipus + ", nau=" + nau + "]";
	}
}
