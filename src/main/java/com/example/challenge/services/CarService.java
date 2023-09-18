package com.example.challenge.services;

import com.example.challenge.models.CarModel;
import com.example.challenge.repositories.CarRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Transactional
    public CarModel save(CarModel carModel){
        return carRepository.save(carModel);
    }

    public Page<CarModel> findAll(Pageable pageable){
        return carRepository.findAll(pageable);
    }

    public Optional<CarModel> findById(Long id){
        return carRepository.findById(id);
    }
    @Transactional
    public void delete(CarModel carModel) {
        carRepository.delete(carModel);
    }

}
