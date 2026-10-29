package InterviewJavaCodePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValueFromList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        Set<Integer> uniques = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();

        //Unique stores value encountered for the first time
        //duplicates stores value that appear more than once
        for(int num : numbers){
            if(!uniques.add(num)){
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate Values Are: " + duplicates);

    }
}
