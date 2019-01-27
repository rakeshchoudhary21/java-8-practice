package streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStreams {

    private  static final String FILE_PATH = "/home/rakesh/Desktop/Work/Java8Practice/java-8-practice/src/main/java/streams/Temp.txt";

    public static void main(String[] args) throws Exception {

        Path path = Paths.get(FILE_PATH);

        Files.lines(path,Charset.forName("utf-8")).forEach(System.out::println);
    }
}
