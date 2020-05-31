package com.idenJava.hackerRank;

import java.io.*;
import java.util.*;
import static com.idenJava.hackerRank.Result.countGroups;

class Result {


    public static int countGroups(List<String> related) {

        int size = related.get(0).toCharArray().length;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < related.size(); i++) {
            char[] charArr = related.get(i).toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                matrix[i][j] = Integer.parseInt(String.valueOf(charArr[j]));
            }
        }


        int maxRegion = 0;


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if(matrix[row][column] == 1){
                    int regionSize  = getRegionSize(matrix, row, column);
                    maxRegion = Math.max(regionSize , maxRegion);

                }
            }
        }
    return maxRegion;
    }


    static int getRegionSize(int[][] matrix, int row, int column){
        if(row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length){
            return 0;
        }

        if(matrix[row][column] == 0 ){
            return  0;
        }

        matrix[row][column] = 0;

        int size = 1;


        for(int r = row-1; r <= row+1 ; r++){
            for(int c =column -1 ; c <=column+1 ; c++){
                if(r!=row || c!=column){
                    size = size+getRegionSize(matrix, r, c);
                }

            }
        }
        return size;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int relatedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> related = new ArrayList<>();

        for (int i = 0; i < relatedCount; i++) {
            String relatedItem = bufferedReader.readLine();
            related.add(relatedItem);
        }

        int result = Result.countGroups(related);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/

        List<String> list = new ArrayList<>();
        list.add("1100");
        list.add("1110");
        list.add("0110");
        list.add("0001");

        System.out.println(countGroups(list));
    }
}
