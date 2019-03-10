package ro.jademy.carrental.car;

public class CarBrandDetails {

    private String make;
    private String model;
    private Integer year;
    private Integer price;

    public CarBrandDetails(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public CarBrandDetails(String make, String model, Integer year, Integer price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
