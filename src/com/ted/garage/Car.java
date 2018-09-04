package com.ted.garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    private int door;
    private int literPer100km;
    private String motor;
    private List<String> options = new ArrayList<String>();

    public Car(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimensions, int weight, int door, int literPer100km, String motor, List<String> options) {
        super(description, manufacturer, speed, year, modelName, color, dimensions, weight);
        this.door = door;
        this.literPer100km = literPer100km;
        this.motor = motor;
        this.options = options;
    }

    public void startHeadlight() {
        System.out.println("J'allume mes phares");
    }

    public void openTrunk() {
        System.out.println("J'ouvre mon coffre");
    }

    @Override
    public void start() {
        System.out.println("Je suis " + modelName + " je consomme " + literPer100km + "l au 100km et je démarre !");
    }

    @Override
    public void stop() {
        System.out.println("Je suis " + modelName + " j'arrête mon moteur " + motor);
    }


    public int getDoor() {
        return door;
    }

    public int getLiterPer100km() {
        return literPer100km;
    }

    public String getMotor() {
        return motor;
    }

    public List<String> getOptions() {
        return options;
    }
}
