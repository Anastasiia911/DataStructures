package tasks.copy;

public class Swapper<T> {

    private T data = null;

    public Swapper(T obj) {
        data = obj; //shallow copy - refer to the same obj
    }

    public T get() {
        return data;
    }

    public void set(T value) {
        data = value;
    }

    public void swap(Swapper<T> o) {
        T tmp = o.data; //take object
        o.data = data;
        data = tmp;
    }
//Method 1 : Changing the data underneath

    public void Swap(RefObject<Integer> p, RefObject<Integer> q)
    {
        int temp;
        temp = p.argvalue;
        p.argvalue = q.argvalue;
        q.argvalue = temp;
    }


    public final class RefObject<T>
    {
        public T argvalue;
        public RefObject(T refarg)
        {
            argvalue = refarg;
        }
    }


//    Swapper<String> a = new Swapper("Hello");
//    Swapper<String> b = new Swapper("World");
//  a.get().equals("Hello")
//  a.swap(b); // now a.get().equals("World")


}

