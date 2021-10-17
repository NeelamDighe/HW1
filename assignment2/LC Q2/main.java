package edu.northeastern.neelam;

public class main {
    public static void main(String args[]) {

        String wordsDict = "right is good good is better";
        String word1 = "right";
        String word2 = "good";

        System.out.print(distance(wordsDict, word1, word2));

    }

    static int distance(String wordsDict, String word1, String word2) {

        if (word1.equals(word2))
            return 0;

        String words[] = wordsDict.split(" ");


        int min_dist = (words.length) + 1;

        for (int index = 0;
             index < words.length; index++) {

            if (words[index].equals(word1)) {
                for (int search = 0;
                     search < words.length; search++) {
                    if (words[search].equals(word2)) {

                        int curr = Math.abs(index - search) - 1;


                        if (curr < min_dist) {
                            min_dist = curr;
                        }
                    }
                }
            }
        }

        return min_dist+1;
    }

}
