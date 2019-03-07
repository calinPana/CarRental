package ro.jademy.carrental;

public class AvailableCar extends Car implements Rentable {

//    public AvailableCar(CarBrandDetails carBrandDetails, CarType carType) {
//        super(carBrandDetails, carType);
//    }

    public AvailableCar(CarBrandDetails carBrandDetails, CarType carType, String color) {
        super(carBrandDetails, carType, color);
        this.isRented=false;
    }
}