package ComparingJava8Style;

import com.sun.javafx.collections.MappingChange;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Emp{
    private int id;
    private String name;
    private BigDecimal salary;
    private String dept;

    public Emp(int id, String name, BigDecimal salary,String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}


public class ComparingEx {

    public static void main(String[] args) {

        List<Emp> empList = Arrays.asList(new Emp(1, "RAKESH", new BigDecimal(10000),"HR")
                , new Emp(2, "RATEESH", new BigDecimal(1000),"PS")
                , new Emp(3, "RAEESH", new BigDecimal(50000),"PS")
                , new Emp(4, "RAMESH", new BigDecimal(2000),"HR"));

        Comparator<Emp> salaryComparator = Comparator.comparing(Emp::getSalary).reversed();

        empList.sort(salaryComparator);
        System.out.println(empList);

        testGrouping(empList,salaryComparator);
    }

    public static void testGrouping(List<Emp> empList,Comparator<Emp> salaryComparator){
        java.util.Map<String, Optional<Emp>> reducedList = empList.stream()
                .collect(Collectors.groupingBy(Emp::getDept,
                        Collectors.reducing(BinaryOperator.maxBy(salaryComparator))));
    }
}
