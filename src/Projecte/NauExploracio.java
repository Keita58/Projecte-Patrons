package Projecte;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NauExploracio implements Nau, PropertyChangeListener  {

    private String nom;
    private double punts;
    private int saldo;

    public NauExploracio(double punts, String nom, int saldoRecursos) {
        this.nom = nom;
        this.punts = punts;
        this.saldo = saldoRecursos;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCapacitatMoviment'");
    }

    @Override
    public int getSaldoRecursos() {
        return saldo;
    }

    @Override
    public String toString() {
        return "NauExploracio [nom=" + nom + ", punts=" + punts + ", saldo=" + saldo + "]";
    }

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
        PuntsAdapter pA;
        ObjecteCapturat obj = (ObjecteCapturat) evt.getOldValue();

        Nau nauActual = obj.getNau();
        Equipament equipament = null;

        while (nauActual instanceof NauDecorator){
            if (nauActual instanceof Equipament){
                equipament = (Equipament) nauActual;
                break;
            }
            nauActual=((NauDecorator) nauActual).getNau();
        }

        if(obj.getObjecte() instanceof Enemic) {
            if(equipament != null)
                pA = new PuntsRestarAdapterImpl(equipament, obj.getObjecte());
            else
                pA = new PuntsRestarAdapterImpl(null, obj.getObjecte());
        }
        else{
            if(equipament != null)
                pA = new PuntsSumarAdapterImpl(equipament, obj.getObjecte());
            else
                pA = new PuntsSumarAdapterImpl(null, obj.getObjecte());
        }
        setPunts(this.getPunts() + pA.getPunts());
	}

	private void setPunts(double newValue) {
		this.punts = newValue;
        System.out.println("Punts de la nau d'Exploració "+this.punts);
	}

    @Override
    public String getDescripcio() {
        return "Nau Exploració";
    }

}
