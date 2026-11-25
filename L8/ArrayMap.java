package lab08;

import java.util.*;
import java.lang.*;
public class ArrayMap<K, V> extends AbstractMap<K,V >{
	private final ArrayList<ArrayMapEntry<K, V>> entries = new ArrayList<>();
    	public Set<Map.Entry<K, V>> entrySet() {
	        return new AbstractSet<Map.Entry<K, V>>() {
           		public Iterator<Map.Entry<K, V>> iterator() {
                		Iterator<ArrayMapEntry<K, V>> it = entries.iterator();
                		return new Iterator<Map.Entry<K, V>>() {
                   			public boolean hasNext() { return it.hasNext(); }
                    			public Map.Entry<K, V> next() { return it.next(); }
                    			public void remove() { it.remove(); }
                		};
            	}
            	public int size() { return entries.size(); }
        };
    }

    public int size() { return entries.size(); }

    public V put(K key, V value) {
        for (ArrayMapEntry<K, V> e : entries) {
            if (Objects.equals(e.getKey(), key)) {
                return e.setValue(value);
            }
        }
        entries.add(new ArrayMapEntry<>(key, value));
        return null;
    }
}
