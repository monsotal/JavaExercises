package Tal;


// { Driver Code Starts
import java.util.*;
class PalindromicArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ;i < n; i++)
                a[i]=sc.nextInt();
            main g = new main();
            System.out.println(g.palinArray(a , n));
        }
    }
}
// } Driver Code Ends
