package Tal;

import java.io.*;
import java.util.*;

/**
 * Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.
 *
 * Example 1:
 *
 * Input:
 * S = "geeksforgeeks"
 * Output: geeksforgeeks
 * Explanation: The vowels are: e, e, o, e, e
 * Reverse of these is also e, e, o, e, e.
 *
 * Example 2:
 *
 * Input:
 * S = "practice"
 * Output: prectica
 * Explanation: The vowels are a, i, e
 * Reverse of these is e, i, a.
 *
 *
 * Example 3:
 *
 * Input:
 * S = "bcdfg"
 * Output: bcdfg
 * Explanation: There are no vowels in S.
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function modify() which takes the string S as input
 * and returns the resultant string by reversing only the vowels present in S.
 *
 *
 * Expected Time Complexity: O(|S|).
 * Expected Auxiliary Space: O(|S|).
 *
 * Driver Code:
 */

public class ReversingTheVowels {

    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();

            ReversingTheVowelsSolution ob = new ReversingTheVowelsSolution();

            System.out.println(ob.modify(s));
        }
    }
}
