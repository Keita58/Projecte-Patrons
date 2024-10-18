package Projecte;

public class Color extends NauDecorator {

    ColorEnum color;
    Nau nau;

    public Color(Nau nau, ColorEnum color) {
        super(nau);
        this.color = color;
        this.nau = nau;
    }

    public Nau getNau() {
        return nau;
    }

    public void setNau(Nau nau) {
        this.nau = nau;
    }

    @Override
    public String getNom() {
        return this.color.toString();
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
        return super.getDescripcio()+" de color "+this.color;
    }

    @Override
    public String toString() {
        return "Color [color=" + color + ", nau=" + nau + "]";
    }
}
