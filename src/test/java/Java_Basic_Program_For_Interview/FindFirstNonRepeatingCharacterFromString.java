package Java_Basic_Program_For_Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacterFromString {

    //Find the first non-repeating character in a string
    public static void main(String[] args) {

        // Approach:1 Using LinkedHashMap
        String input = "swiss";
        char[] charArray = input.toCharArray();

        Map<Character, Integer> lhMap = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < charArray.length; i++) {
            char ch = input.charAt(i);
            lhMap.put(ch, lhMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : lhMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeating character found");

        /******************************************/
        // Approach:2 Using two loops

        String str = "swiss";
        char[] chArray = str.toCharArray();

        for(int i=0; i<chArray.length;  i++){
            boolean repeated = false;

            for(int j=0; j<chArray.length; j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                System.out.println("First not repeated character: " + str.charAt(i));
                return;
            }
        }
        System.out.println("No non repeated character");

    }
}

