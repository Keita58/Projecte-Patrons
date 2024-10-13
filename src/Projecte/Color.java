package Projecte;

public class Color extends NauDecorator {

    ColorEnum color;

    public Color(Nau nau, ColorEnum color) {
        super(nau);
        this.color = color;
    }

    @Override
    public String getNom() {
        return this.color.toString();
    }

    @Override
    public int getPunts() {
        return 0;
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
}
