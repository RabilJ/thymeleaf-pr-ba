package com.example.zoo.repository;

import com.example.zoo.component.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class AnimalRepository {
     private List<Animal>anList = new ArrayList<>();



    public AnimalRepository() {
        anList.add(new Animal("Mruczek","Kot","https://ocdn.eu/pulscms-transforms/1/nMgktkqTURBXy8zYjM2MDFlMjJiNGI2Y2M1ODMzYzg3MzQwZmRlY2Q1ZS5qcGVnkpUDAFHNDxvNCH-TBc0Djs0BVA"));
        anList.add(new Animal("Burek","Pies","https://royalcanin.pl/blog/wp-content/uploads/2016/12/231W-2-950x680.jpeg"));
        anList.add(new Animal("Miki","Mysz","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Apodemus_sylvaticus_bosmuis.jpg/220px-Apodemus_sylvaticus_bosmuis.jpg"));
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
    public Animal findByName(String name) {
        for (Animal animal : anList) {
            if(animal.getName().equalsIgnoreCase(name))
                return animal;
        }
        return null;
    }
}
