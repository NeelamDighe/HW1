package edu.northeastern.neelam;

abstract class Moodyobject {
    abstract String getMood();
    abstract void expressFeelings();
    public void queryMood(){
        System.out.println("I feel " + getMood()+  " today!!");
    }

}
