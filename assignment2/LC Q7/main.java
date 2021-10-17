package edu.northeastern.neelam;

public class main {

    public static void main(String[] args) {

        String num1 = "11";
        String num2 = "123";


        main abc = new main();
        String xyz = abc.addStrings(num1, num2);
        System.out.println(xyz);

    }
    public String addStrings(String num1, String num2) {
        StringBuilder abc = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int d1 = (i >=0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >=0) ? num2.charAt(j) - '0' : 0;
            int sum = d1 + d2 + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            abc.append(sum);
        }
        if (carry == 1) {
            abc.append(carry);
        }
        return abc.reverse().toString();
    }
}
