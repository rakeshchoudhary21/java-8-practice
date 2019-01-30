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


        //You can replace a value with compute method as well
        map.compute(1,(key,value)-> value+"_NEW_VAL");
        //diff between + and concat is that + doesn't throw NPE
        //also concat takes only one arg and of type string, but + can take any type of argument.
        map.compute(1,(key,value)-> value.concat("_NEW_VAL"));
        //compute will do simply add the key to map if key doesnt exists, value for this key will be the result of computation.
        map.compute(-9,(key,value) -> "-9");
        //Also note if computation returns null then that key is removed from the map.
        System.out.println(map.get(-9)); //this will print -9
        map.compute(-9,(k,v) -> null);
        System.out.println(map.keySet()); //this will not contain -9 now
        map.computeIfPresent(-9,(k,v) -> null);
        System.out.println(map.keySet()); //this will not contain -9 now
        map.computeIfAbsent(-9,k-> "NEW_VALUE");
        System.out.println(map.keySet());
        //or use merge
        //but for merge both key and value must match, then the remap function is applied.
        //if key-> val pair is not found then the value at key is simply replaced
        map.merge(1,"ONDU_NEW_VAL",(key,value) -> value);
        System.out.println(map.get(1));
    }
}
