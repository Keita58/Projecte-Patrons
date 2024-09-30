public class NauPesada implements Nau {

    private  int punts;
    private String nom;
    private int saldo;
    private int capacitatMoviment;
    public NauPesada(int punts, String nom, int saldo) {
        this.nom = nom;
        this.punts = punts;
        this.saldo = saldo;
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
        return capacitatMoviment;
    }

    @Override
    public int getSaldoRecursos() {
        // TODO Auto-generated method stub
        return saldo;    
    }

    @Override
    public String toString() {
        return "NauPesada [punts=" + punts + ", nom=" + nom + ", saldo=" + saldo + "]";
    }

}
