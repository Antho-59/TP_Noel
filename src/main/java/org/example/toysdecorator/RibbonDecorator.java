package org.example.toysdecorator;

public class RibbonDecorator extends ToysDecorator{
    public RibbonDecorator(Toy toy) {
        super(toy);
    }

    @Override
    public String getPersonalisation() {
        return super.getPersonalisation()+" et un ruban";
    }
}
