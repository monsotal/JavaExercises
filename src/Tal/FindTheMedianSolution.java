package Tal;

import java.util.Arrays;

public class FindTheMedianSolution {

    public int findMedian(int[] v)
    {
        int median;
        //Sorting the array
        Arrays.sort(v);
        int N = v.length;
        //Median is middle element when n is odd and average of middle two elements when n is even
        if(N%2 == 0){
           int medianright = v[N/2];
           int medianleft = v[N/2-1];
           median = (medianright + medianleft)/ 2;
        }
        else{
            int middleelement = N/2;
            median = v[middleelement];
        }
        return median;
    }
}
