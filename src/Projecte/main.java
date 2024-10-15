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
        //Suma punts
        objc.Capturat(recolectorPunts, aux, kebab);
        System.out.println("Punts despres: " + aux.getPunts());
        //Resta punts
        objc.Capturat(recolectorPunts, aux, naucombat);
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

        Nau nau1 = new Color(new Espiral(new Escut(aux)), ColorEnum.RED);
        System.out.println(nau1.getDescripcio());

        RecolectorPunts recolectorPunts2 = new RecolectorPunts();
        Nau aux1 = nFactory.crearNau(recolectorPunts2, "Nau lleugera", 10.0, "EEEE", 10);
        Nau nau0 = new Cano(new Lenticular(aux1));
        objc.Capturat(recolectorPunts2, nau0, kebab);
    }
}
