package com.geeksOfGeeks.amazon;

public class SendOccurences {
    static int solution(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        int maxOccurence = 0;
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                count[A[i]]++; // change 2
                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
            } else {
                count[A[i]] = 1;
            }
        }
        return A[index];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 1, 3, 1};
        System.out.println(solution(3, arr));

    }
}
