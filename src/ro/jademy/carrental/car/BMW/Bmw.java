package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.CarBrandDetails;
import ro.jademy.carrental.car.CarType;

public abstract class Bmw extends Car {

    public Bmw(String model, int year, Integer price, CarType carType, String color) {
        super(new CarBrandDetails("BMW", model, year, price), carType, color);
    }


}