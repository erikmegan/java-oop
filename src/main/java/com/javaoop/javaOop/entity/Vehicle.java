package com.javaoop.javaOop.entity;

import java.util.Objects;

public class Vehicle {

    Vehicle(String name, Integer wheel){
        this.name = name;
        this.wheel = wheel;
    }
    public String name;
    public Integer wheel;

    public void infoMe(){
        System.out.println("============================");
        System.out.println("this is vehicle: " + this.name);
        System.out.println("amount of wheel: " + this.wheel);
        System.out.println("============================");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (!Objects.equals(name, vehicle.name)) return false;
        return Objects.equals(wheel, vehicle.wheel);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (wheel != null ? wheel.hashCode() : 0);
        return result;
    }
}
