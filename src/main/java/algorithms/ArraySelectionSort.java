package algorithms;

/**
 * Created by anastasiia_911 on 10/25/16.
 * Сортировка выбором - проще чем пузырьковая сортировка: количество перестановок сокращаеться с N*N до N
 * Последовательно перебираем все елементы и самый маленький ставим на позицию 0.
 * следующий проход начинается с позиции 1.
 */
public class ArraySelectionSort {

    long[] array;
    int nElems;

    public ArraySelectionSort(int max) {

        array = new long[max];
        nElems = 0;

    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++)
                if (array[in] < array[min])
                    min = in;

            swap(out, min);
        }

    }

    private void swap(int first, int min) {
        long temp = array[first];

        array[first] = array[min];
        array[min] = temp;

    }


}
