package product.bed;

public class ModernBed implements Bed{

    // constructor
    public ModernBed(){
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
