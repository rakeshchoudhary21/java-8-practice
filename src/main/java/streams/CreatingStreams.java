package streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//There are two type of operations on streams.
//1- intermediary which return a stream back
//2- terminal which are like final operation.. kind of collectors to get result from stream


public class CreatingStreams {
    public static void main(String[] args) {
        //using util like Arrays for array data types
        //all Collection descendants already have a stream method for creating stream
        //Stream class provides a of method.

        Stream<String> stringStream = Arrays.stream(new String[]{"RAKES","RAJESH"});
        Stream<String> another = Stream.of("RAKESH","RAJESH");
        Stream<String> oneMore = Arrays.asList("1","2").stream();

        String[] arr = {"RAKESH","RAJESH"};
        Stream<String> anotherStream = Arrays.stream(arr,1,2);

        stringStream.forEach(System.out::println);

        String s = another.filter(x->x.equalsIgnoreCase("RAKESH")).collect(Collectors.joining());
        System.out.println(s);
        boolean allMatch = another.allMatch(x->x.equalsIgnoreCase("RAKESH"));
        //findAny and allMatch return boolean
        //noneMatch is compliment of anyMatch


        /**
         * Other approaches for stream creation are like builder, generate, iterate etc
         */


        //Once build gets called then no more add to the stream.
        //Once created a stream can only be iterated upon
        //Once an item processed the stream will have to be reset to process that same item again
        Stream<String> builderEx = Stream.<String>builder().add("RAKESH").add("RAMESH").build();


        //Another way for creating infinite stream would be to use the generate method.. generate method takes a Supplier as input
        Stream<Integer> integerStream = Stream.generate(CreatingStreams::intGenerator);


        //another way is iterate.. this guys is similar to generate except here u require a seed
        Stream<String> longText = Stream.iterate("HELLO",str-> str+"SHIT");


        //There are primitive streams available OOTB
        IntStream intStream = IntStream.of(1,2,3,4,5);//and same way for Long and Double

        IntStream exclusiveRange = IntStream.range(1,5); //from 1 to 4, meaning excluding 5
        IntStream inclusiveRange = IntStream.rangeClosed(1,5);//from 1 to 5 including 5


        IntStream randomStream = new Random().ints(); //we can use the Random to generate the random stream
        DoubleStream doubleStream = new Random().doubles();



    }


    public static int intGenerator(){
        return new Random().nextInt();
    }
}
