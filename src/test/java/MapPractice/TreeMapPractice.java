package MapPractice;


import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {

        /* 1.Data stored in key value pair
         * 2.Keys should be Homogeneous
         * 3.Values can be Heterogeneous
         * 4.Keys can not be null
         * 5.values can be null
         * 4.If enter Heterogeneous key will get ClassCastException()
         * 5.Null key is not allow if insert then get NullPointerException()
         */
        TreeMap tm = new TreeMap<>();

        tm.put("banana", 5);
        tm.put("apple", 3);
        tm.put("banana", "fruit");
        tm.put("orange", 3.5);
        tm.put("coconut", 4);
        //tm.put(10, 4);// this throws ClassCastException
        //tm.put(null, 10); // this line throws NullPointerException

        System.out.println(tm.entrySet());
    }
}
