package AbstactFactoryModifier;

import AbstactFactory.IProduitFactory;
import AbstactFactory.ProduitB;

public class ProduitFactory2 implements IProduitFactory {
    public AbstactFactory.ProduitA getProduitA() {
        return new ProduitA2();
    }
    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}
