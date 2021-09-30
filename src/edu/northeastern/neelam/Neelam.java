package edu.northeastern.neelam;

import java.util.Arrays;

public class Neelam {

    public static void main(String[] args) {

        String input = "a1c2d1f5t";

        boolean isValid = true;
        for(int i=0; i < input.length() -1; i++) {
            if (Character.isDigit(input.charAt(i)) == Character.isDigit(input.charAt(i+1))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            System.out.println("**** input is valid");
        } else {
            System.out.println("**** Input is not valid");
        }


    }
}