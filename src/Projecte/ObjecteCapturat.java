package Projecte;

public class ObjecteCapturat <T>{

	private Nau nau;
	private T objecte;

	public ObjecteCapturat(Nau nau, T objecte){
		super();
		this.nau = nau;
		this.objecte = objecte;
	}

	public T getObjecte() {
		return objecte;
	}

	public void setObjecte(T objecte) {
		this.objecte = objecte;
	}

	public Nau getNau() {
		return nau;
	}

	public void setNau(Nau nau) {
		this.nau = nau;
	}

	@Override
	public String toString() {
		return "ObjecteCapturat{" +
				", nau=" + nau +
				", objecte=" + objecte +
				'}';
	}

	/*
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
	}*/
}
