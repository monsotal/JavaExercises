package Tal;

import java.util.*;

public class Print1ToNWithoutLoopsDriver {
    public static void main(String[] args) {

        //taking input using Scanner class
        Scanner sc=new Scanner(System.in);

        //taking total testcases
        int T=sc.nextInt();
        while(T-->0)
        {
            //creating an object of class Print
            Print1ToNWithoutLoopsSolution obj=new Print1ToNWithoutLoopsSolution();
            int N;

            //input N
            N=sc.nextInt();

            //calling printNos() method
            //of class Print
            obj.printNos(N);
            System.out.println();

        }

    }
}
