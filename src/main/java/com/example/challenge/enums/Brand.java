package com.example.challenge.enums;

public enum Brand {
    FORD("Ford"),
    CHEVROLET("Chevrolet"),
    BMW("BMW"),
    VOLVO("Volvo");

    private final String description;

    Brand(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
