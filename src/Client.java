public class Client {

    public static void main(String[] args) {

        Famille pere = new Personne("Mba Sophonie");
        Famille mere = new Personne("Mba Jocelyne");

        GroupeFamille famille = new GroupeFamille(pere, mere);

        Famille enfant1 = new Personne("Karel");
        Famille enfant2 = new Personne("Mika");
        Famille enfant3 = new Personne("Sophia");
        Famille enfant4 = new Personne("Sergio");
        Famille enfant5 = new Personne("Karl");
        Famille enfant6 = new Personne("Jaelyne");

        // AJOUT DES ENFANTS
        famille.ajouter(enfant1);
        famille.ajouter(enfant2);
        famille.ajouter(enfant3);
        famille.ajouter(enfant4);
        famille.ajouter(enfant5);
        famille.ajouter(enfant6);

        // AFFICHAGE
        famille.afficher();
        System.out.println(famille.getnom());

        //  RECHERCHE DESCENDANTE
        System.out.println("\n=== RECHERCHE DESCENDANTE ===");
        Famille resultat = famille.rechercher("Sophia");

        if (resultat != null) {
            System.out.println("Membre trouvé : " + resultat.getnom());
        } else {
            System.out.println("Membre non trouvé");
        }

        // RECHERCHE ASCENDANTE (Père / Mère)
        System.out.println("\n=== RECHERCHE ASCENDANTE ===");
        if (pere.getnom().equalsIgnoreCase("Mba Sophonie")) {
            System.out.println("Ascendant trouvé : " + pere.getnom());
        }

        // SUPPRESSION
        System.out.println("\n=== SUPPRESSION DE Mika ===");
        famille.supprimer("Mika");

        System.out.println("\n=== AFFICHAGE APRÈS SUPPRESSION ===");
        famille.afficher();
    }
}
