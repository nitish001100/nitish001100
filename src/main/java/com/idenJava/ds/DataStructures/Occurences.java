package com.idenJava.ds.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Occurences {

    static Map<Integer, Integer> occurence(int[]arr){
        Map<Integer,Integer> counts = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(counts.containsKey(arr[i])){
                Integer value = counts.get(arr[i]);
                value = value+1;
                counts.put(arr[i],value);
            }else {
                counts.put(arr[i],1);
            }
        }
        return counts;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 5, 10, 11, 100};
        occurence(arr).entrySet().stream().forEach(kv -> System.out.println(kv.getKey()+" "+ kv.getValue()));

    }
}
