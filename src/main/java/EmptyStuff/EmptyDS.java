package EmptyStuff;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class EmptyDS {


    public static void main(String[] args) {
        List<String> emptyList = Collections.emptyList();
        Set<String> emptySet = Collections.emptySet();
        //etc using Collections class


        Stream<String> emptyStream = Stream.empty();
    }
}
