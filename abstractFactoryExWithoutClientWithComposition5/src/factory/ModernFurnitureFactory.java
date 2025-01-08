package factory;

import product.chair.*;
import product.table.*;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Modern Chair is created");
        return new ModernChair(this);
    }

    @Override
    public Table createTable() {
        System.out.println("Modern Table is created");
        return new ModernTable(this);
    }
}
