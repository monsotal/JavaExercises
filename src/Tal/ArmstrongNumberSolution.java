package Tal;

public class ArmstrongNumberSolution {
    static String armstrongNumber(int n){
        String number = Integer.toString(n);
        int numberlength = number.length();
        double finaloutcome = 0;

        for(int i=0; i<numberlength; i++){
            int currentdigit = Integer.parseInt(String.valueOf(number.charAt(i)));
            double outcome = Math.pow(currentdigit,numberlength);
            finaloutcome += outcome;
        }
        if(finaloutcome == n){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
