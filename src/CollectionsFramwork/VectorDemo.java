package CollectionsFramwork;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vectorVar = new Vector<>();
        vectorVar.add(10);
        vectorVar.add(20);
        vectorVar.add(40);
        System.out.println(vectorVar);
    //Legacy class, most of the methods are Synchronized that's why it is Thread Safe!
    }
}
