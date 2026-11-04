package Java_Basic_Program_For_Interview;

import java.util.*;

public class Palindrome_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int org_num = num; // store num as original number for comparison.
        int rev = 0;       // rev variable created to store the reverse number.
        int remainder;     //remainder variable is for store the remainder.
        while (num > 0) {
            //The remainder gives us the last digit.
            remainder = num % 10;

            //multiplying by 10 shifts the existing digits one position to the left, making space for the new digit.
            rev = rev * 10 + remainder;

            //Because num is an integer, the decimal part is removed.
            num = num / 10;
        }
        if (org_num == rev) {
            System.out.println("It is palindrome number: " + org_num);
        } else {
            System.out.println("It is not a palindrome number: " + org_num);
        }
    }
}    //Output = (This is palindrome number: 121)
