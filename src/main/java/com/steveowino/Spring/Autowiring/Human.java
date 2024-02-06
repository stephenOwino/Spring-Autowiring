package com.steveowino.Spring.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    //Dependency injection!
    private Heart heart;

    //Method!
    public void startPumping() {

        if (heart != null) {
            heart.pump();

            System.out.println("Name of the animal is : " + heart.getNameOfAnimal() + ", no of hearts present : " + heart.getNoOfHeart());


        }else {
            System.out.println("you are dead Man!");
        }

    }

}

