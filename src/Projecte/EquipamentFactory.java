package Projecte;

public class EquipamentFactory implements JocFactory<Equipament> {

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
	public Equipament create(String tipus, String nom) {
		if ("Equipament".equalsIgnoreCase(tipus) && "Escut protector".equalsIgnoreCase(nom)) {
			return new Escut(nau);
		} else if ("Equipament".equalsIgnoreCase(tipus) && "Canó".equalsIgnoreCase(nom)) {
			return new Cano(nau);
		} else if ("Equipament".equalsIgnoreCase(tipus) && "Imant magnètic".equalsIgnoreCase(nom)) {
			return new ImantMangetic(nau);
		}
		return null;
	}
}
