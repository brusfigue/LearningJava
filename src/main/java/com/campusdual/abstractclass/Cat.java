package com.campusdual.abstractclass;

public class Cat extends Animal{


    public Cat(String animalname) {
        super(animalname);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void climbing(){
        System.out.println("Get out of there!");
    }
}
