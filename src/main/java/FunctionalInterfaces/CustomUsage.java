package FunctionalInterfaces;



class Impl implements FunctionInterfaceEx{

    @Override
    public void add() {
        System.out.println("add was called");
    }
}

public class CustomUsage {

    private void test(FunctionInterfaceEx fn){
        fn.add();
    }


    public static void main(String[] args) {
        new CustomUsage().test(()-> System.out.println("ANOTHER WAY!!!"));
        new CustomUsage().test(new Impl());
        new CustomUsage().test(new FunctionInterfaceEx() {
            @Override
            public void add() {
                System.out.println("ONE MORE WAY!!!!");
            }
        });

        //Below is yet another way to instantiate the Functional Interface
        //This is method reference approach
        new CustomUsage().test(FunctionInterfaceEx::add2);

    }

}
