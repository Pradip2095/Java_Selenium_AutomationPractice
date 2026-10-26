package Java_Basic_Program_For_Interview;

import java.util.Scanner;

public class DisplayAllPrimeNumbersFrom1ToN {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter prime number 1 to N range: ");
        int n = sc.nextInt();
        primeNumber(n);
    }

    public static void primeNumber(int range) {
       {
            int x,y,flag;
            for (x = 1; x <= range; x++) {
                if (x == 1 || x == 0)
                    continue;

                flag = 1;
                for (y = 2; y <= x / 2; ++y) {
                    if (x % y == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.println(x + " ");
                }
            }

        }


        //Logic - 2
        for (int x = 2; x <= range; x++) {

            boolean isPrime = true;

            for (int y = 2; y * y <= x; y++) {

                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(x);
            }
        }

    }
}
