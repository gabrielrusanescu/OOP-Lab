import java.util.*;
import java.lang.*;

public class Array {
    //Vectorul in care se vor retine elementele
    private Vector vector;

    //Constructor clasei
    public Array() {
        //Instantierea vectorului cu elemente
        vector = new Vector();
    }

    //Metoda care adauga un element in vector, folosind pozitia curenta
    public void addElement(Integer x) {
        vector.add(x);
    }

    //Metoda care adauga un element in vector, tinand cont de pozitia indicata
    public void addElement(Integer x, int poz) {
        if(poz >= 0 && poz <= vector.size()) {
            vector.add(poz, x);
        }
    }

    //Metoda care returneaza elementul aflat in vector la pozitia indicata
    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    //Metoda ce intoarce numarul de elemente din vector
    public int getSize() {
        return vector.size();
    }

    //Metoda pentru stergerea unui element din vector
    public boolean remove(Integer x) {
        return vector.remove(x);
    }

    //Metoda pentru stergerea elementului de pe pozitia pos din vector
    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }

    //Metoda uzitata pentru afisarea unui obiect de tip Array
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
    public Vector vector;
    public SortedArray(){
        vector = new Vector();
    }
    public int getSize(){
        return vector.size();
    }
    public int getElement(int poz) {
        return (int)vector.elementAt(poz);
    }
    public void setElement(int elem, int poz) {
        vector.setElementAt((int)elem, poz);
    }
    public void addElement(int x){
        int size = getSize();
        for (int i = 0; i < size - 1; ++i) {
            if(x > getElement(i)) {
                for(int j = i + 1; j < size; ++j){
                    int elemj1 = getElement(j+1)
                    setElement(getElement(j), )
                }
            }
        }
    }

}