package factory;

import product.bed.*;
import product.desk.*;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Bed createBed() {
        System.out.println("Modern Bed is created");
        return new ModernBed(this);
    }

    @Override
    public Desk createDesk() {
        System.out.println("Modern Desk is created");
        return new ModernDesk(this);
    }
}
