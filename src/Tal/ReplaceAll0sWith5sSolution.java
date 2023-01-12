package Tal;

public class ReplaceAll0sWith5sSolution {

    public static int convertFive(int n){

        String number = String.valueOf(n);
        String newnumber = "";

        for(int i=0 ; i< number.length() ; i++){
            // check if current index equal to ASCII value of the number 0, which is 48.
            if(number.charAt(i) == 48){
                newnumber += "5";
            }
            else{
                newnumber += number.charAt(i);
            }
        }
        int parsednumber = Integer.parseInt(newnumber);
        return parsednumber;
    }
}

