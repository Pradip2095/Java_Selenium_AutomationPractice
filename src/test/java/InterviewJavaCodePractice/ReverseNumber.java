package InterviewJavaCodePractice;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();//1234

//        //1. using Algorithm
//        int rev= 0;
//
//        while(num!=0){
//            rev=rev*10+ num%10; //0*10 + 1234%10=4, 4*10 + 123%10=43, 43*10 + 12%10=432, 432*10 + 1%10=4321
//            num = num/10; // 1234/10=123, 123/10=12, 12/10=1, 1/10=0
//
//        }
//        System.out.println("reverse Number is: " + rev);


        //Using StringBuffer class
//        StringBuffer sbc =  new StringBuffer(String.valueOf(num));
//        StringBuffer rev1 = sbc.reverse();
//        System.out.println("Reverse Number is: " + rev1);

        //Using StringBuilder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        System.out.print(sbl.reverse());
    }

}
