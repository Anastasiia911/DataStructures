package algorithms;

import java.util.HashMap;

/**
 * Created by anastasiia_911 on 7/18/18.
 */
public class Fibonaccii {

    public long getFibonacciByIndex(int index) {
        int fibonacci = 1;
        if (index < 0) {
            return 0;
        } else if (index < 2) {
            return fibonacci;
        } else {
            return getFibonacciByIndex(index - 1) + getFibonacciByIndex(index - 2);
        }
    }

    public long getFibonacciByIndexMemorizing(int index) {
        long fibonacciValue;
        HashMap<Integer, Long> fibonacciMap = new HashMap();

        if (index < 0) {
            return 0;
        } else if (index < 2) {
            return 1;
        } else if (fibonacciMap.containsKey(index)) {
            return fibonacciMap.get(index);
        } else {
            fibonacciValue = getFibonacciByIndex(index - 1) + getFibonacciByIndex(index - 2);
            fibonacciMap.put(index, fibonacciValue);
            return fibonacciValue;
        }}

        public long getFibonacciByIndexNotRecursive(int index){
            long fibonacciValue = 0;



            return fibonacciValue;
    }




}
