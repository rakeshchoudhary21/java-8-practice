package Maps;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx{

    public static void main(String[] args) {
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>(); //doesnt throw CME
        //Map<String,String> map = new HashMap<>();// throws CME

        for(int i=0;i<5;i++)
            map.put(""+i,"val"+i);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            //map.put("2","3"); //doesnt throw exception for CHM
            System.out.println(map.get(iterator.next()));
        }


        long start = System.currentTimeMillis();
        map.forEach((key,val) -> {
            String x = key+val;
        });
        long end = System.currentTimeMillis();
        System.out.println("time taken--"+(end-start));


        //below is incredibly fast.
        start = System.currentTimeMillis();
         map.forEach(50,(key, val) -> {
            String x = key+val;
            //System.out.println(Thread.currentThread().getName());
        });
        end = System.currentTimeMillis();
        System.out.println("time taken parallel--"+(end-start));


        //map.forEach(50, (key,val) -> System.out.println(key));
        //map.forEach((key,val) -> System.out.println(key));

        //Parallel processing above uses the ForkJoinPool

        //Using the forEachKey method with parallelism
        map.forEachKey(50,key -> {
            String x = key;
            //do something with the key
        });


        //The Search Functions-
        String found = map.search(50,(key, val) -> {
            if(key.equals("11")) return "FOUND"+val;
            else return null;
        });
        boolean keyExists = map.searchKeys(50,key-> key.equals("11"));
        String valExists = map.searchValues(50, val -> {
            System.out.println("ITERATING VAL FINDER"+val);
            if(val.equals("val5")) return "VAL-"+val;
            else return null;
        });
        System.out.println(valExists);
        System.out.println(found);



        //The Reduce Function

        String resul = map.reduce(5, (key,value) -> value.toUpperCase(), (r1,r2) -> r1+"|"+r2);
        System.out.println(resul);

        //same way there is a reduceKeys and reduceValues
        System.out.println(map.reduceValues(5,(val1,val2)-> val1.toUpperCase()+"|"+val2.toUpperCase()));

        //NOTE- a reduce function is a terminal operation that produces a single value by applying the given operation on 2 values at a time.
    }
}
