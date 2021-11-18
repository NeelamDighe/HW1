package edu.northeastern.neelam;

public class SportsCar extends CarDecorator{
    public SportsCar(Car c){
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" adding features of Sports Car.");
    }
}
