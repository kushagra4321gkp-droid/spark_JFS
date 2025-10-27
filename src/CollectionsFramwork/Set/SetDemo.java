package CollectionsFramwork.Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(30);
        set.add(40);
        set.add(10);
        System.out.println(set); //No order preserved! -> no duplicates -> no random access

    }
}
