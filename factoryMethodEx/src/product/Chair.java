package product;

public class Chair extends Furniture{

    @Override
    public void paint() {
        System.out.println("Painting the chair");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the chair");
    }

    @Override
    public void dismantle() {
        System.out.println("Dismantling the chair");
    }
}
