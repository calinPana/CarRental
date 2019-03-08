package ro.jademy.carrental;

import ro.jademy.carrental.car.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    // Q: what fields and methods should this class contain?

    private ArrayList<Salesman> salesmen = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();

    public Shop(ArrayList<Salesman> accounts, ArrayList<Car> cars) {
        this.salesmen.addAll(accounts);
        this.cars.addAll(cars);
    }

    public boolean login(String username, String password) {

        // TODO: implement a basic user login
        boolean correctUser = false;
        boolean correctPassword = false;
        int accountNumber = 0;
        for (int i = 0; i < salesmen.size(); i++) {
            if (username.equals(salesmen.get(i).getAccountDetails().getUsername())) {
                correctUser = true;
                accountNumber = i;
                break;
            }
        }
        if (salesmen.get(accountNumber).getAccountDetails().getPassword().equals(password)) {
            correctPassword = true;

//        for (int i = 0; i < accounts.size(); i++) {
//            if (password.equals(accounts.get(i).getPassword())) {
//                correctPassword = true;
//            }
//            break;
        }

        if (correctUser && correctPassword) {
            System.out.println("Login details are correct");
            return true;
        }
        System.out.println("Your username or password are wrong");
        return false;

    }

    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

//    public void listAllCars() {
//        for (int i = 0; i < cars.size(); i++) {
//                System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getMake() + " " + cars.get(i).getCarBrandDetails().getModel());
//        }
//    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");
    }

    public void chooseListMenuOptionsAllCars() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("We have the following makes: ");
                for (int i = 0; i < cars.size(); i++) {
                    System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getMake());
                }
                break;

            case 2:
                System.out.println("We have the following models: ");
                for (int i = 0; i < carBrandDetails.size(); i++) {
                    System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getModel());
                }
                break;

            case 4:
                showMenu();
        }
    }

    public void chooseListMenuOptionsAvailableCars() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The following makes are available: ");
                ArrayList<String> makes = new ArrayList<>();
                for (int i = 0; i < cars.size(); i++) {
                    if (!cars.get(i).isRented() && !cars.contains(cars.get(i).getCarBrandDetails().getMake())) {
                        makes.add(cars.get(i).getCarBrandDetails().getMake());
                        System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getMake());
                    }
                }
                break;

            case 2:
                System.out.println("The following models are available: ");
                ArrayList<String> models = new ArrayList<>();
                for (int i = 0; i < cars.size(); i++) {
                    if (!cars.get(i).isRented() && !cars.contains(cars.get(i).getCarBrandDetails().getModel())) {
                        models.add(cars.get(i).getCarBrandDetails().getModel());
                        System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getModel());
                    }
                }
                break;

            case 3:
                System.out.println("Option in development");

            case 4:
                showMenu();
                chooseListMenuOptionsAvailableCars();
        }
    }

    public void listRentedCars() {
        System.out.println("These cars are rented:");
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).isRented()) {
                System.out.println(cars.get(i).getCarBrandDetails().getMake() + " " + cars.get(i).getCarBrandDetails().getModel() +
                        " with the number " + (i + 1));
            }
        }
    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }
}
