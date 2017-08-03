package list;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by bvenkatesan on 7/31/17.
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int size;

    LRUCache(int size) {
        super(size);

        this.size = size;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > this.size;
    }

    public void printList() {
        this.forEach((k, v) -> System.out.println("k:" + k +", v: " + v));
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put("balaji1", 1);
        lruCache.put("balaji2", 2);
        lruCache.put("balaji3", 3);
        lruCache.put("balaji1", 4);

        lruCache.printList();
    }
}
