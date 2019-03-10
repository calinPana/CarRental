package ro.jademy.carrental.Person;

import ro.jademy.carrental.AccountDetails;

public class Salesman {

    // Q: how can we avoid duplicate code in the salesman and the customer classes?

    public String firstName;
    public String lastName;
    public AccountDetails accountDetails;

    public Salesman(String firstName, String lastName, AccountDetails accountDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountDetails = accountDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }
}
