import factory.*;
import product.bed.Bed;
import product.bed.ClassicBed;

// Client Code
public class Main {
    public static void main(String[] args) {
        System.out.println("Things will get better isA");
        System.out.println("COMPOSING THE FACTORY INSIDE THE PRODUCT");


        FurnitureFactory classicFactory = new ClassicFurnitureFactory();

        Bed classicBed = new ClassicBed(classicFactory);

//        classicBed.fold();



    }
}