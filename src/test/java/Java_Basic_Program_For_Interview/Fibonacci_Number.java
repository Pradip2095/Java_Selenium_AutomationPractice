package Java_Basic_Program_For_Interview;

public class Fibonacci_Number {

    public static void main(String[] args) {

        int numberRange = 10;
        int a=0, b=1;

        for(int i=0; i<=numberRange; i++){
            System.out.print(a + " ");
            int next = a + b;
            a=b;
            b=next;
        }

    }

}
