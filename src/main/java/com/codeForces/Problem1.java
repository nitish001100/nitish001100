package com.codeForces;

import java.util.Scanner;

public class Problem1 {
    /**
     Wrong Subtraction
     */

    static int solution(int num, int attempt){
        for (int i = 0; i < attempt; i++) {
            if(num % 10 == 0){
                num = num/10;
            }else {
                num = num-1;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int attempt = Integer.parseInt(str[1]);

        System.out.println(solution(num, attempt));



    }
}
