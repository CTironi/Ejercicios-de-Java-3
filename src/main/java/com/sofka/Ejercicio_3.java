package com.sofka;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Integer numero;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Para detener ingrese un numero >500\n" +
                    "Para repetir ingrese un numero <=500\n" +
                    "Ingrese un Numero:");
            numero = entrada.nextInt();
        }
        while (numero <= 500);
        System.out.println("Fin del bucle");
    }
}
