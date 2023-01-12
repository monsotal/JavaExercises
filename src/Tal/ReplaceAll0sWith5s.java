package Tal;

import java.util.Scanner;

public class ReplaceAll0sWith5s {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ReplaceAll0sWith5sSolution g=new ReplaceAll0sWith5sSolution();
            System.out.println(g.convertFive(n));
        }
    }
}
