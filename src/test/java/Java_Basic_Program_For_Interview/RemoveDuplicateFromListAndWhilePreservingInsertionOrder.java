package Java_Basic_Program_For_Interview;

import java.util.*;

public class RemoveDuplicateFromListAndWhilePreservingInsertionOrder {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50);

        Set<Integer> unique = new LinkedHashSet<>(list);
        List<Integer> result = new ArrayList<>(unique);
        System.out.println(result);
    }
}
