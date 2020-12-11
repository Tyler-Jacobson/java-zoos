package com.tylerj.javazoos.controllers;

import com.tylerj.javazoos.services.AnimalServices;
import com.tylerj.javazoos.views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animals")
public class AnimalController {

    @Autowired
    private AnimalServices animalServices;

    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> getAnimalCounts() {
        List<AnimalCounts> myList = animalServices.getAnimalCounts();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

}
