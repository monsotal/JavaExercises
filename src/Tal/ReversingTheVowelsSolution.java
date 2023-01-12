package Tal;

/**  I would go with traversing the string . place pointer at the start and ALSO pointer at the end
 and if there is vowels in both sides, to swap between them(pretty similar to finding a palindrom).. */

public class ReversingTheVowelsSolution {

    String modify(String s) {

        int i = 0;
        int j = s.length() - 1;
        char temp;
        char[] ch = s.toCharArray();
        String ModifiedString= "";


        while (i <= j) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {

                if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') {

                    //swapping 1st pointer and 2nd pointer

                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;

                    i++;
                    j--;

                } else {
                    j--;
                }

            } else {
                i++;
            }
            ModifiedString = String.valueOf(ch);

        }
        return ModifiedString;
    }
}

