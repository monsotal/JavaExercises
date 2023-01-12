package Tal;

public class Print1ToNWithoutLoopsSolution {

    public void printNos(int N)
    {

            if(N>0){
                printNos(N-1);
                System.out.print(N+" ");
            }
//            return;
        }
    }

