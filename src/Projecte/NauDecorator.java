package Projecte;

public abstract class NauDecorator implements Nau{

    private Nau nau;

    public NauDecorator(Nau nau) {
        this.nau = nau;
    }

    public String getDescripcio() {
        return nau.getDescripcio();
    }
}
