package Strings;

import java.util.StringJoiner;

public class StringJoinerEx {

    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("|");
        stringJoiner.add("RAKESH").add("CHOUDHARY").add("WORKFUSION");
        System.out.println(stringJoiner.toString());


        StringJoiner stringJoiner1 = new StringJoiner(" ","{","}");
        stringJoiner1.add("RAKESH").add("CHOUDHARY").add("WORKFUSION");
        System.out.println(stringJoiner1.toString());

        stringJoiner.merge(stringJoiner1);
        System.out.println(stringJoiner); // this will come without prefix-suffix
        //Remember the String.join method calls the StringJoiner.
    }
}
