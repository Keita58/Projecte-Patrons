package Projecte;

public class Espiral implements Galaxia{
	String nom="Espiral";
	String tipus="Galàxia";
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
	public String toString() {
		return "Espiral [nom=" + nom + ", tipus=" + tipus + "]";
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
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getDescripcio'");
	}

	
	
}
