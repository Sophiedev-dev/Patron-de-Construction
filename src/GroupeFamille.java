import java.util.ArrayList;
import java.util.List;

public class GroupeFamille extends Famille {

    private String nomPere;
    private String nomMere;
    private List<Famille> membres = new ArrayList<>();

    public GroupeFamille(Famille pere, Famille mere) {
        this.nomPere = pere.getnom();
        this.nomMere = mere.getnom();
    }

    @Override
    public void afficher() {
        System.out.println("Père : " + nomPere);
        System.out.println("Mère : " + nomMere);

        for (Famille membre : membres) {
            membre.afficher();
        }
    }

    public void ajouter(Famille membre) {
        membres.add(membre);
    }

    public void supprimer(String nom) {
        membres.removeIf(m -> m.getnom().equalsIgnoreCase(nom));
    }

    public Famille rechercher(String nom) {

        // Recherche dans les membres directs
        for (Famille membre : membres) {

            if (membre.getnom().equalsIgnoreCase(nom)) {
                return membre;
            }

            // Recherche récursive si c'est un groupe
            if (membre instanceof GroupeFamille) {
                Famille trouve = ((GroupeFamille) membre).rechercher(nom);
                if (trouve != null) {
                    return trouve;
                }
            }
        }
        return null;
    }


    @Override
    public String getnom() {
        return "Nom de la famille: "+ nomPere;
    }
}
