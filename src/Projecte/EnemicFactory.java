package Projecte;

public class EnemicFactory implements JocFactory<Enemic>{

	@Override
	public Enemic create(String tipus, String nom) {
		// TODO Auto-generated method stub
		if ("Enemic".equalsIgnoreCase(tipus) && "Alien".equalsIgnoreCase(nom)) {
			return new Alien();
		}else if ("Enemic".equalsIgnoreCase(tipus)&& "Meteorit".equalsIgnoreCase(nom)) {
			return new Meteorit();
		}else if ("Enemic".equalsIgnoreCase(tipus)&& "Nau de combat".equalsIgnoreCase(nom)) {
			return new NauCombat();
		}else if ("Enemic".equalsIgnoreCase(tipus)&& "Supernova".equalsIgnoreCase(nom)) {
			return new Supernova();
		}
		return null;
	}

}
