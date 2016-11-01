package dataStructures;

/**
 * LIFO - STACK implementation
 */
public class Stack {

    private int maxSize;
    private long[] array;
    private int top; //top of stack

    //Constructor

    public Stack(int s) {
        maxSize = s;
        array = new long[s];
        top = -1; //No elems in Stack

    }

    public void push(long entry) {
        array[++top] = entry;
    }

    public long pop() {
        return array[top--];

    }

    public long peek() {
        return array[top];
    }

    public boolean isEmpty(){

        return (top==-1);
    }

    public boolean isFull(){
        return (top==maxSize-1);
    }

}
