package com.idenSpring.springboot;

import org.springframework.stereotype.Component;

@Component("IdenlaptopBean")
public class Laptop {
    int osVersion;
    String brand;

    public Laptop() {
    }

    public Laptop(int osVersion, String brand) {
        this.osVersion = osVersion;
        this.brand = brand;
    }

    public int getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(int osVersion) {
        this.osVersion = osVersion;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "osVersion=" + osVersion +
                ", brand='" + brand + '\'' +
                '}';
    }
}
