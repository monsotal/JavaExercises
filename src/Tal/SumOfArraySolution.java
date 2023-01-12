package Tal;

public class SumOfArraySolution {

    int sum(int arr[], int n) {
        int i;
        int thesum = 0;
        n = arr.length;
        for(i=0;i<n;i++){
            thesum = thesum + arr[i];
        }
        return thesum;
    }
}
