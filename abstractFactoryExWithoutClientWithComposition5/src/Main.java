import factory.*;
import product.chair.Chair;
import product.chair.ClassicChair;
import product.chair.ModernChair;
import product.table.ClassicTable;
import product.table.Table;
import product.table.ModernTable;

// Client Code
public class Main {
    public static void main(String[] args) {
        System.out.println("Things will get better isA ;) ");
        System.out.println("NO independent client class - composition");

        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        FurnitureFactory modernFactory = new ClassicFurnitureFactory();

        Chair classicChair = new ClassicChair(classicFactory);
        classicChair.dismantle();
        System.out.println(" ****** ");

        Chair modernChair = new ModernChair(modernFactory);
        modernChair.dismantle();
        System.out.println(" ****** ");

        Table modernTable = new ModernTable(modernFactory);
        modernTable.refurbish();
        System.out.println(" ****** ");

        Table classicTable = new ClassicTable(classicFactory);
        classicTable.refurbish();
        System.out.println(" ****** ");
    }
}