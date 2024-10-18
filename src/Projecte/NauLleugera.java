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
        ObjecteCapturat obj = (ObjecteCapturat) evt.getOldValue();

        if(obj.getObjecte() instanceof Enemic) {
            if(obj.getNau()!= null && obj.getNau() instanceof EquipamentDecorator)
                pA = new PuntsRestarAdapterImpl((EquipamentDecorator) obj.getNau(), obj.getObjecte());
            else
                pA = new PuntsRestarAdapterImpl(null, obj.getObjecte());
        }
        else{
            if(obj.getNau() != null && obj.getNau() instanceof EquipamentDecorator)
                pA = new PuntsSumarAdapterImpl((EquipamentDecorator) obj.getNau(), obj.getObjecte());
            else
                pA = new PuntsSumarAdapterImpl(null, obj.getObjecte());
        }
        setPunts(this.getPunts() + pA.getPunts());
	}

	private void setPunts(double newValue) {
		this.punts = newValue;
        System.out.println("Punts de la nau lleugera: " + this.punts);
	}

    @Override
    public String getDescripcio() {
       return "Nau Lleugera";
    }

}
