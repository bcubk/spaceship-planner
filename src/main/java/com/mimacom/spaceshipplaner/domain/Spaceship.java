package com.mimacom.spaceshipplaner.domain;

public class Spaceship {

    private Cabin cabin;
    private final Engine engine;
    private final Module payload;

    public Spaceship(Cabin cabin, Engine engine, Module payload) {
        this.engine = engine;
        this.payload = payload;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public Engine getEngine() {
        return engine;
    }

    public Module getPayload() {
        return payload;
    }
}
