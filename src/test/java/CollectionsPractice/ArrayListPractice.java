package CollectionsPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListPractice {

    public static void main(String[] args) {

        /*   Array List Practice */
        ArrayList arrayList = new ArrayList<>();

        arrayList.add("pradip");
        arrayList.add(123);
        arrayList.add(120.22);
        arrayList.add("c");
        arrayList.add("Automation");
        arrayList.add("Automation");
        arrayList.add(null);

        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

    }
}
