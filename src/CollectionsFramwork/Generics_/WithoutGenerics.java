package CollectionsFramwork.Generics_;

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(2);
        al.add(3);
        System.out.println(al);

        al.add("kushagra");
        al.add("tiwar");
        System.out.println(al);

        //No type safety. that's why Generics are used.

//        ArrayList<Integer> al2 = new ArrayList<>();
//        al2.add(10);
//        al2.add("kushagra"); --> it will not work because we have specified the Generics!


        ArrayList al3 = new ArrayList(Integer.parseInt("Kushagra"));



    }
}
