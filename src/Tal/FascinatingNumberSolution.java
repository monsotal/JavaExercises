package Tal;
import java.util.*;

public class FascinatingNumberSolution {

/** This code take 1 Integer, concatenates it with it's multiplication by 2, and it's multiplication by 3
 * then converts it into characters array, Sort it in ascending order
 * then compares it with a string with the value of 123456789 **/

    boolean fascinating(long n) {

        String ConcatenatedNumber = "" + n*2 + n*3 + n;

        char[] chars = ConcatenatedNumber.toCharArray();
        Arrays.sort(chars);

        String SortedNumber = String.valueOf(chars);
        String OneToNine = "123456789";
        boolean isFascinating = true;

        if (SortedNumber.equals(OneToNine) == false){
            isFascinating = false;
        }
        return isFascinating;
    }
}