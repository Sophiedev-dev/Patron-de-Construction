public class Personne extends Famille {

    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    @Override
    public void afficher() {
        System.out.println("Personne : " + nom);
    }

    @Override
    public String getnom() {
        return nom;
    }
}
