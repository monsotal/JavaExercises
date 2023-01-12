package Tal;


public class ReverseAStringSolution {

    static String revStr(String S) {
        String ReversedString = new String();
        int i;
        for(i=S.length()-1 ; i>=0 ; i--){
            ReversedString+=S.charAt(i);
        }
        return ReversedString;
    }
}
