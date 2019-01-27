package Functions;

import java.util.Arrays;
import java.util.function.Function;

class Test{
    int id;
    String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //For this we could as well create a functional interface with just one method that takes a string and returns a string.
    public String applyFunc(Function<Test,String> function){
        return function.apply(this);
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class FunctionsTest {

    public static void main(String[] args) {
        Test t = new Test(1,"RAKESH");
        System.out.println(t.applyFunc(k -> t.toString()));
        System.out.println(t.applyFunc(k -> t.name));

        Arrays.asList(new Test(1,"RAKESH"),new Test(2,"RAJESH"),new Test(3,"MEENU"))
                .stream()
                .forEach(k ->
                    System.out.println(k.applyFunc(tObj -> tObj.id + "->" + tObj.name)));

        Function<Test,String> toId = myT -> myT.id+"\t";

        Arrays.asList(new Test(1,"RAKESH"),new Test(2,"RAJESH"),new Test(3,"MEENU"))
                .stream()
                .forEach(k ->
                        System.out.println(k.applyFunc(toId)));

    }

}
