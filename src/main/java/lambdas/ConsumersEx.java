package lambdas;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumersEx {


    public static void consumer(String x){

    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("RAJESH","RAKESH","PIYUSH");

        //forEach accepts a consumer method. A consumer is a method that accepts some arg and returns nothing
        //ForEach accepts a single arg consumer
        list.forEach(System.out::println);
        list.forEach(ConsumersEx::consumer);


        Map<String,String> map = new HashMap<>();
        map.put("RAKESH","1");
        map.put("RAJES","2");
        map.forEach((key,value) -> System.out.println(key+"->"+value));
    }
}
