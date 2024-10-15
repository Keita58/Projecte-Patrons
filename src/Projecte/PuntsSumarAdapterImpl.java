package Projecte;

public class PuntsSumarAdapterImpl implements PuntsAdapter{
    
    private Nau nau;
    private Object obj;
    
    public PuntsSumarAdapterImpl(Nau nau, Object o){
        this.nau = nau;
        this.obj = o;
    }

    @Override
    public double getPunts() {
        return multFactor();
    }
    
    private double multFactor(){
        if(nau instanceof Equipament) {
            if(obj instanceof Bonus) {
                System.out.println("Punts de la nau a sumar: " + ((Bonus) obj).puntsASumar() / ((Equipament) nau).getFactor());
                return ((Bonus) obj).puntsASumar() / ((Equipament) nau).getFactor();
            }
            else {
                System.out.println("Punts de la nau a sumar: " + ((Recurs) obj).puntsASumar() / ((Equipament) nau).getFactor());
                return ((Recurs) obj).puntsASumar() / ((Equipament) nau).getFactor();
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
