package org.example.toysfactory;

public class CarFactory extends ToysFactory{
    @Override
    public Toys createToys() {
        return new Car();
    }
}
