package Projecte;

public abstract class GalaxiaDecorator extends NauDecorator{

    Galaxia galaxia;
    Nau nau;
    
    public GalaxiaDecorator(Nau nau) {
        super(nau);
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
