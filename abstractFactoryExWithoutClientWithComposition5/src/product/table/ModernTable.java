package product.table;

import factory.FurnitureFactory;

public class ModernTable extends Table {
    FurnitureFactory factory;

    // constructor
    public ModernTable(FurnitureFactory factory){
        this.factory = factory;
    }
    @Override
    public void dismantle() {
        System.out.println("Creation");
        Table table = factory.createTable();
        System.out.println("Modern Table drawer is dismantled");
    }    public void refurbish() {
        System.out.println("Creation");
        Table table = factory.createTable();
        System.out.println("Modern Table drawer is refurbished");
    }
}
