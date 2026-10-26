package Java_Basic_Program_For_Interview;

public class ConvertStringToInteger {

    public static void main(String[] args) {
        String input = "12314";

        //Convert String ti int
        int output = Integer.parseInt(input);
        System.out.println(output);

        //Convert int to String
        String outputStr = String.valueOf(output);
        System.out.println(outputStr);
    }
}
