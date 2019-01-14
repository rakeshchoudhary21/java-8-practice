package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,45,66,55,5,4,3,3);
        List<Integer> allEvens = list.stream().map(x -> x*2).collect(Collectors.toList());

        //Collectors convert stream to one of children of Collections interface

        Stream<Integer> limitedStream = allEvens.stream().limit(2);
        System.out.println(limitedStream.count());
    }
}

/**
 * When an intermediate operation runs it doesnt actually execute the operation on stream element
 * instead it just creates a new stream with those elements that satisfy the given predicate.
 * And traversal of the stream only happens when the terminal operation executes.
 *
 * When dealing with INFINITE STREAMS its better to use some limit operation in between to avoid the
 * infinite execution
 *
 * So basically the terminal operations are EAGER and intermediate ones are LAZY
 */
