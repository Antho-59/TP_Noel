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

    @Override
    public void makeGift() {
        System.out.println(name+ " va preparer un colis");
    }

    @Override
    public void buyTimbre() {
        System.out.println(name+" va acheter un timbre");
    }
}
