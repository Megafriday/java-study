package org.example;

public class CheckP {
    public static void main(String[] args) {
    }

    public boolean check(String data) {
        int counter = 0;
        for (char str : data.toCharArray()) {
            switch (str) {
                case '(' -> counter++;
                case ')' -> counter--;
            }
            if (counter < 0) return false;
        }
        return counter == 0;
    }
}
