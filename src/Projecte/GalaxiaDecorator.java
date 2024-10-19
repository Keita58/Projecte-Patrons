package Projecte;

public class GalaxiaDecorator extends NauDecorator implements Comparable<Nau>{

    Galaxia galaxia;
    Nau nau;
    
    public GalaxiaDecorator(Nau nau, Galaxia galaxia) {
        super(nau);
        this.nau = nau;
        this.galaxia = galaxia;
    }

    @Override
    public int compareTo(Nau o) {
        return this.nau.getNom().compareTo(o.getNom());
    }

    @Override
    public String getNom() {
        return nau.getNom();
    }

    @Override
    public double getPunts() {
        return nau.getPunts();
    }

    @Override
    public int getCapacitatMoviment() {
        return 0;
    }

    @Override
    public int getSaldoRecursos() {
        return nau.getSaldoRecursos();
    }

    @Override
    public String getDescripcio() {
        return super.getDescripcio() + getGalaxia();
    }

    public String getGalaxia() {
        return " amb " + galaxia;
    }

    @Override
    public Nau getNau() {
        return super.getNau();
    }

    @Override
    public String toString() {
        return "GalaxiaDecorator{" +
                "galaxia=" + galaxia +
                ", nau=" + nau +
                '}';
    }
}
