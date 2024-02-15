package com.company;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking...");

        while (true) {
            System.out.println("Number is: " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Play one guessed " + guessp1);

            guessp2 = p1.number;
            System.out.println("Play two guessed " + guessp2);

            guessp3 = p1.number;
            System.out.println("Play three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Winner!");
                System.out.println("player one is right? " + p1isRight);
                System.out.println("player two is right? " + p2isRight);
                System.out.println("player three is right? " + p3isRight);
                break;
            } else {
                System.out.println("try again");
            }
        }
    }
}
