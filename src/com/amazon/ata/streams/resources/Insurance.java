package com.amazon.ata.streams.resources;

public class Insurance {
    private final String name;

    public Insurance(String name) {
        this.name = name;
    }

    public Insurance() {
        this.name = null;
    }

    public String getName() {
        return name;
    }
}
