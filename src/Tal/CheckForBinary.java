package Tal;

import java.util.Scanner;

public class CheckForBinary {


        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            sc.nextLine();
            while(T>0)
            {
                String str = sc.nextLine();
                CheckForBinarySolution g = new CheckForBinarySolution();
                boolean b = g.isBinary(str);
                if(b== true)
                    System.out.println(1);
                else
                    System.out.println(0);
                T--;
            }
        }
    }

// } Driver Code Ends

