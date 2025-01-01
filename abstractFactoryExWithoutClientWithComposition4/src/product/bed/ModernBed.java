package product.bed;

import factory.FurnitureFactory;

public class ModernBed extends Bed{

    // constructor
    public ModernBed(FurnitureFactory factory){
        super(factory);
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
