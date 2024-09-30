
public class RecursFactory implements JocFactory<Recurs> {

	@Override
	public Recurs create(String tipus, String nom) {
		if ("Recurs".equalsIgnoreCase(tipus)&& "Cristall d'energia".equalsIgnoreCase(nom)) {
			return new CristallEnergia();
		}else if ("Recurs".equalsIgnoreCase(tipus)&& "Kebab".equalsIgnoreCase(nom)) {
			return new Kebab();
		}else if ("Recurs".equalsIgnoreCase(tipus)&& "Or".equalsIgnoreCase(nom)) {
			return new Or();
		}
		return null;
	}

}
