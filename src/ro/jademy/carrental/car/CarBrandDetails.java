package ro.jademy.carrental.car;

public class CarBrandDetails {

    private String make;
    private String model;
    private Integer year;

    public CarBrandDetails(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {

        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }
}
