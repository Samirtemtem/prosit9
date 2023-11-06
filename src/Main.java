
import entities.SocieteArrayList;
import entities.Employe;

public class Main {
    public static void main(String[] args) {
                SocieteArrayList societe = new SocieteArrayList();

                Employe employe1 = new Employe(1, "Foulen", "Ben Foulen", "IT", 3);
                Employe employe2 = new Employe(2, "Saleh", "Ben Saleh", "ES", 2);
                Employe employe3 = new Employe(3, "Ghaith", "Ben Ghaith", "IT", 1);

                societe.ajouterEmploye(employe1);
                societe.ajouterEmploye(employe2);
                societe.ajouterEmploye(employe3);

                System.out.println("Liste des employés :");
                societe.displayEmploye();

                System.out.println("Recherche de l'employé avec le nom 'Ghaith'");
                boolean found = societe.rechercherEmploye("Ghaith");
                if (found) {
                    System.out.println("Employé trouvé !");
                } else {
                    System.out.println("Employé non trouvé.");
                }

                societe.supprimerEmploye(employe2);

                System.out.println("Liste des employés après suppression :");
                societe.displayEmploye();

                System.out.println("\nTri des employés par nom de département et grade :");
                societe.trierEmployeParNomDepartementEtGrade();

                System.out.println("Liste des employés après tri :");
                societe.displayEmploye();

    }
}