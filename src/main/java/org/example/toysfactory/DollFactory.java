package org.example.toysfactory;

public class DollFactory extends ToysFactory {
    @Override
    public Toys createToys() {
        return new Doll();
    }
}
