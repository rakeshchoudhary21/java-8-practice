package WrapperClasses;

public class WrapperUpdate {


    public static void main(String[] args) {
        //all wrapper classes have methods that can be awesome with method references
        //Ex: Integer::sum, max etc. same available with Long and Short
        System.out.println(Integer.numberOfLeadingZeros(10)); //returns 28 only 4 of 32 bits taken
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toUnsignedString(5,2));


        //Boolean wrapper has cool logical operators now. so no need to use the & || etc which are tricky to parse.
        System.out.println(Boolean.logicalAnd(true,true));

    }
}
