package FunctionalInterfaces;

//Runnable, Callable, Comparator and Comparable are normal interfaces that were turned into
//functional interfaces since java 8 release

@FunctionalInterface
public interface FunctionInterfaceEx {


    //The functional interface contains a Single Abstract Method or SAM. So u cant add other abstract methods here.
    //If u did then u will have to remove the annotation Functional Interface
    //but if any of the Object class method declared as abstract here is OK
    void add();

    //Below is ok to be added to the interface since its from Object class
    boolean equals(Object object);

    static String add2(){
        System.out.println("THIS WAS CALLED ATLEAST!!!!");
        return "ADD2";
    }
    //but above cant be default

}


/**
 * A SAM can have single abstract method but any number of default methods or static methods
 */

//java.util.function has tons of lambada expression candidates
