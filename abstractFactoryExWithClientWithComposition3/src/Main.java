import client.Store;
import factory.*;

// Client Code
public class Main {
    public static void main(String[] args) {
        System.out.println("Things will get better isA");


        FurnitureFactory classicFactory = new ClassicFurnitureFactory();

        Store store = new Store(classicFactory);

        store.orderFurniture(classicFactory);



    }
}