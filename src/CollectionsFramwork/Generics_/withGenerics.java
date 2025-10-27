package CollectionsFramwork.Generics_;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class withGenerics {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        System.out.println(al);

        //how Java polymorphism + generics + interfaces connect together.
//        al = new Stack<>();
//        al.push(10);
//        al.push(20);
//        System.out.println(al);

        //It works
        al = new Stack<>(); //either if you want to use push() so you have to type cast it into stack
        al.add(10);
        al.add(20);
        System.out.println(al);



    }
}
