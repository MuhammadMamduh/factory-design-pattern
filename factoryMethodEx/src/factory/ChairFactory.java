package factory;

import product.Chair;
import product.Furniture;

public class ChairFactory extends FurnitureFactory {

    @Override
    public Furniture createFurniture() {
        return new Chair();
    }}
