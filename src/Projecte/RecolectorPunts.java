package Projecte;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class RecolectorPunts {

	private double punts;
	private PropertyChangeSupport support;
	
	public RecolectorPunts() {
		support = new PropertyChangeSupport(this);
		this.punts = 0;
	}

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}

	public void setPunts(double punts) {
		support.firePropertyChange("punts", this.punts, punts);
		this.punts = punts;
	}
}
