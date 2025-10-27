package CollectionsFramwork;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Order preserved
        //Duplicate Allowed
        //Index wise access

        //Can Parent hold Child's Object? see
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(90);
        nums.add(30);
        nums.add(10);
        nums.add(90);
        System.out.println(nums);
        System.out.println(nums.get(0));

        //Some Common Methods are :-
        //size()
        //add()
        //remove()
        //clear()
        //add(idx, ele)
        //isEmpty()

        System.out.println(nums.size());

        if(nums.isEmpty()){
            System.out.println("empty...");
        }else{
            System.out.println("not empty...");
        }

        nums.add(0, 50);
        System.out.println(nums);

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()){
            int data = it.next();
            if(data == 30){
                System.out.println("removing 30");
                it.remove();
            }else{
                System.out.println(data);
            }

        }

    }
}
