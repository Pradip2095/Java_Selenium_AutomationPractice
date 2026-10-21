package MapPractice;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put("name", "Tester");
        hm.put("name", "Tester");
        hm.put("location", "Pune");
        hm.put("age", 30);
        hm.put(null, null);
        hm.put("empty", null);
        hm.put("percentage", 70.45);
        hm.put("role", "Tester");

        System.out.println(hm.entrySet());
        for(int i = 0; i<hm.size(); i++){

            System.out.println(hm.entrySet().iterator().next());
        }
    }
}
