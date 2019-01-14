package lambdas;

import com.google.common.collect.Sets;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//A lambda is an implementation of single method from some class.

//Lambda is like a function without class.
public class Ex1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("RAKESH","RAJESH","MEENU","NISHU");
        Set<String> set = Sets.newHashSet("RAKESH","RAJA","MIKA");

        list.forEach(System.out::println);

        String string = set.stream().filter(str -> str.contains("RA")).collect(Collectors.joining("|"));
        System.out.println(string);
    }
}

//With lambdas a new class is not created for each impl.
