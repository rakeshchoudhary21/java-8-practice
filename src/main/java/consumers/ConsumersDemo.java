package consumers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//Difference between a consumer and function is that a consumer doesnt return anything.
public class ConsumersDemo {

    public static void singleConsumer(int x){
        System.out.println(x);
    }

    public static void biConsumers(int x, int y){
        System.out.println(x+"\t"+y);
    }

    public static int biFunction(int x,int y){
        return x+y;
    }

    public static boolean predicate(int x){
        return x%2==0;
    }

    public static boolean biPredicate(int x, int y){
        return x>y;
    }

    public static void main(String[] args) {
        Arrays.asList(1,2,34,5,10).stream().forEach(ConsumersDemo::singleConsumer);

        Map<Integer,Integer> map = new HashMap();
        map.put(1,2);
        map.put(22,33);
        map.forEach(ConsumersDemo::biConsumers);
        System.out.println(map.compute(22,ConsumersDemo::biFunction));
        Optional<Integer> firstEven = Arrays.asList(1,2,3,4,5,6).stream().filter(ConsumersDemo::predicate).findFirst();
        System.out.println(firstEven.get());

    }
}
