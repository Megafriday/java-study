package org.example;

public class EnumStudy {
    public static void main(String[] args) {
        Fruit fruit_type = Fruit.Orange;

        switch (fruit_type) {
            case Orange -> System.out.println("おいしいみかん");
            case Apple -> System.out.println("りんごたべたい");
            case Melon -> System.out.println("メロンがすべて");
        }
    }

    protected enum Fruit {
        Orange,
        Apple,
        Melon
    }
}
