package edu.northeastern.neelam;


    public class Roomba implements iRobot {
        final int[][] room;
        Direction direction;
        int row, column;

        Roomba(int[][] room) {
            this.room = room;
            this.direction = Direction.DOWN;
        }

        @Override
        public boolean move() {
            if (direction == Direction.DOWN) {
                if (room[row][column + 1] > room.length || room[row][column + 1] == -1) {
                    return false;
                }
                column++;
            } else if (direction == Direction.LEFT) {
                if (room[row - 1][column] < 0 || room[row - 1][column] == -1) {
                    return false;
                }
                row--;
            } else if (direction == Direction.RIGHT) {
                if (room[row + 1][column] > room.length || room[row + 1][column] == -1) {
                    return false;
                }
                row++;
            } else if (direction == Direction.UP) {
                if (room[row][column - 1] < 0 || room[row][column - 1] == -1) {
                    return false;
                }
                column--;
            }
            return true;
        }
        @Override
        public void clean() {
            room[row][column] = 1;

        }

        @Override
        public void turnRight() {
            this.direction = Direction.RIGHT;
        }

        @Override
        public void turnLeft() {
            this.direction = Direction.LEFT;
        }
    }

