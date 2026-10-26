package Java_Basic_Program_For_Interview;

import java.util.ArrayList;

public class PrintDuplicateCharactersFromString {

    public static void main(String[] args) {

        String input = "adidas";
        char[] arr = input.toCharArray();
        int count = 0;

        ArrayList<Character> arrlist = new ArrayList<Character>();
        for (int i = 0; i < arr.length; i++) {
            char ch = input.charAt(i);

            for (int j = 0; j < arr.length; j++) {
                if (input.charAt(j) != ch) {
                    continue;
                }
                count++;
            }
            if (!arrlist.contains(ch)) {
                if (count > 1 && ch != ' ') {
                    System.out.println("Character " + ch + ", count: " + count);
                    arrlist.add(ch);
                }
            }
            count = 0;
        }

    }
}