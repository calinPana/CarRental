package ro.jademy.carrental.Person;

import ro.jademy.carrental.AccountDetails;

public class Salesman extends Person{

    // Q: how can we avoid duplicate code in the salesman and the customer classes?

    public AccountDetails accountDetails;

    public Salesman(String firstName, String lastName, AccountDetails accountDetails) {
        super(firstName, lastName);
        this.accountDetails = accountDetails;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }
}
