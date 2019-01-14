package ExceptionHandling;

import java.util.Arrays;
import java.util.function.Consumer;


//With exception wrappers the forEach will not break for a single item.
//instead it will process all the items.
public class UncheckedExceptionHandling {

    public static void main(String[] args) {
        Arrays.asList(1,2,3).forEach(exceptionWrapper(x-> System.out.println(x/0)));
        //breaks for the first item and never recovers
        Arrays.asList(1,2,3).forEach(x-> System.out.println(x/0));

    }



    private static Consumer<Integer> exceptionWrapper(Consumer<Integer> consumer){
        return i->{
            try {
                consumer.accept(i);

            }catch (Exception ex){
                System.out.println("Exception--"+ex.getMessage());
            }
        };
    }
}
