import algorithms.ArrayBubbleSort;
import algorithms.ArrayInsertionSort;
import algorithms.ArraySelectionSort;
import algorithms.ArraySort;

import java.util.Arrays;

public class MainApp {

    public ArraySort getSortingAlgorithm(Object sortType) {
        ArraySort arraySort;


        if (sortType == "ArrayBubbleSort") {
            arraySort = new ArrayBubbleSort();
        }

        if (sortType == "ArrayInsertionSort") {
            arraySort = new ArrayInsertionSort();
        }
        if (sortType == "ArraySelectionSort") {
            arraySort = new ArraySelectionSort();
        } else {
            arraySort = new ArrayBubbleSort();

        }
        return arraySort;
    }


    public static void main(String[] args) {
        MainApp main = new MainApp();
        ArraySort currArraySort = main.getSortingAlgorithm("ArrayBubbleSort");
        long [] currArray = currArraySort.fillRandomLongs(100);

        String arrayBeforeSortString = Arrays.toString(currArray);
        System.out.println(arrayBeforeSortString);

        long start = System.nanoTime();

        currArraySort.sort(currArray);

        long time = System.nanoTime()-start;
        System.out.println(time+" nano seconds\n");
        double timeSeconds =(double)time/1000000;
        System.out.println(timeSeconds+" milli seconds\n");

        String arrayAfterSortString =Arrays.toString(currArray);
        System.out.println(arrayAfterSortString);

    }


}


