package edu.northeastern.neelam;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] n = {1, 2, 3};
        int k = 3;
        Continoussubarrays.output(n, k);

    }

    public class Continoussubarrays {
        public static int sumofSubarray(int[] nums, int k) {
            int count = 0;
            for (int start = 0; start < nums.length; start++) {
                for (int end = start + 1; end <= nums.length; end++) {
                    int sum = 0;
                    for (int i = start; i < end; i++)
                        sum += nums[i];
                    if (sum == k)
                        count++;
                }
            }
            return count;
        }

        public static void output(int[] n, int k){
            System.out.println("Input: n: " + Arrays.toString(n) + " ; k: " + k);
            System.out.println("Output: " + sumofSubarray(n, k));
            System.out.println();
        }
    }
}
