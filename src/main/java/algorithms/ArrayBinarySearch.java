package algorithms;

/**
 * Created by anastasiia_911 on 10/25/16.
 * Method find() based on binary search
 */
public class ArrayBinarySearch {
    private long[] array;
    private int nElems;

    public ArrayBinarySearch(int max) {
        array = new long[max];
        nElems = 0;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int midPosition;

        while (true) {

            midPosition = (lowerBound + upperBound) / 2;

            if (array[midPosition] == searchKey)
                return midPosition;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (array[midPosition] < searchKey) {
                    lowerBound = midPosition + 1; //In upper half of array
                } else
                    upperBound = midPosition - 1; //In lower part of array

            }
        }

    }

}
