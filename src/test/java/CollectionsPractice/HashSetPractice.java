package CollectionsPractice;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add("Automation");//String
        hashSet.add("Automation");//String
        hashSet.add("G");//char = 2 byte
        hashSet.add(100);//int= 4 byte
        hashSet.add(null);//null
        hashSet.add(11.22f);//float = 4 byte
        hashSet.add(225.05);//double = 8 byte
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("B");

        System.out.println(hashSet);
    }
}
