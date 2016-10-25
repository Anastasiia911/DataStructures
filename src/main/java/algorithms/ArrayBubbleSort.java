package algorithms;

/**
 * Created by anastasiia_911 on 10/25/16.
 * Realisation of simple BUBBLE SORT. Complexity N*N
 */
public class ArrayBubbleSort {

        private long[] array;
        private int nElems;

        public ArrayBubbleSort(int max) {
            array = new long[max];
            nElems = 0;
        }

        public void bubbleSort(){ //Bubble sort :compare elements one by one and move their places if first one is more then second.
            //Thus after first iteration the biggest element will be in the end.
            int out, in;

            for (out = nElems-1;out>1;out--){ //n times we should compare n elements of array
                for (in=0; in<out; in++){
                    if (array[in]>array[in+1]){
                        swap(in, in+1);
                    }
                }
            }
        }

        private void swap (int curr, int next){
            long temp = array[curr];
            array[curr]=array[next];
            array[next]=temp;
        }

    }


