package com.nastya;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat ( String name , int appetite) {
        this.name = name;
        this.appetite = appetite;


    }



    public int getAppetite () {
        return appetite;
    }

    public void eat ( Plate plate ) {
        plate.decreaseFood (appetite);
    }



    public void setFullness ( boolean fullness ) {
        if (fullness){
            System.out.println ("котик " + name + " сыт!");
        } else  {
            System.out.println ("котик " + name + " остался голодным!");
        }
    }
}

