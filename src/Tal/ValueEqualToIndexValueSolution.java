package Tal;
import java.util.*;

public class ValueEqualToIndexValueSolution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> temparraylist = new ArrayList<Integer>();

        n = arr.length;

        for(int i=1; i<=n ; i++){
            if(i==arr[i-1]){
                temparraylist.add(arr[i-1]);
            }
        }
        return temparraylist;
    }
}
