package Tal;

import java.lang.*;
import java.io.*;

/**
 * Given N,  reverse the digits of N.
 *
 *
 * Example 1:
 *
 * Input: 200
 * Output: 2
 * Explanation: By reversing the digts of
 * number, number will change into 2.
 * Example 2:
 *
 * Input : 122
 * Output: 221
 * Explanation: By reversing the digits of
 * number, number will change into 221.
 *
 *
 * Your Task:
 * You don't need to read or print anything. Your task is to complete the function reverse_digit() which takes N as input parameter and returns the reversed number.
 *
 *
 * Expected Time Complexity: O(Log(N))
 * Expected Space Complexity: O(1)
 */



public class ReverseDigits {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            ReverseDigitsSolution ob = new ReverseDigitsSolution();
            long ans = ob.reverse_digit(n);
            System.out.println(ans);
        }
    }
}
