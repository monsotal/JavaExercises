package Tal;

import java.io.*;
import java.util.*;

public class MultiplicationTableSolution {

    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> arrli = new ArrayList<Integer>();

        for(int i= 1; i<= 10; i++){
            arrli.add(N*i);
        }
        return arrli;
    }
}
