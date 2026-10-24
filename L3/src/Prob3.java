class MyArray {
    private int v[];
    private int size;

    public MyArray() {
        this(100);
    }

    public MyArray(int length) {
        size = 0;
        v = new int[length];
    }

    public int get(int poz) {
        if(poz < size) {
            return v[poz];
        } else {
            return -1;
        }
    }

    public void set(int pos, int value) {
        v[pos] = value;
        //size++;
        if(pos>=size){
            size = pos+1;
        }
    }

    public int getSize() {
        return size;
    }
}

class MyQueue{
    private MyArray arr;
    private final int inf = 9500;
    private int primul, ultimul, nrelem;
    MyQueue(MyArray a, int p, int u, int lungime){
        arr = a;
        primul = p;
        ultimul = u;
        nrelem = lungime;
    }
    MyQueue(){
        this(new MyArray(100), 0, 0, 0);
    }
    public int getSize(){
        return nrelem;
    }
    public void enqueue(int value){
        arr.set(ultimul, value);
        ultimul++;
        nrelem++;
    }
    public int dequeue(){
        int ret = -1;
        if(nrelem > 0){
            ret = arr.get(primul);
            primul++; nrelem--;
        }
        return ret;
    }
    public boolean isEmpty(){
        if(nrelem <= 0){
            return true;
        }
        return false;
    }
    public String toString(){
        int p = primul;
        String ret = "";
        while(p < ultimul){
            ret = ret + ", " + arr.get(p);
            p++;
        }
        return ret;
    }
}

class Test {
    public static void main(String args[]) {
        MyQueue queue = new MyQueue();
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(-1);
        queue.enqueue(2);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        System.out.println(queue);
        queue.enqueue(9);
        queue.enqueue(queue.dequeue());
        queue.enqueue(11);
        queue.enqueue(22);
        System.out.println(queue);
        while(!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println("");
        System.out.println(queue);
    }
}

public class Prob3 {
}
