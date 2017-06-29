package dataStructures;

/**
 */
public abstract class AbstractQueue <T> {

    private int size;
    private T[] array;

    public AbstractQueue(int size){
        this.size =size;
        array = (T[])new Object[size];
    }
    public String printEntry(int index){
        return String.format("%04d%", index, array[index]);
    }

    public void print (){
        for (int i = 0; i<size;i++)
            System.out.println(printEntry(i));
    }

    public abstract void put(T element);
    public abstract T get();
    public abstract T peek();
    public abstract boolean isEmpt ();

}


