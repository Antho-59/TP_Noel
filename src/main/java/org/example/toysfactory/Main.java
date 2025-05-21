package org.example.toysfactory;

public class Main {
    public static void main(String[] args) {

        ToysFactory carFactory = new CarFactory();
        Toys car = carFactory.createToys();
        car.description();


        BigToysfactory bigToysfactory = new BigToysfactory();
        bigToysfactory.setToysMap("voiture",new CarFactory());
        bigToysfactory.setToysMap("poupée",new DollFactory());

        Toys doll = bigToysfactory.buildtoys("poupée");
        doll.description();

    }
}
