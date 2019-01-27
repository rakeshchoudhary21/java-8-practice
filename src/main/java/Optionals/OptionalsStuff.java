package Optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class OptionalsStuff {

    private static final List<Person> persons = Arrays.asList(new Person(1,"RAKESH"),new Person(2,"RAJESH"));
    public Optional<Person> getPerson(int id){
        return persons.stream().filter(person -> person.id == id).findFirst();
    }

    public static void main(String[] args) {
        Optional<Person> person = Optional.of(new Person(1,"RAM"));
        if(person.isPresent())
        System.out.println(person.get());
        //when a call returns Optional, then we get many options to operate on it.
        //like isPresent, ifPresent, orElse etc....

        Optional<String> someString = Optional.ofNullable(null);
        System.out.println(someString.equals(Optional.empty()));

    }
}
