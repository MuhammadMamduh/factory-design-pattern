package product.bed;

import factory.FurnitureFactory;

public class ModernBed extends Bed{
    FurnitureFactory factory;
    // constructor
    public ModernBed(FurnitureFactory factory){
        this.factory = factory;

    }
    @Override
    public void fold() {
        System.out.println("Creation");
        Bed bed = factory.createBed();
        System.out.println("Modern Bed is now FOLDED");
    }

    @Override
    public void unfold() {
        System.out.println("Creation");
        Bed bed = factory.createBed();
        System.out.println("Modern Bed is now UNFOLDED");
    }
}
