package factory;

import product.Bed;
import product.Furniture;

public class BedFactory extends FurnitureFactory {

    @Override
    public Furniture createFurniture() {
        return new Bed();
    }
}
