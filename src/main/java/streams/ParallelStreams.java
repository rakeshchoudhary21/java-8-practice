package streams;

import java.util.Arrays;
import java.util.List;




public class ParallelStreams {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("RAKESH","RAJESH","MEENU","NIKU");

        System.out.println("Parallel output");
        stringList.parallelStream().forEach(s-> processIt(s));

        System.out.println("Non parallel output");
        stringList.stream().forEach(s->processIt(s));
    }

    public static void processIt(String s){
        System.out.println(s);
    }
}
