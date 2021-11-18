package edu.northeastern.neelam;

public class Paypal implements PaymentStrategy{


    private String emailID;
    public Paypal(String email){
        this.emailID =email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paypal : $"+amount);

    }
}
