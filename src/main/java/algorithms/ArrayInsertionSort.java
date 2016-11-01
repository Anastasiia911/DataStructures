package algorithms;

import java.util.Arrays;

/**
 * Complexity of this algorithm is N*N
 * Faster if array is partially sorted practically the fastest was tested on 100 000 and 10 000 elements
 */
public class ArrayInsertionSort extends ArraySort {


    public long[] sort(long[] array) {
        int in, out;
        int nElems = array.length;
        for (out = 1; out < nElems; out++) //out - marker for sort
        {
            long temp = array[out]; //copy element-marker
            in = out; //start element movement starting from marker out

            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;//insertion of marker element
        }
        return array;
    }


    private long getMediana(long[] array) {
        Arrays.sort(array);
        long medianValue = 0;
        int middle = array.length / 2;
        if (array.length % 2 == 1)
            medianValue = array[middle];
        else medianValue = (array[middle - 1] + array[middle]) / 2;
        return medianValue;

    }


}
