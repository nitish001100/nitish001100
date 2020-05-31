package com.costProblems;

import org.javatuples.Pair;

import java.util.*;

public class ClosestDistanceToOriginProblem {
    public static void main(String[] args) {

        int numberOfClosest = 2;

        List<Pair<Integer, Integer>> pairList = new ArrayList<>();

        pairList.add(new Pair<>(-2, 4));
        pairList.add(new Pair<>(0, -2));
        pairList.add(new Pair<>(-1, 0));
        pairList.add(new Pair<>(3, 5));
        pairList.add(new Pair<>(-2, -3));
        pairList.add(new Pair<>(3, 2));

        closestDistanceToOriginProblem(pairList, numberOfClosest);
    }

    private static void closestDistanceToOriginProblem(List<Pair<Integer, Integer>> pairList, int numberOfClosest) {
        Map<String, Double> distanceStore = new HashMap<>();

        for (int ptr1 = 0; ptr1 < pairList.size(); ptr1++) {
            Pair<Integer, Integer> var1 = pairList.get(ptr1);
                int x1 = var1.getValue0();
                int y1 = var1.getValue1();
                int x2 = 0;
                int y2 = 0;
                double ds = Math.sqrt((y2 - x2) * (y2 - x2) + (y1 - x1) * (y1 - x1));
                distanceStore.put(x1 + "," + x2 + "--" + y1 + "," + y2, ds);
            }

        Map.Entry<String, Double> min = null;
        for (Map.Entry<String, Double> entry : distanceStore.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }

        System.out.println(min.getKey()+" " + min.getValue());

    }
}
