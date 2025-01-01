import factory.BedFactory;
import factory.ChairFactory;
import factory.TableFactory;
import product.Chair;
import product.Furniture;

public class Main {
    public static void main(String[] args) {
        System.out.println("Al7amduilllah!");
        System.out.println("Things are now getting better!\n");

        TableFactory tableFactory = new TableFactory();
        BedFactory bedFactory = new BedFactory();
        ChairFactory chairFactory = new ChairFactory();

        Furniture chair = tableFactory.createFurniture();
        Furniture bed = bedFactory.createFurniture();
        Furniture table = chairFactory.createFurniture();

        chair.refurbish();
        bed.refurbish();
        table.refurbish();
    }
}