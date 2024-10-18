package Projecte;

public class GalaxiaDecorator extends NauDecorator{

    Galaxia galaxia;
    Nau nau;
    
    public GalaxiaDecorator(Nau nau) {
        super(nau);
        this.nau = nau;
    }

    @Override
    public String getNom() {
        return "";
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
        return 0;
    }

    @Override
    public String getDescripcio() {
        return super.getDescripcio() + getGalaxia();
    }

    public String getGalaxia() {
        return " amb " + galaxia;
    }

    public Nau getNau() {
        return nau;
    }
}
