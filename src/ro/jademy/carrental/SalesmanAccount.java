package ro.jademy.carrental;

public class SalesmanAccount {

    String username;
    String password;

    public SalesmanAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
