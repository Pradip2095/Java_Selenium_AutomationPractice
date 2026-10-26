package Java_Basic_Program_For_Interview;

public class SwapTwoStringWithoutUsingThirdVariable {

    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "defg";
        System.out.println("S1: " + s1 + " " + "S2: " + s2);

       s1 =s1 +s2;//abcddefg
        s2 = s1.substring(0, (s1.length()-s2.length()));
        s1 = s1.substring(s2.length());

        System.out.println("s1: "+s1+" s2: "+s2);
    }
}
