package Tal;

import java.io.*;

public class UpperCaseConversion {

    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String str = br.readLine();
            UpperCaseConversionSolution ob = new UpperCaseConversionSolution();
            System.out.println(ob.transform(str));
        }
    }
}
