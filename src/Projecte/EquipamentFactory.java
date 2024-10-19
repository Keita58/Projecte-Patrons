package Projecte;

public class EquipamentFactory implements JocFactory<Equipament> {

	@Override
	public Equipament create(String tipus, String nom) {
		if ("Equipament".equalsIgnoreCase(tipus) && "Escut protector".equalsIgnoreCase(nom)) {
			return new Escut();
		} else if ("Equipament".equalsIgnoreCase(tipus) && "Cano".equalsIgnoreCase(nom)) {
			return new Cano();
		} else if ("Equipament".equalsIgnoreCase(tipus) && "Imant magnetic".equalsIgnoreCase(nom)) {
			return new ImantMangetic();
		}
		return null;
	}
}
