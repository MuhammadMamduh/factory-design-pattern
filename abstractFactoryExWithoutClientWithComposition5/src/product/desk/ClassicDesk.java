package product.desk;

import factory.FurnitureFactory;

public class ClassicDesk extends Desk{
    FurnitureFactory factory;

    // constructor
    public ClassicDesk(FurnitureFactory factory){
        this.factory = factory;
    }
    @Override
    public void openTheDrawer() {
        System.out.println("Creation");
        Desk desk = factory.createDesk();
        System.out.println("Classic Desk drawer is OPEN");
    }
}
