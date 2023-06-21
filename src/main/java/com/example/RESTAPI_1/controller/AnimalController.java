package com.example.RESTAPI_1.controller;

import com.example.RESTAPI_1.model.Animal;
import com.example.RESTAPI_1.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animal")
    public Animal getAnimalByID(@RequestParam long id) {
        return animalService.getAnimalByID(id);
    }
}
