package compose;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Emp{
    int id;
    String name;

    public  Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


public class ComposeDriver {

    public static void main(String[] args) {
        Function<Emp,Emp> empIdentity = e -> e;
        Function<Emp,String> initials = e -> e.getName().substring(0,1);

        List<Emp> empList = Arrays.asList( new Emp(1, "RAKESH")
                ,  new Emp(2, "RATEESH")
                ,  new Emp(3, "RAEESH")
                ,  new Emp(4, "RAMESH"));

        //initials function runs last. first the composed method runs
        empList.forEach(emp->
            System.out.println(initials.compose(empIdentity).apply(emp)));

        //first the name getter runs and then the initials
        empList.forEach(emp->
                System.out.println(empIdentity.andThen(initials).apply(emp)));

        //initials function runs last. first the composed method runs
        empList.forEach(emp->
                System.out.println(initials.compose(Function.identity()).apply(emp)));



    }
}
