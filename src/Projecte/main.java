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

        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau lleugera", 10.0, "Llança de la llibertat", 1000));
        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau pesada", 50.0, "Escut de la democràcia", 10000));
        llistaNaus.add(nFactory.crearNau(recolectorPunts, "Nau exploració", 5.0, "Mapa de les estrelles", 500));

        Iterator<Nau> itNaus = llistaNaus.iterator();
        while(itNaus.hasNext()) {
            Nau nau = itNaus.next();
            System.out.println(nau);
        }

        Iterator<Nau> it = llistaNaus.iterator();
        Nau aux = it.next();

        JocFactory jocFactory;

        //Ara els enemics tenen punts negatius per restar als punts del jugador
        //Sinó només sumava punts, no restava
        jocFactory = FactoryProvider.getFactory("Enemic");
        Enemic naucombat = (Enemic) jocFactory.create("Enemic", "Nau de combat");
        
        jocFactory = FactoryProvider.getFactory("Recurs");
        Recurs kebab = (Recurs) jocFactory.create("Recurs", "Kebab");
        
        jocFactory = FactoryProvider.getFactory("Equipament");
        Equipament escut = (Equipament) jocFactory.create("Equipament", "Escut protector");
        
        jocFactory = FactoryProvider.getFactory("Bonus");
        Bonus robot = (Bonus) jocFactory.create("Bonus", "Robot reparador");
        
        jocFactory = FactoryProvider.getFactory("Galàxia");
        Galaxia espiral = (Galaxia) jocFactory.create("Galàxia", "Espiral");
        
        String resultat = "Nau " + naucombat + ", Kebab: " + kebab + ", escut: " + escut + ", robot: " + robot + ", espiral: " + espiral;
        System.out.println(resultat);

        System.out.println("Punts del kebab: " + kebab.puntsASumar());
        System.out.println("Punts abans: " + aux.getPunts());
        //Suma punts
        ObjecteCapturat objc = new ObjecteCapturat(aux, kebab);
        recolectorPunts.setPunts(objc);
        System.out.println("Punts despres: " + aux.getPunts());
        //Resta punts
        ObjecteCapturat objc0 = new ObjecteCapturat(aux, naucombat);
        recolectorPunts.setPunts(objc0);
        System.out.println("Punts despres: " + aux.getPunts());
        
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

        //Nau nau1 = new Color(new Espiral(new Escut()), ColorEnum.RED);
        //System.out.println(nau1.getDescripcio());

        RecolectorPunts recolectorPunts2 = new RecolectorPunts();
        Nau aux1 = nFactory.crearNau(recolectorPunts2, "Nau lleugera", 10.0, "EEEE", 10);
        //Nau nau0 = new Irregular(new Color(new Cano(new Lenticular(aux1)), ColorEnum.RED));
        //ObjecteCapturat objc1 = new ObjecteCapturat(nau0, kebab);
        //recolectorPunts2.setPunts(objc1);
    }
}
