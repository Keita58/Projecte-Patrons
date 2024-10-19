package Projecte;

public class Color extends NauDecorator implements Comparable<Nau> {

    ColorEnum color;
    Nau nau;

    public Color(Nau nau, ColorEnum color) {
        super(nau);
        this.color = color;
        this.nau = nau;
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
    public Nau getNau() {
        return super.getNau();
    }

    @Override
    public String getDescripcio() {
        return super.getDescripcio()+" de color "+this.color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color=" + color +
                ", nau=" + nau +
                '}';
    }
}
