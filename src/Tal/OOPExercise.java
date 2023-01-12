package Tal;

import java.util.Scanner;

public class OOPExercise {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            OOPExercisecls2 obj=new OOPExercisecls2();
            int a=sc.nextInt();
            int b=sc.nextInt();
            //String tilde=sc.next();
            obj.add(a,b);
            obj.mul(a,b);
            obj.task(a,b);
            //System.out.println("~");
        }
    }
}
