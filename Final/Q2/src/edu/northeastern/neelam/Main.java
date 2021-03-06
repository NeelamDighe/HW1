package edu.northeastern.neelam;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(arr));
    }
    private static ArrayList<ArrayList<String>> groupAnagrams(String[] arr) {
        ArrayList<ArrayList<String>> listAnagrams = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : arr) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String anagram = String.valueOf(ch);
            if (!map.containsKey(anagram)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(anagram, list);
            } else {
                ArrayList<String> list = map.get(anagram);
                list.add(str);
                map.put(anagram, list);
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            listAnagrams.add(entry.getValue());
        }
        return listAnagrams;

    }
}


