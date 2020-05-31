package com.treeAndGraph;


import java.util.*;

/*
    Graph representation:

    1: Sequential Representation: represent by adjacency matrix.
    2: Linked Representation: represent by adjacency list.

 */
public class Iden_CreateGraph {

    static Map<String, List<String>> storeLinkage = new HashMap<>();

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0}
        };


        // First Logic : Below logic is where I kept mapping of vertex as, 0 as A 1 as B and so on..  On net, you can see they play with 0, 1 and so on as vertex's.


        for (int itr1 = 0; itr1 < matrix.length; itr1++) {
            for (int itr2 = 0; itr2 < matrix.length; itr2++) {
                if (matrix[itr1][itr2] != 0) {
                    createLinkage(itr1, itr2, getMapping(), true);
                }
            }
        }

        printGraph();
        // Alternative of First one.

    }

    private static void printGraph() {
        StringBuilder builder = new StringBuilder();

        for (String v : storeLinkage.keySet()) {
            builder.append(v.toString() + "-> ");
            for (String w : storeLinkage.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        System.out.println(builder.toString() + "\n");
    }

    private static Map<Integer, String> getMapping() {
        Map<Integer, String> mapping = new HashMap<>();
        mapping.put(0, "A");
        mapping.put(1, "B");
        mapping.put(2, "C");
        mapping.put(3, "D");
        mapping.put(4, "E");
        return mapping;
    }

    private static void createLinkage(int itr1, int itr2, Map<Integer, String> mapping, boolean bidirectional) {
        String vertex = mapping.get(itr1);

        if (storeLinkage.containsKey(vertex)) {
            List<String> value = storeLinkage.get((String) vertex);
            value.add(mapping.get(itr2));
        } else {
            LinkedList<String> ll = new LinkedList<>();
            ll.add(mapping.get(itr2));
            storeLinkage.put(vertex, ll);
        }
    }
}
