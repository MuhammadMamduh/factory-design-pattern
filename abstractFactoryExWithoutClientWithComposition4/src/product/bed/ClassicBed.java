package product.bed;

import factory.*;

public class ClassicBed extends Bed{

    // constructor
    public ClassicBed(FurnitureFactory factory){
        super(factory);
        System.out.println("Classic Bed is created");
    }
    @Override
    public void fold() {
        System.out.println("Classic Bed is ALWAYS folded");
    }

    @Override
    public void unfold() {
        System.out.println("Classic Bed can NEVER be unfolded");
    }
}
