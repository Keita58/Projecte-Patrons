package Projecte;

public abstract class EquipamentDecorator extends NauDecorator{

    Equipament equipament;
    public EquipamentDecorator(Nau nau, Equipament equipament) {
        super(nau);
        this.equipament=equipament;
    }
    @Override
    public String getDescripcio() {
        return super.getDescripcio()+getEquipament();
    }
    public String getEquipament() {
        return " amb "+equipament;
    }
}
