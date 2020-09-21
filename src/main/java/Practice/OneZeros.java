package Practice;

public class OneZeros {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1};
        printArray(sort(arr));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] sort(int[] arr) {
        int leftPtr = 0;
        int rightPtr = arr.length - 1;

        while (leftPtr < rightPtr) {
            if (arr[rightPtr] == 0) {
                arr = swap(arr, leftPtr, rightPtr);
            } else if (arr[rightPtr] == 1) {
                rightPtr -= 1;
            }

            if (arr[leftPtr] == 1) {
                arr = swap(arr, leftPtr, rightPtr);
            } else {
                leftPtr += 1;
            }
        }
        return arr;
    }

    public static int[] swap(int[] arr, int leftPtr, int rightPtr) {
        int temp = 0;
        temp = arr[leftPtr];
        arr[leftPtr] = arr[rightPtr];
        arr[rightPtr] = temp;
        return arr;
    }
}
