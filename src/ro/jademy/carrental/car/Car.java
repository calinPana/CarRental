package ro.jademy.carrental.car;

public abstract class Car {

    // Q: how can we better represent the car make?
//    private String make;
//    private String model;
//    private Integer year;

    boolean isRented;
    int id;
    int rentPeriodDays = 0;

    CarBrandDetails carBrandDetails;

    // Q: how can we better represent the car type?
    //private String carType; // coupe, sedan, hatchback, convertible, wagon, SUV
    private CarType carType;
    // Q: how can we better represent the motor type?
    private String fuelType; // diesel, gasoline, alternative

    private Integer doorNumber;

    private String color;

    // Q: how can we better represent the transmission type?
    private String transmissionType; // automatic, manual

    // Q: how can we better represent the engine?
    private String engine;

    // Q: how can we better represent money value?
    // String basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?

//    public Car(CarBrandDetails carBrandDetails, CarType carType) {
//        this.carBrandDetails = carBrandDetails;
//        this.carType = carType;
//    }

    public Car(CarBrandDetails carBrandDetails, CarType carType, String color) {
        this.carBrandDetails = carBrandDetails;
        this.carType = carType;
        this.color = color;
    }

    public CarBrandDetails getCarBrandDetails() {
        return carBrandDetails;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getColor() {
        return color;
    }

    public boolean isRented() {
        return isRented;
    }

    public int getRentPeriodDays() {
        return rentPeriodDays;
    }




    public void rent (int rentPeriodDays){
        isRented=true;
        this.rentPeriodDays=rentPeriodDays;
    }
}

