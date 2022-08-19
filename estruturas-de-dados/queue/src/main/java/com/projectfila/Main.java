package com.projectfila;

public class Main {

    public static void main(String[] args){

        Fila minhaFila = new Fila();

        //TODO refatorar p/ não ter que passar new No, apenas obj
        minhaFila.enqueue(new No("1"));
        minhaFila.enqueue(new No("2"));
        minhaFila.enqueue(new No("3"));
        minhaFila.enqueue(new No("4"));
        minhaFila.enqueue(new No("5"));
        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue(new No("último"));
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }
}
