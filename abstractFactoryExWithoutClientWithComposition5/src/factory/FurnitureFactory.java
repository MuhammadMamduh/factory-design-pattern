package factory;

import product.chair.Chair;
import product.table.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
