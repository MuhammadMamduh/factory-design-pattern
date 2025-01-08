package product.chair;

import factory.FurnitureFactory;

public class ModernChair extends Chair {
    FurnitureFactory factory;
    // constructor
    public ModernChair(FurnitureFactory factory){
        this.factory = factory;

    }
    @Override
    public void dismantle() {
        System.out.println("Creation");
        Chair chair = factory.createChair();
        System.out.println("Modern Bed is now dismantled");
    }

    @Override
    public void refurbish() {
        System.out.println("Creation");
        Chair chair = factory.createChair();
        System.out.println("Modern Bed is now refurbished");
    }
}
