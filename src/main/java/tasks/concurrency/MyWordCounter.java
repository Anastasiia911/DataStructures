package tasks.concurrency;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by anastasiia_911 on 7/18/18.
 */

public class MyWordCounter implements WordCounter {

    //value in ConcurrentHashMap volatile - that makes counting thread safe
    private ConcurrentHashMap<String, Integer> wordMap = new ConcurrentHashMap<>();

    @Override
    public void add(String word) {

        wordMap.compute(word, (key, value) -> value == null ? 1 : value + 1);
    }

    @Override
    public int getCount(String word) {

        return wordMap.getOrDefault(word,0);
    }


}
