package Java_Basic_Program_For_Interview;

import java.util.Scanner;

public class Number_Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check Reverse: ");
        int num = sc.nextInt();

        int rev = 0;
        int remainder;

        while(num>0){
            remainder = num%10;
            rev = rev *10 + remainder;
            num = num/10;
        }
        System.out.println("Reverse Number is: " + rev);

    }
}
