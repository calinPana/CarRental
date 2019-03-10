package ro.jademy.carrental.car.BMW;

import ro.jademy.carrental.car.CarType;
import ro.jademy.carrental.car.dacia.Bmw;

public class X5 extends Bmw {

    public X5(int year, Integer price, String color) {
        super("X5", year, price, new CarType("SUV", 5), color);
    }
}
