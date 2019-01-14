package interfaces;

public class AbstractChildClass extends AbstractChild {


    //If abstract parent only had private constructor then it cant be extended.

    /*public AbstractChild(){

    }
    */
    public AbstractChildClass(int x) {
        //you must call this since default super injected is no arg call but here the super no arg is private.
        super(x);
    }

    @Override
    public void add2() {

    }

    public static void main(String[] args) {
        System.out.println();
        new AbstractChildClass(10);
    }
}
