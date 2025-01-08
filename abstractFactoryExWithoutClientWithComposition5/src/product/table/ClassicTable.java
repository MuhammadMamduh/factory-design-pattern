package product.table;

import factory.FurnitureFactory;

public class ClassicTable extends Table {
    FurnitureFactory factory;

    // constructor
    public ClassicTable(FurnitureFactory factory){
        this.factory = factory;
    }
    @Override
    public void dismantle() {
        System.out.println("Creation");
        Table table = factory.createTable();
        System.out.println("Classic Table is dismantled");
    }
    @Override
    public void refurbish() {
        System.out.println("Creation");
        Table table = factory.createTable();
        System.out.println("Classic Table is refurbished");
    }
}
