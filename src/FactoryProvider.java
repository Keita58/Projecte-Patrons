
public class FactoryProvider {
	public static JocFactory getFactory(String choice){
		if ("Enemic".equalsIgnoreCase(choice)) {
			return new EnemicFactory();
		}
		else if ("Recurs".equalsIgnoreCase(choice)) {
			return new RecursFactory();
		}
		else if ("Bonus".equalsIgnoreCase(choice)) {
			return new BonusFactory();
		}
		else if ("Equipament".equalsIgnoreCase(choice)) {
			return new EquipamentFactory();
		}
		else if ("Galàxia".equalsIgnoreCase(choice)) {
			return new GalaxiaFacotry();
		}
		
		return null;
		
	}

}
