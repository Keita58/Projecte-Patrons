package Projecte;

public class PuntsRestarAdapterImpl implements PuntsAdapter {

    private Equipament eq;
    private Object obj;
    
    public PuntsRestarAdapterImpl(EquipamentDecorator eq, Object o){
        if(eq != null)
            this.eq = eq.getEquipament();
        else
            this.eq = null;
        this.obj = o;
    }
    
    @Override
    public double getPunts() {
        return multFactor();
    }

    private double multFactor(){
        if(eq != null) {
            System.out.println("Punts a restar: " + ((Enemic) obj).getPuntsARestar());
            System.out.println("Factor a multiplicar: " + eq.getFactor());
            return ((Enemic) obj).getPuntsARestar() * eq.getFactor();
        }
        else {
            System.out.println("Punts a restar: " + ((Enemic) obj).getPuntsARestar());
            System.out.println("Sense factor a aplicar");
            return ((Enemic) obj).getPuntsARestar();
        }
    }
}
