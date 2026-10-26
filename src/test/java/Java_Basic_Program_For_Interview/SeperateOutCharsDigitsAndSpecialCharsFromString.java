package Java_Basic_Program_For_Interview;

public class SeperateOutCharsDigitsAndSpecialCharsFromString {

    public static void main(String[] args) {
        String str = "abcd@defe1231+wre^&213234as*#hdc4645";

        StringBuffer characters = new StringBuffer();
        StringBuffer digits = new StringBuffer();
        StringBuffer specialChars = new StringBuffer();

        for(int i=0; i<str.toCharArray().length; i++){
            if(Character.isAlphabetic(str.charAt(i))){
                characters.append(str.charAt(i));
            }
            else if(Character.isDigit(str.charAt(i))){
                digits.append(str.charAt(i));
            }
            else{
                specialChars.append(str.charAt(i));
            }
        }
        System.out.println("Characters: " + characters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}
