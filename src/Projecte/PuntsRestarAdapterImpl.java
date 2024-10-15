package Projecte;

public class PuntsRestarAdapterImpl implements PuntsAdapter {

    private Equipament eq;
    private Object obj;
    
    public PuntsRestarAdapterImpl(Equipament eq, Object o){
        this.eq = eq;
        this.obj = o;
    }
    
    @Override
    public double getPunts() {
        return multFactor();
    }

    private double multFactor(){
        if(eq != null) {
            System.out.println("Punts de la nau a restar: " + ((Enemic) obj).getPuntsARestar() * eq.getFactor());
            return ((Enemic) obj).getPuntsARestar() * eq.getFactor();
        }
        else {
            return ((Enemic) obj).getPuntsARestar();
        }
    }
}
