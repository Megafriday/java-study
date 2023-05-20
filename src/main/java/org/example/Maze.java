package org.example;

import java.io.IOException;

public class Maze {
    public static void main(String[] args) throws IOException {
        record Position(int x, int y) {
        }
        int[][] map = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
        };

        var current = new Position(1, 1);
        var goal = new Position(4, 3);

        while (true) {
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {

                    if (x == current.x() && y == current.y()) {
                        System.out.print("o");
                    } else if (x == goal.x() && y == goal.y()) {
                        System.out.print("G");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            // goal判定
            if (current.equals(goal)) {
                System.out.println("GOAL!!!!!!!!!!!!!!!!!!!");
                break;
            }

            // key入力
            int key = System.in.read();
            var nextPosition = switch (key) {
                case 'w' -> new Position(current.x(), current.y() - 1);
                case 'a' -> new Position(current.x() - 1, current.y());
                case 's' -> new Position(current.x(), current.y() + 1);
                case 'd' -> new Position(current.x() + 1, current.y());
                default -> current;
            };

            // 押された方向が通路なら進む
            if (map[nextPosition.y()][nextPosition.x()] == 0) {
                current = nextPosition;
            }

            // Enter key を捨てる
            System.in.read();

        }
    }
}
