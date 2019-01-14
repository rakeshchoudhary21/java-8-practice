package interfaces;

public abstract class AbstractChild implements Interface1{


    /*private AbstractChild(){
        System.out.println("HERE COMES THE CALL");
    }*/

   //if arg constructor is present then default no arg constructor is hidden
    //you must explicitly make it available

    public AbstractChild(int x){
        add();
        add2();//u can call the abstract methods. since only children of this class are allowed to call this contractor so there would be one impl
        Interface1.someStaticMethod();
        //below is illegal
        //AbstractChild.someStaticMethod();
    }

    //its ok not to override anything here.
    //default methods are not applicable to abstract classes
}
