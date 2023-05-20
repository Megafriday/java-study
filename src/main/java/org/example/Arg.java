package org.example;

public class Arg {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        Integer[] b = new Integer[]{1, 2, 3};

//        test(a);       //不適合な型: int[]をjava.lang.Object[]に変換できません:
        test(b); //実行可能
    }

    public static void test(Object[] a) {
        System.out.println("きた");
    }
}
