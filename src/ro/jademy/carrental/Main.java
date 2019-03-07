package ro.jademy.carrental;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?
        CarType sedan = new CarType("Sedan");
        CarBrandDetails d1 = new CarBrandDetails("Dacia", "Logan", 2015);

        ArrayList<Car> cars = new ArrayList<>();
        Car c1 = new AvailableCar(d1, sedan, "Blue");
        Car c2 = new AvailableCar(d1, sedan, "Yellow");
        cars.add(c1);
        cars.add(c2);

        ArrayList<SalesmanAccount> accounts = new ArrayList<>();
        SalesmanAccount acc1 = new SalesmanAccount("Calinelu", "admin");
        accounts.add(acc1);
        Salesman salesman1 = new Salesman("Calin", "Pana", acc1);


        Shop s = new Shop(accounts, cars);

        // show login message
        // se citeste userul si parola si se paseaza ca parametri ai metodei login




    }
}
