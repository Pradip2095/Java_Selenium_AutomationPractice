package MapPractice;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {

    public static void main(String[] args) {

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("name", "Automation");
        lhm.put("name", "Automation");
        lhm.put("char", "H");
        lhm.put("age", 30);
        lhm.put("B", null);
        lhm.put("A", "Automation");
        lhm.put("percent", 88.20);

        System.out.println(lhm.entrySet());


    }
}
