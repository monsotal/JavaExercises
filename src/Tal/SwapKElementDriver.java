package Tal;

public class SwapKElementDriver {

    public static void main(String[] args) throws Exception {

        int n = 8;
        int k = 3;
        int arr[] ={1, 2, 3, 4, 5, 6, 7, 8};

            new SwapKElementSolution().swapKth(arr, n, k);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

// } Driver Code Ends

