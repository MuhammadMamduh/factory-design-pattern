package product;

public class Table  extends Furniture{

    @Override
    public void paint() {
        System.out.println("Painting the table");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the table");
    }

    @Override
    public void dismantle() {
        System.out.println("Dismantling the table");
    }
}
