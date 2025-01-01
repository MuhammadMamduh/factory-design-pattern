package client;

import factory.FurnitureFactory;
import factory.ModernFurnitureFactory;

public class ModernStore extends Store {
    @Override
    public FurnitureFactory selectFactory() {
        return new ModernFurnitureFactory();
    }
}
