package com.campusdual.abstractclass;

public class Fox extends Animal{


    public Fox(String animalname) {
        super(animalname);
    }

    @Override
    public void makeSound() {
        System.out.println("What does the fox say?");
    }
}
