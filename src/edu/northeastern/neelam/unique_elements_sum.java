package edu.northeastern.neelam;

public class unique_elements_sum {
    public static void xyz(int[] arr) {

        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == arr.length) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of unique element is  " + sum);

    }
}

