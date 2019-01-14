package streams;

import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class InfiniteStream {


    public static void main(String[] args) {
        Stream<Integer> inifiniteEvenStream = Stream.iterate(0, i-> i+2);

        //If limit is not used then it will be stuck here. since count is terminal operation
        System.out.println(inifiniteEvenStream.limit(10000).count());


        Supplier<UUID> uuidSupplier = UUID::randomUUID;

        Stream<UUID> uuidGenerator = Stream.generate(uuidSupplier);

        Stream<UUID> limitedStream = uuidGenerator.limit(10);
        System.out.println(limitedStream.count());
    }
}
