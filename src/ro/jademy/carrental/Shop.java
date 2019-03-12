package ro.jademy.carrental;

import ro.jademy.carrental.Person.Customer;
import ro.jademy.carrental.Person.Salesman;
import ro.jademy.carrental.car.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    // Q: what fields and methods should this class contain?

    private ArrayList<Salesman> salesmen = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private int income = 0;

    public Shop(ArrayList<Salesman> salesmen, ArrayList<Car> cars) {
        this.salesmen = salesmen;
        this.cars = cars;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your username");
        String username = sc.nextLine();
        System.out.println("Now please write your password");
        String password = sc.nextLine();
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

//        for (int i = 0; i < salesmen.size(); i++) {
//            if (password.equals(salesmen.get(i).getPassword())) {
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

    public void chooseFromMenu(int option) {
        switch (option) {
            case 1:
                System.out.println("--------------");
                System.out.println("|Our cars are:");
                for (int i = 0; i < cars.size(); i++) {
                    System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getMake() + " " + cars.get(i).getCarBrandDetails().getModel() +
                            " which costs " + cars.get(i).getCarBrandDetails().getPrice() + "$");
                }
                showListMenuOptions();
                chooseListMenuOptionsAllCars(option);
                break;
            case 2:
                System.out.println("Our available cars are:");
                for (int i = 0; i < cars.size(); i++) {
                    if (!cars.get(i).isRented()) {
                        System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getMake() + " " + cars.get(i).getCarBrandDetails().getModel() +
                                " which costs " + cars.get(i).getCarBrandDetails().getPrice() + "$");
                    }
                }
                showListMenuOptions();
                System.out.println("5. Rent a car");
                chooseListMenuOptionsAvailableCars(option);
                break;
            case 3:
                listRentedCars();
            case 4:
                checkIncome();

                break;
            case 5:
                System.out.println("Goodbye!");
                login();
            case 6:
                System.out.println("Goodbye!");
                break;
        }
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");
    }

    public void chooseListMenuOptionsAllCars(int option) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("We have the following makes: ");
                for (int i = 0; i < cars.size(); i++) {
                    System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getMake());
                }
                System.out.println("Press 1 to go back or anything else to exit");
                int secondaryChoice = sc.nextInt();
                if (secondaryChoice == 1) {
                    showListMenuOptions();
                    int tertiaryChoice = sc.nextInt();
                    chooseListMenuOptionsAllCars(tertiaryChoice);
                } else {
                    System.out.println("Goodbye!");
                }
                break;

            case 2:
                System.out.println("We have the following models: ");
                for (int i = 0; i < cars.size(); i++) {
                    System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getModel());
                }
                System.out.println("Press 1 to go back or anything else to exit");
                secondaryChoice = sc.nextInt();
                if (secondaryChoice == 1) {
                    showListMenuOptions();
                    int tertiaryChoice = sc.nextInt();
                    chooseListMenuOptionsAllCars(tertiaryChoice);
                } else {
                    System.out.println("Goodbye!");
                }
                break;

            case 3:
                ArrayList<Integer> carPrices = new ArrayList<>();
                System.out.println("We offer the following prices: ");
                for (int i = 0; i < cars.size(); i++) {
                    System.out.println(cars.get(i).getCarBrandDetails().getPrice() + "$ for a " +
                            cars.get(i).getCarBrandDetails().getMake() + " " +
                            cars.get(i).getCarBrandDetails().getModel() + " from " +
                            cars.get(i).getCarBrandDetails().getYear());
                }
                System.out.println("Press 1 to go back or anything else to exit");
                secondaryChoice = sc.nextInt();
                if (secondaryChoice == 1) {
                    showListMenuOptions();
                    int tertiaryChoice = sc.nextInt();
                    chooseListMenuOptionsAllCars(tertiaryChoice);
                } else {
                    System.out.println("Goodbye!");
                }
                break;

            case 4:
                showMenu();
                int tertiaryChoice = sc.nextInt();
                chooseFromMenu(tertiaryChoice);
        }
    }

    public void chooseListMenuOptionsAvailableCars(int option) {
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
                System.out.println("Press 1 to go back or anything else to exit");
                int secondaryChoice = sc.nextInt();
                if (secondaryChoice == 1) {
                    showListMenuOptions();
                    int tertiaryChoice = sc.nextInt();
                    chooseListMenuOptionsAvailableCars(tertiaryChoice);
                } else {
                    System.out.println("Goodbye!");
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
                System.out.println("Press 1 to go back or anything else to exit");
                secondaryChoice = sc.nextInt();
                if (secondaryChoice == 1) {
                    showListMenuOptions();
                    int tertiaryChoice = sc.nextInt();
                    chooseListMenuOptionsAvailableCars(tertiaryChoice);
                } else {
                    System.out.println("Goodbye!");
                }
                break;

            case 3:
                ArrayList<Integer> carPrices = new ArrayList<>();
                System.out.println("We offer the following prices: ");
                for (int i = 0; i < cars.size(); i++) {
                    if (!cars.get(i).isRented()) {
                        System.out.println(cars.get(i).getCarBrandDetails().getPrice() + "$ for a " +
                                cars.get(i).getCarBrandDetails().getMake() + " " +
                                cars.get(i).getCarBrandDetails().getModel() + " from " +
                                cars.get(i).getCarBrandDetails().getYear());
                    }
                }
                System.out.println("Press 1 to go back or anything else to exit");
                secondaryChoice = sc.nextInt();
                if (secondaryChoice == 1) {
                    showListMenuOptions();
                    int tertiaryChoice = sc.nextInt();
                    chooseListMenuOptionsAvailableCars(tertiaryChoice);
                } else {
                    System.out.println("Goodbye!");
                }
                break;

            //System.out.println("Option in development");

            case 4:
                showMenu();
                int tertiaryChoice = sc.nextInt();
                chooseListMenuOptionsAvailableCars(tertiaryChoice);
                break;

            case 5:
                System.out.println("Which car would you like to rent? Choose its number to continue");
                for (int i = 0; i < cars.size(); i++) {
                    if (!cars.get(i).isRented()) {
                        System.out.println(i + 1 + ". " + cars.get(i).getCarBrandDetails().getMake() + " " +
                                cars.get(i).getCarBrandDetails().getModel() + " which costs " +
                                cars.get(i).getCarBrandDetails().getPrice() + "$");
                    }
                }
                int rentChoice = sc.nextInt();
                System.out.println("Great choice! How many days would you like to have it? Write down the number");
                int daysNumberChoice = sc.nextInt();
                System.out.println("Now we only need your First and last name. Please write it down");
                String firstName = sc.nextLine();
                String lastName = sc.nextLine();
                for (int i = 0; i < customers.size(); i++) {
                    if ((firstName.equals(customers.get(i).getFirstName()) &&
                            (lastName.equals(customers.get(i).getLastName())))) {
                        rent(customers.get(i), cars.get(rentChoice - 1), daysNumberChoice);
                        System.out.println("You can go and take your car! Enjoy it! See you in " + daysNumberChoice + " days!");
                        break;
                    }
                }
                Customer customer = new Customer(firstName, lastName);
                customers.add(customer);
                rent(customer, cars.get(rentChoice - 1), daysNumberChoice);
                System.out.println("You can go and take your car! Enjoy it! See you in " + daysNumberChoice + " days!");
                break;
        }


    }


    public void listRentedCars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("These cars are rented:");
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).isRented()) {
                System.out.println(cars.get(i).getCarBrandDetails().getMake() + " " +
                        cars.get(i).getCarBrandDetails().getModel() + " with the number " + (i + 1));
            }
        }
        System.out.println("Press 1 to go back or anything else to exit");
        int secondaryChoice = sc.nextInt();
        if (secondaryChoice == 1) {
            showMenu();
            int tertiaryChoice = sc.nextInt();
            chooseFromMenu(tertiaryChoice);
        } else {
            System.out.println("Goodbye!");
        }
    }

    public void checkIncome() {
        Scanner sc = new Scanner(System.in);
        int currentIncome = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).isRented()) {
                currentIncome += cars.get(i).getCarBrandDetails().getPrice() *
                        cars.get(i).getRentPeriodDays() - cars.get(i).getCarBrandDetails().getPrice() *
                        cars.get(i).getRentPeriodDays() * calculateDiscount(cars.get(i).getCarBrandDetails().getPrice(), cars.get(i).getRentPeriodDays()) / 100;
            }
        }
        System.out.println("Our income from currently rented cars is " + currentIncome + "$ " +
                "and our total income is " + income + "$");
        System.out.println("Press 1 to go back or anything else to exit");
        int secondaryChoice = sc.nextInt();
        if (secondaryChoice == 1) {
            showMenu();
            int tertiaryChoice = sc.nextInt();
            chooseFromMenu(tertiaryChoice);
        } else {
            System.out.println("Goodbye!");
        }
    }

    public Integer calculateDiscount(int price, int numberOfDays) {
        int discount = 0;
        if (numberOfDays < 3) {
            discount = 0;
        } else if (numberOfDays > 3 && numberOfDays < 7) {
            discount = 10;
        } else if (numberOfDays >= 7) {
            discount = 20;
        }
        return discount;
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    public void findCustomer(String firstName, String lastName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getFirstName().equals(firstName) && customers.get(i).getLastName().equals(lastName)) {
                System.out.println("Customer " + firstName + " " + lastName + " has rented " +
                        customers.get(i).getTimesRented() + " times from us");
            }
            break;
        }
    }

    public void rent(Customer customer, Car car, int numberOfDays) {
        customer.rents();
        car.rent(numberOfDays);
        income += car.getCarBrandDetails().getPrice() * numberOfDays -
                car.getCarBrandDetails().getPrice() * numberOfDays *
                        calculateDiscount(car.getCarBrandDetails().getPrice(), numberOfDays) / 100;

    }
}