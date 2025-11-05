package CollectionsFramwork.Map;

import java.util.*;

public class MapDemo {
    //wherever we see Linked in Front(LinkedHashSet) in Collection Framework, Things will be Linked means Order will be preserved!
    //wherever we see Hash in Front(HashSet) Collection Framework, No Order will be preserved!
    //one Key:Value pair is called Entity!
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //order not preserved
        //Duplicates are not allowed
        //null allowed at once only because duplicate Keys not allowed
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put(null, 5);
        map.put(null, 6);
//        System.out.println(map);
//        System.out.println(map.get("four"));

//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(20);
//        for(Integer ele : set){
//            System.out.println(ele);
//        } Same like Set, we can also do with Map but with the variable datatype set same as key's datatype

        for(String key : map.keySet()){
            //System.out.println("key:" + key + " | data:" + map.get(key));

        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key:"+entry.getKey() + "---- value:"+entry.getValue());
        }

    }
}
