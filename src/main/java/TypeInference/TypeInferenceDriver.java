package TypeInference;

public class TypeInferenceDriver {




    public static void main(String[] args) {
        //ability to use lambda expression without the type declaration
        //java compiler figures it out for u
        TypeInferenceEx typeInferenceEx = (x,y) -> x.toString()+y.toString();

        System.out.println(typeInferenceEx.add(1,2));
        System.out.println(typeInferenceEx.add("RAKES","RAJESH"));
    }

}
