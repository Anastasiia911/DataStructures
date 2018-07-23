package tasks;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by anastasiia_911 on 7/19/18.
 */
@Slf4j
public class MyDeadLockOneObject {

    ExecutorService executorService = Executors.newFixedThreadPool(2);

    String st1 = "First message";

    private void runThread1() {

        synchronized (this) {
            log.info("Synchronized Thread1 on this...");
            try {
                Thread.sleep(7000);
                log.info("Thread1 woke up and trying to acquire log on st1...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (st1) {

                System.out.println(st1);
            }
        }
    }

    private void runThread2() {

        synchronized (st1) {
            log.info("Synchronized Thread2 on st1...");
            try {
                Thread.sleep(7000);
                log.info("Thread2 woke up and trying to acquire log on this...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {

                System.out.println(st1 );
            }
        }
    }

    public void createLock() {

        executorService.submit(this::runThread1);
        executorService.submit(this::runThread2);

        executorService.shutdown();
    }

}
