package edu.northeastern.neelam;
import java.util.Arrays;

public class square_of_each_number {

    public static void pqr(int[] arr) {
        for(int i =0; i < arr.length; i++)
        {
            arr[i]  = arr[i] * arr[i];
        }

        Arrays.sort(arr);
        System.out.println("Square of Numbers-"+Arrays.toString(arr));
    }
}

