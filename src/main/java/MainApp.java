import algorithms.*;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class MainApp {


    public static void main(String[] args) {
        Fibonaccii fibonaccii = new Fibonaccii();
        long start = System.nanoTime();
        long f = fibonaccii.getFibonacciByIndex(18);
        long end = System.nanoTime();

        long time = (end - start);

        long start1 = System.nanoTime();
        long f1 = fibonaccii.getFibonacciByIndexMemorizing(18);
        long end1 = System.nanoTime();

        long time1 = (end1 - start1);
       // long s = TimeUnit.NANOSECONDS.toSeconds(time);

        long start2 = System.nanoTime();
        long f2 = fibonaccii.getFibonacciByIndexNotRecursive(18);
        long end2 = System.nanoTime();

        long time2 = (end2 - start2);

        log.info("Result of recursive search is  :{} , nano seconds taken : {}", f, time);
        log.info("Result of recursive memorizing search is  :{} , nano seconds taken : {}", f1, time1);
        log.info("Result of non recursive search is  :{} , nano seconds taken : {}", f2, time2);

    }
}



