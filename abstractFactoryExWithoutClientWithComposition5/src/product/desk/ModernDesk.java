package product.desk;

import factory.FurnitureFactory;

public class ModernDesk extends Desk{
    FurnitureFactory factory;

    // constructor
    public ModernDesk(FurnitureFactory factory){
        this.factory = factory;
        System.out.println("Modern Desk is created");
    }
    @Override
    public void openTheDrawer() {
        System.out.println("Modern Desk drawer is OPEN");
    }
}
