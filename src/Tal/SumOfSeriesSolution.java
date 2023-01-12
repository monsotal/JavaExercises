package Tal;


/**
 * Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
 * Example :
 *
 * Input:
 * N = 5
 * Output: 15
 * Explanation: For n = 5, sum will be
 *  1 + 2 + 3 + 4 + 5 = 15.
 */



// This is the "inefficient" way to do it with time complexity of O(N)

/**
 * public class SumOfSeriesSolution {
 *
 *     long seriesSum(int n) {
 *
 *         long sumofseries = 0;
 *         for(int i=0; i < n+1; i++){
 *             sumofseries += i;
 *         }
 *         return sumofseries;
 *     }
 * }
 */


// This is the "efficient" way to do it with time complexity of O(1)

public class SumOfSeriesSolution {

    long seriesSum(int n) {

        long  m= n;
        return (m*(m+1))/2;
    }
}
