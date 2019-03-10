package ro.jademy.carrental.Person;

public class Customer extends Person {

    private int timesRented = 0;

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.timesRented = 0;
    }

    public int getTimesRented() {
        return timesRented;
    }

    public void rents() {
        timesRented++;
    }


}
