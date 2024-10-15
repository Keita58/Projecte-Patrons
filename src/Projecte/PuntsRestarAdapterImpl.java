package Projecte;

public class PuntsRestarAdapterImpl implements PuntsAdapter {

    private Nau nau;
    private Object obj;
    
    public PuntsRestarAdapterImpl(Nau nau, Object o){
        this.nau = nau;
        this.obj = o;
    }
    
    @Override
    public double getPunts() {
        return multFactor();
    }

    private double multFactor(){
        if(nau instanceof Equipament) {
            System.out.println("Punts de la nau a restar: " + ((Enemic) obj).getPuntsARestar() * ((Equipament) nau).getFactor());
            return ((Enemic) obj).getPuntsARestar() * ((Equipament) nau).getFactor();
        }
        else {
            return ((Enemic) obj).getPuntsARestar();
        }
    }
}
