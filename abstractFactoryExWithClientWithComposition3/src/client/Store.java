package client;

import factory.FurnitureFactory;
import product.bed.Bed;
import product.desk.Desk;

public class Store {

    FurnitureFactory factoryType;

    // constructor
    public Store(FurnitureFactory factoryType) {
        this.factoryType = factoryType;
    }


    public void orderFurniture(FurnitureFactory factoryType)
    {
        Bed bed = factoryType.createBed();
        Desk desk = factoryType.createDesk();
    }
}
