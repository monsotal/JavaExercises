package Tal;

public class SecondLargestSolution {

/** Will return the second largest. if there's no second largest , return "-1" . **/

    int print2largest(int arr[], int n) throws Exception {
        n = arr.length;
        int first = arr[0];
        int second = arr[1];

        for (int i = 1; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
            else if (first == second && arr[i] < second){
                second = arr[i];
            }
        }
        if(second < first){
            return second;
        }
        else{
            return -1;
        }
    }


/*
    int print2largestNotEfficient(int arr[],int n){
//Implementing Bubble Sort (less efficient due to larger time complexity)
        n = arr.length;
        for(int i = 0 ; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                //swapping
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        //returning the 2nd from the end, meaning the 2nd largest
        return arr[n-2];
    }
 */

}

