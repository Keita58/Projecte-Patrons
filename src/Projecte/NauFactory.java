package Projecte;

public class NauFactory {

    public Nau crearNau(RecolectorPunts recolectorPunts, String tipus, double punts, String nom, int saldo) {
        if (tipus.equalsIgnoreCase("Nau Lleugera")) {
            NauLleugera nauLleugera = new NauLleugera(punts, nom, saldo);
            recolectorPunts.addPropertyChangeListener(nauLleugera);
            System.out.println("S'ha afegit "+nauLleugera.getNom()+" a l'observer.");
            return nauLleugera;
        } 
        else if (tipus.equalsIgnoreCase("Nau Pesada")) {
            NauPesada nauPesada = new NauPesada(punts, nom, saldo);
            recolectorPunts.addPropertyChangeListener(nauPesada);
            System.out.println("S'ha afegit "+nauPesada.getNom()+" a l'observer.");
            return nauPesada;
        } 
        else if (tipus.equalsIgnoreCase("Nau Exploració")) {
            NauExploracio nauExploracio = new NauExploracio(punts, nom, saldo);
            recolectorPunts.addPropertyChangeListener(nauExploracio);
            System.out.println("S'ha afegit "+nauExploracio.getNom()+" a l'observer.");
            return nauExploracio;
        }
        return null;
    }
}
