package product.chair;

import factory.*;

public class ClassicChair extends Chair {
    FurnitureFactory factory;

    // constructor
    public ClassicChair(FurnitureFactory factory){
        this.factory = factory;
    }
    @Override
    public void dismantle() {
        System.out.println("Creation");
        Chair chair = factory.createChair();
        System.out.println("Then, Classic Bed is now dismantled");
    }

    @Override
    public void refurbish() {
        System.out.println("Creation");
        Chair chair = factory.createChair();
        System.out.println("Classic Bed is now refurbished");
    }
}
