package IteratingOverCollections;

import java.util.Arrays;
import java.util.List;

public class ListIterations {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,5,6,5,4,3,4,5,6,7,7,8,9);

        //creates an even only item list
        list.replaceAll(item-> {
            if(item%2!=0)
            return item*2;
            else return item;
        });

        System.out.println(list);
    }
}
