package Java_Basic_Program_For_Interview;

public class ReverseWordFromGivenStringSentence {

    public static void main(String[] args) {
        String inputString = "Arise! Awake! and stop not until the goal is reached";
        String[] strArray = inputString.split(" ");
        System.out.println(strArray.length);
        String rev = "";

        for (int i = strArray.length - 1; i >= 0; i--) {
            rev = rev + strArray[i] + " ";
        }
        System.out.print(rev.trim());
    }
}
