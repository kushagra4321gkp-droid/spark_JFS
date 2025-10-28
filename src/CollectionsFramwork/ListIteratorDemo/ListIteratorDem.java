package CollectionsFramwork.ListIteratorDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDem {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("java", "dsa", "python", "ml"));
        ListIterator<String> li = list.listIterator();
        System.out.println("Forward Direction");

        while (li.hasNext()){
            String data = li.next();
            System.out.println(data);
        }

    }
}
