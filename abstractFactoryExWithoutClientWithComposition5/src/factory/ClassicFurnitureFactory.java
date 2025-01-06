package factory;

import product.bed.*;
import product.desk.*;

public class ClassicFurnitureFactory implements FurnitureFactory {


    @Override
    public Bed createBed() {
        System.out.println("Classic Bed is created");
        return new ClassicBed(this);
    }

    @Override
    public Desk createDesk() {
        System.out.println("Classic Desk is created");
        return new ClassicDesk(this); }
}
