package interfaces;

public interface Interface1 {

    int SOME_VAR = 100;

    //You cant override this
    static void someStaticMethod(){
        System.out.println("I m a static method!!!!");
    }

    //you can override this
    default void add(){
        System.out.println("This is default add method!!!!");
    }

    default void add4(){
        
    }

    //can override
    void add2();
    //void add3();

    //other rule remain same like must override all abstract methods. unless your class itself is abstract

}
