package Tal;

/**
 * Given a string str, convert the first letter of each word in the string to uppercase.
 *
 * Example 1:
 *
 * Input:
 * str = "i love programming"
 * Output: "I Love Programming"
 * Explanation:
 * 'I', 'L', 'P' are the first letters of
 * the three words.
 *
 * Your Task:
 * You dont need to read input or print anything. Complete the function transform() which takes s as input parameter and returns the transformed string.
 *
 *
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N) to store resultant string
 *
 *
 * Constraints:
 * 1 <= N <= 104
 * The original string str only consists of lowercase alphabets and spaces to separate words.
 */


// In the 1st implementation (my implementation) I'm iterating the string, keep checking if the current element is the first element
//  then checking if the element before that is space, then uppercase the current element
// it is inefficient since i keep checking if the element is the 1st character in string..

/**
 * public class UpperCaseConversionSolution {
 *     public String transform(String s) {
 *
 *         String result = "";
 *
 *         for (int i = 0; i < s.length(); i++) {
 *             if(i > 0){
 *                 if (s.charAt(i-1) == ' ') {
 *                     result += Character.toUpperCase(s.charAt(i));
 *                 }
 *                 else{
 *                     result += s.charAt(i);
 *                 }
 *             }
 *             else{
 *                 result += Character.toUpperCase(s.charAt(i));
 *             }
 *         }
 *         return result;
 *     }
 * }
 */


// This implementation is simpler and much quicker.

class UpperCaseConversionSolution {
    public String transform(String s)
    {
        boolean toUpperCase = true;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(toUpperCase){

                //
                str.append(Character.toUpperCase(c));
                //

                toUpperCase = false;
                continue;
            }
            if(c == ' '){
                toUpperCase = true;
            }
            str.append(c);
        }

        return str.toString();
    }
}
