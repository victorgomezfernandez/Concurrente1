package com.concurrente;

public class Main {
    public static void main(String[] args) {
        Cuenta C1 = new Cuenta("C1",0, 20);
        Cuenta C2 = new Cuenta("C2",21, 40);
        C1.start();
        C2.start();
    }
}