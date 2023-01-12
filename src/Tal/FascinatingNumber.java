package Tal;
import java.util.*;

public class FascinatingNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        FascinatingNumberSolution ob = new FascinatingNumberSolution();
        System.out.println("How many test cases do you want to have?");
        int T = sc.nextInt();

        while (T != 0) {
            System.out.println("Type your number to know if it's Fascinating :");
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}

