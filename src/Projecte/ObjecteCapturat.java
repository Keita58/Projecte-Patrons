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
}
