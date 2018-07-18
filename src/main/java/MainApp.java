import algorithms.*;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class MainApp {


    public static void main(String[] args) {
        Fibonaccii fibonaccii = new Fibonaccii();
        long start = System.nanoTime();
        long f = fibonaccii.getFibonacciByIndex(50);
        long end = System.nanoTime();

        long start1 = System.nanoTime();
        long end1 = System.nanoTime();

        long time = (end - start);
        long f1 = fibonaccii.getFibonacciByIndexMemorizing(50);
        long time1 = (end1 - start1);
       // long s = TimeUnit.NANOSECONDS.toSeconds(time);

        log.info("Result of recursive search is  :{} , seconds taken : {}", f, time);
        log.info("Result of recursive memorizing search is  :{} , seconds taken : {}", f1, time1);

    }
}



