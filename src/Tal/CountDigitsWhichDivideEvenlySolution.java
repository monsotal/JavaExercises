package Tal;

/**
 * Given a number N. Count the number of digits in N which evenly divides N.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 12
 * Output:
 * 2
 * Explanation:
 * 1, 2 both divide 12 evenly
 * Example 2:
 *
 * Input:
 * N = 23
 * Output
 * 0
 * Explanation:
 * 2 and 3, none of them
 * divide 23 evenly
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function evenlyDivides() which takes an integer N as input parameters and returns an integer, total number factor of digits N which divides N evenly.
 */






/**     Implementation #1 - my implementation - less efficient
 *      logic here is to convert number to string, then string to char array
 *      then to iterate over the char array, and each time check if the current element is different than 0,
 *      then with modulo operator to see if it's even. if it's even, increment "digitcount" by 1
 *      finally return "digitcount" , which is the count of all elements which divides N evenly.
 */


// public class CountDigitsWhichDivideEvenlySolution {
//
// static int evenlyDivides(int N){
//
//        int digitcount = 0;
//        String number = Integer.toString(N);
//        char[] ch =number.toCharArray();
//
//        for(char c : ch){
//            if(Character.getNumericValue(c) != 0 && N % Character.getNumericValue(c) == 0){
//                    digitcount ++;
//                }
//            }
//        return digitcount;
//    }
//  }
//



    /** Implementation #2 - more efficient
     * This implementation does the same as above but maybe more efficient, as in this time the counting is done by dividing N by 10
     * each time ,& in each iteration you check the same as above(check if the current element is different than 0,
     * then with modulo operator to see if it's even& if it is, increment "num" by 1.)
     * Reference for this can be found in here : https://www.geeksforgeeks.org/program-count-digits-integer-3-different-methods/
     */

public class CountDigitsWhichDivideEvenlySolution {
    static int evenlyDivides(int N){
        int num=0;
        int temp=N;
        while(temp!=0){
            int rem=temp%10;
            temp=temp/10;
            if(rem>0&&N%rem==0){
                num++;
            }
        }
        return num;
    }
}
