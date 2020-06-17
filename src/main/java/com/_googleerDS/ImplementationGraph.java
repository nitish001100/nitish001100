package com._googleerDS;


import java.util.HashMap;
import java.util.LinkedList;

public class ImplementationGraph {
    static int numOfVertex = 5;
    static int[][] grid = new int[numOfVertex][numOfVertex];

    ImplementationGraph() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                grid[row][col] = 0;
            }
        }
    }

    private void addConnections(int srcVertex, int destVertex) {
        grid[srcVertex][destVertex] = 1;
    }

    public static void main(String[] args) {

        ImplementationGraph implGraph = new ImplementationGraph();

        implGraph.addConnections(0, 1);
        implGraph.addConnections(0, 4);

        implGraph.addConnections(1, 0);
        implGraph.addConnections(1, 2);
        implGraph.addConnections(1, 3);
        implGraph.addConnections(1, 4);

        implGraph.addConnections(2, 1);
        implGraph.addConnections(2, 3);

        implGraph.addConnections(3, 1);
        implGraph.addConnections(3, 2);
        implGraph.addConnections(3, 4);

        implGraph.addConnections(4, 0);
        implGraph.addConnections(4, 1);
        implGraph.addConnections(4, 3);


        createGraph(grid);
    }

    public static void createGraph(int[][] grid) {
        HashMap<Integer, LinkedList<Integer>> graphTrace = new HashMap<>();

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                if (grid[row][col] == 1) {
                    if (!graphTrace.containsKey((int) row)) {
                        LinkedList addVertex = new LinkedList();
                        addVertex.add((int) col);
                        graphTrace.put(row, addVertex);
                    } else if (graphTrace.containsKey((int) row)) {
                        LinkedList<Integer> value = graphTrace.get((int) row);
                        value.add(col);
                        graphTrace.put(row, value);
                    }
                }
            }
        }


        graphTrace.entrySet().stream().forEach(keyValue -> {
            System.out.print("Vertex " + keyValue.getKey() + " having these connected edges " + keyValue.getValue() + "\n");
        });
    }
}
