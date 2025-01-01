package product.desk;

import factory.FurnitureFactory;

public class ClassicDesk extends Desk{
    FurnitureFactory factory;

    // constructor
    public ClassicDesk(FurnitureFactory factory){
        this.factory = factory;
        System.out.println("Classic Desk is created");
    }
    @Override
    public void openTheDrawer() {
        System.out.println("Classic Desk drawer is OPEN");
    }
}
