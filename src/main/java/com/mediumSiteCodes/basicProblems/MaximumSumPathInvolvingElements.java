package com.mediumSiteCodes.basicProblems;


public class MaximumSumPathInvolvingElements {
    public static void main(String[] args) {
        int x[] = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int y[] = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        int sum = maxSum(x, y);
        System.out.println(sum);
    }

    public static int maxSum(int[] X, int[] Y) {

        int sum = 0, sum_x = 0, sum_y = 0, m = X.length, n = Y.length, i = 0, j = 0;

        // loop till X and Y are not empty
        while (i < m && j < n)
        {
            // to handle duplicate elements in X
            while (i < m-1 && X[i] == X[i+1]) {
                sum_x += X[i++];
            }

            // to handle duplicate elements in Y
            while (j < n-1 && Y[j] == Y[j+1]) {
                sum_y += Y[j++];
            }

            // if current element of Y is less than current element of X
            if (Y[j] < X[i])
            {
                sum_y += Y[j];
                j++;
            }

            // if current element of X is less than current element of Y
            else if (X[i] < Y[j])
            {
                sum_x += X[i];
                i++;
            }

            else // if (X[i] == Y[j])
            {
                // consider maximum sum and include value of current cell
                sum += Integer.max(sum_x, sum_y) + X[i];

                // move both indices by 1 position
                i++;
                j++;

                // reset both sums
                sum_x = 0;
                sum_y = 0;
            }
        }

        // process remaining elements of X (if any)
        while (i < m)
            sum_x += X[i++];

        // process remaining elements of Y (if any)
        while (j < n)
            sum_y += Y[j++];

        sum += Integer.max(sum_x, sum_y);
        return sum;
    }
}
