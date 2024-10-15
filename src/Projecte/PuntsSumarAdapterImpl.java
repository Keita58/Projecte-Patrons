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
            System.out.println("Punts de la nau a sumar: " + punts / ((Equipament) nau).getFactor());
            return punts / ((Equipament) nau).getFactor();
        }
        else {
            return punts;
        }
    }
}
