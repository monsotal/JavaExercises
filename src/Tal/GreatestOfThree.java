package Tal;
import java.io.*;

public class GreatestOfThree {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            GreatestOfThreeSolution ob = new GreatestOfThreeSolution();
            System.out.println(ob.greatestOfThree(A, B, C));
        }
    }

}
