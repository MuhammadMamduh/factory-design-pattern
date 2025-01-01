package product.desk;

public class ClassicDesk implements Desk{

    // constructor
    public ClassicDesk(){
        System.out.println("Classic Desk is created");
    }
    @Override
    public void openTheDrawer() {
        System.out.println("Classic Desk drawer is OPEN");
    }
}
