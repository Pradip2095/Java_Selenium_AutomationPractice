package Java_Basic_Program_For_Interview;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfWordsInAStringUsingHashMap {


    public static void main(String[] args) {

        //Write a Java Program to count the number of words in a string using HashMap.
        String str = "This this is done by Pradip Gaikwad";
        String[] strArray = str.split("");
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strArray.length; i++) {

            if (map.containsKey(strArray[i])) {
                int count = map.get(strArray[i]);
                map.put(strArray[i], count + 1);
            } else {
                map.put(strArray[i], 1);
            }
        }

        System.out.println(map.size());
        System.out.println(map.toString());

    }
}
