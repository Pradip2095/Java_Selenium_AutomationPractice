package Java_Basic_Program_For_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class String_Anagram_Code {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        // Convert both strings to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Convert strings into character arrays
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        // Sort both character arrays
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        if (Arrays.equals(s1Array, s2Array)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are Not Anagrams");
        }
    }
}
