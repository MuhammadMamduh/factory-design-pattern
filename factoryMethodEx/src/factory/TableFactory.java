package factory;

import product.Furniture;
import product.Table;

public class TableFactory extends FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
