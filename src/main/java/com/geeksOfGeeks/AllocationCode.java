package com.geeksOfGeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllocationCode {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases-- > 0) {
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            int noOfHouses = Integer.parseInt(arr[0]);
            int budget = Integer.parseInt(arr[1]);

            String houses = scanner.nextLine();
            String[] houseArr = houses.split(" ");

            int[] housearr = new int[noOfHouses];

            for (int i = 0; i < houseArr.length; i++)
                housearr[i] = Integer.parseInt(houseArr[i]);

            int count = 0;
            int flagCount = 0;
            for (int i = 0; i < housearr.length; i++) {
                for (int j = 1; j < housearr.length; j++) {
                    if(count <= budget){
                        if((housearr[i]+housearr[j])<=budget) {
                            count = housearr[i] + housearr[j];
                        }else {
                            count = count + housearr[i];
                        }
                    }
                }
            }

        }
    }
}
