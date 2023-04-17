package com.mimacom.spaceshipplaner.domain;

public class Engine {

    private final String name;
    private final double fuelCapacity;
    private final double thrust;

    public Engine(String name, double fuelCapacity, double thrust) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.thrust = thrust;
    }

    public String getName() {
        return name;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getThrust() {
        return thrust;
    }
}
