package org.example.toysfactory;

import org.example.lutinnotif.Lutin;
import org.example.lutinnotif.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigToysfactory {

    private List<Observer> lutins = new ArrayList<>();

    public  void  addLutin(Observer observer){
        this.lutins.add(observer);
    }
    Lutin lutin = new Lutin("lulu");

    public void notifLutin (){
        for (Observer observer : lutins){
            observer.notif();
        }
    }

    private Map<String,ToysFactory> toysMap = new HashMap<>();

    public void setToysMap(String typeFacto, ToysFactory factory) {
        toysMap.put(typeFacto,factory);
    }

    public Toys buildtoys(String typeToys){
        ToysFactory factory = toysMap.get(typeToys);
        Toys toys = factory.createToys();
        lutin.notif();
        return toys;
    }

}
