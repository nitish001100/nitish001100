package com.mediumSiteCodes.graphProblems;

public class AirportPOJO {
    String IATA_CODE;
    String AIRPORT;
    String CITY;
    String STATE;
    String COUNTRY;
    Double LATITUDE;
    Double LONGITUDE;

    public String getIATA_CODE() {
        return IATA_CODE;
    }

    public void setIATA_CODE(String IATA_CODE) {
        this.IATA_CODE = IATA_CODE;
    }

    public String getAIRPORT() {
        return AIRPORT;
    }

    public void setAIRPORT(String AIRPORT) {
        this.AIRPORT = AIRPORT;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public Double getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(Double LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public Double getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(Double LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    @Override
    public String toString() {
        return "AirportPOJO{" +
                "IATA_CODE='" + IATA_CODE + '\'' +
                ", AIRPORT='" + AIRPORT + '\'' +
                ", CITY='" + CITY + '\'' +
                ", STATE='" + STATE + '\'' +
                ", COUNTRY='" + COUNTRY + '\'' +
                ", LATITUDE=" + LATITUDE +
                ", LONGITUDE=" + LONGITUDE +
                '}';
    }
}
