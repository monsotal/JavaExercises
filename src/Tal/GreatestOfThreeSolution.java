package Tal;

public class GreatestOfThreeSolution {
    int greatestOfThree(int A, int B, int C) {
        if(A>B){
            if(A>C){
                return A;
                }
            else{
                return C;
                }
            }
        else if(B>C){
            return B;
        }
        else{
            return C;
        }
    }
}
