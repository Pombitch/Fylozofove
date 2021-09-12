package com.engeto.example;

public class Vlakno extends Thread {
    public void run() {
        pocitaniPorci();
    }

    private static synchronized void pocitaniPorci() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }
    }

}
