    package edu.northeastern.neelam;

    public class first_nonrepeated_integer {
        public static void efg(int[] arr) {

        int result = -1;

            for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == arr.length) {
                result = i;
                break;
                //sum += arr[i];
            }
        }
            if (result == -1) {
            System.out.println("No such element");

        } else {
            System.out.println("First non repeated number is  " + arr[result]);
        }

    }
    }


