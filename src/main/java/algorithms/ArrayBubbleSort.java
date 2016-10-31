package algorithms;

/**
 * Realisation of simple BUBBLE SORT. Complexity N*N
 */
public class ArrayBubbleSort extends ArraySort {


    public long[] sort(long[] array) { //Bubble sort :compare elements one by one and move their places if first one is more then second.
        //Thus after first iteration the biggest element will be in the end.
        int out, in;

        for (out = array.length - 1; out > 1; out--) { //n times we should compare n elements of array
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1, array);
                }
            }
        }
        return array;
    }

    private void swap(int curr, int next, long [] array) {
        long temp = array[curr];
        array[curr] = array[next];
        array[next] = temp;
    }


}


