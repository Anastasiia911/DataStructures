package algorithms;

import static java.lang.Math.random;


public abstract class ArraySort {

    public long[]  sort(long[] array) {

        return array;
    }

    public long[] fillRandomLongs(int maxSize) {
        long[] array = new long[maxSize];
        long n;
        for (int j = 0; j < maxSize; j++) {
            //random longs
            n = (long) (random() * (maxSize - 1));
            array[j] = n;
        }

        return array;
    }

}
