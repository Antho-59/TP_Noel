package org.example.toysdecorator;

public abstract class ToysDecorator implements Toy {

    protected Toy toy;

    public ToysDecorator(Toy toy){
        this.toy = toy;
    }

    @Override
    public String getPersonalisation() {
        return toy.getPersonalisation();
    }
}
