package ro.jademy.carrental;

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
        cars.add(new Logan(2019, "Blue"));
        cars.add(new Logan(2019, "Red"));
        cars.add(new Logan(2019, "Green"));

        ArrayList<AccountDetails> accounts = new ArrayList<>();
        AccountDetails acc1 = new AccountDetails("calinelu", "admin");
        accounts.add(acc1);
        Salesman salesman1 = new Salesman("Calin", "Pana", acc1);


        Shop s = new Shop(accounts, cars);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please write your username");
        String username = sc.nextLine();
        System.out.println("Now please write your password");
        String password = sc.nextLine();

        if (s.login(username, password)) {
            s.showMenu();
        }

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
                break;
        }


        // show login message
        // se citeste userul si parola si se paseaza ca parametri ai metodei login


    }
}
