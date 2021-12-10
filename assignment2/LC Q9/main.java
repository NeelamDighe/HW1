package edu.northeastern.neelam;

public class main {

    public static void main(String[] args) {

        String s = "Alice    does not even   like bob";

        main abc = new main();
        String xyz = abc.reverseWords(s);
        System.out.println(xyz);

    }
    public String reverseWords(String s) {
        int i = 0;
        int length = s.length();
        int j = 0;
        String rev = null;
        String sub = null;
        while (i < length) {
            while (i < length && s.charAt(i) == ' ') i++;
            if (i == length)
                break;
            j = i + 1;
            while (j < length && s.charAt(j) != ' ') j++;
            sub = s.substring(i, j);
            rev = rev == null ? sub : sub + " " + rev;

            i = j + 1;
        }
        return rev;
    }


}
