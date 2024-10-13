package Projecte;

public class EquipamentFactory implements JocFactory<Equipament> {

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
