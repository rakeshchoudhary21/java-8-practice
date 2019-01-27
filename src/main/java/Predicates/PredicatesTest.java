package Predicates;

import java.util.function.BiPredicate;

public class PredicatesTest {

    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (x,y) -> x>y;
        BiPredicate<Integer,Integer> biPredicate2 = (x,y) -> x*y %2 ==0;

        System.out.println(biPredicate.or(biPredicate2).test(1,2));
        System.out.println(biPredicate.and(biPredicate2).test(5,4));
        System.out.println(biPredicate.and(biPredicate2).negate().test(6,3));
        System.out.println(biPredicate.and(biPredicate2).test(7,1));

    }
}
