package ComparingJava8Style;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OtherComparings {

    public static void main(String[] args) {
        Emp emp = new Emp(1,"RAKESh",new BigDecimal(5000),"EC");
        Emp emp2 = new Emp(2,"RAJESh",new BigDecimal(4000),"CS");
        Emp emp3 = new Emp(3,"RAMESh",new BigDecimal(2000),"IT");
        Emp emp4 = new Emp(4,"RATEESh",new BigDecimal(1000),"ME");

        List<Emp> empList = Arrays.asList(emp,emp2,emp3,emp4);

        //You can chain the comparing methods.
        Collections.sort(empList,Comparator.comparing(Emp::getSalary).thenComparing(e -> e.getName().length()));
        Collections.sort(empList,Comparator.comparingInt(e -> e.getName().length()));

        System.out.println(empList);


        //Natural order
        List<Integer> integerList = Arrays.asList(1,2,null,4,3,null,-1,0);
        //You can try to get the nulls first
        Collections.sort(integerList,Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(integerList);
        //or nulls last
        Collections.sort(integerList,Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println(integerList);
    }


}
