package org.example;

public class CheckFloat {
    public static void main(String[] args) {
        System.out.println(check(""));      // false
        System.out.println(check("012"));   // false
        System.out.println(check(".12"));   // false
        System.out.println(check("12."));   // false
        System.out.println(check("1.2.3")); // false
        System.out.println(check("1..3"));  // false
        System.out.println(check("0"));     // true
        System.out.println(check("12"));    // true
        System.out.println(check("12.3"));  // true
        System.out.println(check("0.3"));   // true
        System.out.println(check("12.3"));  // true
    }

    static boolean check(String data) {
        var state = FloatState.START;
        for (char ch : data.toCharArray()) {
            switch (state) {
                case START -> {
                    if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                }

                case ZERO -> {
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                }

                case INT -> {
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else if (ch >= '0' && ch <= '9') {
                        // do nothing
                    } else {
                        return false;
                    }

                }

                case FRAC_START -> {
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.FRAC;
                    } else {
                        return false;
                    }

                }

                case FRAC -> {
                    if (ch >= '0' && ch <= '9') {
                        // do nothing
                    } else {
                        return false;
                    }
                }

            }

        }
        return switch (state) {
            case INT, ZERO, FRAC -> true;
            default -> false;
        };
    }

    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO
    }
}
