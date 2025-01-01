package client;

import factory.*;
import product.bed.Bed;
import product.bed.ClassicBed;
import product.desk.Desk;

// Client Code
public class Main {
    public static void main(String[] args) {
        System.out.println("Things will get better isA");

        FurnitureFactory classicFactory = new ClassicFurnitureFactory();

        Bed classicBed = classicFactory.createBed();
        Desk classicDesk = classicFactory.createDesk();

        classicBed.fold();
        classicBed.unfold();
        classicDesk.openTheDrawer();



    }
}