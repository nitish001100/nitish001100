package com.algorithms.graphColuringProblem;

import java.util.Arrays;


/** https://www.youtube.com/watch?v=dQr4wZCiJJ4 */

public class HamiltonianCycleAlgo {

    static int[] path;
    static int V = 5;

    public static void main(String[] args) {

        int graph[][] = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0},
        };

        path = new int[V];

        Arrays.fill(path, -1);

        int positionWhereToKeepVertex = 0;

        path[positionWhereToKeepVertex] = 0 /** => 0th vertex */;

        positionWhereToKeepVertex += 1;

        hamiltonianCycleAlgo(graph, positionWhereToKeepVertex);

        //          Output:-

        /**

         0 1 2 4 3
         0 1 3 4 2
         0 3 1 2 4
         0 3 1 4 2
         0 3 4 1 2
         0 3 4 2 1

         (0)--(1)--(2)
         |   / \   |
         |  /   \  |
         | /     \ |
         (3)-------(4)

         */
    }

    private static void print() {
        for (int i = 0; i < path.length; i++)
            System.out.print(path[i] + " ");
    }

    private static boolean hamiltonianCycleAlgo(int[][] graph, int positionWhereToKeepVertex) {
        if (positionWhereToKeepVertex == V) {
            print();
            System.out.println();
        } else {
            for (int vertexWhichIHaveTOKeep = 0; vertexWhichIHaveTOKeep < V; vertexWhichIHaveTOKeep++) {
                if(isValid(graph, positionWhereToKeepVertex, vertexWhichIHaveTOKeep) == true){
                    path[positionWhereToKeepVertex] = vertexWhichIHaveTOKeep;
                    if(hamiltonianCycleAlgo(graph, positionWhereToKeepVertex+1) == true){
                        return true;
                    }
                    path[positionWhereToKeepVertex] = -1;
                }
            }
        }
        return false;
    }

    private static boolean isValid(int[][] graph, int positionWhereToKeepVertex, int vertexWhichIHaveTOKeep) {

        for (int i = 0; i < path.length ; i++) {
            if(path[i] == vertexWhichIHaveTOKeep){
                return false;
            }
        }

        // check for vertexWhichIHaveTOKeep and (positionWhereIHaveToKeep-1), sharing same edge or not.
        if(graph[path[positionWhereToKeepVertex-1]][vertexWhichIHaveTOKeep] == 0){
            return false;
        }

        return true;
    }
}
