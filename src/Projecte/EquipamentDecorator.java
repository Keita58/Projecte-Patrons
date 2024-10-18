package Projecte;

public class EquipamentDecorator extends NauDecorator{

    Equipament equipament;
    Nau nau;

    public EquipamentDecorator(Nau nau, Equipament equipament) {
        super(nau);
        this.equipament=equipament;
        this.nau = nau;
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
        return nau.getCapacitatMoviment();
    }

    @Override
    public int getSaldoRecursos() {
        return nau.getSaldoRecursos();
    }

    @Override
    public String getDescripcio() {
        return super.getDescripcio() + posarEquipament();
    }

    public String posarEquipament() {
        return " amb "+equipament;
    }

    public Equipament getEquipament() {
        return equipament;
    }
}
