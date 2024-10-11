package Projecte;

public class NauFactory {

    public Nau crearNau(RecolectorPunts recolectorPunts, String tipus, int punts, String nom, int saldo) {
        if (tipus.equalsIgnoreCase("Nau Lleugera")) {
            NauLleugera nauLleugera = new NauLleugera(punts, nom, saldo);
            recolectorPunts.addPropertyChangeListener(nauLleugera);
            return nauLleugera;
        } 
        else if (tipus.equalsIgnoreCase("Nau Pesada")) {
            NauPesada nauPesada = new NauPesada(punts, nom, saldo);
            recolectorPunts.addPropertyChangeListener(nauPesada);
            return nauPesada;
        } 
        else if (tipus.equalsIgnoreCase("Nau Exploració")) {
            NauExploracio nauExploracio = new NauExploracio(punts, nom, saldo);
            recolectorPunts.addPropertyChangeListener(nauExploracio);
            return nauExploracio;
        }
        return null;
    }
}
