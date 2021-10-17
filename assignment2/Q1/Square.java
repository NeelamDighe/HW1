package edu.northeastern.neelam;

public class Square extends Shape{
    private double side;

    public Square (double side){
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public Square (String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public String printShape() {
        return "Square has " + this.color + " color";
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
}


