package com.treeAndGraph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {




    static class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    ;

    List<List<Integer>> adjacencyList = new LinkedList<>();

    public Graph(List<Edge> edges, boolean flag) {
        for (int i = 0; i < edges.size(); i++)
            adjacencyList.add(i, new LinkedList<>());

        for (Edge current : edges) {
            adjacencyList.get(current.src).add(current.dest);

            if (flag)
                adjacencyList.get(current.dest).add(current.src);
        }
    }


    private static void printGraph(Graph graph) {
        int src = 0;
        int n = graph.adjacencyList.size();
        while (src < n) {
            for (int dest : graph.adjacencyList.get(src))
                System.out.print("(" + src + " --> " + dest + ")\t");
            System.out.println();
            src++;
        }
    }


    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 2),
                new Edge(2, 0), new Edge(2, 1), new Edge(3, 2),
                new Edge(4, 5), new Edge(5, 4));
        boolean flag = true;
        Graph graph = new Graph(edges, flag);
        printGraph(graph);
    }
}
