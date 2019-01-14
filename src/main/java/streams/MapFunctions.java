package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFunctions {

    //Difference between map and flatMap is that map accepts a predicate that accepts T and return R which is child of Mapper
    //flatMap accepts a predicate that returns a Stream of R

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,7);

        Stream<String> stringStream = list.stream().map(s-> Integer.toBinaryString(s));

        System.out.println(stringStream.distinct().collect(Collectors.joining("|")));
        Stream<String> stringStream1 = list.stream().flatMap(s -> Arrays.asList(Integer.toBinaryString(s)).stream());


        // Flat maps are useful in creating a single stream from streams.



    }
}
