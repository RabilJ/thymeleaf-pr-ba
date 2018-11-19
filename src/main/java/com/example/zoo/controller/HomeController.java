package com.example.zoo.controller;


import com.example.zoo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

    private AnimalRepository anRep;

    @Autowired
    public HomeController(AnimalRepository anRep) {
        this.anRep = anRep;
    }





    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("anList",anRep.getAnList());
        return "list";
    }

}
