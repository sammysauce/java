package com.RahulShetty.Interfacedemo;

public class aussieTraffic implements centralTraffic, continentalTraffix {

    public static void main(String[] args) {
        centralTraffic ac = new aussieTraffic();
        ac.greenGo();
        ac.redStop();
        ac.flashYellow();

        aussieTraffic ap = new aussieTraffic();
        continentalTraffix ct = new aussieTraffic();
        ap.greenManWalk();
        ap.redManWalk();
        ct.trainSymbol();


    }

    @Override
    public void greenGo() {
        System.out.println("Green Light - Go!");

    }

    public void greenManWalk(){
        System.out.println("Green Man - Pedestrian walk!");
    }
    public void redManWalk(){
        System.out.println("Red Man - Pedestrian wait!");
    }

    @Override
    public void redStop() {
        System.out.println("Red Light - Stop!");

    }

    @Override
    public void flashYellow() {
        System.out.println("Yellow Light - ");

    }

    @Override
    public void trainSymbol() {
        System.out.println("Train Crossing");
    }
}
