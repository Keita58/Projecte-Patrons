public class NauPesada implements Nau {

    private String nom;
    private  int punts;
    private int saldo;
    private int capacitatMoviment;

    public NauPesada(int punts, String nom, int saldo) {
        this.nom = nom;
        this.punts = punts;
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
        //return capacitatMoviment;
        // TODO: Encara no implementem això (30/9)
        throw new UnsupportedOperationException("Unimplemented method 'getCapacitatMoviment'");
    }

    @Override
    public int getSaldoRecursos() {
        return saldo;    
    }

    @Override
    public String toString() {
        return "NauPesada [nom=" + nom + ", punts=" + punts + ", saldo=" + saldo + "]";
    }

}
