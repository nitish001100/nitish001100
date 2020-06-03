package com.mediumSiteCodes.basicProblems.problemsProgrammer;

import java.io.*;
import java.util.HashMap;

public class SapientTestProgramming {

    public static void main(String args[]) throws IOException {

        BufferedReader csvReader = null;
        String row;
        HashMap<String, Object[]> dataset = new HashMap<>();
        File csvFile = new File("C:\\Globant\\SpringBoot\\src\\main\\resources\\dataset.csv");
        if (csvFile.isFile()) {
            csvReader = new BufferedReader(new FileReader(csvFile));
        }

        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            Object[] objArray = new Object[2];
            objArray[0] = data[1];
            objArray[1] = data[2];

            if (dataset.containsKey(data[0])) {
                if (dataset.get(data[0])[0] == Integer.valueOf(data[1])) {
                    dataset.remove(data[0]);
                }
            } else {
                Object[] newEntryStoreInDataSet = new Object[2];
                newEntryStoreInDataSet[0] = Integer.valueOf(data[1]);
                newEntryStoreInDataSet[1] = data[2];
                dataset.put(data[0], newEntryStoreInDataSet);
            }
        }

        dataset.entrySet().stream().forEach(keyValue -> {
            System.out.println(keyValue.getKey() + " " + keyValue.getValue()[0] + " " + keyValue.getValue()[1]);
        });
        try {
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
