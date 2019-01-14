package closures;

interface Adder{
    int add(int x);
}


public class ClosuresEx {


    void closed(int x, Adder adder){

        System.out.println(adder.add(x));
    }

    public static void main(String[] args) {
        //Always remember the closure dont allow u to modify stuff.
        //any variable in closure is final or effective final
        new ClosuresEx().closed(100, x->++x);
    }
}
