import algorithms.ArrayBubbleSort;
import algorithms.ArrayInsertionSort;
import algorithms.ArraySelectionSort;
import algorithms.ArraySort;

public class MainApp {


    enum SortingAlgorithm {ArrayBubbleSort, ArrayInsertionSort, ArraySelectionSort}

    public ArraySort getSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        ArraySort arraySort = null;

        switch (sortingAlgorithm) {
            case ArrayBubbleSort:
                arraySort = new ArrayBubbleSort();
                break;

            case ArrayInsertionSort:
                arraySort = new ArrayInsertionSort();
                break;

            case ArraySelectionSort:
                arraySort = new ArraySelectionSort();
                break;
        }

        return arraySort;
    }


    public static void main(String[] args) {
        SortingAlgorithm[] allSortingAlgorithm = SortingAlgorithm.values();
        MainApp main = new MainApp();

        for (SortingAlgorithm sortingAlgorithm : allSortingAlgorithm) {

            ArraySort currArraySort = main.getSortingAlgorithm(sortingAlgorithm);


            //Random array
            //  long[] currArray = currArraySort.fillRandomLongs(100000);
            //Desc Array
            long [] currArray = currArraySort.fillDescLongs(1000);


            //  String arrayBeforeSortString = Arrays.toString(currArray);
            // System.out.println(arrayBeforeSortString);

            long start = System.nanoTime();

            currArraySort.sort(currArray);

            long time = System.nanoTime() - start;
            System.out.println(sortingAlgorithm.toString()+" ");
            System.out.println(time + " nano seconds");
            double timeSeconds = (double) time / 100000;
            System.out.println(timeSeconds + " milli seconds\n");

            //String arrayAfterSortString = Arrays.toString(currArray);
            // System.out.println(arrayAfterSortString);

        }
    }
}


