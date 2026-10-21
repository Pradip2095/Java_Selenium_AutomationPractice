package CursorsInCollectionPractice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorPractice {

    public static void main(String[] args) {

        /**
         * 1.ListIterator is specially designed for collection whose backend data structure is doubly linked list.
         * 2.It is used to iterate through collection both in forward & reverse direction.
         */

        LinkedList linkedList = new LinkedList();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("B");

        ListIterator listItr = linkedList.listIterator();

        while(listItr.hasNext()){
            System.out.println("Index:" + listItr.nextIndex());
            System.out.println("Element:" + listItr.next());
        }

        while(listItr.hasPrevious()){

            if(listItr.previous().equals("C")){
                listItr.add("L");
            }
            System.out.println();
        }

        System.out.println("Linked List: " + linkedList);
    }

}
