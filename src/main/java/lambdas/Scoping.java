package lambdas;

@FunctionalInterface
interface ScopeTest{
    String returnValue();
}


public class Scoping {

    private String scopeValue = "THIS IS ENCLOSING SCOPE VALUE";

    void checkScopeValue(){

        ScopeTest scopeTest = new ScopeTest() {
            //its going to override the outer scope stuff
            String scopeValue = "THIS IS INNER_CLASS SCOPE VALUE";
            @Override
            public String returnValue() {
                return this.scopeValue;
            }
        };

        ScopeTest lambda = () -> {
            String scopeValue = "THIS IS ENCLOSING SCOPE VALUE";
            System.out.println(this.getClass().getSuperclass());
            System.out.println(scopeValue+"\t"+this.scopeValue);
            return this.scopeValue;
        };

        System.out.println(scopeTest.returnValue());//returns own overridden value
        System.out.println(lambda.returnValue()); //returns outer scope value


    }

    public static void main(String[] args) {
        new Scoping().checkScopeValue();
    }
}
