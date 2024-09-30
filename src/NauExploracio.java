public class NauExploracio implements Nau {

    String nom;
    int punts;
    int saldo;

    public NauExploracio(int punts, String nom, int saldoRecursos) {
        this.nom = nom;
        this.punts = punts;
        this.saldo = saldoRecursos;
    }

    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return nom;
    }

    @Override
    public int getPunts() {
        // TODO Auto-generated method stub
        return punts;
    }

    @Override
    public int getCapacitatMoviment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCapacitatMoviment'");
    }

    @Override
    public int getSaldoRecursos() {
        // TODO Auto-generated method stub
        return saldo;
    }

    @Override
    public String toString() {
        return "NauExploracio [nom=" + nom + ", punts=" + punts + ", saldo=" + saldo + "]";
    }

}
