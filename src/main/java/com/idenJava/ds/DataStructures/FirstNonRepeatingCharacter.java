package com.idenJava.ds.DataStructures;

public class FirstNonRepeatingCharacter {

    static void firstNonRepeatingCharacter(String str){
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < charArray.length; j++) {
                if(charArray[i]==charArray[j]){
                    flag = true;
                }else {
                    i=j;
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "aaabcccdeeef";
        firstNonRepeatingCharacter(str);
    }
}
