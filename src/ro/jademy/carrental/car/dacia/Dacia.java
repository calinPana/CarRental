package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.CarBrandDetails;
import ro.jademy.carrental.car.CarType;

public abstract class Dacia extends Car {

    public Dacia(String model, int year, Integer price, CarType carType, String color) {
        super(new CarBrandDetails("Dacia", model, year, price), carType, color);
    }
}
