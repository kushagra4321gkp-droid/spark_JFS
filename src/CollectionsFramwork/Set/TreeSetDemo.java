package CollectionsFramwork.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(90);
        treeSet.add(40);
        treeSet.add(10);
        System.out.println(treeSet);
        //No duplicates allowed --> no insertion order --> Extra property, elements would be sorted
        //For fetching in Collection Framework, we have -->
        //(1)Enumeration --> Used for Legacy classes(Vector, Stack) --> Can remove elements --> only fetch in forward direction
        //(2)Iterator --> works for all Collection type --> Traverse and Remove
        //(3)ListIterator --> Works only for List type --> fetches elements both forward and backward --> removes, updates and adds as well



    }
}
