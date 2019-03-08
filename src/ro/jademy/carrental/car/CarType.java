package ro.jademy.carrental.car;

public class CarType {

    private String typeName; // sedan, suv, break, etc.
    private int doorNumber;

    public CarType(String typeName, int doorNumber) {
        this.typeName = typeName;
        this.doorNumber = doorNumber;
    }
}
