package IteratingOverCollections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"ONE");
        map.put(2,"TWO");
        map.put(3,"THREE");

        map.forEach((key,value) -> System.out.println(value));

        //get or default
        System.out.println(map.getOrDefault(5,"NOT_PRESENT"));
        //put if absent
        map.putIfAbsent(2,"TOOO");
        System.out.println(map.get(2));
        //replace all values starting with T with some other value
        map.replaceAll((key,value)-> {
            if(value.startsWith("T"))
                return value="SOME_OTHER_THING";
            else return value;
        });
        System.out.println(map);

        //a new remove method, removes only if given key is associated with given value
        System.out.println(map.remove(3,"SOME_OTHER_THING"));
        //same way a new replace, which replaces only if given key is associated with given value
        System.out.println(map.replace(1,"ONE","ONDU"));
    }
}
