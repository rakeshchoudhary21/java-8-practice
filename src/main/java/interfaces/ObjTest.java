package interfaces;

public interface ObjTest {

    //u can have clone default impl but cant have toString or equals and hashcode

    default Object clone(){
        return 1;
    }

    //The reason that the default method cant be method from Object class is that...
    //every class anyway extends Object in java, and if such class implemented an interface that...
    //also provide impl of hashCode or equals then that class will get two impls for same method..
    //there by cluttering the single inheritance of java.
}
