package Tal;

import java.io.*;

public class ArmstrongNumber {

    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArmstrongNumberSolution ob = new ArmstrongNumberSolution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
