package Tal;

class DeleteAlternateCharactersSolution {

    static String delAlternate(String S) {
        String newstring = new String();
        for(int i=0; i<=S.length()-1; i++){
            if(i%2==0){
                newstring += S.charAt(i);
            }

        }
        return newstring;
    }
}
