package com.example.zoo.controller;


import com.example.zoo.component.Animal;
import com.example.zoo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    private AnimalRepository anRep;

    @Autowired
    public HomeController(AnimalRepository anRep) {
        this.anRep = anRep;
    }


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("anList", anRep.getAnList());
        return "home";
    }

    @GetMapping("/animal")
    public String animal(Model model, @RequestParam String name) {
        Animal findAnimal = anRep.findByName(name);
        model.addAttribute("animalFound", findAnimal);
        return "animal";
    }

    @GetMapping("/nowy")
    public String nowy(Model model) {
        model.addAttribute("newAnimal", new Animal());
        return "animalForm";
    }

    @PostMapping("/dodaj")
    public String dodaj(Animal animal) {
        if (animal != null)
            anRep.add(animal);
        return "redirect:/";
    }

    @GetMapping("/newToDelete")
    public String skasuj(Model model) {
        model.addAttribute("newAnimalToDelete", new Animal());
        return "animalToDeleteForm";
    }
    @PostMapping("/skasuj")
    public String skasuj(@RequestParam String name) {
        Animal findAnimal = anRep.findByName(name);
        anRep.remove(findAnimal);
        return "redirect:/";
    }

}