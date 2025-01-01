package product.bed;

import factory.FurnitureFactory;

public abstract class Bed {
    FurnitureFactory factory;

    public Bed(FurnitureFactory factory)
    {
        this.factory = factory;
    }

    public void fold(){};
    public void unfold(){};
}
