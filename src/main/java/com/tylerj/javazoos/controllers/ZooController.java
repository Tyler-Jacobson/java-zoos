package com.tylerj.javazoos.controllers;

import com.tylerj.javazoos.models.Zoo;
import com.tylerj.javazoos.services.ZooServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("zoos")
public class ZooController {

    @Autowired
    private ZooServices zooServices;

    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> listAllZoos() {
        List<Zoo> myList = zooServices.findAllZoos();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    @GetMapping(value = "/zoo/{id}", produces = "application/json")
    public ResponseEntity<?> findZooById(@PathVariable long id) {
        Zoo myZoo = zooServices.findZooById(id);
        return new ResponseEntity<>(myZoo, HttpStatus.OK);
    }

}
