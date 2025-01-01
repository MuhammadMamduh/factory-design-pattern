package product.bed;

import factory.FurnitureFactory;

public class ModernBed extends Bed{
    FurnitureFactory factory;
    // constructor
    public ModernBed(FurnitureFactory factory){
        this.factory = factory;
        System.out.println("Modern Bed is created");
    }
    @Override
    public void fold() {
        System.out.println("Modern Bed is now FOLDED");
    }

    @Override
    public void unfold() {
        System.out.println("Modern Bed is now UNFOLDED");
    }
}
