package Projecte;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class RecolectorPunts {

	private ObjecteCapturat objC;
	private PropertyChangeSupport support;
	
	public RecolectorPunts() {
		support = new PropertyChangeSupport(this);
	}

	public void addPropertyChangeListener(PropertyChangeListener pcl) {support.addPropertyChangeListener(pcl);}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}

	public void setPunts(ObjecteCapturat obj) {
		System.out.println("Objecte que arriba a l'observer: " + obj.getObjecte());
		support.firePropertyChange("punts", obj, this.objC);
		this.objC = obj;
	}
}
