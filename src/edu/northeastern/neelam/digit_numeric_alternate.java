package edu.northeastern.neelam;

public class digit_numeric_alternate {
    public static void abc(String input) {
    boolean isValid = true;
        for(int i=0; i < input.length() -1; i++) {
        if (Character.isDigit(input.charAt(i)) == Character.isDigit(input.charAt(i+1))) {
            isValid = false;
            break;
        }
    }
        if(isValid) {
        System.out.println("**** True");
    } else {
        System.out.println("**** False");
    }


}
}
