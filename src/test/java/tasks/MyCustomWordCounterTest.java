package tasks;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by anastasiia_911 on 7/23/18.
 */
@RunWith(JUnit4.class)
public class MyCustomWordCounterTest {

    @Test
    public void add() throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        MyCustomWordCounter wordCounter = new MyCustomWordCounter();
        //executorService.submit();
        wordCounter.add("Me");

    }

    @Test
    public void getCount() throws Exception {
    }


}
