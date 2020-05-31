package com.geeksOfGeeks.amazon;

public class SumCoin {

    static int minCoins(int coins[], int m, int V)
    {
        if (V == 0) return 0;
        int res = Integer.MAX_VALUE;
        for (int i=0; i<m; i++) {
            if (coins[i] <= V) {
                int sub_res = minCoins(coins, m, V-coins[i]);
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int input = 10;
        int[] arr = {1, 3, 5, 7};
        System.out.println(minCoins(arr, arr.length, input));
    }
}
