package Java_Basic_Program_For_Interview;

public class Palindrome {

    public static void main(String[] args) {

        String input = "madam";
        String revers = "";
        char[] charArray = input.toCharArray();

        for(int i=charArray.length-1; i>=0; i--){
            revers = revers + input.charAt(i);
        }
        if(revers.equals(input)){
            System.out.println("This is Palindrome string.");
        }
        else {
            System.out.println("This is not a Palindrome String.");
        }
    }
}
