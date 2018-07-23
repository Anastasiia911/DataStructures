package tasks;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by anastasiia_911 on 7/23/18.
 */
public class MyCustomWordCounter implements WordCounter {

    //LongAdder since java 8
    private final HashMap<String, LongAdder> wordCounter = new HashMap<>();

    @Override
    public void add(String word) {

        wordCounter.computeIfAbsent(word, (value) -> new LongAdder()).increment();

    }

    @Override
    public int getCount(String word) {

        return wordCounter.get(word).intValue();
    }




}
