package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.function.Consumer;

@FunctionalInterface
interface CheckedExceptionConsumer<T, E extends FileNotFoundException>{
    void accept(File file) throws E;
}


public class ExceptionHandlingWithWrappers {

    public static void main(String[] args) {
        Arrays.asList(new File("/home/rakesh/Desktop/input.csv"))
                .forEach(exceptionWrapper(file -> new FileInputStream(file)));
    }


    private  static Consumer<File> exceptionWrapper(CheckedExceptionConsumer throwingConsumer){
        return file -> {
            try {
                throwingConsumer.accept(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        };
    }
}
