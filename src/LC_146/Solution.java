package LC_146;

import java.util.*;

public class Solution {
    private int cap;
    private LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();
    public Solution(int capacity) {
       this.cap =  capacity;
    }
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.put(key, value);
            makeRecently(key);
            return;
        }
        if(cache.size() >= cap){
            int oldkey = cache.keySet().iterator().next();
            cache.remove(oldkey);
        }
        cache.put(key, value);
    }
    public  void makeRecently(int key){
        int value = cache.get(key);
        cache.remove(key);
        cache.put(key, value);
    }
}
