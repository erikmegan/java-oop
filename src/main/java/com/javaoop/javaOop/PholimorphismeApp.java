package com.javaoop.javaOop;

import com.javaoop.javaOop.entity.Car;
import com.javaoop.javaOop.entity.MotorCycle;
import com.javaoop.javaOop.entity.Vehicle;

public class PholimorphismeApp {
    public static void main(String[] args) {

        Vehicle vec = new Car("honda",4);
//        vec.infoMe();
//
        printInfo(new Car("toyota", 8));
        printInfo(new MotorCycle("yamaha", 3));

    }

    static void printInfo(Vehicle vehicle){
        if (vehicle instanceof Car){
            Car car = (Car) vehicle;
            car.infoDetail();
        }else if (vehicle instanceof MotorCycle motorCycle){
            motorCycle.infoDetail();
        }else{
            vehicle.infoMe();
        }

    }
}
