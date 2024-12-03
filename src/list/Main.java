package list;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de SocieteArrayList
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés à la société
        societe.ajouterEmploye(new Employe(1, 3, "Dupont", "Jean", "Informatique"));
        societe.ajouterEmploye(new Employe(2, 2, "Durand", "Marie", "Marketing"));
        societe.ajouterEmploye(new Employe(3, 1, "Martin", "Paul", "Informatique"));
        societe.ajouterEmploye(new Employe(4, 2, "Lemoine", "Claire", "Informatique"));
        societe.ajouterEmploye(new Employe(5, 3, "Bernard", "Marc", "Ressources humaines"));

        // Affichage des employés avant tout tri
        System.out.println("Employés avant tri : ");
        societe.displayEmploye();

        // Tri par ID
        System.out.println("\nTri par ID : ");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par département puis grade
        System.out.println("\nTri par département puis grade : ");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // Recherche d'un employé par nom
        System.out.println("\nRecherche de l'employé 'Dupont' : ");
        System.out.println(societe.rechercherEmploye("Dupont"));

        // Suppression d'un employé
        System.out.println("\nSuppression de l'employé 'Durand' : ");
        Employe employeASupprimer = new Employe(2, 2, "Durand", "Marie", "Marketing");
        societe.supprimerEmploye(employeASupprimer);
        societe.displayEmploye();
    }
}
