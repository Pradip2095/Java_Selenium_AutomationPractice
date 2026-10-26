package Java_Basic_Program_For_Interview;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for factorial: ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i=0; i<n; i++){ // i=0; 0<5, i=1; 1<5, i=2; 2<5, i=3; 3<5, i=4; 4<5
            fact = fact*(n-i);// 1*(5-0)=5, 5*(5-1)=20, 20*(5-2)=60, 60*(5-3)=120, 120*(5-4)=120
        }
        System.out.println(fact);
        sc.close();
    }
}
