package lab08;

import java.util.*;
import java.lang.*;

public class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
	private K key;
	private V value;
	public ArrayMapEntry(){
	key = null;
	value = null;
	}
	public ArrayMapEntry(K key, V value){
	this.key = key;
	this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public V setValue(V value) {
		V tmp = this.value;
		this.value = value;
		return tmp;
	}
	public String toString() {
		return key + "=" + value;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if (!(o instanceof Map.Entry)) return false;
		Map.Entry<?, ?> x = (Map.Entry<?, ?>) o;
		return Objects.equals(key, x.getKey()) && Objects.equals(value, x.getValue());
	}
	public int hashCode(){
		return Objects.hashCode(key) ^ Objects.hashCode(value);
	}
}
