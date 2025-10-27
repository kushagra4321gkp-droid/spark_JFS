package CollectionsFramwork.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(90);
        ll.add(40);
        ll.add(20);
        ll.add(80);
        System.out.println(ll.get(4)); //Here we get the values after traversal from 0 to the index
                                       //that we have provided in the get() method...

        int first = ll.getFirst();
        int last = ll.getLast();
        System.out.println("first : "+first);
        System.out.println("last : "+last);

    }
}
