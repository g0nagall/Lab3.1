package com.company;

public class Main {

    public static void main(String[] args) {
        Formula obj = new Formula();
        obj.set(-4.5, 0.75 * Math.pow(10, -4), 0.845 * Math.pow(10, -2));
        obj.run();
        obj.print();

    }
}
