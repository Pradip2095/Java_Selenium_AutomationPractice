package Java_Basic_Program_For_Interview;

public class PrintTheNumberInString {

    public static void main(String[] args) {

        String input = "abcd123asdf324dsaf342";//123324342
        input = input.replaceAll("[^\\d]", " ");
        input = input.replaceAll(" +", " ");
        System.out.println(input);
    }
}
