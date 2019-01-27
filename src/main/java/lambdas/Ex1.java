package lambdas;

import com.google.common.collect.Sets;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


//A lambda is an implementation of single method from some class.
//If a lamda needs curly brace then better to move the code to a method. and call that method from lambda
//An explicit return is only needed in case of parenthesis around lambda expression
//If lambda expression is only doing things that are done by an available method then use the method reference

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

//Anything in lambda expression is effectively final. if not it will cause compiler exception
//effective final is some var that is assigned only once thoughout the code

//With lambdas a new class is not created for each impl.

/**
 * Some more points:
 * 1- lamda is not inner class. An inner class has a scope which can be referred by this,(lamdas have no this).
 * Also inner classes can override the outer scope variables. but for lambda all that is effective final.
 * And for lamda expression the this points to enclosing scope.
 *
 *
 */
