package Projecte;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        //Random r = new Random();
        Queue<Nau> llistaNaus = new LinkedList<>();

        NauFactory nFactory = new NauFactory();
        RecolectorPunts recolectorPunts = new RecolectorPunts(); //Observer de les naus

        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau lleugera", 10, "Llança de la llibertat", 1000));
        System.out.println(llistaNaus.peek());

        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau pesada", 50, "Escut de la democràcia", 10000));
        System.out.println(llistaNaus.peek());

        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau exploració", 5, "Mapa de les estrelles", 500));
        System.out.println(llistaNaus.peek());

        Iterator<Nau> it = llistaNaus.iterator();
        Nau aux = it.next();
        
        JocFactory jocFactory;

        //Ara els enemics tenen punts negatius per restar als punts del jugador
        //Sinó només sumava punts, no restava
        jocFactory = FactoryProvider.getFactory("Enemic");
        Enemic naucombat = (Enemic) jocFactory.create("Enemic", "Nau de combat", null);
        
        jocFactory = FactoryProvider.getFactory("Recurs");
        Recurs kebab = (Recurs) jocFactory.create("Recurs", "Kebab", null);
        
        jocFactory = FactoryProvider.getFactory("Equipament");
        Equipament escut = (Equipament) jocFactory.create("Equipament", "Escut protector", aux);
        
        jocFactory = FactoryProvider.getFactory("Bonus");
        Bonus robot = (Bonus) jocFactory.create("Bonus", "Robot reparador", null);
        
        jocFactory = FactoryProvider.getFactory("Galàxia");
        Galaxia espiral = (Galaxia) jocFactory.create("Galàxia", "Espiral", aux);
        
        String resultat = "Nau " + naucombat + ", Kebab: " + kebab + ", escut: " + escut + ", robot: " + robot + ", espiral: " + espiral;
        System.out.println(resultat);
        
        ObjecteCapturat objc = new ObjecteCapturat();
        System.out.println("Punts del kebab: " + kebab.puntsASumar());
        System.out.println("Punts abans: " + aux.getPunts());
        objc.Capturat(recolectorPunts, aux, kebab);
        System.out.println("Punts despres: " + aux.getPunts());
        System.out.println("Punts despres: " + aux.getPunts());
        
        objc.Capturat(recolectorPunts, aux, naucombat);
        
        for(Nau nau : llistaNaus) {
            if(nau instanceof NauExploracio) {
                recolectorPunts.removePropertyChangeListener((NauExploracio)nau);
            }
            else if(nau instanceof NauLleugera) {
                recolectorPunts.removePropertyChangeListener((NauLleugera)nau);
            }
            else if(nau instanceof NauPesada) {
                recolectorPunts.removePropertyChangeListener((NauPesada)nau);
            }
        }

        Nau nau1 = new Escut(new Color(aux, ColorEnum.RED));
        System.out.println(nau1.getDescripcio());
    }
}
