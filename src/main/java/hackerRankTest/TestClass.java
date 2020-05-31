package hackerRankTest;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass {

    static int N = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");

        N = Integer.valueOf(str[0]);

        int K = Integer.valueOf(str[1]);


        int[][] visited = new int[N][N];

        for (int itr1 = 0; itr1 < visited.length; itr1++) {
            for (int itr2 = 0; itr2 < visited.length; itr2++) {
                visited[itr1][itr2] = 0;
            }
        }


        while (K > 0) {
            String[] strArr = scanner.nextLine().split(" ");
            int row = Integer.valueOf(strArr[0]);
            int col = Integer.valueOf(strArr[1]);

            fill(visited, row - 1, col - 1);

            int count = checkFreeCells(visited);

            System.out.print(count + " ");
            K -= 1;
        }

    }

    public static int checkFreeCells(int[][] visited) {
        int count = 0;
        for (int row = 0; row < visited.length; row++) {
            for (int col = 0; col < visited.length; col++) {
                if (!hmForCol.containsKey((int) col)) {
                    count = count + N;
                }
                if (!hmForRow.containsKey((int) row)) {
                    count = count + N;
                }
            }
        }
        return count;
    }

    public static void fill(int[][] visited, int row, int col) {
        for (int i = 0; i < N; i++)
            visited[row][i] = 1;

        for (int i = 0; i < N; i++) {
            visited[i][col] = 1;
        }

        if (!hmForRow.containsKey(row))
            hmForRow.put(row, true);

        if (!hmForCol.containsKey(col))
            hmForCol.put(col, true);

    }

    static HashMap<Integer, Boolean> hmForRow = new HashMap<>();
    
    static HashMap<Integer, Boolean> hmForCol = new HashMap<>();
}
