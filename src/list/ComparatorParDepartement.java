package list;

import java.util.Comparator;

public class ComparatorParDepartement implements Comparator<Employe> {

    public int compare(Employe o1, Employe o2) {
        return o1.getDepartement().compareTo(o2.getDepartement());
    }
}