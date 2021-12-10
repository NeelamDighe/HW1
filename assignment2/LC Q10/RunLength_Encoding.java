import java.util.ArrayList;

public class RunLength_Encoding {

    public static void printRLE(String str)
    {
        int n = str.length();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            int count = 1;
            while (i < n - 1 &&
                    str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            result.add(String.valueOf(str.charAt(i)));
            if(count > 1) {
                result.add(String.valueOf(count));
            }


        }
        System.out.println(result.toString());

        String concatenatedString = "";

        for(String word: result ){

            concatenatedString += word;

        }

        System.out.println(concatenatedString);
    }

    public static void main(String[] args)
    {
        String str = "aabbcccd";
        printRLE(str);
    }
}