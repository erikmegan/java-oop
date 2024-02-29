package com.javaoop.javaOop.entity;

public class Car extends Vehicle {

    private Integer seat = 4;
    public Car(String name, Integer wheel) {
        super(name, wheel);
    }

    public void infoMe(){
        System.out.println("============================");
        System.out.println("this is car: " + this.name);
        System.out.println("amount of wheel: " + this.wheel);

    }

    public void infoDetail(){
        infoMe();
        System.out.println("detail:");
        System.out.println("amount of seat: " +this.seat);
        System.out.println("============================");
    }
    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }
}
