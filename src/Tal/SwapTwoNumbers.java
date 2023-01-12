package Tal;
import java.util.*;
import java.lang.*;

// Java Program to swap two numbers
// without using temporary variable

public class SwapTwoNumbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            SwapTwoNumbersSolution ob = new SwapTwoNumbersSolution();
            List<Integer> ans = ob.get(a,b);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
