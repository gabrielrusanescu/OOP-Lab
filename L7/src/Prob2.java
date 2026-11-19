package Problema2;
import java.util.*;
class LinkedSet extends LinkedList implements Set {
    public LinkedSet(){
        super();
    }
    public boolean add(Object obj){
        if(contains(obj)) {
            return false;
        }
        super.add(obj);
        return true;
    }
    public void add(int index, Object obj){
        if(!contains(obj)) super.add(index, obj);
    }
    public Object set(int index, Object obj) throws IllegalArgumentException {
        if(contains(obj)) {
            throw new IllegalArgumentException("deja exista obj");
        }
        Object ret = get(index);
        super.set(index, obj);
        return ret;
    }
}