package edu.northeastern.neelam;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        main abc = new main();
        Boolean xyz = abc.isIsomorphic(s,t);
        System.out.println(xyz);

    }

    private String isomorphicString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);

            if (!indexMapping.containsKey(c1)) {
                indexMapping.put(c1, i);
            }

            builder.append(Integer.toString(indexMapping.get(c1)));
            builder.append(" ");
        }
        return builder.toString();
    }

    public boolean isIsomorphic(String s, String t) {
        return isomorphicString(s).equals(isomorphicString(t));
    }
}
