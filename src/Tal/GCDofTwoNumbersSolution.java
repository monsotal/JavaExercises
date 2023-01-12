package Tal;

/**
 *  1st implementation is: the not so mathematical solution (not efficient in terms of Time complexity)
 *  first you pick the smallest number out of two
 *  as long as it's bigger than 0
 *  check whether it divides 1st integer, and if divides 2nd integer without leaving a remainder
 * if it is, return gcd. as long as it doesn't , decrease gcd by 1
 */
//  public class GCDofTwoNumbersSolution {
//    public int gcd(int A, int B) {
//        int gcd = Math.min(A, B);
//        while (gcd > 0) {
//            if (A % gcd == 0 && B % gcd == 0) {
//                break;
//            }
//            gcd--;
//        }
//            return gcd;
//    }
//
// }

/**
 * A simple and old  approach is the Euclidean algorithm by subtraction
 * t is a process of repeat subtraction, carrying the result forward each time until the result is equal to any one number being subtracted.
 * If the answer is greater than 1, there is a GCD (besides 1).
 * If the answer is 1, there is no common divisor (besides 1), and so both numbers are coprime
 * At some point, one number becomes factor of the other so instead of repeatedly subtracting till both become equal,
 * we check if it is factor of the other.
 */

public class GCDofTwoNumbersSolution {
    public int gcd(int A, int B){
        if(A == B){
            return A;
        }
        if(A > B){
            return gcd(A- B, B);
        }
        return gcd(A, B-A);
    }
}