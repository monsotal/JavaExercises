package Tal;

public class ReverseDigitsSolution {

    /**
     * This is some less efficient implementation of mine ..better go with the 2nd implementation
     * which is more mathematical and also what the interviewers wants you to do
     */

    
    // public long reverse_digit(long n)
     //     {
     //         String ReversedDigits = "";
     //         String string = String.valueOf(n);
     //
     //         for(int i = string.length()-1; i>=0; i--){
     //             ReversedDigits += string.charAt(i);
     //         }
     //         return Long.parseLong(ReversedDigits);
     //     }




    public long reverse_digit(long n)
       {
           long reversedDigits = 0;

           while(n>0){
               reversedDigits = reversedDigits * 10 + n %10;
               n = n/10;
           }
           return reversedDigits;
       }
}
