package Tal;

import java.io.IOException;
import java.util.Scanner;

public class TheDiceProblem {

    /**
     * You are given a cubic dice with 6 faces. All the individual faces have a number printed on them.
     * The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube,
     * your task is to guess the number on the opposite face of the cube.
     *
     * Example 1:
     *
     * Input:
     * N = 6
     * Output:
     * 1
     * Explanation:
     * For dice facing number 6 opposite face
     * will have the number 1.
     */

    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();


            TheDiceProblemSolution ob = new TheDiceProblemSolution();
            int ans  = ob.oppositeFaceOfDice(N);
            System.out.println(ans);
        }
    }
}
