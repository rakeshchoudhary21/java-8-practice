package FunctionalInterfaces;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HowToUseFunctionalInterfaces {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("RAJESH");
        list.add("RAKESH");
        list.add("MEENAKSHI");

        //Anonymous impl way
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambada way
        list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println);

    }


}
