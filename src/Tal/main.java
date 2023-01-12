package Tal;

import java.sql.SQLOutput;

public class main {

    public static void main(String[] args) {
        System.out.println("Hello");
    }
    public static int palinArray(int[] a, int n) {

        boolean isPAlindromArrayPerfect = true;
        //first convert array elements to type String
        int in;
        n = a.length;
        //Iterate Array elements
        for (in = 0; in < n; in++) {
            String string = Integer.toString(a[in]);

            //for each array member, check if palindrome
            Integer i = 0;
            Integer j = string.length() - 1;

            while (i < j) {
                if (string.charAt(i) == string.charAt(j)) {
                    i++;
                    j--;
                } else {
                    isPAlindromArrayPerfect = false;
                    break;
                }
            }
        }
        if(isPAlindromArrayPerfect == true){
            return 1;
        }
        else {
            return 0;
        }
    }
}
