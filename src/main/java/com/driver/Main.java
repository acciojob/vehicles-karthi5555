package com.driver;

public class Main {
    public static void main(String[] args) {
//        F1 mercedes = new F1("mercedes", false);
//        mercedes.move(40, 0);
//        mercedes.accelerate(20);
//        mercedes.accelerate(-60);

        //for my test cases
        F1 benz = new F1("benz",false);
        benz.move(50, 20);
        benz.accelerate(30);
        benz.accelerate(30);
        benz.stop();
        System.out.println(benz.getCurrentSpeed());

    }
}