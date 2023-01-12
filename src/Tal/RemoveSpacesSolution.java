package Tal;

public class RemoveSpacesSolution {

    static String modify(String S) {
        char space = ' ';
        String newstring = new String();
        for(int i=0; i<=S.length()-1; i++){
            if(S.charAt(i) != space){
                newstring += S.charAt(i);
            }
        }
        return newstring;
    }
}
