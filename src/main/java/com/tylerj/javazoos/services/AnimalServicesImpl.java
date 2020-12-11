package com.tylerj.javazoos.services;


import com.tylerj.javazoos.repositories.AnimalRepository;
import com.tylerj.javazoos.views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "animalServices")
public class AnimalServicesImpl implements AnimalServices{

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<AnimalCounts> getAnimalCounts() {
        List<AnimalCounts> list = animalRepository.findAnimalCounts();
        return list;
    }
}
