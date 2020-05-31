package com.idenJava.ds.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class DuplicaeCharactersInString {

    static Map<Character, Integer> duplicateCharacters(char[] charArr) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            if (map.containsKey(charArr[i])) {
                int value = map.get(charArr[i]);
                map.put(charArr[i],value+1);
            } else {
                map.put(charArr[i], 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "Programming";
        duplicateCharacters(str.toCharArray()).entrySet().stream().forEach(kv -> System.out.println(kv.getKey()+" " + kv.getValue()));
    }
}
