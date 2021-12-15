package edu.northeastern.neelam;

public class Main {

    public static void main(String[] args) {
        int[][] room = {
                {0, 1, 0, 0},
                {-1, 1, 1, 0},
                {0, -1, 0, 0},
                {1, 0, 1, 1}
        };
        Roomba roomba = new Roomba(room);
    }
}
