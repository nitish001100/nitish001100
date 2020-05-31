package com.treeAndGraph;

import java.util.*;


public class SourceToDestinationInMatrix {

    static Map<Integer, List<Integer>> nodeMap = new HashMap<>();

    private static void createNode(int src, int dest) {
        if (nodeMap.containsKey((int) src)) {
            List<Integer> value = nodeMap.get((int) src);
            value.add(dest);
        } else {
            LinkedList<Integer> obj = new LinkedList<>();
            obj.add(dest);
            nodeMap.put(src, obj);
        }
    }

    private static void printGraph() {
        Set<Map.Entry<Integer, List<Integer>>> var = nodeMap.entrySet();
        Iterator<Map.Entry<Integer, List<Integer>>> var0 = var.iterator();

        while (var0.hasNext()) {
            Map.Entry<Integer, List<Integer>> var1 = var0.next();
            List<Integer> var2 = var1.getValue();

            for (int itr = 0; itr < var2.size(); itr++)
                System.out.print(var1.getKey() + " -> " + var2.get(itr) + " \n");
        }
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'S', '#', '.', '.'},
                {'.', '.', '#', '.'},
                {'.', '#', '.', '#'},
                {'.', '.', '.', 'T'}
        };

        createNode(1, 2);
        createNode(1, 3);
        createNode(1, 4);
        createNode(2, 5);
        createNode(4, 1);

        printGraph();

        findVertex(3);
    }

    private static void sourceToDestination(char[][] matrix) {

    }

    private static void findVertex(int key){

        if(nodeMap.containsKey((int)key)){
            System.out.println("Find the key : " + key);
        }else {
            System.out.println("We can reach "+ key+" from some other vertex. Directly not possible. Let's see!! ");

            Iterator<Map.Entry<Integer, List<Integer>>> itr = nodeMap.entrySet().iterator();

            while (itr.hasNext()){
                Map.Entry<Integer, List<Integer>> var0 = itr.next();
                List<Integer> list = var0.getValue();

                list.stream().forEach(findKey -> {
                    if(findKey == key){
                        System.out.println("Possible solution to reach vertex is from : "+ var0.getKey());
                    }
                });
            }
        }


    }

}
