package Projecte;

public class BonusFactory implements JocFactory<Bonus> {

	@Override
	public Bonus create(String tipus, String nom) {
		if ("Bonus".equalsIgnoreCase(tipus)&& "Accelerador de velocitat".equalsIgnoreCase(nom)) {
			return new AcceleradorVelocitat();
		} else if ("Bonus".equalsIgnoreCase(tipus)&& "Robot reparador".equalsIgnoreCase(nom)) {
			return new RobotReparador();
		}else if ("Bonus".equalsIgnoreCase(tipus)&& "Porta espacial".equalsIgnoreCase(nom)) {
			return new PortaEspacial();
		}
		return null;
	}
}
