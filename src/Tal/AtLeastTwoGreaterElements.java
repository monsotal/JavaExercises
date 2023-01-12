package Tal;

import java.io.IOException;

public class AtLeastTwoGreaterElements {

    public static void main(String[] args) throws IOException
    {
        long size = 5;
        long[] array = {2,8,-7,1,5};
        AtLeastTwoGreaterElementsSolution obj = new AtLeastTwoGreaterElementsSolution();
        obj.findElements(array,size);
        }
    }


