package ro.jademy.carrental;

public class Salesman {

    // Q: how can we avoid duplicate code in the salesman and the customer classes?

    public String firstName;
    public String lastName;
    public SalesmanAccount salesmanAccount;

    public Salesman(String firstName, String lastName, SalesmanAccount salesmanAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salesmanAccount = salesmanAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SalesmanAccount getSalesmanAccount() {
        return salesmanAccount;
    }
}
