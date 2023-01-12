package Tal;

import java.io.*;

public class SumOfSeries {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new SumOfSeriesSolution().seriesSum(n);

            System.out.println(ans);
        }
    }
}
