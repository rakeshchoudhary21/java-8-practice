package thisVar;

import java.util.Arrays;

@FunctionalInterface
interface MyInterface{
    void printThis(int x);
}


/**
 * The this in lambda expression points to surrounding instance in which lambda expression exists.
 * If lambda is in static scope than this cant be used.
 * If lambda is in instance of class then it points to that surrounding scope.
 * But annonymous classes have there own this. that is the diff between these two
 */
public class ThisVariable {

    private void testThis(MyInterface consumer){
        consumer.printThis(100);
    }


    public static void main(String[] args) {
        Arrays.asList(1,2,3,4).forEach(x->{
            //cant access this
            //System.out.println(this);
            System.out.println(x);
        });

        Arrays.asList(1,2,3,4).forEach(x->new MyInterface(){

            @Override
            public void printThis(int x) {
                //here we can
                System.out.println(this);
            }
        });

        //non static printThis cant be accessed from here
        //new ThisVariable().testThis(MyInterface::printThis);
        new ThisVariable().testThis(x-> System.out.println(x));



    }
}
