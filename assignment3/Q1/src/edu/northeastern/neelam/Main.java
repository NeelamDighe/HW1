package edu.northeastern.neelam;

public class Main {
    public static void main(String[] args) {
        Psychiatristobject psychiatristobject = new Psychiatristobject();
        Happyobject happyobject = new Happyobject();
        Sadobject sadobject = new Sadobject();

        psychiatristobject.examine(happyobject);
        psychiatristobject.observe(happyobject);

        psychiatristobject.examine(sadobject);
        psychiatristobject.observe(sadobject);
    }
}
