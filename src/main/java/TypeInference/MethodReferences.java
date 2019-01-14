package TypeInference;

import java.util.Arrays;

public class MethodReferences {

    public void consumer(String x){
        System.out.println(x);
    }

    public static void staticConsumer(String x){
        System.out.println(x);
    }

    public void testMethod(){
        //is fine.
        Arrays.asList("RAJES","MEENU").forEach(MethodReferences::staticConsumer);
        MethodReferences methodReferences = new MethodReferences();
        // Below not ok, u r making call like static but method being called is not static
        //Arrays.asList("RAJESH","MEENU").forEach(MethodReferences::consumer);
        //below is fine
        Arrays.asList("RAJES","MEENU").forEach(methodReferences::consumer);
    }

    public static void main(String[] args) {

        //cant do below...non static reference thing
        //Arrays.asList("RAJESH","MEENU").forEach(MethodReferences::consumer);
        //below is fine
        //Object consumers work the same way
        Arrays.asList("RAJES","MEENU").forEach(MethodReferences::staticConsumer);
    }


}
