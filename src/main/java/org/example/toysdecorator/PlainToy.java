package org.example.toysdecorator;

public class PlainToy implements  Toy{
    @Override
    public String getPersonalisation() {
        return "Cadeau avec un emballage basique";
    }
}
