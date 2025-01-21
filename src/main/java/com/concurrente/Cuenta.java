package com.concurrente;

public class Cuenta extends Thread {
    String nombre;
    int inicio;
    int termino;
    public Cuenta(String nombre, int inicio, int termino) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.termino = termino;
    }
    @Override
    public void run() {
        for (int i = inicio; i < 39; i++) {
            System.out.println(this.nombre+": "+i);
        }
        System.out.println(this.nombre+" finalizado");
    }
}
