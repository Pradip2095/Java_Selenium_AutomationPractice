package ExceptionHandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionPractice {

    private static final Logger log = LoggerFactory.getLogger(ExceptionPractice.class);

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");

    }








}
