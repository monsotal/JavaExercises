package Tal;

import java.io.*;

public class CountDigitsWhichDivideEvenly {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            CountDigitsWhichDivideEvenlySolution ob = new CountDigitsWhichDivideEvenlySolution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
