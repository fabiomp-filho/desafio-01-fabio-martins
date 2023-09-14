package com.example.challenge.controller;

import com.example.challenge.dtos.CarDTO;
import com.example.challenge.models.CarModel;
import com.example.challenge.services.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }
    @PostMapping("/save")
    public ResponseEntity<Object> saveCar(@RequestBody @Valid CarDTO carDTO){
        var carModel = new CarModel();
        BeanUtils.copyProperties(carDTO, carModel);
        return status(CREATED).body(carService.save(carModel));
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getCarById(@PathVariable Long id) {
        Optional<CarModel> carModelOptional = carService.findById(id);
        if(carModelOptional.isEmpty()){
            return status(NOT_FOUND).body("Car not found!");
        }
        return status(OK).body(carModelOptional.get());
    }

}
