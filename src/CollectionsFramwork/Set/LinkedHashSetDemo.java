package CollectionsFramwork.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> llHS = new LinkedHashSet<>();
        llHS.add(10);
        llHS.add(20);
        llHS.add(30);
        llHS.add(10);
        System.out.println(llHS); //order preserved -> duplicates are not allowed

    }
}
