package Projecte;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NauExploracio implements Nau, PropertyChangeListener  {

    private String nom;
    private int punts;
    private int saldo;

    public NauExploracio(int punts, String nom, int saldoRecursos) {
        this.nom = nom;
        this.punts = punts;
        this.saldo = saldoRecursos;
    }

    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return nom;
    }

    @Override
    public int getPunts() {
        // TODO Auto-generated method stub
        return punts;
    }

    @Override
    public int getCapacitatMoviment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCapacitatMoviment'");
    }

    @Override
    public int getSaldoRecursos() {
        // TODO Auto-generated method stub
        return saldo;
    }

    @Override
    public String toString() {
        return "NauExploracio [nom=" + nom + ", punts=" + punts + ", saldo=" + saldo + "]";
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

}
