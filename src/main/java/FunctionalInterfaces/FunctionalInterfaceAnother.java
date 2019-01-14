package FunctionalInterfaces;

//Below setting works as Parent itself is a SAM

interface Parent{
    void add();
    //void substract();
}

@FunctionalInterface
public interface FunctionalInterfaceAnother extends Parent{
}
