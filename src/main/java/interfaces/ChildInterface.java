package interfaces;


//same logic goes for
public interface ChildInterface extends InterfaceOne,InterfaceTwo {
    @Override
    default void add() {

    }
}
