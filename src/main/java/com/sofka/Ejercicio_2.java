package com.sofka;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Integer opcion;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese 1 para terminar");
        opcion = entrada.nextInt();

        while (opcion != 1) {
            System.out.println("Ingrese 1 para terminar");
            opcion = entrada.nextInt();
        }
    }
}
