package com.campusdual.abstractclass;

public abstract class Animal {
    private String animalname;

    public Animal(String animalname) {
        this.animalname = animalname;
    }

    public String getAnimalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }

    public void sleep(){
        System.out.println(this.animalname + " is sleeping. ");
    }

    public void wakeUp(){
        System.out.println(this.animalname + " is awake. ");
    }

    public abstract void makeSound();
}
