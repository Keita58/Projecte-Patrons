import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        LinkedList<Nau> llistaNaus = new LinkedList<>();
        NauFactory nFactory = new NauFactory();

        llistaNaus.addLast(nFactory.crearNau("Nau lleugera", 10, "Llança de la llibertat", 1000));
        System.out.println(llistaNaus.getLast());

        llistaNaus.addLast(nFactory.crearNau("Nau pesada", 50, "Escut de la democràcia", 10000));
        System.out.println(llistaNaus.getLast());

        llistaNaus.addLast(nFactory.crearNau("Nau exploració", 5, "Mapa de les estrelles", 500));
        System.out.println(llistaNaus.getLast());
        
        JocFactory jocFactory;
        
        jocFactory=FactoryProvider.getFactory("Enemic");
        Enemic naucombat=(Enemic) jocFactory.create("Enemic", "Nau de combat");
        
        jocFactory=FactoryProvider.getFactory("Recurs");
        Recurs kebab=(Recurs) jocFactory.create("Recurs", "Kebab");
        
        jocFactory=FactoryProvider.getFactory("Equipament");
        Equipament escut=(Equipament) jocFactory.create("Equipament", "Escut protector");
        
        jocFactory=FactoryProvider.getFactory("Bonus");
        Bonus robot=(Bonus) jocFactory.create("Bonus", "Robot reparador");
        
        jocFactory=FactoryProvider.getFactory("Galàxia");
        Galaxia espiral=(Galaxia) jocFactory.create("Galàxia", "Espiral");
        
        String resultat="Nau "+naucombat+", Kebab: "+kebab+", escut: "+escut+", robot: "+robot+", espiral: "+espiral;
        System.out.println(resultat);


        
    }
}
