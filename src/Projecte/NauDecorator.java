package Projecte;

public abstract class NauDecorator implements Nau{

    private Nau nau;

    public NauDecorator(Nau nau) {
        this.nau = nau;
    }

    @Override
    public String getDescripcio() {
        return nau.getDescripcio();
    }

    @Override
    public Nau getNau() {
        return nau.getNau();
    }
}
