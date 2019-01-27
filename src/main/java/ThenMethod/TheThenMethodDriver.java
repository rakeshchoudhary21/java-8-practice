package ThenMethod;

import java.util.function.BiConsumer;

public class TheThenMethodDriver {

    public static void main(String[] args) {
        BiConsumer<String,String> toUpperCase = (s1,s2) -> System.out.println(s1.toUpperCase()+"\t"+s2.toUpperCase());
        toUpperCase.andThen((s1,s2)-> System.out.println("ONE MORE TIME")).accept("RAKESH","RAJESH");

        //accept is the terminating operation here.
        //the operations will execute from right to left in usual order.
    }
}
