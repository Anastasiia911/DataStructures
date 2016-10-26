package algorithms;

/**
 * Created by anastasiia_911 on 10/26/16.
 * Complexity of this algorithm is N*N
 * Faster if array is partially sorted
 *
 *
 */
public class ArrayInsertionSort {

    long [] array;
    int nElems;

    public ArrayInsertionSort(int max){

        array = new long[max];
        nElems=0;

    }

    public void insertionSort(){
        int in, out;

        for (out=1; out<nElems;out++) //out - marker for sort
        {
            long temp = array[out]; //copy element-marker
            in =out; //start element movement starting from marker out

            while(in>0&&array[in-1]>=temp)
            {
                array[in]=array[in-1];
                --in;
            }
            array[in]=temp;//insertion of marker element
        }
    }

}
