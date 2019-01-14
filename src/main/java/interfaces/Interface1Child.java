package interfaces;


/***
 * if this class implements two interfaces and both those had same default method, then this class must provide impl of that default method
 */
public class Interface1Child implements Interface1 {

    //below is not an override its just hiding.
    static int SOME_VAR = 20;

    @Override
    public void add2() {
        add(); //remember add is non static
    }

    @Override
    public void add() {
    }


    public static void main(String[] args) {
        System.out.println(SOME_VAR);
    }
}
