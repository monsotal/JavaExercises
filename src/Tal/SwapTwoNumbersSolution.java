package Tal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapTwoNumbersSolution {

    /** The idea is to get a sum in one of the two given numbers. The numbers can then be swapped using the sum and subtraction from the sum.
     * */

    static List<Integer> get(int a, int b)
    {
        List<Integer> list = new ArrayList<Integer>();

        a = a+b;
        b = a-b;
        a = a-b;

        list.addAll(Arrays.asList(a,b));
        return list;
    }
}
