package TheClass;

import java.io.FileNotFoundException;

public class TheClassObject {

    private static <E extends Exception> void test(Class<E> eClass, E obj){
        E e = eClass.cast(obj);
        System.out.println(e.getMessage());
    }


    public static void main(String[] args) {
        test(FileNotFoundException.class,new FileNotFoundException("FILE NOT FOUND!!!"));
    }
}
