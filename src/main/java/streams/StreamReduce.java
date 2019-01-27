package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamReduce {

    /**
     * Reduce methods are useful in getting some final outcome from a stream.
     * Like say a List. which we could do with Collectors
     * Or aggregate like sum, count, distinct, sort and others
     * Still there is a method called reduce. which operates on following principle-
     * either start with given seed value.
     * Or accumulate
     */

    public static int biFunc(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        List<Integer> integers = Stream.of(1,2,3,4,5,5,6,7,7,8,89).collect(Collectors.toList());
        System.out.println(integers.stream().distinct().reduce(StreamReduce::biFunc));
        System.out.println(integers.stream().distinct().reduce((x,y) -> x+y));
        //with seed
        System.out.println(integers.stream().distinct().reduce(0,(x,y) -> x+y));

        //parallel streams take a combiner
        Integer res = integers.parallelStream().distinct().reduce(0,(x,y) -> x+y, (x,y) -> {
            System.out.println("THIS GUYS IS COMBINER");
            return x+y;
        });

        System.out.println(res);

        //Below is just amaging... collect the average value from stream of ints

        IntStream intStream = IntStream.range(1,100);
        System.out.println(intStream.average().getAsDouble());

        System.out.println(Stream.of("RA","R","RAMA","RAASDASD","RAAS").collect(Collectors.averagingInt(String::length)));

        //returns stats of summary. its fab
        System.out.println(Stream.of("RA","R","RAMA","RAASDASD","RAAS").collect(Collectors.summarizingInt(String::length)));


        //grouping by..
        System.out.println(Stream.of("RA","R","RAMA","RAASDASD","RAAS").collect(Collectors.groupingBy(String::length)).get(4));

        //partitioning by
        System.out.println(Stream.of("RA","R","RAMA","RAASDASD","RAAS").collect(Collectors.partitioningBy(x-> x.length()>2)));

        //Each stream Wrapper has both sequential and Parallel calls
        System.out.println(IntStream.of(1,2,3).parallel().isParallel());
        System.out.println(LongStream.of(1,2,3).sequential().isParallel());

    }
}
