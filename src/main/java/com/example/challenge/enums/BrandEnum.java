package com.example.challenge.enums;

public enum BrandEnum {
    Ford("Ford"),
    Chevrolet("Chevrolet"),
    BMW("BMW"),
    Volvo("Volvo");

    private final String description;

    BrandEnum(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
