package Java_Basic_Program_For_Interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayInString {

    public static void main(String[] args) {
        //Input
        String[] input = {"My", "Name", "is", "Pradip", "Gaikwad"};

        // By using toString method
        String output1 = Arrays.toString(input);
        System.out.println("By Using toString Method: " + output1);

        //By using StringBuilder
        StringBuilder output2 = new StringBuilder();
        for(String str: input){
            output2.append(str+ " ");
        }
        System.out.println("By StringBuilder append() method: "+output2.toString());

        //Using String.join method
        String output3 = String.join(" ", input);
        System.out.println("By String.join method: "+output3.toString());

        //Using Collectors.joining() method
        String output4 = Arrays.stream(input).collect(Collectors.joining());
        System.out.println("By Collectors.joining() method: "+output3.toString());


    }
}
