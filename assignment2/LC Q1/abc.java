package edu.northeastern.neelam;

public class abc {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        abc main = new abc();
        main.print(matrix);
        System.out.println("");
        System.out.println("");

        int[][] sol= main.transpose(matrix);
        main.print(sol);
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
    public int[][] transpose(int[][] matrix) {
        int M = matrix.length, N = matrix[0].length;
        int[][] sol = new int[N][M];
        for (int m = 0; m < M; ++m)
            for (int n = 0; n < N; ++n) {
                sol[n][m] = matrix[m][n];
            }
        return sol;
    }
}
