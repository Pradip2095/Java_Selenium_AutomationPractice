package CursorsInCollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {


    public static void main(String[] args) {

        /**
         * 1. Iterator is used to iterate elements of any collection
         * 2.It's an Interface which has abstract methods
         * 3.It is used to iterate in foreword direction only for any collection.
         * 4.Declare: Iterator itr = list.iterator()
         * 5. It has 3 Methods
         *   i.hasNext(), ii.next(),  iii.remove()
         */
        ArrayList al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("B");

        String str = "";

        System.out.println("Elements in array list before deletion" + al);

        Iterator itr = al.iterator();

        while(itr.hasNext()){
            str = (String) itr.next();
            if(str.equals("B")){
                itr.remove();
            }
        }
        System.out.println("Elements in array list after deleting:" + al);
    }
}
