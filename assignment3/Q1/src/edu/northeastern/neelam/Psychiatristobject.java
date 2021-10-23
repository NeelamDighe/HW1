package edu.northeastern.neelam;

public class Psychiatristobject {

    public void examine(Moodyobject moodyObject) {

        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }

    public void observe(Moodyobject moodyobject) {


        moodyobject.expressFeelings();
        System.out.println("Observation: " +moodyobject.toString());
    }


}
