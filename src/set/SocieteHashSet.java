package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SocieteHashSet implements IDepartement<Departement> {

    Set<Departement> departements = new HashSet<>();


    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }


    public boolean rechercherDepartement(String nom) {
//        Iterator<Departement> it = departements.iterator();
//        while (it.hasNext()) {
//            Departement d = it.next();
//            if (d.getNom().equals(nom))
//                return true;
//        }

        for (Departement d : departements) {
            if (d.getNom().equals(nom))
                return true;
        }

        return false;
    }


    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }


    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }


    public void displayDepartement() {
        System.out.println(departements);
    }


    public TreeSet<Departement> trierDepartementById() {
        //Comparable
//        TreeSet<Departement> tree = new TreeSet<>(departements);
//        return tree;
//
//        //Comparator
        TreeSet<Departement> tree = new TreeSet<>(new ComparatorParId());
        tree.addAll(departements);
        return tree;
    }
}