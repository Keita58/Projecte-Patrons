package Projecte;

public class EquipamentDecorator extends NauDecorator implements Comparable<Nau>{

    Equipament equipament;
    Nau nau;

    public EquipamentDecorator(Nau nau, Equipament equipament) {
        super(nau);
        this.equipament = equipament;
        this.nau = nau;
    }

    @Override
    public Nau getNau() {
        return super.getNau();
    }

    public void setNau(Nau nau) {
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

    @Override
    public int compareTo(Nau o) {
        return this.getNom().compareTo(o.getNom());
    }

    @Override
    public String toString() {
        return "EquipamentDecorator{" +
                "equipament=" + equipament +
                ", nau=" + nau +
                '}';
    }
}
