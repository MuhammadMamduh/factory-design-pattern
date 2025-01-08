package factory;

import product.chair.*;
import product.table.*;

public class ClassicFurnitureFactory implements FurnitureFactory {


    @Override
    public Chair createChair() {
        System.out.println("Classic Chair is created");
        return new ClassicChair(this);
    }

    @Override
    public Table createTable() {
        System.out.println("Classic Table is created");
        return new ClassicTable(this); }
}
