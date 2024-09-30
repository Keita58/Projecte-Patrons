public class NauFactory {

    public Nau crearNau(String tipus, int punts, String nom, int saldo) {
        if (tipus.equalsIgnoreCase("Nau Lleugera")) {
            return new NauLleugera(punts, nom, saldo);
        } else if (tipus.equalsIgnoreCase("Nau Pesada")) {
            return new NauPesada(punts, nom, saldo);
        } else if (tipus.equalsIgnoreCase("Nau d'Exploració")) {
            return new NauExploracio(punts, nom, saldo);
        }
        return null;
    }
}
