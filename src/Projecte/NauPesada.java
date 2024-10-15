package Projecte;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NauPesada implements Nau, PropertyChangeListener {

    private String nom;
    private double punts;
    private int saldo;
    private int capacitatMoviment;

    public NauPesada(double punts, String nom, int saldo) {
        this.nom = nom;
        this.punts = punts;
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
        //return capacitatMoviment;
        // TODO: Encara no implementem això (30/9)
        throw new UnsupportedOperationException("Unimplemented method 'getCapacitatMoviment'");
    }

    @Override
    public int getSaldoRecursos() {
        return saldo;    
    }

    @Override
    public String toString() {
        return "NauPesada [nom=" + nom + ", punts=" + punts + ", saldo=" + saldo + "]";
    }

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		this.punts = newValue;
	}

    @Override
    public String getDescripcio() {
        // TODO Auto-generated method stub
        return "Nau pesada";
    }

}
