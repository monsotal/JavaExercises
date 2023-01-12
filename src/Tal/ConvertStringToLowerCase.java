package Tal;
import java.io.*;


public class ConvertStringToLowerCase {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            ConvertStringToLowerCaseSolution ob = new ConvertStringToLowerCaseSolution();

            System.out.println(ob.toLower(S));
        }
    }
}
