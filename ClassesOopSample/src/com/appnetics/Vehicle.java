package com.appnetics;

public class Vehicle {
    private String name;
    private int wheels;
    private int lights;
    private String numberPlate;

    public Vehicle(String name, int wheels, int lights, String numberPlate) {
        this.name = name;
        this.wheels = wheels;
        this.lights = lights;
        this.numberPlate = numberPlate;
    }
    public void move(int speed){
        System.out.println(" Vehicle is moving at a speed of " + speed);
        gears();

    }

    public void gears(){
        System.out.println("Gear has been engaged");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
