package com.mediumSiteCodes.graphProblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SparkImplWithGraph {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner str = new Scanner(new File("C:\\Users\\nitish.saxena\\Desktop\\datasets_810_1496_airports.csv"));
        List<AirportPOJO> airportsDetails = new ArrayList<>();
        while (str.hasNext()) {
            String[] strArray = str.nextLine().split(",");
            AirportPOJO airportPOJO = new AirportPOJO();
            airportPOJO.setIATA_CODE(strArray[0]);
            airportPOJO.setAIRPORT(strArray[1]);
            airportPOJO.setCITY(strArray[2]);
            airportPOJO.setSTATE(strArray[3]);
            airportPOJO.setCOUNTRY(strArray[4]);
            airportPOJO.setLATITUDE(Double.valueOf(strArray[5]));
            airportPOJO.setLONGITUDE(Double.valueOf(strArray[6]));
            airportsDetails.add(airportPOJO);
        }
        HashMap<String, LinkedList<AirportPOJO>> graph = implementGraph(airportsDetails);
        graph.entrySet().stream().forEach(keyValue -> {
            System.out.println(keyValue.getKey() + "," + keyValue.getValue());
        });
        str.close();
    }
    public static HashMap<String, LinkedList<AirportPOJO>> implementGraph(List<AirportPOJO> airportsDetails) {
        HashMap<String, LinkedList<AirportPOJO>> graph = new HashMap<>();
        for (int i = 0; i < airportsDetails.size(); i++) {
            AirportPOJO currentAirport = (airportsDetails.get(i));
            if (!graph.containsKey(currentAirport.getCOUNTRY())) {
                LinkedList addCurrentAirport = new LinkedList();
                addCurrentAirport.add(currentAirport);
                graph.put(currentAirport.getCOUNTRY(), addCurrentAirport);
            } else if (graph.containsKey(currentAirport.getCOUNTRY())) {
                LinkedList<AirportPOJO> previousAirportState = graph.get(currentAirport.getCOUNTRY());
                previousAirportState.add(currentAirport);
                graph.remove(currentAirport.getCOUNTRY());
                graph.put(currentAirport.getCOUNTRY(), previousAirportState);
            }
        }
        return graph;
    }
}

