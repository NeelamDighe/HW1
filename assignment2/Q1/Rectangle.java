package edu.northeastern.neelam;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String printShape() {
        return "Rectangle has " + this.color + " color.";
    }
}
