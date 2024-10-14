package Projecte;

public class GalaxiaFacotry implements JocFactory<Galaxia> {

	Nau nau = new Nau() {
		@Override
		public String getNom() {
			return "";
		}

		@Override
		public int getPunts() {
			return 0;
		}

		@Override
		public int getCapacitatMoviment() {
			return 0;
		}

		@Override
		public int getSaldoRecursos() {
			return 0;
		}

		@Override
		public String getDescripcio() {
			return "";
		}
	};

	@Override
	public Galaxia create(String tipus, String nom, Nau nau) {
		if ("Galàxia".equalsIgnoreCase(tipus)&& "Espiral".equalsIgnoreCase(nom)) {
			return new Espiral(nau);
		}else if ("Galàxia".equalsIgnoreCase(tipus)&& "El·líptica".equalsIgnoreCase(nom)) {
			return new Eliptica(nau);
		}else if ("Galàxia".equalsIgnoreCase(tipus)&& "Irregular".equalsIgnoreCase(nom)) {
			return new Irregular(nau);
		}else if ("Galàxia".equalsIgnoreCase(tipus)&& "Lenticular".equalsIgnoreCase(nom)) {
			return new Lenticular(nau);
		}
		return null;
	}
}
