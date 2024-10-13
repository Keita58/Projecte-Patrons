package Projecte;

public class GalaxiaFacotry implements JocFactory<Galaxia> {

	@Override
	public Galaxia create(String tipus, String nom) {
		if ("Galàxia".equalsIgnoreCase(tipus)&& "Espiral".equalsIgnoreCase(nom)) {
			return new Espiral();
		}else if ("Galàxia".equalsIgnoreCase(tipus)&& "El·líptica".equalsIgnoreCase(nom)) {
			return new Eliptica(nau);
		}else if ("Galàxia".equalsIgnoreCase(tipus)&& "Irregular".equalsIgnoreCase(nom)) {
			return new Irregular(nau);
		}else if ("Galàxia".equalsIgnoreCase(tipus)&& "Lenticular".equalsIgnoreCase(nom)) {
			return new Lenticular();
		}
		return null;
	}
}
