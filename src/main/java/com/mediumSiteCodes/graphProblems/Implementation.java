package com.mediumSiteCodes.graphProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Implementation {
    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                {1, 0, 1, 1, 1},
                {0, 0, 1, 1, 0},
                {1, 0, 1, 0, 0},
                {1, 0, 0, 1, 1},
                {1, 0, 1, 1, 0},
        };

        HashMap<Integer, LinkedList<Integer>> graph = implGraph(adjacencyMatrix);

        graph.entrySet().stream().forEach(keyValue -> {
            System.out.println(keyValue.getKey() + " -> " + keyValue.getValue());
        });

        ReferenceClasses.Employee employee1 = new ReferenceClasses.Employee(101, "A");
        ReferenceClasses.Employee employee2 = new ReferenceClasses.Employee(102, "B");
        ReferenceClasses.Employee employee3 = new ReferenceClasses.Employee(103, "C");
        ReferenceClasses.Employee employee4 = new ReferenceClasses.Employee(101, "D");
        ReferenceClasses.Employee employee5 = new ReferenceClasses.Employee(104, "E");
        ReferenceClasses.Employee employee6 = new ReferenceClasses.Employee(103, "F");
        ReferenceClasses.Employee employee7 = new ReferenceClasses.Employee(101, "G");
        ReferenceClasses.Employee employee8 = new ReferenceClasses.Employee(102, "H");
        ReferenceClasses.Employee employee9 = new ReferenceClasses.Employee(102, "I");

        Object[][] objMatrix = {
                {employee1, employee2, employee3},
                {employee4, employee5, employee6},
                {employee7, employee8, employee9}
        };


        HashMap<Integer, LinkedList<ReferenceClasses.Employee>> employeeGraph = implEmployeeGraph(objMatrix);

        employeeGraph.entrySet().stream().forEach(keyValue -> {
            System.out.println(keyValue.getKey() + " -> " + keyValue.getValue().toString());
        });

    }


    private static HashMap<Integer, LinkedList<ReferenceClasses.Employee>> implEmployeeGraph(Object[][] objMatrix) {
        HashMap<Integer, LinkedList<ReferenceClasses.Employee>> graph = new HashMap<>();
        List<Integer> addDepartmentList = new ArrayList<>();
        addDepartmentList.add(101);
        addDepartmentList.add(102);
        addDepartmentList.add(103);
        addDepartmentList.add(104);


        for (int row = 0; row < objMatrix.length; row++) {
            for (int col = 0; col < objMatrix.length; col++) {
                switch (((ReferenceClasses.Employee) objMatrix[row][col]).getDeptId()) {
                    case 101:
                        if (!graph.containsKey(101)) {
                            LinkedList<ReferenceClasses.Employee> addNewEmployee = new LinkedList<>();
                            addNewEmployee.add((ReferenceClasses.Employee) objMatrix[row][col]);
                            graph.put(101, addNewEmployee);
                        } else {
                            LinkedList<ReferenceClasses.Employee> value = graph.get(101);
                            value.add((ReferenceClasses.Employee) objMatrix[row][col]);
                            graph.remove(101);
                            graph.put(101, value);
                        }
                        break;
                    case 102:
                        if (!graph.containsKey(102)) {
                            LinkedList<ReferenceClasses.Employee> addNewEmployee = new LinkedList<>();
                            addNewEmployee.add((ReferenceClasses.Employee) objMatrix[row][col]);
                            graph.put(102, addNewEmployee);
                        } else {
                            LinkedList<ReferenceClasses.Employee> value = graph.get(102);
                            value.add((ReferenceClasses.Employee) objMatrix[row][col]);
                            graph.remove(102);
                            graph.put(102, value);
                        }
                        break;
                    case 103:
                        if (!graph.containsKey(103)) {
                            LinkedList<ReferenceClasses.Employee> addNewEmployee = new LinkedList<>();
                            addNewEmployee.add((ReferenceClasses.Employee) objMatrix[row][col]);
                            graph.put(103, addNewEmployee);
                        } else {
                            LinkedList<ReferenceClasses.Employee> value = graph.get(103);
                            value.add((ReferenceClasses.Employee) objMatrix[row][col]);
                            graph.remove(103);
                            graph.put(103, value);
                        }
                        break;
                    case 104:
                        if (!graph.containsKey(104)) {
                            LinkedList<ReferenceClasses.Employee> addNewEmployee = new LinkedList<>();
                            addNewEmployee.add((ReferenceClasses.Employee) objMatrix[row][col]);
                            graph.put(104, addNewEmployee);
                        } else {
                            LinkedList<ReferenceClasses.Employee> value = graph.get(104);
                            value.add((ReferenceClasses.Employee) objMatrix[row][col]);
                            graph.remove(104);
                            graph.put(104, value);
                        }
                        break;
                }
            }
        }
        return graph;
    }

    private static HashMap<Integer, LinkedList<Integer>> implGraph(int[][] adjacencyMatrix) {
        HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();
        for (int row = 0; row < adjacencyMatrix.length; row++) {
            for (int col = 0; col < adjacencyMatrix.length; col++) {
                if (adjacencyMatrix[row][col] == 1) {
                    if (!graph.containsKey(row)) {
                        LinkedList<Integer> addingNewVertex = new LinkedList<>();
                        addingNewVertex.add(col);
                        graph.put(row, addingNewVertex);
                    } else if (graph.containsKey(row)) {
                        LinkedList<Integer> updatingWithNewVertex = graph.get((Integer) row);
                        updatingWithNewVertex.add(col);
                        graph.remove(row);
                        graph.put(row, updatingWithNewVertex);
                    }
                }
            }
        }
        return graph;
    }
}
