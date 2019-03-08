package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.CarType;

public class Logan extends Dacia {

    public Logan(int year, String color) {
        super("Logan", year, new CarType("Sedan", 5), color);
    }
}
