package product.bed;

import factory.*;

public class ClassicBed extends Bed{
    FurnitureFactory factory;

    // constructor
    public ClassicBed(FurnitureFactory factory){
        this.factory = factory;
    }
    @Override
    public void fold() {
        System.out.println("Creation");
        Bed bed = factory.createBed();
        System.out.println("Then, Classic Bed is ALWAYS folded");
    }

    @Override
    public void unfold() {
        System.out.println("Creation");
        Bed bed = factory.createBed();
        System.out.println("Classic Bed can NEVER be unfolded");
    }
}
