package Projecte;

public class PuntsSumarAdapterImpl implements PuntsAdapter{
    
    private Equipament eq;
    private Object obj;
    
    public PuntsSumarAdapterImpl(EquipamentDecorator eq, Object o){
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
            if(obj instanceof Bonus) {
                System.out.println("Punts a sumar: " + ((Bonus) obj).puntsASumar() / eq.getFactor());
                System.out.println("Factor a dividir: " + eq.getFactor());
                return ((Bonus) obj).puntsASumar() / eq.getFactor();
            }
            else {
                System.out.println("Punts a sumar: " + ((Recurs) obj).puntsASumar() / eq.getFactor());
                System.out.println("Factor a dividir: " + eq.getFactor());
                return ((Recurs) obj).puntsASumar() / eq.getFactor();
            }
        }
        else {
            if(obj instanceof Bonus) {
                System.out.println("Punts a sumar: " + ((Bonus) obj).puntsASumar());
                System.out.println("Sense factor a aplicar");
                return ((Bonus) obj).puntsASumar();
            }
            else {
                System.out.println("Punts a sumar: " + ((Recurs) obj).puntsASumar());
                System.out.println("Sense factor a aplicar");
                return ((Recurs) obj).puntsASumar();
            }
        }
    }
}
