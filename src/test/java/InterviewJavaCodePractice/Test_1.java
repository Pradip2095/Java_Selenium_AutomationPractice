package InterviewJavaCodePractice;

public class Test_1 {


    public static void main(String[] args) {

        /* This is the code reverse print the sentence.*/
        /*String value = "I am working with on banking domain";
        String reverse = "";
        String[] arr = value.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse = reverse + arr[i].concat(" ");
        }
        System.out.println(reverse);*/


/************************************************************************/

        /* Print reverse string */

        String input = "Paper";
//        String rev = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//            rev = rev + input.charAt(i);
//        }
//        System.out.println("Reverse string: " + rev);
//
//        //String Builder
//        StringBuilder sb = new StringBuilder();
//        for(int i=input.length()-1; i>=0; i--){
//           sb.append(input.charAt(i));
//        }
//        System.out.println("Reverse using string builder: " + sb);

        //String Buffer
        StringBuffer sbb = new StringBuffer(input);
        System.out.println(sbb.reverse());

/************************************************************************/
        /* palindrome code*/
        /*String mad = "rotator";
        String bad = "";
        for(int i=mad.length()-1; i>=0; i--){
            bad = bad+mad.charAt(i);
        }
        if(mad.equals(bad)){
            System.out.println("String is palindrome" + mad);
        }*/

/************************************************************************/

        /*Reverse Number*/
        int number = 15302;
        StringBuilder sbi = new StringBuilder();

    }
}
