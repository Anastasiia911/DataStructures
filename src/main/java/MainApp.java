import lombok.extern.slf4j.Slf4j;
import tasks.concurrency.MyCustomWordCounter;
import tasks.concurrency.MyWordCounter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class MainApp {


    public static void main(String[] args) {
//        Fibonaccii fibonaccii = new Fibonaccii();
//        long start = System.nanoTime();
//        long f = fibonaccii.getFibonacciByIndex(18);
//        long end = System.nanoTime();
//
//        long time = (end - start);
//
//        long start1 = System.nanoTime();
//        long f1 = fibonaccii.getFibonacciByIndexMemorizing(18);
//        long end1 = System.nanoTime();
//
//        long time1 = (end1 - start1);
//       // long s = TimeUnit.NANOSECONDS.toSeconds(time);
//
//        long start2 = System.nanoTime();
//        long f2 = fibonaccii.getFibonacciByIndexNotRecursive(18);
//        long end2 = System.nanoTime();
//
//        long time2 = (end2 - start2);
//
//        log.info("Result of recursive search is  :{} , nano seconds taken : {}", f, time);
//        log.info("Result of recursive memorizing search is  :{} , nano seconds taken : {}", f1, time1);
//        log.info("Result of non recursive search is  :{} , nano seconds taken : {}", f2, time2);
//
//
//         /* Usage example */
//        WordCounter wc = new MyWordCounter();
//        wc.add("hello");
//        wc.add("hello");
//        wc.add("world");
//        //assertEquals(2, wc.getCount("hello"));
//        //assertEquals(1, wc.getCount("world"));


        // MyDeadLockOneObject deadLock = new MyDeadLockOneObject();
        //  deadLock.createLock();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        MyWordCounter wordCounter = new MyWordCounter();

        MyCustomWordCounter wordCounter1 = new MyCustomWordCounter();

        executorService.submit(() -> wordCounter1.add("Me"));
        executorService.submit(() -> wordCounter1.add("Me"));
        executorService.submit(() -> wordCounter1.add("Me"));
        executorService.submit(() -> wordCounter1.add("Me"));

        System.out.println(wordCounter.getCount("Me"));

        System.out.println(wordCounter1.getCount("Me"));

        executorService.shutdown();



    }


}




