package Projecte;

public class ObjecteCapturat {

	public void Capturat(RecolectorPunts recolectorPunts, Nau n, Object o) {

		if(n instanceof NauPesada) {
            if (o instanceof Bonus) {
				recolectorPunts.setPunts(((Bonus) o).puntsASumar());
			}
			else if (o instanceof Enemic) {
				recolectorPunts.setPunts(((Enemic) o).getPuntsARestar());
			}
			else if (o instanceof Recurs) {
				recolectorPunts.setPunts(((Recurs) o).puntsASumar());
			}
		}
		else if(n instanceof NauLleugera) {
			if (o instanceof Bonus) {
				recolectorPunts.setPunts(((Bonus) o).puntsASumar());
			}
			else if (o instanceof Enemic) {
				recolectorPunts.setPunts(((Enemic) o).getPuntsARestar());
			}
			else if (o instanceof Recurs) {
				recolectorPunts.setPunts(((Recurs) o).puntsASumar());
			}
		}
		else if(n instanceof NauExploracio) {
			if (o instanceof Bonus) {
				recolectorPunts.setPunts(((Bonus) o).puntsASumar());
			}
			else if (o instanceof Enemic) {
				recolectorPunts.setPunts(((Enemic) o).getPuntsARestar());
			}
			else if (o instanceof Recurs) {
				recolectorPunts.setPunts(((Recurs) o).puntsASumar());
			}
		}
	}
}
