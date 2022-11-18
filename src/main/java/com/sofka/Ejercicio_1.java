package com.sofka;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Integer numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        numero = entrada.nextInt();

        for (Integer i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}