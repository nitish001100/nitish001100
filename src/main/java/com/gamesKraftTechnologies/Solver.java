package com.gamesKraftTechnologies;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solver {

    static String outputPath;
    static String inputPath;

    public static void main(String[] args) {

        inputPath = "C:\\Globant\\SpringBoot\\src\\main\\resources\\probabilities.txt";
        outputPath = "C:\\Globant\\SpringBoot\\src\\main\\resources\\outputProbabilities.txt";

        createFile();
        getNextString();
    }

    private static void createFile() {
        try {

            File myObj = new File(outputPath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists, writing in the existing file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file while checking the file existence.");
            e.printStackTrace();
        }
    }

    private static void getNextString() {
        String comma = ",";
        try (BufferedReader br = Files.newBufferedReader(Paths.get(inputPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splittedLine = line.split(comma);
                String lineContent = splittedLine[0];
                double probability = Double.valueOf(splittedLine[1]);
                lineRepeater(lineContent, probability);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    private static void lineRepeater(String lineContent, double probability) {
        int numOfRepetitions = (int) Math.round(probability * 100);
        for (int i = 0; i < numOfRepetitions; i++)
            writeIntoOutputFile(outputPath, lineContent);
    }

    public static void writeIntoOutputFile(String fileName, String str) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            out.write(str);
            out.write("\n");
            out.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
}
