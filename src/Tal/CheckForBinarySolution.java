package Tal;

public class CheckForBinarySolution {



    /**
     * //Given a non-empty sequence of characters str, return true if sequence is Binary, else return false
     * example 1:
     *
     * Input:
     * str = 101
     * Output:
     * 1
     * Explanation:
     * Since string contains only 0 and 1, output is 1.
     * @param str
     * @return
     */

    boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)) != '0'){
                if((str.charAt(i)) != '1'){
                    return false;
                }
            }
        }
        return true;
    }
}
