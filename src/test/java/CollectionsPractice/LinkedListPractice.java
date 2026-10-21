package CollectionsPractice;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        /* Linked List Practice*/
        LinkedList linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add("P");
        linkedList.add("FUTURE Automation");
        linkedList.add("FUTURE Automation");
        linkedList.add(25.22);
        linkedList.add(null);

        System.out.println(linkedList.get(3));

        for(int i=0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
    }
}
