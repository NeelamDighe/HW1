    package edu.northeastern.neelam;

    import java.util.HashMap;

    public class ransomeNote {
        public static void mno(String ransomNote, String magazine ) {

            HashMap<Character, Integer> hasMap = new HashMap<>();


            for(int i = 0; i < ransomNote.length(); i++) {
                char currentChar = ransomNote.charAt(i);
                hasMap.putIfAbsent(ransomNote.charAt(i), 0 );
                hasMap.put(currentChar, hasMap.get(currentChar) +1);

            }

            //System.out.println("**** first map " + hasMap.toString());

            HashMap<Character, Integer> magCharMap = new HashMap<>()      ;

            for(int i=0;i< magazine.length();i++ ){
                char currentChar = magazine.charAt(i);
                magCharMap.putIfAbsent(currentChar, 0);
                magCharMap.put(currentChar, magCharMap.get(currentChar)+1) ;


            }

            boolean isValid = true;
            for(int i= 0; i < ransomNote.length(); i++) {
                int countInRan = hasMap.get(ransomNote.charAt(i));
                int countInMag = magCharMap.containsKey(ransomNote.charAt(i)) ? magCharMap.get(ransomNote.charAt(i)) : 0;
                if(countInMag - countInRan < 0) {

                    isValid = false;
                }





            }

            System.out.println("****  " + isValid);





        }

    }
