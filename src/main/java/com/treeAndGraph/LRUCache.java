package com.treeAndGraph;

import java.sql.Timestamp;
import java.util.*;

public class LRUCache {

    static Hashtable<Integer, List<Long>> ht = new Hashtable<>();
    static Map<Integer, Integer> map = new HashMap<>();
    static int capacity = 0;

    public static void main(String[] args) {
        capacity = 2;

        LRUCache lruCache = new LRUCache();
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        int output0 = lruCache.get(1);
        System.out.println("Get(1): " + output0);

        lruCache.put(3, 3); // evicts 2
        int output1 = lruCache.get(2); // return// -1 (not found)
        System.out.println("Get(2): " + output1);


        lruCache.put(4, 4);


        int output2 = lruCache.get(1);
        System.out.println("Get(1): " + output2);

        int output3 = lruCache.get(3);
        System.out.println("Get(3): " + output3);

        int output4 = lruCache.get(4);
        System.out.println("Get(4): " + output4);
    }

    private int get(int key) {
        if (map.containsKey(key)) {
            ArrayList<Long> var = new ArrayList<>();
            if (ht.containsKey(key)) {
                List<Long> getCallsInfo = ht.get(key);
                var.add(getCallsInfo.get(0) + 1);
                var.add(getCurrentTimeStamp());
                ht.put(key, var);
            } else {
                var.add(1L);
                var.add(getCurrentTimeStamp());
                ht.put(key, var);
            }
            return map.get((int) key);
        } else {
            return -1;
        }
    }

    private Long getCurrentTimeStamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    private void put(int key, int value) {

        if (map.size() == capacity) {

            Set<Map.Entry<Integer, List<Long>>> var = ht.entrySet();

            Iterator<Map.Entry<Integer, List<Long>>> itr = var.iterator();

            int minKey = Integer.MAX_VALUE;

            Long minValue = Long.MAX_VALUE;

            while (itr.hasNext()) {

                Map.Entry<Integer, List<Long>> var0 = itr.next();

                if (var0.getValue().get(0) < minValue) {

                    minValue = var0.getValue().get(0);

                    minKey = var0.getKey();


                } else if (var0.getValue().get(0) == minValue) {

                    Long lessTimeStampValue = Long.MAX_VALUE;
                    int lessTimeStampKey = 0;

                    while (itr.hasNext()) {

                        Map.Entry<Integer, List<Long>> var1 = itr.next();

                        if (var1.getValue().get(1) < lessTimeStampValue) {

                            lessTimeStampValue = var1.getValue().get(1);
                            lessTimeStampKey = var1.getKey();

                        }
                    }
                    map.remove(lessTimeStampKey);
                }
            }
            map.remove(minKey);
        }

        // Adding a new entry in Map and HashTable.

        map.put(key, value);

        ArrayList<Long> var = new ArrayList<>();

        var.add(0L);

        var.add(getCurrentTimeStamp());

        ht.put(key, var);

    }
}
