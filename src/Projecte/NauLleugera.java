package Projecte;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NauLleugera implements Nau, PropertyChangeListener  {

    private String nom;
    private int punts;
    private int saldo;

    public NauLleugera(int punts, String nom, int saldo) {
        this.punts = punts;
        this.nom = nom;
        this.saldo = saldo;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getPunts() {
        return punts;
    }

    @Override
    public int getCapacitatMoviment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCapacitatMoviment'");
    }

    @Override
    public int getSaldoRecursos() {
        return saldo;
    }

    @Override
    public String toString() {
        return "NauLleugera [nom=" + nom + ", punts=" + punts + ", saldo=" + saldo + "]";
    }

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		this.setPunts(this.punts+(int)evt.getNewValue());
	}

	private void setPunts(int newValue) {
		// TODO Auto-generated method stub
		this.punts = newValue;
	}

    @Override
    public String getDescripcio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescripcio'");
    }

}
