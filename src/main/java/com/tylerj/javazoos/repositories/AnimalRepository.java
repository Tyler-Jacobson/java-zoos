package com.tylerj.javazoos.repositories;

import com.tylerj.javazoos.models.Animal;
import com.tylerj.javazoos.views.AnimalCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

    @Query(value = "SELECT a.animaltype AS animaltype, a.animalid AS animalid, count(zooid) as countzoos FROM animals a LEFT JOIN zooanimals z ON a.animalid = z.animalid GROUP BY a.animaltype",
            nativeQuery = true)
    List<AnimalCounts> findAnimalCounts();
}
