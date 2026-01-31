import java.util.List;

public abstract class Famille {

    public abstract void afficher();

    public abstract String getnom();

    private List<Famille> children;
}
