package service;

import algorithms.ArrayBubbleSort;
import algorithms.ArrayInsertionSort;
import algorithms.ArraySelectionSort;
import algorithms.ArraySort;

public class AlgorithmService {

    enum SortingAlgorithm {ArrayBubbleSort, ArrayInsertionSort, ArraySelectionSort}

    public ArraySort getSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        ArraySort arraySort = null;
        SortingAlgorithm[] allSortingAlgorithm = SortingAlgorithm.values();

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
}
