package factory;

import product.bed.Bed;
import product.desk.Desk;

public interface FurnitureFactory {
    Bed createBed();
    Desk createDesk();
}
