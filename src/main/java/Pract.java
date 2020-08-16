import java.util.Scanner;

public class Pract {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        findingSum(arr);
        findingSum0(arr);
    }

    public static void findingSum0(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++)
            sum += (arr[i] * arr[i+1]);

        System.out.println(sum);
    }

    public static void findingSum(int[] arr) {
        int sum = 0;
        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                sum += (arr[itr1] * arr[itr2]);
                break;
            }
        }

        System.out.println(sum);
    }
}
