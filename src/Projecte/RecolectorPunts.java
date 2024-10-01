package Projecte;

import java.beans.PropertyChangeSupport;

public class RecolectorPunts {
	private Nau nau;
	
	private PropertyChangeSupport support;
	
	public RecolectorPunts() {
		support = new PropertyChangeSupport(this);
	}
	public void addPropertyChangeListener() {
		
	}
}
