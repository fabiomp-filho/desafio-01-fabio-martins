package com.example.challenge.dtos;


import com.example.challenge.enums.BrandEnum;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    @NotEmpty(message = "Field model can't be null")
    private String model;
    private BrandEnum brand;
    @NotEmpty(message = "Field color can't be null")
    private String color;
    @NotEmpty(message = "Field year can't be null")
    private String fabricationYear;
}
