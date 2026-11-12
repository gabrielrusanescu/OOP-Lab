import java.util.*;
import java.lang.*;
class SortedVector extends Vector{
    Comparator c;
    public SortedVector(Comparator c){
        this.c = c;
    }
    public SortedVector(){
        this(null);
    }
    public boolean add(Object o){
        super.add(o);
        Collections.sort(this, c);
        return true;
    }
}

class Pair{
    Object a, b;
    public Pair(Object a, Object b){
        this.a = a;
        this.b = b;
    }
    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof Pair)) return false;
        Pair p = (Pair) o;
        if(this.a == p.a && this.b == p.b) return true;
        return false;
    }
    public String toString(){
        return ""+ a + " " + b;
    }
}