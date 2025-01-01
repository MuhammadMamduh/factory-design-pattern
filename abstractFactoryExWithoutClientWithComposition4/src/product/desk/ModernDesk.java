package product.desk;

public class ModernDesk implements Desk{

    // constructor
    public ModernDesk(){
        System.out.println("Modern Desk is created");
    }
    @Override
    public void openTheDrawer() {
        System.out.println("Modern Desk drawer is OPEN");
    }
}
