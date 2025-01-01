package product;

public class Bed extends Furniture {

    @Override
    public void paint() {
        System.out.println("Painting a bed");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling a bed");
    }

    @Override
    public void dismantle() {
        System.out.println("Dismantling a bed");
    }
}
