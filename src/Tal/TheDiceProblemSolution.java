package Tal;

import java.util.HashMap;
import java.util.*;

public class TheDiceProblemSolution {

    static int oppositeFaceOfDice(int N){
        return  7-N;
    }


/**  Inefficient Solution......

    static int oppositeFaceOfDice(int N){
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1,6);
        hm.put(2,5);
        hm.put(3,4);
        hm.put(6,1);
        hm.put(5,2);
        hm.put(4,3);

        int oppositeFaceNumber = hm.get(N);
        return  oppositeFaceNumber;
    }

 **/
}
