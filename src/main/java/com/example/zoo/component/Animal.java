package com.example.zoo.component;

public class Animal {
    private String name;
    private String species;
    private String imgUrl;

    public Animal() {
    }

    public Animal(String name, String species, String imgUrl) {
        this.name = name;
        this.species = species;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Zwierzak: "+name+" "+species;
    }
}
