package com.javaoop.javaOop.entity;

public class MotorCycle extends Vehicle {

    private Integer jok = 2;
    public MotorCycle(String name, Integer wheel) {
        super(name, wheel);
    }

    public void infoMe(){
        System.out.println("============================");
        System.out.println("this is motor cycle: " + this.name);
        System.out.println("amount of wheel: " + this.wheel);

    }

    public void infoDetail(){
        infoMe();
        System.out.println("detail:");
        System.out.println("amount of jok (Liter): " +this.jok);
        System.out.println("============================");
    }
}
