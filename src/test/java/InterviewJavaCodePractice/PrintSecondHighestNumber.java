package InterviewJavaCodePractice;

import java.util.Arrays;
import java.util.List;

public class PrintSecondHighestNumber {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 30, 40);
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        if(secondHighest == Integer.MIN_VALUE){
            System.out.println("Second highest number not found.");
        }
        else{
            System.out.println("Second highest number: " + secondHighest);
        }
    }
}
