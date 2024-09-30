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
    }
}
