package com.example.challenge.dtos;


import com.example.challenge.enums.BrandEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    @NotEmpty(message = "Field model can't be null")
    @Size(max = 60, message = "The model field must have a maximum of 60 characters.")
    private String model;
    private BrandEnum brand;
    @NotEmpty(message = "Field color can't be null")
    @Size(max = 20, message = "The color field must have a maximum of 20 characters.")
    private String color;
    @NotEmpty(message = "Field fabrication year can't be null")
    @Pattern(regexp = "\\d{4}/\\d{4}", message = "The format must be yyyy/yyyy.")
    @Size(max = 9, message = "The fabricationYear field must have a maximum of 9 characters.")
    private String fabricationYear;
}
