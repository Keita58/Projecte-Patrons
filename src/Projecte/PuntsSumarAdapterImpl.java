package Projecte;

public class PuntsSumarAdapterImpl implements PuntsAdapter{
    
    private Nau nau;
    private double punts;
    
    public PuntsSumarAdapterImpl(Nau nau, double num){
        this.nau = nau;
        this.punts = num;
    }

    @Override
    public double getPunts() {
        return multFactor();
    }
    
    private double multFactor(){
        if(nau instanceof Equipament) {
                return punts / ((Equipament) nau).getFactor();
        }
        else {
                return punts;
        }
    }
}
