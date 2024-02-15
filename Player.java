package com.company;

public class Player {
    int number;

    void guess(){
        number = (int) (Math.random()* 10);
    }
}
