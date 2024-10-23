package com.campusdual.polymorph;

public class Smartphone extends Device implements IChargeable{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void makeACall(){
        System.out.println("Making a call.");
    }

    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + " Charging a 15 W.");
    }

    @Override
    public void use() {
        System.out.println("Using with touch screen.");
    }
}
