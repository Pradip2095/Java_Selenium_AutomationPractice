package InterviewJavaCodePractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCodePractice {


    public static void main(String[] args) {
        /* Reverse string using string builder */
       /* String input = "Pradip";
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        System.out.println("reverse string: " + sb);

        //Logic -2
        char[] charArray = input.toCharArray();
        for(int i=charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }*/

        //Logic -3
        String str = "Automation";
        String rev= "";
        int leng = str.length();
        for(int i=leng-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Logic-3 Reverce String: " + rev);

        //Logic- 4 Using a array


/********************************************************************************************/

        /*Count character occurrences.*/
        String input1 = "pradipgaikwad";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : input1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
/********************************************************************************************/

        /*Find duplicate characters and numbers.*/


    }
}
