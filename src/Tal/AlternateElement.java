package Tal;

import java.util.Scanner;

public class AlternateElement {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            main gfg = new main();
            AlternateElementSolution.print(arr, n);
            System.out.println();

        }
    }
}
