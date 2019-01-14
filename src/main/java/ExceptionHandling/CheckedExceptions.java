package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class CheckedExceptions {

    public static void main(String[] args) {
        //For a checked exception inside lambda u can only surround it with try-catch
        Arrays.asList(new File("/home/rakesh/Desktop/input.csv")).forEach(file ->
        {
            try {
                new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
