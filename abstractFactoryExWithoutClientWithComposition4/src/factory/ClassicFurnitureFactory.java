package factory;

import product.bed.*;
import product.desk.*;

public class ClassicFurnitureFactory implements FurnitureFactory {


    @Override
    public Bed createBed() {
        return new ClassicBed(this);
    }

    @Override
    public Desk createDesk() {
        return new ClassicDesk();
    }
}
