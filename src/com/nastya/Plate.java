package com.nastya;

public class Plate {
    private int food;
    private boolean isCatEat;

    private int addFood; // возможность пополнения

    public Plate ( int food , int addFood ) {
        this.food = food;
        this.addFood = addFood ;
    }

    public void info () {
        System.out.println ("plate: " + food);
    }

    public int getFood () {
        return food;
    }

    public void decreaseFood ( int n ) {
        if (n <= food) {
            food = food - n;
            isCatEat = true;

        } else {
            isCatEat = false;

        }

    }

    public void setFood ( int food ) {
        this.food = food;
    }

    public void fullCatReturn ( Cat cat ) {
        cat.setFullness (isCatEat);
    }

    public void setiNeedMore () {
        if (isCatEat) {
        }
        else food=food+addFood ;
    }
}