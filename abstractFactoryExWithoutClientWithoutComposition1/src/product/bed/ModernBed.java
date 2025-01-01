package product.bed;

public class ModernBed implements Bed{
    @Override
    public void fold() {
        System.out.println("Modern Bed is now FOLDED");
    }

    @Override
    public void unfold() {
        System.out.println("Modern Bed is now UNFOLDED");
    }
}
