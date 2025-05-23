package org.example;

import org.example.lutinnotif.Lutin;
import org.example.toysdecorator.PlainToy;
import org.example.toysdecorator.RibbonDecorator;
import org.example.toysdecorator.Toy;
import org.example.toysfactory.*;

public class Main {
    public static void main(String[] args) {

        Lutin lutin = new Lutin("lulu");
        Lutin lutin2 = new Lutin("lala");
        Lutin lutin3 = new Lutin("lolo");


        ToysFactory carFactory = new CarFactory();
        Toys car = carFactory.createToys();
        car.description();


        BigToysfactory bigToysfactory = new BigToysfactory();
        bigToysfactory.setToysMap("voiture",new CarFactory());
        bigToysfactory.setToysMap("poupée",new DollFactory());

        Toys doll = bigToysfactory.buildtoys("poupée");
        doll.description();

        lutin.notif(); // notifie un lutin
        lutin2.buyTimbre(); // le lutin va chercher des timbres
        lutin3.makeGift(); // le lutin prepare le cadeau/colis



        Toy baseGift = new PlainToy();
        System.out.println(baseGift.getPersonalisation());

        Toy ribbonGift = new RibbonDecorator(baseGift);
        System.out.println(ribbonGift.getPersonalisation());


    }


}
