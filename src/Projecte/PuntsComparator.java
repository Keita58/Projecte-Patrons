package Projecte;

import java.util.Comparator;

public class PuntsComparator implements Comparator<Nau> {

    public int compare(Nau a, Nau b) {
        return Double.compare(b.getPunts(), a.getPunts());
    }
}
