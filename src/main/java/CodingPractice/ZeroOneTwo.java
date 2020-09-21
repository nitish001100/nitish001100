package CodingPractice;

public class ZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 0, 1};
        print(arrangeOneAndZeros(arr));
    }

    public static int[] arrangeOneAndZeros(int[] arr) {
        int leftPtr = 0;
        int rightPtr = arr.length - 1;

        while (leftPtr < rightPtr) {
            if (arr[leftPtr] == 0) {
                leftPtr += 1;
            } else if (arr[leftPtr] == 1) {
                swap(arr, leftPtr, rightPtr);
            }

            if (arr[rightPtr] == 1) {
                rightPtr -= 1;
            } else if (arr[rightPtr] == 0) {
                swap(arr, leftPtr, rightPtr);
            }
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
