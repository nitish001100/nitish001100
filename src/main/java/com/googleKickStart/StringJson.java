package com.googleKickStart;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringJson {


    static public boolean isJSONValid(String test) {
        try {
            new JSONObject(test);
        } catch (Exception e) {
            try {
                new JSONArray(test);
                return true;
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String jsonString = "{ \"name\":\"[A,\"}";

        System.out.println(isJSONValid(jsonString));

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("C:\\Globant\\SpringBoot\\src\\main\\resources\\employees.json")) {
            Object obj = jsonParser.parse(reader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

class Employee{
    String firstName;
    String lastName;
    String website;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}