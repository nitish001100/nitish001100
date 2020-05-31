package com.codeWars;

public class Kata1 {
    public static void main(String[] args) {
        int[] arr = {3,234,25,345,45,34,234,235,345};
        int[] buffer = Kata0.splitAndAdd(arr, 3);

        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] +" ");
        }
    }
}

class Kata0 {
    public static int[] splitAndAdd(int[] numbers, int n) {

        if(n==0)
            return numbers;

        int[] buffer = null;

        while (n > 0) {
            int ptr1 = 0;
            ptr1 = numbers.length/2-1;
            if (numbers.length%2 == 0) {
                buffer = new int[numbers.length/2];
            }
            else {
                buffer = new int[(numbers.length/2)+1];
            }

            int ptr2 = numbers.length - 1;
            int ptr3 = buffer.length - 1;
            while (ptr1 >= 0) {
                buffer[ptr3] = numbers[ptr1] + numbers[ptr2];
                ptr1 -= 1;
                ptr2 -= 1;
                ptr3 -= 1;
            }
            if (numbers.length%2 != 0) {
                buffer[ptr3] = numbers[ptr2];
            }
            numbers = buffer;

            n-=1;

            if(numbers.length == 1)
                return buffer;
            else
                continue;
        }

        return buffer;
    }

}
