package algorithms;

/**
 * Сортировка выбором - проще чем пузырьковая сортировка: количество перестановок сокращаеться с N*N до N
 * Последовательно перебираем все елементы и самый маленький ставим на позицию 0.
 * следующий проход начинается с позиции 1.
 */
public class ArraySelectionSort extends ArraySort {


    public long[] sort(long[] array) {
        int nElems = array.length;
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++)
                if (array[in] < array[min])
                    min = in;

            swap(out, min, array);
        }
        return array;
    }

    private void swap(int first, int min, long[] array) {
        long temp = array[first];

        array[first] = array[min];
        array[min] = temp;

    }


}
