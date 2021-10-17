package edu.northeastern.neelam;

    public class main {
        public static void main(String[] args) {
            int i[] = {0, 3, 2, 0, 0,};
            main main = new main();
            main.move0(i);
            for(int a = 0; a < i.length ; a++) {
                System.out.print(i[a] + "  ");
            }

        }


        public void move0(int[] nums) {
            int n = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int x = nums[i];
                    nums[i] = nums[n];
                    nums[n++] = x;
                }
            }
        }
    }
