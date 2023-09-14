package com.example.challenge.enums;

public enum BrandEnum {
    FORD("Ford"),
    CHEVROLET("Chevrolet"),
    BMW("BMW"),
    VOLVO("Volvo");

    private final String description;

    BrandEnum(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
