package AbstactFactoryModifier;

import AbstactFactory.ProduitA;
import AbstactFactory.ProduitB;

public interface IProduitFactory {
    public ProduitA getProduitA();
    public ProduitB getProduitB();
}
