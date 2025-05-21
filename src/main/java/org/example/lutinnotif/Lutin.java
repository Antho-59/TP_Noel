package org.example.lutinnotif;

public class Lutin implements Observer{
    private String name;

    public Lutin(String name){
        this.name = name;
    }


    @Override
    public void notif() {
        System.out.println(name+ " notif : un cadeau a été fabriqué");

    }
}
