package com.algorithms.graphColuringProblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class GraphImplementation {

    static HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();
    static int numOfColours = 3;
    static int numOfVertex = 5;
    static int[] currentColourStatus = new int[numOfVertex];
    static int[][] matrix = null;

    public static void main(String[] args) {

        matrix = new int[][]{
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 1) {
                    add(row, col);
                }
            }
        }


        Iterator<Map.Entry<Integer, LinkedList<Integer>>> itr = graph.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, LinkedList<Integer>> var = itr.next();
            System.out.print(var.getKey() + " => ");
            var.getValue().stream().forEach(values -> System.out.print(values + " -> "));
            System.out.println();
        }
    }


    public void graphColour(int vertexToBeColour) {
        for (int c = 1; c <= numOfColours; c++) {
            if (isSafe(vertexToBeColour, c)) {
                currentColourStatus[vertexToBeColour] = c;
                if ((vertexToBeColour + 1) < numOfVertex) {
                    graphColour(vertexToBeColour + 1);
                } else {
                    print(currentColourStatus);
                    return;
                }
            }
        }
    }

    private void print(int[] currentColourStatus) {
        for (int i = 0; i < currentColourStatus.length; i++)
            System.out.print(currentColourStatus[i] + " ");
    }

    //Below is the code, to check whether neighbour node contains same colour or not.
    
    public boolean isSafe(int vertexToBeColour, int c) {
        for (int i = 0; i < numOfVertex; i++) {
            if(matrix[vertexToBeColour][i] == 1 && c == currentColourStatus[i]){
                return false;
            }
        }
        return true;
    }

    public static void add(int srcVertex, int destVertex) {
        if (graph.containsKey(srcVertex)) {
            LinkedList<Integer> destVertexList = graph.get(srcVertex);
            destVertexList.add(destVertex);
            graph.put(srcVertex, destVertexList);
        } else {
            LinkedList<Integer> destVertexList = new LinkedList<>();
            destVertexList.add(destVertex);
            graph.put(srcVertex, destVertexList);
        }
    }


}
