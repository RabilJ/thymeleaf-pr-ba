package com.example.zoo.repository;

import com.example.zoo.component.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class AnimalRepository {
     private List<Animal>anList = new ArrayList<>();



    public AnimalRepository() {
        anList.add(new Animal("Mruczek","Kot"));
        anList.add(new Animal("Burek","Pies"));
        anList.add(new Animal("Miki","Mysz"));
}
    public List<Animal> getAnList() {
        return anList;
    }

    public void remove(Animal animal){
        anList.remove(animal);
    }
    public void add(Animal animal) {
        anList.add(animal);
    }
}
