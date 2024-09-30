public class NauLleugera implements Nau {

    String nom;
    int punts;
    int saldo;

    public NauLleugera(int punts, String nom, int saldo) {
        this.punts = punts;
        this.nom = nom;
        this.saldo = saldo;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getPunts() {
        return punts;
    }

    @Override
    public int getCapacitatMoviment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCapacitatMoviment'");
    }

    @Override
    public int getSaldoRecursos() {
        return saldo;
    }

    @Override
    public String toString() {
        return "NauLleugera [nom=" + nom + ", punts=" + punts + ", saldo=" + saldo + "]";
    }

}
