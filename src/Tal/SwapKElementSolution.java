package Tal;

public class SwapKElementSolution {

    void swapKth(int arr[], int n, int k) {

        int beginning = arr[k-1];
        int end = arr[n-k];

/** Swapping **/
        int temp = beginning;
        beginning = end;
        end = temp;

        arr[k-1] = beginning;
        arr[n-k] = end;

        }
    }

