package com.campusdual.abstractclass;

public class AngoraCat extends Cat {
    public AngoraCat(String animalname) {
        super(animalname);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow! (in Angora dialect)");
    }

}
