package lambdas;

import java.util.Arrays;

public class LambdaExDriver {


    public static void main(String[] args) {
        LambdaEx lambdaEx = () -> System.out.println("THIS METHOD DOES NOTHING!!!!");

        //execution only happens when below runs.
        lambdaEx.myMethod();

        //both approaches work, but giving data type in arg gives clarity.
        //LambdaEx2 lambdaEx2 = (raja) -> System.out.println("PASSED ME--"+raja);
        LambdaEx2 lambdaEx2 = (String arg) -> System.out.println("PASSED ME--"+arg);

        lambdaEx2.myMethod("RAKESH");


        LambdaEx3 lambdaEx3 = ((name1, name2) -> {
            String[] name1Arr = name1.split("\\s+");
            String[] name2Arr = name2.split("\\s+");
            if(name1Arr[name1Arr.length-1].equalsIgnoreCase(name2Arr[name2Arr.length-1]))
                return "related";
            else return "unrelated";
        });

        //Below is fine. It doesnt have an explicit return but java is ok with it.
        LambdaEx3 lambdaEx3_1 = ((name1, name2) -> "RAKESH");

        System.out.println(lambdaEx3.iReturn("rakesh choudhary","rajesh choudhary"));
        System.out.println(lambdaEx3.iReturn("piyush","rakesh choudhary"));
    }
}
