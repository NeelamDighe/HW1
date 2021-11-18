package edu.northeastern.neelam;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car c){
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" adding features of Luxury Car.");
    }
}
