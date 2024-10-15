package Projecte;

public class PuntsRestarAdapterImpl implements PuntsAdapter {

    private Nau nau;
    private double punts;
    
    public PuntsRestarAdapterImpl(Nau nau, double num){
        this.nau = nau;
        this.punts = num;
    }
    
    @Override
    public double getPunts() {
        return multFactor(punts);
    }

    private double multFactor(double punts){
        if(nau instanceof Equipament) {
            System.out.println("Punts de la nau a restar: " + punts * ((Equipament) nau).getFactor());
            return punts * ((Equipament) nau).getFactor();
        }
        else {
            return punts;
        }
    }
}
