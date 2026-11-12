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