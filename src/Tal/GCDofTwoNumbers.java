package Tal;

import java.util.*;

/**
 * Given two positive integers A and B, find GCD of A and B.
 * GCD is the largest positive integer that divides each of the integers
 * Your Task:
 * You don't need to read input or print anything. Complete the function gcd()
 * which takes two positive integers as input parameters and returns an integer.
 *
 * Example 1:
 *
 * Input: A = 3, B = 6
 * Output: 3
 * Explanation: GCD of 3 and 6 is 3
 *
 * Example 2:
 *
 * Input: A = 1, B = 1
 * Output: 1
 * Explanation: GCD of 1 and 1 is 1
 *
 *
 * Expected Time Complexity: O(log(min(A, B)))
 * Expected Auxiliary Space: O(1)
 */

public class GCDofTwoNumbers {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            GCDofTwoNumbersSolution ob = new GCDofTwoNumbersSolution();
            System.out.println(ob.gcd(A,B));
        }
    }
}
