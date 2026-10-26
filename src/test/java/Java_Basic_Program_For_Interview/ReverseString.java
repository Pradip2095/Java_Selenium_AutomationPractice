package Java_Basic_Program_For_Interview;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        String value = sc.next();
        reverseString(value);
    }

    static void reverseString(String str){

        //logic:1 - Convert String to char array & use reverse for loop
//        char[] charArray = str.toCharArray();
//        for(int i=charArray.length-1; i>=0; i--){
//            //System.out.print(charArray[i]);
//            System.out.print(str.charAt(i));
//        }

        //login:2 - store in empty variable & print after for loop
//        char[] charArray = str.toCharArray();
//        String rev = "";
//        for(int i=charArray.length-1; i>=0; i--){
//            rev = rev+str.charAt(i);
//        }
//        System.out.println(rev);

        //logic:3 by using string buffer
//        StringBuffer sbf = new StringBuffer(str);
//        System.out.println(sbf.reverse());

        //logic:4 by using string builder
//        StringBuilder sb = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            sb.append(str.charAt(i));
//        }
//        System.out.println("reverse string: " + sb);


        char[] chArray = str.toCharArray();
        String rev = "";
        for(int i=chArray.length-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);

    }
}
