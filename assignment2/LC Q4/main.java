package edu.northeastern.neelam;


public class main {
    public static void main(String[] args) {
        int[][] matrix = {{6,1,7},{2,4,1},{8,6,4}};
        main main = new main();
        main.print(matrix);
        System.out.println("");
        System.out.println("");

        int[][] result= main.rotation(matrix);
        main.print(result);
    }

    public void print(int[][] matrix) {
        int M = matrix.length, N = matrix[0].length;

        for (int m = 0; m < M; ++m){
            for (int n = 0; n < N; ++n) {
                System.out.print(matrix[m][n] + "   ");
            }
            System.out.println("");
        }

    }

    public int[][] rotation(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        return matrix;
    }
}
