package Projecte;

public class PuntsSumarAdapterImpl implements PuntsAdapter{
    
    private Equipament eq;
    private Object obj;
    
    public PuntsSumarAdapterImpl(Equipament eq, Object o){
        this.eq = eq;
        this.obj = o;
    }

    @Override
    public double getPunts() {
        return multFactor();
    }
    
    private double multFactor(){
        if(eq != null) {
            if(obj instanceof Bonus) {
                System.out.println("Punts de la nau a sumar: " + ((Bonus) obj).puntsASumar() / eq.getFactor());
                return ((Bonus) obj).puntsASumar() / eq.getFactor();
            }
            else {
                System.out.println("Punts de la nau a sumar: " + ((Recurs) obj).puntsASumar() / eq.getFactor());
                return ((Recurs) obj).puntsASumar() / eq.getFactor();
            }
        }
        else {
            if(obj instanceof Bonus) {
                System.out.println("Punts de la nau a sumar: " + ((Bonus) obj).puntsASumar());
                return ((Bonus) obj).puntsASumar();
            }
            else {
                System.out.println("Punts de la nau a sumar: " + ((Recurs) obj).puntsASumar());
                return ((Recurs) obj).puntsASumar();
            }
        }
    }
}
