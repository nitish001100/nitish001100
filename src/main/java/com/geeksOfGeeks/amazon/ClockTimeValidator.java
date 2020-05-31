package com.geeksOfGeeks.amazon;

import java.util.Arrays;

public class ClockTimeValidator {

    static public String solution(int A, int B, int C, int D, int E, int F) {

        int bufferVar = 0;
        Double testValue = 0.0;
        String resultNotFound = "NOT POSSIBLE";

        int[] numsArray = new int[]{A,B,C,D,E,F};

        Arrays.sort(numsArray);

        for (int i = 0; i < 6; i++){
            if (numsArray[i] > 5)
                bufferVar++;
            testValue = testValue + numsArray[i]*Math.pow(10.0,5.0-i);
        }

        if (bufferVar > 3){
            return null;
        }

        if ( testValue > 235959){
            return resultNotFound;
        }

        if (numsArray[4] > 5){
            bufferVar = numsArray[4];
            numsArray[4] = numsArray[2];
            numsArray[2] = bufferVar;
        }
        if (numsArray[2] > 5){
            bufferVar = numsArray[2];
            numsArray[2] = numsArray[3];
            numsArray[3] = bufferVar;
        }
        if (numsArray[2] > 5){
            bufferVar = numsArray[1];
            numsArray[1] = numsArray[2];
            numsArray[2] = bufferVar;
        }
        if (numsArray[2] > numsArray[4]){
            bufferVar = numsArray[4];
            numsArray[4] = numsArray[2];
            numsArray[2] = bufferVar;
        }
        return ("" + numsArray[0] + numsArray[1] + ":" + numsArray[2] + numsArray[3] + ":" + numsArray[4] + numsArray[5]);
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 4, 5, 9, 5, 9));
    }
}
