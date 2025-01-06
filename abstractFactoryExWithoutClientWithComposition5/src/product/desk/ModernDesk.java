package product.desk;

import factory.FurnitureFactory;

public class ModernDesk extends Desk{
    FurnitureFactory factory;

    // constructor
    public ModernDesk(FurnitureFactory factory){
        this.factory = factory;
    }
    @Override
    public void openTheDrawer() {
        System.out.println("Creation");
        Desk desk = factory.createDesk();
        System.out.println("Modern Desk drawer is OPEN");
    }
}
