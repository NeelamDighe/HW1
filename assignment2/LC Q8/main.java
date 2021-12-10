package edu.northeastern.neelam;

public class main {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println();
        main abc = new main();
        boolean xyz = abc.isPalindrome(s);
        System.out.println(xyz);
    }

    public boolean isPalindrome(String a) {
        int left = 0;
        int right = a.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(a.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(a.charAt(right))) {
                right--;
                continue;
            }

            if (Character.toLowerCase(a.charAt(left)) != Character.toLowerCase(a.charAt(right)))
                return false;

            left++;
            right--;
        }

        return true;

    }
}
