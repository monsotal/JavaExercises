package Tal;

public class PrintPatternSolution {

    void printPat(int n) {

// as close is t is to i, the less times inner loop has to print a number before moving to next number.
// although this code looks complex, in fact its no so complex. just took it chunk by chunk , then modified it a bit.

        for(int t =0 ; t<n ; t++){
            for(int k =n ; k>0 ;k--){
                for(int i =n ; i>t ; i--){
                    System.out.print(k+" ");
                }
            }
            System.out.print("$");

        }
    }
}
