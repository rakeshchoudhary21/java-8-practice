package IteratingOverCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Fail Fast should be preferable since they fail as soon as any concurrent modification happens, instead of failing in
 * some near future with some non deterministic state.
 *
 * Ex:
 * FailFastItr -> ArrayList, Vector, HashMap, HashSet
 * FailSafeItr -> CopyOnWriteArrayList, CopyOnWriteHashSet, ConcurrentHashMap
 */


public class FailFastFailSafe {

    public static void main(String[] args) {
        //Below returns a Abstract version of List
        //List<Integer> aList = Arrays.asList(1,2,3,4,5,6,7,8,9,9,8,7,8);
        List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        int lastRet = -1;
        //Strange but works. assigns 2 to lastRet and then gets the 2nd item.
        System.out.println(aList.get(lastRet=2));

        //Below is a FailFast Iterator
        Iterator<Integer> iterator = aList.iterator();
        while (iterator.hasNext()){
            //iterator.remove(); will throw IllegalStateException
            //aList.remove(0); will throw CME
            //aList.add(4);will throw CME
            System.out.println(iterator.next());
            iterator.remove(); //removes from original list
        }
        //List will now be empty
        System.out.println(aList);
    }
}
