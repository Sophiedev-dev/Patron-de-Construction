package AbstactFactoryModifier;

import AbstactFactory.IProduitFactory;
import AbstactFactory.ProduitB;

public class ProduitFactory3 implements IProduitFactory {
    public AbstactFactory.ProduitA getProduitA() {
        return new ProduitA3();
    }
    public ProduitB getProduitB() {
        return new ProduitB3();
    }
}
