package product;

public abstract class Furniture {

    public abstract void dismantle();
    public abstract void assemble();
    public abstract void paint();
    public void refurbish(){
        dismantle();
        assemble();
        paint();
        System.out.println("Refurbishing is done!");
        System.out.println("*********************");
    };
}
