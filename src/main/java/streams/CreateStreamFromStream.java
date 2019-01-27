package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamFromStream {


    public static boolean filterEvens(int item){
        return item%2 == 0;
    }

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,3,2,3,4,5,6,7,8,4,4,3,2,2,2,1,1,1);
        Stream<Integer> evenStream = integerStream.filter(CreateStreamFromStream::filterEvens);
        List<Integer> evenList = evenStream.collect(Collectors.toList());
        System.out.println(evenList);

        //Find first boolean
        //note that to use the stream again u need to reinitialize it
        integerStream = Stream.of(1,2,3,4,3,2,3,4,5,6,7,8,4,4,3,2,2,2,1,1,1);
        Optional<Integer> firstBoolean = integerStream.filter(CreateStreamFromStream::filterEvens).findFirst();
        System.out.println(firstBoolean.get());


        //A stream cant be used after any terminating method has been called.


        //We can skip stuff
        System.out.println(evenList.stream().skip(2).sorted().distinct().count());

        //use map method for applying same operation on every element of the stream.
    }
}
