package factory;

import product.bed.*;
import product.desk.*;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Bed createBed() {
        return new ModernBed(this);
    }

    @Override
    public Desk createDesk() {
        return new ModernDesk(this);
    }
}
