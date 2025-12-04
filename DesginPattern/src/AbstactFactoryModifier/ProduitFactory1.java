package AbstactFactoryModifier;

import AbstactFactory.IProduitFactory;
import AbstactFactory.ProduitA1;
import AbstactFactory.ProduitB;
import AbstactFactory.ProduitB1;

public class ProduitFactory1 implements IProduitFactory {
    public AbstactFactory.ProduitA getProduitA() {
        return new ProduitA1();
    }
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
