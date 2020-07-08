import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Graph {

    static HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();

    public static void main(String[] args) {
        int[][] adjMatrix = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 0},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 0},
        };

        for (int row = 0; row < adjMatrix.length; row++) {
            for (int col = 0; col < adjMatrix.length; col++) {
                findConnections(adjMatrix, row, col);
            }
        }

        printGraph();

    }

    private static void printGraph() {

        Iterator<Map.Entry<Integer, LinkedList<Integer>>> itr = graph.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer, LinkedList<Integer>> var = itr.next();

            System.out.print(var.getKey()+" => ");

            LinkedList<Integer> list = var.getValue();

            list.stream().forEach(value -> System.out.print(value+" "));

            System.out.println();
        }

    }

    private static void findConnections(int[][] adjMatrix, int row, int col) {
        if (adjMatrix[row][col] == 1) {
            if (graph.containsKey((int) row)) {
                LinkedList<Integer> list = graph.get(row);
                list.add(col);
                graph.put(row, list);
            } else {
                LinkedList<Integer> list = new LinkedList<>();
                list.add(col);
                graph.put(row, list);
            }
        }
    }
}
