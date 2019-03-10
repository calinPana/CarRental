package ro.jademy.carrental;

import ro.jademy.carrental.Person.Customer;
import ro.jademy.carrental.Person.Person;
import ro.jademy.carrental.Person.Salesman;
import ro.jademy.carrental.car.BMW.X5;
import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.dacia.Logan;

import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?
//
//        CarType sedan = new CarType("Sedan");
//        CarType SUV = new CarType("SUV");
//
//        ArrayList<CarBrandDetails> carBrandDetails = new ArrayList<>();
//        CarBrandDetails d1 = new CarBrandDetails("Dacia", "Logan", 2015);
//        CarBrandDetails d2 = new CarBrandDetails("BMW", "X5", 2012);
//        carBrandDetails.add(d1);
//        carBrandDetails.add(d2);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Logan(2013, 30, "Blue"));
        cars.add(new Logan(2018, 50, "Red"));
        cars.add(new Logan(2017, 40, "Green"));
        cars.add(new X5(2012, 100, "White"));
        cars.add(new X5(2015, 120, "Black"));

//        cars.get(0).rent(2);
//        cars.get(3).rent(5);

        ArrayList<AccountDetails> accounts = new ArrayList<>();
        AccountDetails acc1 = new AccountDetails("calinelu", "admin");
        accounts.add(acc1);
        Salesman salesman1 = new Salesman("Calin", "Pana", acc1);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ion", "Popescu"));
        customers.add(new Customer("Ioana", "Popa"));


        Shop s = new Shop(accounts, cars);

        s.setCustomers(customers);

        s.rent(customers.get(1), cars.get(1), 9);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please write your username");
        String username = sc.nextLine();
        System.out.println("Now please write your password");
        String password = sc.nextLine();

        if (s.login(username, password)) {
            s.showMenu();

            //navigarea la infinit prin meniuri ar trebui facuta cu recursivitate, cred
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    s.showListMenuOptions();
                    s.chooseListMenuOptionsAllCars();
                    break;
                case 2:
                    s.showListMenuOptions();
                    s.chooseListMenuOptionsAvailableCars();
                    break;
                case 3:
                    s.listRentedCars();
                case 4:
                    s.checkIncome();

                    break;
                case 5:
//                    System.out.println("Please write your username");
//                    String username = sc.nextLine();
//                    System.out.println("Now please write your password");
//                    String password = sc.nextLine();

                    if (s.login(username, password)) {
                        s.showMenu();
                    }
            }

        }

//            System.out.println(customers.get(0));
//            customers.get(0).rents();
//            System.out.println(customers.get(0).getTimesRented());
//            s.findCustomer("Ion", "Popescu");
            //s.calculatePrice(cars.get());

        // show login message
        // se citeste userul si parola si se paseaza ca parametri ai metodei login


    }
}
