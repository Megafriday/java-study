package org.example;

public class ReLoopStudy {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

        reloop(0);
    }

    public static void reloop(int i) {
        if (i >= 5) return;
        System.out.println(i);
        reloop(i + 1);
    }
}
