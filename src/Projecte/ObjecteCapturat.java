package Projecte;

public class ObjecteCapturat {

	public void Capturat(RecolectorPunts recolectorPunts, Nau n, Object o) {

		if(n instanceof Equipament) {
			if (n instanceof Escut escut) {
                Capturat(recolectorPunts, escut.getNau(), o);
			}
			else if (n instanceof Cano cano) {
                Capturat(recolectorPunts, cano.getNau(), o);
			}
			else if (n instanceof ImantMangetic imantMangetic) {
                Capturat(recolectorPunts, imantMangetic.getNau(), o);
			}
		}
		else if (n instanceof Galaxia) {
			if (n instanceof Espiral espiral) {
				Capturat(recolectorPunts,  espiral.getNau(), o);
			}
			else if (n instanceof Eliptica eliptica) {
				Capturat(recolectorPunts, eliptica.getNau(), o);
			}
			else if (n instanceof Irregular irregular) {
				Capturat(recolectorPunts, irregular.getNau(), o );
			}
			else if (n instanceof Lenticular lenticular) {
				Capturat(recolectorPunts, lenticular.getNau(), o);
			}
		}
		else {
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
