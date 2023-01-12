package Tal;

import java.util.Scanner;

/**
 * You a given a number N. You need to print the pattern for the given value of N.
 * for N = 2 the pattern will be
 * 2 2 1 1
 * 2 1
 * for N = 3 the pattern will be
 * 3 3 3 2 2 2 1 1 1
 * 3 3 2 2 1 1
 * 3 2 1
 * Since this is a function problem, you don't need to worry about the testcases. Your task is to complete the function printPat which takes one argument 'N' denoting the length of the pattern.
 * Note : Instead of printing new line print a "$" without quotes.
 * Example :
 *
 * Input: 3
 * Output:
 * 3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
 */


public class PrintPattern {

    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            PrintPatternSolution g = new PrintPatternSolution();
            g.printPat(n);
            System.out.println();
            t--;
        }
    }
}
