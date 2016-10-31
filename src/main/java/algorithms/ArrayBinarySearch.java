package algorithms;

/**
 * Created by anastasiia_911 on 10/25/16.
 * Method find() based on binary search (each time divide array length on 2 and check if middle element more or less then )
 * search element.
 *
 */
public class ArrayBinarySearch {

    static int arraylength = 10000;
    static long[] array = new long[arraylength];
    static int nElems = 0;
    int maxSize = 10000;

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public int find (long searchKey) { //Binary search:
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


