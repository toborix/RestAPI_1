package com.example.RESTAPI_1.service;

import com.example.RESTAPI_1.model.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class AnimalServiceImpl implements AnimalService {
    ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(
            new Animal(1, "Bear", 10),
            new Animal(2, "Bird", 13),
            new Animal(3, "Dog", 5),
            new Animal(4, "Fox", 2)
    ));

    public Animal getAnimalByID(long id) {
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                return animal;
            }

        }
        return null;

    }
}
