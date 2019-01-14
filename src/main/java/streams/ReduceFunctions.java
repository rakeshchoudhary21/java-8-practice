package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceFunctions {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,6);

        Optional<Integer> reduceResult = integerList.stream().reduce((a, b) -> a/b);
        System.out.println(reduceResult);
    }
}
