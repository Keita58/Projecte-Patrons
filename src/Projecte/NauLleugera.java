package Projecte;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NauLleugera implements Nau, PropertyChangeListener  {

    private String nom;
    private double punts;
    private int saldo;

    public NauLleugera(double punts, String nom, int saldo) {
        this.punts = punts;
        this.nom = nom;
        this.saldo = saldo;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public double getPunts() {
        return punts;
    }

    @Override
    public int getCapacitatMoviment() {
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
        PuntsAdapter pA;
        if((double)evt.getNewValue() < 0) {
            pA = new PuntsRestarAdapterImpl(this, (double) evt.getNewValue());
        }
        else{
            pA = new PuntsSumarAdapterImpl(this, (double) evt.getNewValue());
        }
        this.setPunts(this.punts + pA.getPunts());
	}

	private void setPunts(double newValue) {
		this.punts = newValue;
	}

    @Override
    public String getDescripcio() {
       return "Nau Lleugera";
    }

}
