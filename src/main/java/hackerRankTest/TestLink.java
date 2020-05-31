package hackerRankTest;

import java.util.Scanner;

public class TestLink {
    static boolean flag = true;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.valueOf(scanner.nextLine());

        int[] reqToMakePowerFul = new int[N];
        int[] buffer = new int[N];

        String[] strArr = scanner.nextLine().split(" ");


        for (int i = 0; i < strArr.length; i++) {
            reqToMakePowerFul[i] = Integer.valueOf(strArr[i]);
            buffer[i] = Integer.valueOf(strArr[i]);
        }

        int[] quantity = new int[N];

        String[] quantityArr = scanner.nextLine().split(" ");


        for (int i = 0; i < quantityArr.length; i++) {
            quantity[i] = Integer.valueOf(quantityArr[i]);
        }

        int count = 0;


        count = checkCount(reqToMakePowerFul, buffer, quantity, count);
        System.out.println(count);
    }


    static int checkCount(int[] reqToMakePowerFul, int[] buffer, int[] quantity, int count) {

        for (int i = 0; i < quantity.length; i++) {
            if(quantity[i] == 0)
                return 0;
        }

        while (flag) {
            for (int i = 0; i < reqToMakePowerFul.length; i++) {
                reqToMakePowerFul[i] = reqToMakePowerFul[i] + buffer[i];
                if (reqToMakePowerFul[i] > quantity[i]) {
                    flag = false;
                    break;
                }
            }
            count += 1;
        }
        return count;
    }
}