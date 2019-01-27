package Operators;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class OperatorsFun {


    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = i -> i*2;
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5);
        arrayList = arrayList.stream().map(unaryOperator).collect(Collectors.toList());
        System.out.println(arrayList);

        //Binary Operators
        BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;
        Map<Integer,Integer> map = new HashMap();
        map.put(1,2);
        map.put(2,3);
        map.forEach((x,y) -> map.put(x,binaryOperator.apply(x,y)));
        System.out.println(map);
    }
}
