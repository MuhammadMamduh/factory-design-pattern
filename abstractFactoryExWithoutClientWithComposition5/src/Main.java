import factory.*;
import product.bed.Bed;
import product.bed.ClassicBed;
import product.desk.Desk;
import product.desk.ModernDesk;

// Client Code
public class Main {
    public static void main(String[] args) {
        System.out.println("Things will get better isA ;) ");
        System.out.println("NO client class - composition");

        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        FurnitureFactory modernFactory = new ClassicFurnitureFactory();

        Bed classicBed = new ClassicBed(classicFactory);
        Desk modernDesk = new ModernDesk(modernFactory);



    }
}