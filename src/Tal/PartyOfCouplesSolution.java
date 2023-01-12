package Tal;

import java.util.*;

public class PartyOfCouplesSolution {

    // In this implementation you basically use XOR Bitwise operator ^ , now if you have identical couples along the array
    // all of the bits should be turned off by the end of iteration.
    //assuming you have identical couples except for a single element, this element would be returned, cuz it's the one who left its bits turned on.

    int findSingle(int N, int arr[]){
        // code here
        int ans=0;
        for(int i=0;i<N;i++){
            ans^=arr[i];

        }
        return ans;
    }
}


/**    ----- inefficient implementation w/o using XOR (but it works)-----
 *
 *     static int findSingle(int N, int arr[]) {
 *
 *         N =arr.length;
 *         // Sorting the array
 *         Arrays.sort(arr);
 *
 *         //Declaring a new ArrayList of Integers
 *         List<Integer> arraylist = new ArrayList<Integer>();
 *
 *         //Converting int array to Integers ArrayList, just the way i like
 *         for (int i = 0; i < N; i++) {
 *             arraylist.add(arr[i]);
 *         }
 *
 *         //remove first 2 elements if they're equal
 *         //After first removal, 0 index becomes 1, therefore i repeat with remove(0);
 *         while(arraylist.size() >1){
 *             int first = arraylist.get(0);
 *             int second = arraylist.get(1);
 *
 *             if (first == second){
 *                 arraylist.remove(0);
 *                 arraylist.remove(0);
 *             }
 *             else{
 *                 break;
 *             }
 *         }
 *         return arraylist.get(0);
 *     }
 */

