package dataStructures;

/**
 * FIFO
 */
public class Queue {

    private int maxSize;
    private int front;
    private int rear;
    private long[] array;

    public Queue(int s) {           //Constructor
        maxSize = s + 1;
        front = 0;
        rear = -1;
        array = new long[maxSize];   //array 1 cell more then requested
    }

    public void insert(long entry) {  //вставка в конец очереди
        if (rear == maxSize - 1)      //если последний елемент равен оконанию массива - перезатереть
            rear = -1;
        array[++rear] = entry;
    }

    public long remove() { //take entry from the beginning of queue
        long temp = array[front++];
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public long peek() {
        return array[front];
    }

    public boolean isFull() {
        return (rear + 2 == front || (front + maxSize - 2 == rear)); //?

    }

    public boolean isEmpty() {
        return (rear + 1 == front || (front + maxSize - 1 == rear)); //?
    }

    public int size() {
        if (rear > front)
            return rear - front + 1; //непрерывная последовательность
        else
            return (maxSize - front) + (rear + 1); //несвязная последовательность
    }

}


