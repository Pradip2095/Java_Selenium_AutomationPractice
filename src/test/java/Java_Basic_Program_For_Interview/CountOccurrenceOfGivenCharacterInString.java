package Java_Basic_Program_For_Interview;

import java.util.Scanner;

public class CountOccurrenceOfGivenCharacterInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char which you want to check occurrence: ");
        char givenChar = sc.next().charAt(0);

        String input = "asaaafddaaasdfrweaa";
        char[] charArray = input.toCharArray();
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
           if(input.charAt(i)!=givenChar){
                continue;
           }
           count++;

        }
        System.out.println("Character: " + givenChar + "  " + "Count: " + count);

    }
}
