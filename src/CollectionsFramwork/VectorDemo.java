package CollectionsFramwork;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vectorVar = new Vector<>();
        vectorVar.add(10);
        vectorVar.add(20);
        vectorVar.add(40);
        //System.out.println(vectorVar);
    //Legacy class, most of the methods are Synchronized that's why it is Thread Safe!

        Enumeration<Integer> e = vectorVar.elements(); //wrote vector.elements(),Selected,Extract,variable
//        while(e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }

        while (e.hasMoreElements()) {
            Integer element = e.nextElement(); // returns Integer object

            System.out.println("Value: " + element);
            System.out.println("Class Type: " + element.getClass().getName());
            System.out.println("Is Object? " + (element instanceof Object));
            System.out.println("-------------------------");
        }//Hence proved that 10 20 30 are objects ***
    }
}
