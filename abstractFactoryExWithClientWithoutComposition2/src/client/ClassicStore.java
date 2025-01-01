package client;

import factory.ClassicFurnitureFactory;
import factory.FurnitureFactory;

public class ClassicStore extends Store {

    @Override
    public FurnitureFactory selectFactory() {
        return new ClassicFurnitureFactory();
    }
}
