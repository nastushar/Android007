package com.nastya;

import java.util.Locale;

public class Main {

    public static void main ( String[] args ) {
        Cat[] kitty = new Cat[4];
        kitty[0]=new Cat ("Ракета" , 5);
        kitty[1]=new Cat ("Рыжий" , 20);
        kitty[2]=new Cat ("Гарфилд" , 150);
        kitty[3]=new Cat ("Догоняй" , 5);
        Plate plate = new Plate (100 , 100);



        for (int i = 0; i < kitty.length; i++) {

            plate.info ();
            kitty[i].eat (plate);
            plate.fullCatReturn (kitty[i]);
            plate.setiNeedMore() ;


        }
        plate.info ();
    }
}