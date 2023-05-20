package org.example;

public class LoopStudy {
    public static void main(String[] args) {
        var data = "abbcccaaabccccc";
        var result = new StringBuilder();
        char prev = 0;  // 文字コードとして存在しない

        for (char ch : data.toCharArray()) {
            if (ch == prev) continue;
            prev = ch;
            result.append(ch);
        }

        System.out.println(data);
        System.out.println(result);

    }
}
