package CollectionsPractice;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("A");
        lhs.add(10);
        lhs.add("Animal");
        lhs.add(null);
        lhs.add(12.55);
        lhs.add("Animal");

        System.out.println(lhs);
    }
}
