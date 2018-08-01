package tasks.concurrency;


public interface WordCounter {
    void add(String word);
    int getCount(String word);
}
