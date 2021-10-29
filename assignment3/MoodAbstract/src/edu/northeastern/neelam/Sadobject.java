package edu.northeastern.neelam;

public class Sadobject extends  Moodyobject {
    public String getMood() {

        return "Sad";
    }

    public void expressFeelings() {
        System.out.println("`waah` ‘boo hoo’ ‘weep’ ‘sob’");

    }

    public String toString() {
        return "Subject cries a lot";
    }
}