package com.idenSpring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Alien {

    String aName;
    int aId;
    String atech;

    @Autowired
    Laptop laptop;

    public Alien(String aName, int aId, String atech) {
        this.aName = aName;
        this.aId = aId;
        this.atech = atech;
    }

    public Alien() {
        System.out.println("Object Created!!");
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getAtech() {
        return atech;
    }

    public void setAtech(String atech) {
        this.atech = atech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    void show() {
        System.out.println("In show!!");
    }

    void compile() {
        System.out.println("compiling");
        System.out.println(getLaptop().toString());
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aName='" + aName + '\'' +
                ", aId=" + aId +
                ", atech='" + atech + '\'' +
                '}';
    }
}
