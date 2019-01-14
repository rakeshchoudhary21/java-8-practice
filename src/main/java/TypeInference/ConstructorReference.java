package TypeInference;


import java.util.function.Function;

/**
 * We cant pass argument to method reference
 */
class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class ConstructorReference {

    void test(Function<Integer, Integer> test) {
        System.out.println(test.apply(100));
    }

    void testStud(Function<Student,Integer> studentIntegerFunction){
        int id = studentIntegerFunction.apply(new Student(1, "RAKESH"));
        System.out.println(id);
    }
    public static void main(String[] args) {

        //This is a way to initialize a integer object.
        //Basically we passed in a reference to constructor.
        //which can be invoked via the apply function.
        //apply function takes one argument
        new ConstructorReference().test(Integer::new);

        //saying new Integer would create the object and pass reference to it.
        //instead here we are passing the reference to constructor.


        //we need reference to a function that can be used to get Integer from student object
        new ConstructorReference().testStud(Student::getId);
    }

}
