package Tal;

public class CountOfSmallerElementsSolution {

    public long countOfElements(long arr[], long n, long x)
    {
        long ElementsSmallerThanX = 0;
        n = arr.length-1;

        for(int i=0; i<=n; i++){
            if(arr[i] <= x){
                ElementsSmallerThanX += 1;
            }
        }
        return ElementsSmallerThanX;
    }
}
