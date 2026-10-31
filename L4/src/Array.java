import java.util.*;

public class Array {
    private Vector vector;

    public Array() {
        vector = new Vector();
    }

    public void addElement(Integer x) {
        vector.add(x);
    }

    public void addElement(Integer x, int poz) {
        if(poz >= 0 && poz <= vector.size()) {
            vector.add(poz, x);
        }
    }

    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int getSize() {
        return vector.size();
    }

    public boolean remove(Integer x) {
        return vector.remove(x);
    }

    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }

    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }

    public void sort() {
        Collections.sort(vector);
    }
}

class SortedArray extends Array {
    @Override
    public void addElement(Integer x) {
        super.addElement(x);
        super.sort();
    }
}

class MyStack {
    private Array array;

    public MyStack() {
        array = new Array();
    }

    public void push(Integer x) {
        array.addElement(x);
    }

    public Integer pop() {
        int size = array.getSize();
        if (size == 0) {
            return null;
        }
        int topIndex = size - 1;
        Integer topElement = array.get(topIndex);
        array.remove(topIndex);
        return topElement;
    }

    public int getSize() {
        return array.getSize();
    }

    @Override
    public String toString() {
        return array.toString();
    }
}

class main {
    public static void main(String[] args) {
        SortedArray arr = new SortedArray();
        arr.addElement(5);
        arr.addElement(2);
        arr.addElement(9);
        arr.addElement(1);
        System.out.println("SortedArray: " + arr);

        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack:" + stack);
        System.out.println("pop" + stack.pop());
        System.out.println("Stack dupa pop:" + stack);
    }
}