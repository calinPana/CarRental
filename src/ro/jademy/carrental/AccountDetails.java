package ro.jademy.carrental;

public class AccountDetails {

    String username;
    String password;

    public AccountDetails(String username, String password) {
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
