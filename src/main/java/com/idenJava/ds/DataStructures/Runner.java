package com.idenJava.ds.DataStructures;

class Fruits{
    void fruitsDisplay(){
        System.out.println("Fruits");
    }
}

class Vegetable{
    void vegetableDisplay(){
        System.out.println("Vegetables");
    }
}

class MixedUpFoods{
    void mixedUpFoodsDisplay(){
        System.out.println("MixedUpFoods");
    }
}
class CustomObjectCreater{
    Object createObject(Object whichClassObject){
        if(whichClassObject instanceof Fruits)
            return new Fruits();

        if(whichClassObject instanceof Vegetable)
            return new Vegetable();

        if(whichClassObject instanceof MixedUpFoods)
            return new MixedUpFoods();

        return "Incovertible Types";
    }
}

class CustomObjectCreaterThruString{
    Object createObject(String whichClassObject){
        if(whichClassObject.equalsIgnoreCase("Fruits"))
            return new Fruits();

        if(whichClassObject.equalsIgnoreCase("Vegetables"))
            return new Vegetable();

        if(whichClassObject.equalsIgnoreCase("MixedUpFoods"))
            return new MixedUpFoods();

        return "Incovertible Types";
    }
}


public class Runner {
    public static void main(String[] args) {
        CustomObjectCreaterThruString customObjectCreaterThruString = new CustomObjectCreaterThruString();
        Fruits fruits = (Fruits)customObjectCreaterThruString.createObject("Fruits");
        fruits.fruitsDisplay();
    }
}
