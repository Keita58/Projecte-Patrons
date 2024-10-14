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
        return multFactor(punts); //Sumem perquè els enemics tenen puntuació negativa
    }

    private double multFactor(double punts){
        if(nau instanceof Equipament) {
            return punts * ((Equipament) nau).getFactor();
        }
        else {
            return punts;
        }
    }
}
