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
        PuntsAdapter pA;
        ObjecteCapturat obj = (ObjecteCapturat) evt.getOldValue();

        if(obj.getObjecte() instanceof Enemic) {
            pA = new PuntsRestarAdapterImpl(obj.getNau(), obj.getObjecte());
        }
        else{
            pA = new PuntsSumarAdapterImpl(obj.getNau(), obj.getObjecte());
        }
        setPunts(this.getPunts() + pA.getPunts());
    }

	private void setPunts(double newValue) {
		this.punts = newValue;
        System.out.println("Punts de la Nau Pesada: "+this.punts);
	}

    @Override
    public String getDescripcio() {
        return "Nau pesada";
    }

}
