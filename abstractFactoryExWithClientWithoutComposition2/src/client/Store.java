package client;

import factory.FurnitureFactory;
import product.bed.Bed;
import product.desk.Desk;

public abstract class Store {

    abstract FurnitureFactory selectFactory();


    public void orderFurniture()
    {
        FurnitureFactory factory = selectFactory();

        Bed bed = factory.createBed();
        Desk desk = factory.createDesk();
    }
}
